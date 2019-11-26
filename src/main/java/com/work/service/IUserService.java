package com.work.service;

import com.work.bean.User;

import java.util.List;

/**
 * @authar Mr.Feng
 * @date 2019/11/25 - 23:31
 * 持久层接口
 */
public interface IUserService {
    //用户保存
    boolean saveUser(User user);
    //用户查询
    List<User> selAllUser();
}
