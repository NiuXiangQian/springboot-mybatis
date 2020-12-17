package com.niu.springboot.mapper;

import com.niu.springboot.model.SysUser;
import org.springframework.stereotype.Repository;

/**
 * @description: userMapper
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/17 8:27 上午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/17 8:27 上午
 * @updateRemark:
 * @version: 1.0
 **/
@Repository
public interface SysUserMapper {

    SysUser selectUserById(Integer id);
}
