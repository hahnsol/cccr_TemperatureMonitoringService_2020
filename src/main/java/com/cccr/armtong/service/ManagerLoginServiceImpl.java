package com.cccr.armtong.service;

import com.cccr.armtong.mapper.ManagerSQLMapper;
//import com.cccr.armtong.mapper.MemberSQLMapper;
import com.cccr.armtong.vo.ManagerBasicVo;
import com.cccr.armtong.vo.SessionUserDataVo;

import org.springframework.stereotype.Service;

@Service
public class ManagerLoginServiceImpl implements ManagerLoginService{
    
    private ManagerSQLMapper managerMapper;

    // login logic
    @Override
    public SessionUserDataVo login(ManagerBasicVo vo){

        // 사용자가 입력한 id로 해당하는 manager's info  
        ManagerBasicVo managerVo = managerMapper.selectManagerInfoByManagerID(vo.getManagerId());

        // 사용자가 입력한 pw 
        String password = vo.getManagerPw();

        if(managerVo != null && managerVo.getManagerPw().equals(password)){
            
            // 로그인 정보 세션에 저장
            SessionUserDataVo sessionUserDataVo = new SessionUserDataVo(managerVo.getManagerIdx(), managerVo.getManagerName());

            return sessionUserDataVo;
        } else {
            return null;
        }

        

    }





}
