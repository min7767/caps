<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>발로렌트</title>
        <!-- css -->
        <link rel="stylesheet" href="static/css/design.css">
    </head>
    
    <body>
        <div class="signup-container-wrapper">
            <div class="signup-container">
                <h1 class="title">회원가입</h1>
                <div class="input-group">
                    <label for="username" class="input-label">아이디</label>
                    <input type="text" id="username" placeholder="아이디" onkeyup="checkUsername()" name="id">
                    <small id="username-message"></small>
                </div>
                <div class="input-group">
                    <label for="password" class="input-label">비밀번호</label>
                    <input type="password" id="password" placeholder="비밀번호" onkeyup="checkPassword()">
                </div>
                <div class="input-group">
                    <label for="confirm-password" class="input-label">비밀번호 확인</label>
                    <input type="password" id="confirm-password" placeholder="비밀번호 확인" onkeyup="checkPassword()">
                    <small id="password-message"></small>
                </div>
                <div class="input-group">
                    <label for="name" class="input-label">이름</label>
                    <input type="text" placeholder="이름">
                </div>
                <div class="input-group">
                    <label for="gender" class="input-label">성별</label>
                    <select>
                        <option value="">성별</option>
                        <option value="male">남성</option>
                        <option value="female">여성</option>
                    </select>
                </div>
                <div class="input-group">
                    <label for="birthdate" class="input-label">생년월일</label>
                    <input type="text" placeholder="생년월일(년4자)">
                </div>
                <div class="input-group">
                    <label for="phone" class="input-label">핸드폰번호</label>
                    <input type="text" placeholder="핸드폰번호">
                </div>
                <div class="input-group">
                    <label for="address" class="input-label">주소</label>
                    <input type="text" placeholder="주소">
                </div>
                <div class="input-group">
                    <label for="student-proof" class="input-label">대학생 증명서</label>
                    <input type="file" id="student-proof" placeholder="대학생 증명">
                </div>
                <button class="btn" id="signup-button">가입하기</button>
            </div>
        </div>
    </body>
<!-- javascript -->
<script src="/static/js/main.js"></script>
</html>