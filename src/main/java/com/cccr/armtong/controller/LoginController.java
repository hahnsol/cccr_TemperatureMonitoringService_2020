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
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private ManagerLoginService managerLoginService;

    @Autowired
    private MainContentService mainContentService;



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
            return "mainContentStartPage";
        }

    }

    @RequestMapping("/logoutAction")
    public String logoutAction(HttpSession session){
        session.invalidate();
        return "indexPage";
    }
    
    @RequestMapping("/mainContentStartPage")
    public String mainContentStartPage(Model model){

        // 오늘 체온정보 리스트 출력용
        ArrayList<MemTemJoinVO> startContents = new ArrayList<MemTemJoinVO>();

        int year = Calendar.YEAR;
        int month = Calendar.MONTH;
        int day = Calendar.DAY_OF_MONTH;

        String year1 = Integer.toString(year);
        String month1 = Integer.toString(month);
        String day1 = Integer.toString(day);

        String today = year1+"-"+month1+"-"+day1;

        startContents = mainContentService.getTodayContents(today);


        // 오늘 멤버 평균 체온
        Float average = mainContentService.getTodayAverageTem(today);


        // today total member count
        int totalMember = startContents.size();

        // 오늘 37도 이상인 멤버 숫자
        int memberCount = mainContentService.getTodayCountMemberOf37(today);




        model.addAttribute("startContents", startContents);
        model.addAttribute("average", average);
        model.addAttribute("totalMember", totalMember);
        model.addAttribute("memberCount", memberCount);

        return "mainContentStartPage";
        
    }


    @RequestMapping("/mainContentPage")
    public String mainContentStartPage(TemperatureBasicVo param, Model model){

        // selected day 체온정보 리스트 출력용
        ArrayList<MemTemJoinVO> mainContentList = new ArrayList<MemTemJoinVO>();

        mainContentList = mainContentService.getSelectDayContents(param);

        
        // selected day 멤버 평균 체온
        Float maincontenttemAverage = mainContentService.getSelectDayAverageTem(param);

        // selected day total member count
        int mainContentTotalMember = mainContentList.size();

        // selcted day 37도 이상인 멤버 숫자
        int mainContentMemberOf37 = mainContentService.getSelectDayCountMemberOf37(param);

        model.addAttribute("mainContentList", mainContentList);
        model.addAttribute("maincontenttemAverage", maincontenttemAverage);
        model.addAttribute("mainContentTotalMember", mainContentTotalMember);
        model.addAttribute("mainContentMemberOf37", mainContentMemberOf37);

        return "mainContentPage";

    }

    

}
