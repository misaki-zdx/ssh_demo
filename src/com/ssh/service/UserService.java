package com.ssh.service;

import com.ssh.bean.po.UserEntity;
import com.ssh.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Author Misaki
 * Create By 2018/7/12
 */
@Service("userservice")
@Transactional
public class UserService {

    @Resource(name="userdao")
    UserDao dao;

    public void save(UserEntity userEntity){
        System.out.println("user"+userEntity);
        System.out.println("service∆Ù∂Ø");
        dao.add(userEntity);
    }
}
