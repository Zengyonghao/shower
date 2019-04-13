package com.coderx.shower.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>
 *     author : YONGHAOZENG
 *     e-mail : 1007687534@qq.com
 *     time   : 2019/04/08
 *     desc   :
 *     version: 1.0
 * </pre>
 */

@RestController
class HelloWorldController {
    @RequestMapping("/hello")
    public String index(){

        return "helloWorld";
    }
}
