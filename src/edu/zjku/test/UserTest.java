package edu.zjku.test;

import edu.zjku.bean.User;
import edu.zjku.service.UserService;
import edu.zjku.service.UserServiceImpl;
import org.junit.Test;

import java.util.List;

public class UserTest {
    private UserService service = new UserServiceImpl();
    @Test
    public void selectAll(){
        List<User> users =service.selectAll();
        for (User u:users
             ) {
            System.out.println(u);
        }
    }
    @Test
    public void selectName(){
        List names =service.selectName();
        System.out.println(names);
    }
    @Test
    public void insert(){
        User user = new User();
        user.setUsername("Lifour");
        user.setPassword("114514");
        service.insert(user);
    }
    @Test
    public void delete(){
        String username = "test";
        service.delete(username);
    }
    @Test
    public void update(){
        User user = new User();
        user.setUsername("Dreamcold");
        user.setPassword("goodmoring");
        service.update(user);
    }
}
