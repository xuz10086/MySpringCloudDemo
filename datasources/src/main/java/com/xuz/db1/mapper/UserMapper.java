package com.xuz.db1.mapper;

import com.xuz.db1.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    int deleteByPrimaryKey(Integer lUserId);

    int insert(User record);

//    @Insert("INSERT INTO T_B01_USER(VC_USER_NAME,VC_USER_PASSWORD) VALUES(#{vcUserName},#{vcUserPassword})")
    int insertSelective(User record);

    User selectByPrimaryKey(Integer lUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}