package com.coderx.shower;

import com.coderx.shower.domain.User;
import com.coderx.shower.service.UserServices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShowerApplicationTests {

    @Autowired
    private UserServices mUserServices;
    @Test
    public void contextLoads() {
        User user = new User();
        user.setUserId("3");
        user.setUserType("1");
        user.setCreateTime(System.currentTimeMillis());
        int id = mUserServices.addUser(user);

    }

}
