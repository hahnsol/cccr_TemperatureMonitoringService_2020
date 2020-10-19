package com.cccr.armtong.controller;

import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.http.HttpSession;

import com.cccr.armtong.service.MainContentService;
import com.cccr.armtong.service.ManagerLoginService;
import com.cccr.armtong.service.MemberContentService;
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

    @Autowired
    private MemberContentService memberContentService;


    @RequestMapping("/")
    public String startPage(){
        return "indexPage";
    }

    @RequestMapping("/indexPage")
    public String indexPage(){
        return "indexPage";
    }

    @RequestMapping("loginPage")
    public String loginPage(){
        return "loginPage";
    }

    @RequestMapping("loginAction")
    public String loginAction(ManagerBasicVo param, HttpSession session){

        SessionUserDataVo userSession = managerLoginService.login(param);

        if(userSession == null){
            return "loginFailPage";
        } 
            session.setAttribute("userSession", userSession);

            return "redirect:mainContentStartPage";
    }

    @RequestMapping("logoutAction")
    public String logoutAction(HttpSession session){
        session.invalidate();
        return "indexPage";
    }
    
    @RequestMapping("mainContentStartPage")
    public String mainContentStartPage(Model model){

        // 오늘 체온정보 리스트 출력용
        ArrayList<MemTemJoinVO> startContents = new ArrayList<MemTemJoinVO>();

        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);

        String year1 = Integer.toString(year);
        String month1 = Integer.toString(month);
        String day1 = Integer.toString(day);

        String today = year1+"-"+month1+"-"+day1;

        startContents = mainContentService.getTodayContents(today);


        // 오늘 멤버 평균 체온
        Float average = mainContentService.getTodayAverageTem(today);
        
        // 소숫점 1자리까지 출력
        String mainTodayTemAverageString = String.format("%.1f", average);
        // change double type
        Double mainTodayTemAverage = Double.parseDouble(mainTodayTemAverageString);

        System.out.println("평균="+mainTodayTemAverage);

        // today total member count
        int totalMember = startContents.size();
        System.out.println("측정인원="+totalMember);

        // 오늘 37도 이상인 멤버 숫자
        int memberCount = mainContentService.getTodayCountMemberOf37(today);
        System.out.println("37도이상인원="+memberCount);

        System.out.println("startMainPageList.size"+startContents.size());

        model.addAttribute("startContents", startContents);
        model.addAttribute("mainTodayTemAverage", mainTodayTemAverage);
        model.addAttribute("totalMember", totalMember);
        model.addAttribute("memberCount", memberCount);

        return "mainContentStartPage";
    }


    @RequestMapping("mainContentPage")
    public String mainContentStartPage(TemperatureBasicVo param, Model model){

        String selectedDay = param.getTemperature_date();

        // selected day 체온정보 리스트 출력용
        ArrayList<MemTemJoinVO> mainContentList = new ArrayList<MemTemJoinVO>();

        mainContentList = mainContentService.getSelectDayContents(param);

        
        // selected day 멤버 평균 체온
        Float selectedDayAverage = mainContentService.getSelectDayAverageTem(param);

        // 소숫점 1자리까지 출력
        String mainSelectedDayTemAverageString = String.format("%.1f", selectedDayAverage);
        // 다시 숫자로 변환
        double mainSelectedDayTemAverage = Double.parseDouble(mainSelectedDayTemAverageString);

        // selected day total member count
        int mainContentTotalMember = mainContentList.size();

        // selcted day 37도 이상인 멤버 숫자
        int mainContentMemberOf37 = mainContentService.getSelectDayCountMemberOf37(param);

        model.addAttribute("selectedDay", selectedDay);
        model.addAttribute("mainContentList", mainContentList);
        model.addAttribute("mainSelectedDayTemAverage", mainSelectedDayTemAverage);
        model.addAttribute("mainContentTotalMember", mainContentTotalMember);
        model.addAttribute("mainContentMemberOf37", mainContentMemberOf37);

        return "mainContentPage";

    }

    @RequestMapping("memberInfoPage")
    public String memberInfoPage(MemberBasicVo param, Model model){

        MemberBasicVo memberInfo = memberContentService.getMemberInfoByVo(param);

        ArrayList<TemperatureBasicVo> temperatureList = memberContentService.getMemberTemContents(param);

        model.addAttribute("memberInfo", memberInfo);
        model.addAttribute("temperatureList", temperatureList);

        return "memberInfoPage";

    }



    

}
