package edu.zjku.service;

import edu.zjku.bean.Blog;
import edu.zjku.mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Override
    public int selectCount() {
        int sumBlog;
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper=sql.getMapper(BlogMapper.class);
            sumBlog=mapper.selectCount();
        } catch (IOException e) {
            if (sql!=null){
                sql.close();
            }
            if (is!=null){
                try {
                    is.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
            throw new RuntimeException(e);
        }
        return sumBlog;
    }

    @Override
    public List<Blog> selectByPage(int pageNumber,int linesPerPage) {
        List<Blog> list = null;
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            list = mapper.selectByPage((pageNumber-1)*linesPerPage,linesPerPage);
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
        return list;
    }

    @Override
    public List<Blog> selectAll() {
        List<Blog> list = null;
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            list = mapper.selectAll();
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
        return list;
    }

    @Override
    public List<Blog> selectUnpass() {
        List<Blog> list = null;
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            list = mapper.selectUnpass();
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
        return list;
    }

    @Override
    public List<Blog> selectPass() {
        List<Blog> list = null;
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            list = mapper.selectPass();
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
        return list;
    }

    @Override
    public Blog selectById(String pid) {
        Blog blog = null;
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            blog = mapper.selectById(pid);
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
        return blog;
    }

    @Override
    public void insert(Blog blog) {
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            mapper.insert(blog);
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
    public void delete(Blog blog) {
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            mapper.delete(blog);
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
    public void update(Blog blog) {
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            mapper.update(blog);
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
    public void allow(Blog blog) {
        InputStream is = null;
        SqlSession sql = null;
        try {
            is = Resources.getResourceAsStream("mybatisConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            sql = sqlSessionFactory.openSession(true);
            BlogMapper mapper = sql.getMapper(BlogMapper.class);
            mapper.allow(blog);
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
}
