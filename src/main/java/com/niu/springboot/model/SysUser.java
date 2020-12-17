package com.niu.springboot.model;

/**
 * @description: user
 * @author: nxq email: niuxiangqian163@163.com
 * @createDate: 2020/12/17 8:26 上午
 * @updateUser: nxq email: niuxiangqian163@163.com
 * @updateDate: 2020/12/17 8:26 上午
 * @updateRemark:
 * @version: 1.0
 **/
public class SysUser {
    private Integer id;
    private String name;
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
