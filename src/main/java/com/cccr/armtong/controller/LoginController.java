package com.cccr.armtong.controller;

import javax.servlet.http.HttpSession;

import com.cccr.armtong.service.ManagerLoginService;
import com.cccr.armtong.vo.ManagerBasicVo;
import com.cccr.armtong.vo.SessionUserDataVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private ManagerLoginService managerLoginService;
    
    @RequestMapping("/indexPage")
    public String indexPage(){
        return "indexPage";
    }

    @RequestMapping("/loginPage")
    public String loginPage(){
        return "loginPage";
    }

    @RequestMapping("/loginAction")
    public String loginAction(ManagerBasicVo param, HttpSession session){

        SessionUserDataVo userSession = managerLoginService.login(param);

        if(userSession == null){
            return "loginFailPage";
        } else {
            session.setAttribute("userSession", userSession);
            return "redirect:mainContentPage";
        }

    }

    @RequestMapping("/logoutAction")
    public String logoutAction(HttpSession session){
        session.invalidate();
        return "indexPage";
    }
    

}
