package com.qf.springboot_my.dao;

import com.qf.springboot_my.entity.DUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<DUser,Integer> {
}
