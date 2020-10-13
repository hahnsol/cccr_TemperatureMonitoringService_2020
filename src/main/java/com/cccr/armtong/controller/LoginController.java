package com.cccr.armtong.controller;

import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.http.HttpSession;

import com.cccr.armtong.service.MainContentService;
import com.cccr.armtong.service.ManagerLoginService;
import com.cccr.armtong.vo.ManagerBasicVo;
import com.cccr.armtong.vo.SessionUserDataVo;
import com.cccr.armtong.vo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private ManagerLoginService managerLoginService;

    @Autowired
    private MainContentService MainContentService;



    @RequestMapping("/")
    public String indexPage(){
        System.out.println("good index");
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
            return "redirect:mainContentStartPage";
        }

    }

    @RequestMapping("/logoutAction")
    public String logoutAction(HttpSession session){
        session.invalidate();
        return "indexPage";
    }
    
    @RequestMapping("/mainContentStartPage")
    public String mainContentStartPage(){

        ArrayList<MemTemJoinVO> join = new ArrayList<MemTemJoinVO>();

        int year = Calendar.YEAR;
        int month = Calendar.MONTH;
        int day = Calendar.DAY_OF_MONTH;

        String year1 = Integer.toString(year);
        String month1 = Integer.toString(month);
        String day1 = Integer.toString(day);

        String today = year1+"-"+month1+"-"+day1;

        join = MainContentService.getTodayContents(today);
        



    }

    

}
