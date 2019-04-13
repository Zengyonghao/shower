package com.coderx.shower.controller;

import com.coderx.shower.data.ResponseBase;
import com.coderx.shower.domain.User;
import com.coderx.shower.service.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     author : YONGHAOZENG
 *     e-mail : 1007687534@qq.com
 *     time   : 2019/04/09
 *     desc   :
 *     version: 1.0
 * </pre>
 */
@RestController
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserServices mUserServices;


    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ResponseBase<User> getUser(@RequestParam String id) throws Exception{

        User user = mUserServices.findUser(id);
        ResponseBase<User> base = new ResponseBase<>();

        if (user == null){
            base.setErrCode("1");
            base.setErrorMsg("未查询到该用户");
        }

        base.setData(user);
        base.setStatus("200");
        return base;
    }


}
