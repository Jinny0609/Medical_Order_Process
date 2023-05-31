<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Marsh Tit Medical</title>
	<link rel="stylesheet" type="text/css" href="resources/css/Home.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.1/font/bootstrap-icons.css"><!-- 헤더  -->
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"><!-- 헤더  --> 
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
	<script src="resources/js/Home.js"></script>
</head>

<header>
  <div class="dropdown">
    <button class="btn btn-danger">
      <i class="bi bi-justify fs-2"></i><br>
      카테고리
    </button>
    <div class="dropdown-content">
      <a href="#">패션의류</a>
      <a href="#">뷰티</a>
      <a href="#">디지털/가전</a>
      <a href="#">식품</a>
      <a href="#">도서</a>
      <a href="#">스포츠/레저</a>
    </div>
  </div>
  <section>
    <div class="I_BOX">
      <h1 class="I_logo">
        <a>
          <img src="resources/img/home/coupang.png" alt="쿠팡로고" width="174" height="39">
        </a>
      </h1>
      <div class="search">
        <input class="S_input" type="text" placeholder="검색어 입력">
        <img class="S_img" src="https://s3.ap-northeast-2.amazonaws.com/cdn.wecode.co.kr/icon/search.png">
      </div>
      <ul class="H_ikon">
        <li><a><i class="bi bi-person fs-2"></i><span>마이 페이지</span></a></li>
        <li><a><i class="bi bi-cart3 fs-2"></i><span>장바구니</span></a></li>
      </ul>
    </div>
  </section>
</header>
<article class="Top_bar">
  <div class="M_box">
    <ul class="M_sub">
      <li>즐겨찾기</li>
      <li>입점신청</li>
    </ul>
    <ul class="M_login">
      <li>로그인</li>
      <li>회원가입</li>
      <li>고객센터</li>
    </ul>
  </div>
</article>

<body>

<!-- banner slider -->
<div class="slider">
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner1_n.png');"></div>
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner2_n.png');"></div>
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner3_n.png');"></div>
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner4_n.png');"></div>
  <div class="slide" style="background-image: url('resources/img/home/item/banner/banner5_n.png');"></div>

  <div class="slide-buttons">
    <span class="slide-button" data-slide="0">
      <img src="resources/img/home/item/btn/banner_btn1.png" alt="Button 1">
    </span>
    <span class="slide-button" data-slide="1">
      <img src="resources/img/home/item/btn/banner_btn2.png" alt="Button 2">
    </span>
    <span class="slide-button" data-slide="2">
      <img src="resources/img/home/item/btn/banner_btn3.png" alt="Button 3">
    </span>
    <span class="slide-button" data-slide="3">
      <img src="resources/img/home/item/btn/banner_btn4.png" alt="Button 4">
    </span>
    <span class="slide-button" data-slide="4">
      <img src="resources/img/home/item/btn/banner_btn5.png" alt="Button 5">
    </span>
  </div>
</div>



<!-- group slider -->
<h4>오늘의 판매자 특가</h4>
<div class="group_slider">
  <div class="slide-groups">
    <!-- 슬라이드 1 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/1.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
    
    <!-- 슬라이드 2 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/2.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>

    <!-- 슬라이드 3 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/3.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>

    <!-- 슬라이드 4 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/4.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
    
    <!-- 슬라이드 5 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/5.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
    
    <!-- 추가 슬라이드 6 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/6.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
    
    <!-- 추가 슬라이드 7 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/7.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
    
    <!-- 추가 슬라이드 8 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/8.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
    
    <!-- 추가 슬라이드 9 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/9.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
    
    <!-- 추가 슬라이드 10 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/10.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
    
    <!-- 추가 슬라이드 11 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/11.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>

    <!-- 추가 슬라이드 12 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/12.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>

    <!-- 추가 슬라이드 13 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/13.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>

    <!-- 추가 슬라이드 14 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/14.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>

    <!-- 추가 슬라이드 15 -->
    <div class="group_slide">
      <img src="resources/img/home/item/group_banner/15.jpg" alt="1">
      <div class="discount">할인률</div>
      <div class="name">상품 이름</div>
      <div class="price">가격</div>
      <div class="rating">평점</div>
    </div>
  </div>
  <div class="prev-button">이전</div>
  <div class="next-button">다음</div>
</div>

</body>

<!-- footer -->
<footer>
  <div class="footer-container">
    <div class="footer-section">
      <h3 class="footer-heading">고객센터</h3>
      <ul class="footer-links">
        <li><a href="#">자주 묻는 질문</a></li>
        <li><a href="#">1:1 문의</a></li>
        <li><a href="#">고객의 소리</a></li>
        <li><a href="#">인재 채용 안내</a></li>
      </ul>
    </div>
    
    <div class="footer-section">
      <h3 class="footer-heading">회사 정보</h3>
      <ul class="footer-links">
        <li>상호명 및 호스팅 서비스 제공 : 쿠팡(주)</li>
        <li>대표이사 : 강한승, 박대준</li>
        <li>서울시 송파구 송파대로 570</li>
        <li>사업자 등록번호 : 120-88-00767</li>
        <li>통신판매업신고 : 2017-서울송파-0680</li>
      </ul>
    </div>
    
    <div class="footer-section">
      <h3 class="footer-heading">팔로우하기</h3>
      <ul class="footer-social">
        <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
        <li><a href="#"><i class="fab fa-instagram"></i></a></li>
        <li><a href="#"><i class="fab fa-youtube"></i></a></li>
        <li><a href="#"><i class="fab fa-twitter"></i></a></li>
      </ul>
  	</div>
  </div>
	
  <div class="footer-bottom">
    <p>
      사이버몰 내 판매되는 상품 중에는 쿠팡에 등록한 개별 판매자가 판매하는 마켓플레이스(오픈마켓) 상품이 포함되어 있습니다.
마켓플레이스(오픈마켓) 상품의 경우 쿠팡은 통신판매중개자이며 통신판매의 당사자가 아닙니다.
쿠팡은 마켓플레이스(오픈마켓) 상품, 거래정보 및 거래 등에 대하여 책임을 지지 않습니다.
쿠팡은 소비자 보호와 안전거래를 위해 신뢰관리센터(CM112@coupang.com)를 운영하고 있으며, 관련 분쟁이 발생할 경우 별도의 분쟁 처리절차에 의거 분쟁이 처리됩니다.
Copyright © Coupang Corp. 2010-2022 All Rights Reserved.
    </p>
  </div>
</footer>

</html>
