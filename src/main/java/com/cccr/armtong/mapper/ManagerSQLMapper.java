package com.cccr.armtong.mapper;

import com.cccr.armtong.vo.ManagerBasicVo;

import org.apache.ibatis.annotations.*;

@Mapper
public interface ManagerSQLMapper {
    
    @Select("SELECT * FROM MANAGER WHERE MANAGER_ID=#{manager_id}")
    public ManagerBasicVo selectManagerInfoByManagerID(String manager_id);

}
