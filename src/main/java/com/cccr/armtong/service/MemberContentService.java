package com.cccr.armtong.service;

import java.util.ArrayList;

import com.cccr.armtong.vo.MemberBasicVo;
import com.cccr.armtong.vo.TemperatureBasicVo;

public interface MemberContentService {
    

    // 해당 멤버 정보 출력
    public MemberBasicVo getMemberInfo(int member_idx);


    // 해당 멤버의 체온데이터 리스트 출력
    public ArrayList<TemperatureBasicVo> getMemberTemContents(MemberBasicVo vo);

}
