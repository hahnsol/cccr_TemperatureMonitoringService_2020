package com.cccr.armtong.service;

import java.util.ArrayList;

import com.cccr.armtong.vo.TemperatureBasicVo;
import com.cccr.armtong.vo.MemTemJoinVO;

public interface MainContentService {
    
    // 선택날짜의 체온측정데이터 리스트 가져오기
    public ArrayList<MemTemJoinVO> getSelectDayContents(TemperatureBasicVo vo);

    // 오늘날짜의 체온측정데이터 리스트 가져오기
    public ArrayList<MemTemJoinVO> getTodayContents(String temperature_date);



    
    // today 체온평균 구하기
    public Float getTodayAverageTem(String temperature_date);

    // today 측정인원 구하기
    public int getTodayMemNum(String temperature_date);

    // today 37도 이상 멤버 숫자 구하기
    public int getTodayCountMemberOf37(String temperature_date);



    // select date 체온평균 구하기
    public Float getSelectDayAverageTem(TemperatureBasicVo vo);

    // select date 측정인원 구하기
    public int getSelectDayMemNum(TemperatureBasicVo vo);

    // select date 37도 이상 멤버 숫자 구하기
    public int getSelectDayCountMemberOf37(TemperatureBasicVo vo);

    


}
