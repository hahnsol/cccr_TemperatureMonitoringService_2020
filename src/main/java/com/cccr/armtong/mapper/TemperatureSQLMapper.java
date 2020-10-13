package com.cccr.armtong.mapper;

import java.util.ArrayList;

import com.cccr.armtong.vo.*;

import org.apache.ibatis.annotations.*;

@Mapper
public interface TemperatureSQLMapper {
    
    // 오늘 모든 사람의 체온정보 출력
    @Select("SELECT * FROM TEMPERATURE WHERE temperature_date=#{temperature_date}")
    public ArrayList<TemperatureBasicVo> selectAllTodayByTemperatureDate(String temperature_date);

    // 해당날짜의 모든 사람의 체온정보 출력
    @Select("SELECT * FROM TEMPERATURE WHERE temperature_date=#{temperature_date}")
    public ArrayList<TemperatureBasicVo> selectAllByTemperatureDate(TemperatureBasicVo vo);
 
    // 해당멤버의 모든 체온정보 출력
    @Select("SELECT * FROM TEMPERATURE WHERE member_idx=#{member_idx}")
    public ArrayList<TemperatureBasicVo> selectAllByMemberIdx(MemberBasicVo vo);


}
