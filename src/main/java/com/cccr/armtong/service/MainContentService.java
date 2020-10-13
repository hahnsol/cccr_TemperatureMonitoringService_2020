package com.cccr.armtong.service;

import java.util.ArrayList;

import com.cccr.armtong.vo.TemperatureBasicVo;
import com.cccr.armtong.vo.MemTemJoinVO;

public interface MainContentService {
    
    // 선택날짜의 체온측정데이터 리스트 가져오기
    public ArrayList<MemTemJoinVO> getSelectDayContents(TemperatureBasicVo vo);

    // 오늘날짜의 체온측정데이터 리스트 가져오기
    public ArrayList<MemTemJoinVO> getTodayContents(String temperature_date);
 

}
