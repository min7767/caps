<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>발로렌트</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <link rel="stylesheet" type="text/css" href="css/mypage.css">
</head>
<body>
    <div class="header">
        <div class="logo"><a href="index.jsp">발로렌트</a></div>
        <div class="nav">
            <div><a href="notice.html">공지사항</a></div>
            <div><a href="signup.html">회원가입</a></div>
            <div><a href="login.html"><button>로그인</button></a></div>
            <div><a href="about.html">회사소개</a></div>
            <div><a href="contact.html">문의하기</a></div>
        </div>
    </div>
    
    <div class="container">
        <div class="sidebar">
            <button>개인정보확인/수정</button>
            <button>대여내역</button>
            <button>알림내역</button>
            <button>문의하기/내역확인</button>
        </div>
        
        <div class="main-content">
            <h2>대여한 물품</h2>
            <table>
                <tr>
                    <th>물품</th>
                    <th>대여 기간</th>
                    <th class="status">상태</th>
                </tr>
                <tr>
                    <td><img src="img/device1.jpg" alt="Device 1" width="50"> 갤럭시 오디세이</td>
                    <td>24.03.21 ~ 24.07.14</td>
                    <td class="status">반납완료</td>
                </tr>
                <tr>
                    <td><img src="img/device2.jpg" alt="Device 2" width="50"> 아이패드 Air 5</td>
                    <td>24.01.11 ~ 25.06.24</td>
                    <td class="status">대여중</td>
                </tr>
            </table>
            
            <h2>대여해준 물품</h2>
            <table>
                <tr>
                    <th>물품</th>
                    <th>대여 기간</th>
                    <th class="status">상태</th>
                </tr>
                <tr>
                    <td><img src="img/device3.jpg" alt="Device 3" width="50"> 아이패드 Pro</td>
                    <td>24.02.23 ~ 25.04.06</td>
                    <td class="status">대여중</td>
                </tr>
            </table>
        </div>
    </div>
    
    <div class="footer">
        <a href="terms.html">이용약관</a> | 
        <a href="trade_terms.html">거래약관</a> | 
        <a href="privacy.html">개인정보 취급방침</a> | 
        <a href="support.html">임차자 1대1 문의</a>
    </div>
</body>
</html>