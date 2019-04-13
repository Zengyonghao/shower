package com.coderx.shower.service;

import com.coderx.shower.domain.User;
import com.coderx.shower.repository.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <pre>
 *     author : YONGHAOZENG
 *     e-mail : 1007687534@qq.com
 *     time   : 2019/04/09
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@Service
public class UserServices {
    @Autowired
    UserDao mUserDao;

    public User findUser(String userId){
        return mUserDao.findUser(userId);

    }

    public int updateUser(User user){
        return mUserDao.updateUser(user);
    }

    public int addUser(User user){
        return mUserDao.addUser(user);
    }
}
