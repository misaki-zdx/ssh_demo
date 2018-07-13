package com.ssh.dao;

import com.ssh.bean.po.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * Author Misaki
 * Create By 2018/7/12
 */
@Repository("userdao")
public class UserDao {

    @Autowired
    HibernateTemplate ht ;

    public void add(UserEntity userEntity){
        System.out.println("dao∆Ù∂Ø");
            ht.save(userEntity);
    }
}
