<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head></head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/49199b18c4.js" crossorigin="anonymous"></script>
    <title>memberInfoPage</title>
    <link rel="stylesheet" href="resources/CSS/style.css">
    <link rel="stylesheet" href="resources/CSS/global.css">
    <link rel="stylesheet" href="resources/CSS/memberInfoPage.css">
</head>
<body class="memberInfoPage_body">

    <section class="memberInfoPage_section1">
        <div class="memberInfoPage_section1_memberinfo">
            <div class="memberInfoPage_section1_memberinfo_left">
                <c:choose>
                    <c:when test="${memberInfo.member_idx == 1}">
                        <img src="https://user-images.githubusercontent.com/46100398/95995210-28e0a580-0e6c-11eb-87e9-1da4ffcd5950.jpg" alt="sol's img">
                    </c:when>
                    <c:when test="${memberInfo.member_idx == 2}">
                        <img src="https://user-images.githubusercontent.com/46100398/95995217-2aaa6900-0e6c-11eb-8e00-cf90330ae34c.jpg" alt="won's img">
                    </c:when>
                    <c:when test="${memberInfo.member_idx == 3}">
                        <img src="https://user-images.githubusercontent.com/46100398/95995231-2e3df000-0e6c-11eb-945e-3aa2dd9020ec.jpg" alt="hyun's img">
                    </c:when>
                    <c:otherwise>
                        <img src="https://user-images.githubusercontent.com/46100398/96003691-76154500-0e75-11eb-9492-299e6179a636.jpg" alt="someone's img">
                    </c:otherwise>
                </c:choose>
            </div>
            <div class="memberInfoPage_section1_memberinfo_right">
                <div class="memberInfoPage_section1_memberinfo_right-textBox">
                    <div class="memberInfoPage_section1_memberinfo_right-textBox_title memberInfoPage_section1_memberinfo_right-textBox_title1">
                        소속
                    </div>
                    <div class="memberInfoPage_section1_memberinfo_right-textBox_text">
                        CCCR
                    </div>
                </div>
                <div class="memberInfoPage_section1_memberinfo_right-textBox">
                    <div class="memberInfoPage_section1_memberinfo_right-textBox_title memberInfoPage_section1_memberinfo_right-textBox_title1">
                        이름
                    </div>
                    <div class="memberInfoPage_section1_memberinfo_right-textBox_text">
                        ${memberInfo.member_name}
                    </div>
                </div>
                <div class="memberInfoPage_section1_memberinfo_right-textBox">
                    <div class="memberInfoPage_section1_memberinfo_right-textBox_title memberInfoPage_section1_memberinfo_right-textBox_title3">
                        생년월일
                    </div>
                    <div class="memberInfoPage_section1_memberinfo_right-textBox_text">
                        ${memberInfo.member_birth}
                    </div>
                </div>
                <div class="memberInfoPage_section1_memberinfo_right-textBox">
                    <div class="memberInfoPage_section1_memberinfo_right-textBox_title memberInfoPage_section1_memberinfo_right-textBox_title1">
                        성별
                    </div>
                    <div class="memberInfoPage_section1_memberinfo_right-textBox_text">
                        ${memberInfo.member_gender}
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="memberInfoPage_section2">
        <div class="memberInfoPage_section2_wrapper">
            <div class="memberInfoPage_section2_top">
                해당 인물 전체 체온 데이터 List
            </div>
            <div class="memberInfoPage_section2_middle">
                <div class="memberInfoPage_section2_middle_Box1">
                    date
                </div>
                <div class="memberInfoPage_section2_middle_Box1">
                    temperature
                </div>
                <div class="memberInfoPage_section2_middle_Box1">
                    location
                </div>
                <div class="memberInfoPage_section2_middle_Box1">
                    time
                </div>
            </div>
            <!--반복문 시작-->
            <c:forEach items="${temperatureList}" var="temList">
                <div class="memberInfoPage_section2_bottom">
                    <div class="memberInfoPage_section2_bottom_Box1">
                        ${temList.temperature_date}
                    </div>
                    <div class="memberInfoPage_section2_bottom_Box1">
                        ${temList.temperature_tem}
                    </div>
                    <div class="memberInfoPage_section2_bottom_Box1">
                        ${temList.temperature_location}
                    </div>
                    <div class="memberInfoPage_section2_bottom_Box1">
                        ${temList.temperature_time}
                    </div>
                </div>
            </c:forEach>
        </div>
    </section>
    
</body>
</html>