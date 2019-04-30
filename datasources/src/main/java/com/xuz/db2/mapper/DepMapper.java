package com.xuz.db2.mapper;

import com.xuz.db2.pojo.Dep;

public interface DepMapper {
    int deleteByPrimaryKey(Integer lDepId);

    int insert(Dep record);

    int insertSelective(Dep record);

    Dep selectByPrimaryKey(Integer lDepId);

    int updateByPrimaryKeySelective(Dep record);

    int updateByPrimaryKey(Dep record);
}