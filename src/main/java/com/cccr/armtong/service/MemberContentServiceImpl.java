package com.cccr.armtong.service;

//import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.cccr.armtong.mapper.MemberSQLMapper;
import com.cccr.armtong.mapper.TemperatureSQLMapper;
import com.cccr.armtong.vo.MemberBasicVo;
import com.cccr.armtong.vo.TemperatureBasicVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberContentServiceImpl implements MemberContentService{
    
    @Autowired
    private MemberSQLMapper memMapper;

    @Autowired
    private TemperatureSQLMapper temMapper;


    @Override
    public MemberBasicVo getMemberInfo(int member_idx){

        MemberBasicVo memberInfo = memMapper.selectMemberInfoByMemberIdx(member_idx);

        return memberInfo;

    }


    @Override
    public ArrayList<TemperatureBasicVo> getMemberTemContents(MemberBasicVo vo){


        ArrayList<TemperatureBasicVo> membersTemList = temMapper.selectAllByMemberIdx(vo);

        return membersTemList;

    }


}
