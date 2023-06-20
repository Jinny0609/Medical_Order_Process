<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="include/header.jsp"%>
<meta charset="UTF-8">
<title>관리자 페이지</title>
<link rel="stylesheet" type="text/css" href="resources/css/Order_history/Order_history.css">
</head>
<body>
    <div class="MainWrapper">
        <table>
            <!-- 게시판 제목 -->
            <tr class="Header">
                <th colspan="6" class="Header2">관리자 페이지</th>
            </tr>
            <!-- 게시판 목록 -->
            <tr>
                <!-- 검색 폼 영역 -->
                <td colspan="6">
                    <select>
                        <option value='A'>상품명</option>
                        <option value='T'>날짜</option>
                        <option value='C'>유저 아이디</option>
                    </select>
                    <input type="text" />
                    <button type="button" class="Button Login">검색</button>
                </td>
            </tr>
            <tr>
                <th>No</th>
                <th>유저 아이디</th>
                <th>상품명</th>
                <th>가격(원)</th>
                <th>날짜</th>
            </tr>
            <!-- 게시물이 출력될 영역 -->
            <tr>
                <td>1</td>
                <td>202306160712</td>
                <td>투명 망토</td>
                <td>4,900</td>
                <td>2023.06.16</td>
            </tr>
        </table>
    </div>
</body>
<%@ include file="include/Footer.jsp"%>
</html>