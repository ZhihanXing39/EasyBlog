package edu.zjku.mapper;

import edu.zjku.bean.User;

import java.util.List;

public interface UserMapper {
    //查询所有用户
    List<User> selectAll();
    //查询所有用户名
    List<User> selectName();
    //添加新用户
    void insert(User user);
    //注销用户
    void delete(String username);
    //用户修改密码
    void update(User user);
}
