package com.scit.lms.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDAO {
    int selectCount();
}