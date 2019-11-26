package com.work.service.impl;

import com.work.bean.User;
import com.work.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @authar Mr.Feng
 * @date 2019/11/25 - 23:33
 */
@Service
public class UserServiceImpl implements IUserService {
    private static ApplicationContext act;
    static{
        //加载类时加载IOC容器
        act = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    @Override
    public boolean saveUser(User user) {
        JdbcTemplate jt = act.getBean("jdbcTemplate",JdbcTemplate.class);
        int i = jt.update("insert into user(username,pwd,name) values(?,?,?)",user.getUsername(),user.getPwd(),user.getName());
        if(i!=0){
            return true;
        }
        return false;
    }

    @Override
    public List<User> selAllUser() {
        return null;
    }
}
