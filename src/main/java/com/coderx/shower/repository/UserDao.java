package com.coderx.shower.repository;

import com.coderx.shower.domain.User;

/**
 * <pre>
 *     author : YONGHAOZENG
 *     e-mail : 1007687534@qq.com
 *     time   : 2019/04/09
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public interface UserDao {
     int updateUser(User user);
     User findUser(String UserId);
     //返回主键
     int addUser(User user);
}
