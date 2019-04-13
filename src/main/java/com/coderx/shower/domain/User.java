package com.coderx.shower.domain;

import org.springframework.stereotype.Component;

/**
 * <pre>
 *     author : YONGHAOZENG
 *     e-mail : 1007687534@qq.com
 *     time   : 2019/04/09
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@Component
public class User {

    private String userId;
    private long createTime;
    private String userType;

    public String getUserId() {
        return userId;
    }

    public User setUserId(String userId) {
        this.userId = userId;
        return this;
    }



    public long getCreateTime() {
        return createTime;
    }

    public User setCreateTime(long createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }
}
