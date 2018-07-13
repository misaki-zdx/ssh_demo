package com.ssh.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.bean.po.UserEntity;
import com.ssh.service.UserService;

import javax.annotation.Resource;

/**
 * Author Misaki
 * Create By 2018/7/11
 */
public class UserAction extends ActionSupport implements ModelDriven<UserEntity>{
    private UserEntity user = new UserEntity();
    @Override
    public UserEntity getModel() {
        return user;
    }
    @Resource(name = "userservice")
    UserService us;

    public String save(){
        System.out.println("action∆Ù∂Ø"+user);
        us.save(user);
        return SUCCESS;
    }


}
