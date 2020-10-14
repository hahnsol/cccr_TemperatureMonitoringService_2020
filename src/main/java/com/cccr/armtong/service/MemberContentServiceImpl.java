package com.cccr.armtong.service;

//import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.cccr.armtong.mapper.MemberSQLMapper;
import com.cccr.armtong.mapper.TemperatureSQLMapper;
// import com.cccr.armtong.vo.MemTemJoinVO;
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

    public MemberBasicVo getMemberInfoByVo(MemberBasicVo vo){

        MemberBasicVo memberInfoByVo = memMapper.selectMemberInfoByVoMemberIdx(vo);

        return memberInfoByVo;

    }

    @Override
    public ArrayList<TemperatureBasicVo> getMemberTemContents(MemberBasicVo vo){


        ArrayList<TemperatureBasicVo> membersTemList = temMapper.selectAllByMemberIdx(vo);

        return membersTemList;

    }

    // @Override
    // public ArrayList<MemTemJoinVO> getMemberInfo(MemberBasicVo vo){

    //     ArrayList<MemTemJoinVO> MemberTemInfoList = new ArrayList<MemTemJoinVO>();

    //     ArrayList<TemperatureBasicVo> temList = temMapper.selectAllByMemberIdx(vo);

    //     for(TemperatureBasicVo list : temList){
    //         MemberBasicVo memberData = memMapper.selectMemberInfoByMemberIdx(list.getMember_idx());
    //     }
    // }


}
