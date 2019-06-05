package com.qf.springboot_my.mapper;


import com.qf.springboot_my.entity.DUser;
import org.springframework.stereotype.Repository;

@Repository
public interface DUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DUser record);

    int insertSelective(DUser record);

    DUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DUser record);

    int updateByPrimaryKey(DUser record);
}