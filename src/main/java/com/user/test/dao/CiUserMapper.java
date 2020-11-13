package com.user.test.dao;

import com.user.test.pojo.CiUser;

public interface CiUserMapper {
    int deleteByPrimaryKey(String objectId);

    int insert(CiUser record);

    int insertSelective(CiUser record);

    CiUser selectByPrimaryKey(String objectId);

    int updateByPrimaryKeySelective(CiUser record);

    int updateByPrimaryKey(CiUser record);
}
