package com.cccr.armtong.mapper;

import com.cccr.armtong.vo.MemberBasicVo;

import org.apache.ibatis.annotations.*;

@Mapper 
public interface MemberSQLMapper {
    
    // 특정 멤버의 정보 출력
    @Select("SELECT * FROM MEMBER WHERE MEMBER_IDX=#{member_idx}")
    public MemberBasicVo selectMemberInfoByMemberIdx(int member_idx);

}
