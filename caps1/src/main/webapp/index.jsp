<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>발로렌트</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">
    <style>
        a {
            color: black;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline; 
        }
    </style>
</head>
<body>
    <div class="header">
        <div class="logo"><a href="index.jsp">발로렌트</a></div>
        <div class="nav">
            <div><a href="notice.html">공지사항</a></div>
            <div><a href="signup.html">회원가입</a></div>
            <div><a href="login.html"><button>로그인</button></a></div>
        </div>
    </div>

    <div class="container">
        <div class="section">
            <a href="notebook.html">
                <img src="images/노트북.png" alt="노트북 대여">
                <p>노트북 대여</p>
            </a>
        </div>
        <div class="section">
            <a href="pad.html">
                <img src="images/pad.jpg" alt="패드/탭 대여">
                <p>패드/탭 대여</p>
            </a>
        </div>
    </div>

    <div class="content">
        <div class="left">
            <table>
                <thead>
                    <tr>
                        <th>대여 UP! 리스트</th>
                        <th>월간 대여비</th>
                        <th>판매자</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>맥북</td>
                        <td>25,000원</td>
                        <td>홍길동</td>
                    </tr>
                    <tr>
                        <td>갤럭시 오디세이</td>
                        <td>35,000원</td>
                        <td>홍길동</td>
                    </tr>
                    <tr>
                        <td>아이패드 Air 5</td>
                        <td>22,000원</td>
                        <td>홍길동</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="right">
            <table>
                <thead>
                    <tr>
                        <th>공지사항</th>
                        <th>더보기</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td colspan="2">허위 매물 처벌합니다</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

    <div class="footer">
        이용약관 | 거래약관 | 개인정보 취급방침 | 임차자 1대1 문의
    </div>
</body>
</html>
