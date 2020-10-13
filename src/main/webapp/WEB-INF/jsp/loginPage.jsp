<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://kit.fontawesome.com/49199b18c4.js" crossorigin="anonymous"></script>
    <title>loginPage</title>
    <link rel="stylesheet" href="resources/CSS/loginPage.css"> 
    <link rel="stylesheet" href="resources/CSS/global.css">
    <link rel="stylesheet" href="resources/CSS/style.css"> 
    <style>
        .loginPage_body {
            background-image: url("https://user-images.githubusercontent.com/46100398/95442481-65a52c00-0996-11eb-9026-f628038a2dbd.jpg");
            background-repeat: no-repeat;
        }
    </style> 
</head>
<body class="loginPage_body">

    <main class="loginPage_main">
        <div class="login_box">
            <div class="login_text">
                LogIn
            </div>
            <form action="./loginAction" method="POST" calss="loginPage_insert_box">
                <div class="loginPage_insert_box_input-frame">
                    <div class="loginPage_insert_box_input-frame_inputBox login_id_inputBox1">
                        <input type="text" name="manager_id" class="loginPage_insert_box_input-frame_input1" placeholder="아이디"> 
                    </div>
                    <div class="loginPage_insert_box_input-frame_inputBox">
                        <input type="password" name="manager_pw" class="loginPage_insert_box_input-frame_input2" placeholder="비밀번호">
                    </div>
                </div>
                <button type="submit" class="loginPage_insert_box_button">로그인</button>   
            </form>
        </div>
    </main>

 
        
    
</body>
</html>