package com.work.service.test;

import com.work.bean.User;
import com.work.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @authar Mr.Feng
 * @date 2019/11/25 - 23:48
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
//        JdbcTemplate jdbc = act.getBean("jdbcTemplate",JdbcTemplate.class);
        //jdbc.execute("insert into user(username,pwd,name) values ('好好',11,22)");
        //jdbc.execute("update user set username='11111111111' where username='好好' ");
//        List<User> list = jdbc.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
//        list.forEach(System.out::println);
        //jdbc.update("update user set name=? where id=? ","三叶",1);
//        IUserService userService = act.getBean("userServiceImpl",IUserService.class);
        IUserService iUserService = act.getBean("userServiceImpl",IUserService.class);
        User user = new User();
        user.setName("哈哈哈哈哈");
        user.setPwd("hhhhhhhhhhhhh");
        user.setUsername("sssssssssssssssssss");
        boolean boo = iUserService.saveUser(user);
        System.out.println(boo);
    }
}
