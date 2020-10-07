package com.cccr.armtong.service;

//import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.cccr.armtong.mapper.MemberSQLMapper;
import com.cccr.armtong.mapper.TemperatureSQLMapper;
import com.cccr.armtong.vo.MemTemJoinVO;
import com.cccr.armtong.vo.MemberBasicVo;
import com.cccr.armtong.vo.TemperatureBasicVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaincontentServiceImpl implements MainContentService {
    
    @Autowired
    private MemberSQLMapper memberMapper;

    @Autowired
    private TemperatureSQLMapper temperatureMapper;


    @Override
    public ArrayList<MemTemJoinVO> getTodayContents(TemperatureBasicVo vo){

        // controller로 보내줄 체온데이터 리스트들(joined member, temperature data)
        ArrayList<MemTemJoinVO> mainContentList = new ArrayList<MemTemJoinVO>();

        // 해당 날짜와 temperature_date가 동일한 체온데이터 리스트 추출
        ArrayList<TemperatureBasicVo>  mainTemperatureList = temperatureMapper.selectAllByTemperatureDate(vo);

        // 체온데이터와 멤버정보 join
        for(TemperatureBasicVo tem : mainTemperatureList){

            // 해당 체온데이터의 멤버 정보
            MemberBasicVo memberInfo = memberMapper.selectMemberInfoByMemberIdx(tem.getMember_idx());
            
            // 체온데이터 정보와 멤버정보 join
            MemTemJoinVO memtemjoin = new MemTemJoinVO(memberInfo, tem);

            // join된 체온+멤버 정보 리스트를 mainContentList에 하나씩 추가
            mainContentList.add(memtemjoin);
        }

        return mainContentList;
    
    
    }








}
