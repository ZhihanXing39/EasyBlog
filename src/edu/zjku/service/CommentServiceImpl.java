package edu.zjku.service;

import edu.zjku.bean.Comment;
import edu.zjku.bean.User;
import edu.zjku.mapper.CommentMapper;
import edu.zjku.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CommentServiceImpl implements CommentService {
    @Override
    public List<Comment> select() {
        List<Comment> list = null;
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
            CommentMapper mapper = sql.getMapper(CommentMapper.class);
            //5.通过实现类对象调用方法，接受结果
            list = mapper.select();
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
    public List<Comment> selectById(String id) {
        List<Comment> list = null;
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
            CommentMapper mapper = sql.getMapper(CommentMapper.class);
            //5.通过实现类对象调用方法，接受结果
            list = mapper.selectById(id);
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
    public void insert(Comment comment) {
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
            CommentMapper mapper = sql.getMapper(CommentMapper.class);
            //5.通过实现类对象调用方法，接受结果
            mapper.insert(comment);
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
    }
}
