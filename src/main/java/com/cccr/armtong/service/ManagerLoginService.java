package com.cccr.armtong.service;

import com.cccr.armtong.vo.ManagerBasicVo;
import com.cccr.armtong.vo.SessionUserDataVo;

public interface ManagerLoginService {
    
    // 로그인 logic
    public SessionUserDataVo login(ManagerBasicVo vo);

}
