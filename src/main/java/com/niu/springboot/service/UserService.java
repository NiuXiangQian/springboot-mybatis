package com.niu.springboot.service;

import com.niu.springboot.mapper.SysUserMapper;
import com.niu.springboot.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: service
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/17 8:28 上午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/17 8:28 上午
 * @updateRemark:
 * @version: 1.0
 **/
@Service
public class UserService {

    @Autowired
    private SysUserMapper userMapper;

    public SysUser getUser(Integer id){
        return  userMapper.selectUserById(id);
    }


}
