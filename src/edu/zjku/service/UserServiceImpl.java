package edu.zjku.service;

import edu.zjku.bean.User;
import edu.zjku.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> selectAll() {
        List<User> list = null;
        SqlSession sql = null;
        InputStream is = null;
        try {
            //1.加载核心配置文件
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            //2.获取SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            //3.通过工厂获取SqlSession对象
            sql = sqlSessionFactory.openSession(true);
            //4.获取UserMapper接口的实现类对象
            UserMapper mapper = sql.getMapper(UserMapper.class);
            //5.通过实现类对象调用方法，接受结果
            list = mapper.selectAll();
        } catch (IOException e) {
            e.printStackTrace();
            //6.释放资源
            if (sql != null) {
                sql.close();
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
        return list;
    }

    @Override
    public List<User> selectName() {
        List list = null;
        InputStream is = null;
        SqlSession sql = null;
        try {
            is=Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql=sqlSessionFactory.openSession(true);
            UserMapper mapper=sql.getMapper(UserMapper.class);
            list=mapper.selectName();
        } catch (IOException e) {
            e.printStackTrace();
            if (sql!=null){
                sql.close();
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
        return list;
    }

    @Override
    public void insert(User user) {
        SqlSession sql = null;
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            UserMapper mapper = sql.getMapper(UserMapper.class);
            mapper.insert(user);
        } catch (IOException e) {
            e.printStackTrace();
            if (sql != null) {
                sql.close();
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(String username) {
        SqlSession sql = null;
        InputStream is = null;
        try {
            is=Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql=sqlSessionFactory.openSession(true);
            UserMapper mapper=sql.getMapper(UserMapper.class);
            mapper.delete(username);
        } catch (IOException e) {
            e.printStackTrace();
            if (sql!=null){
                sql.close();
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }

    @Override
    public void update(User user) {
        InputStream is = null;
        SqlSession sql = null;
        try {
            is=Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql=sqlSessionFactory.openSession(true);
            UserMapper mapper = sql.getMapper(UserMapper.class);
            mapper.update(user);
        } catch (IOException e) {
            e.printStackTrace();
            if (sql!=null){
                sql.close();
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
    }
}
