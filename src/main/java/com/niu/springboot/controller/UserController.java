package com.niu.springboot.controller;

import com.niu.springboot.model.SysUser;
import com.niu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: user控制器
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/17 8:27 上午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/17 8:27 上午
 * @updateRemark:
 * @version: 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public SysUser user(@PathVariable  Integer userId){
        return userService.getUser(userId);
    }
}
