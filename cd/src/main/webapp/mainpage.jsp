<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>발로렌트</title>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
        <script src="https://cdn.tailwindcss.com"></script>
        <style>
            body {
                font-family: 'Roboto', sans-serif;
            }
        </style>
    </head>
    <body class="bg-gray-100">
        <header class="bg-white shadow-md">
            <div class="container mx-auto px-4 py-4 flex justify-between items-center">
                <h1 class="text-2xl font-bold">발로렌트</h1>
                <nav>
                    <ul class="flex space-x-4">
                        <li><a href="#" class="text-gray-700">공지사항</a></li>
                        <li><a href="signup.html" class="text-gray-700">회원가입</a></li>
                        <li><a href="login.html" class="bg-blue-500 text-white px-4 py-2 rounded">로그인</a></li>
                    </ul>
                </nav>
            </div>
        </header>
    
        <main class="container mx-auto px-4 py-8">
            <div class="grid grid-cols-1 md:grid-cols-2 gap-8">
                <div class="bg-pink-100 p-4 rounded shadow-md">
                    <a href="#" class="block text-center">
                        <img src="static\img\laptop.jpg" alt="노트북 대여" class="mx-auto mb-4">
                        <span class="text-lg font-semibold">노트북 대여</span>
                    </a>
                </div>
                <div class="bg-pink-100 p-4 rounded shadow-md">
                    <a href="#" class="block text-center">
                        <img src="static\img\tablet.jpg" alt="패드/탭 대여" class="mx-auto mb-4">
                        <span class="text-lg font-semibold">패드/탭 대여</span>
                    </a>
                </div>
            </div>
        
            <div class="mt-8 grid grid-cols-1 md:grid-cols-2 gap-8">
                <div class="bg-white p-4 rounded shadow-md">
                    <h2 class="text-xl font-bold mb-4">대여 UP! 리스트</h2>
                    <table class="w-full text-left">
                        <thead>
                            <tr>
                                <th class="border-b-2 py-2">제품</th>
                                <th class="border-b-2 py-2">월간 대여비</th>
                                <th class="border-b-2 py-2">판매자</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td class="border-b py-2">맥북</td>
                                <td class="border-b py-2">25,000원</td>
                                <td class="border-b py-2"><a href="#" class="text-blue-500">홍길동</a></td>
                            </tr>
                            <tr>
                                <td class="border-b py-2">갤럭시 오디세이</td>
                                <td class="border-b py-2">35,000원</td>
                                <td class="border-b py-2"><a href="#" class="text-blue-500">김강길</a></td>
                            </tr>
                            <tr>
                                <td class="border-b py-2">아이패드 Air 5</td>
                                <td class="border-b py-2">22,000원</td>
                                <td class="border-b py-2"><a href="#" class="text-blue-500">장지엽</a></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="bg-white p-4 rounded shadow-md">
                    <h2 class="text-xl font-bold mb-4">공지사항</h2>
                    <ul>
                        <li class="border-b py-2">허위 매물 처벌합니다</li>
                    </ul>
                    <a href="#" class="text-blue-500 block mt-4">더보기</a>
                </div>
            </div>
        </main>
    
        <footer class="bg-gray-200 py-4 mt-8">
            <div class="container mx-auto px-4 text-center">
                <ul class="flex justify-center space-x-4">
                    <li><a href="footers/terms.html" class="text-gray-700">이용약관</a></li>
                    <li><a href="footers/trade_terms.html" class="text-gray-700">거래약관</a></li>
                    <li><a href="footers/privacy.html" class="text-gray-700">개인정보 취급방침</a></li>
                    <li><a href="footers/support.html" class="text-gray-700">1대1 문의</a></li>
                </ul>
            </div>
        </footer>
    </body>
</html>