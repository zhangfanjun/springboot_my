package com.qf.springboot_my;

import com.qf.springboot_my.dao.UserDao;
import com.qf.springboot_my.entity.DUser;
import com.qf.springboot_my.mapper.DUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMyApplicationTests {
    @Autowired
    private  DUserMapper mapper;
    @Test
    public void contextLoads() {
//        System.out.println(mapper);
        DUser dUser = mapper.selectByPrimaryKey(1);
        System.out.println(dUser);
    }
    @Autowired
    private UserDao dao;
    @Test
    public void contextLoads2() {
        Optional<DUser> user = dao.findById(1);
        System.out.println(user);
        
    }

}
