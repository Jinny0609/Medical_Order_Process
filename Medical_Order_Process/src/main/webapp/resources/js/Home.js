<<<<<<< HEAD
document.addEventListener("DOMContentLoaded", function() {
<<<<<<< HEAD
    let slides = Array.from(document.querySelectorAll('.slide'));
    let currentSlide = 0;
    let slideButtons = Array.from(document.querySelectorAll('.slide-button'));

    slideButtons[currentSlide].classList.add('active-button');

    slideButtons.forEach((button, index) => {
        button.addEventListener('mouseover', function() {
            slideButtons[currentSlide].classList.remove('active-button');

            let targetSlide = parseInt(button.getAttribute('data-slide'));
            slides[currentSlide].style.opacity = 0;
            currentSlide = targetSlide;
            slides[currentSlide].style.opacity = 1;

            slideButtons[currentSlide].classList.add('active-button');
        });
    });

    let timer = setInterval(function() {
        slides[currentSlide].style.opacity = 0;
        slideButtons[currentSlide].classList.remove('active-button');

        currentSlide = (currentSlide+1)%slides.length;
        slides[currentSlide].style.opacity = 1;
        slideButtons[currentSlide].classList.add('active-button');
    }, 5000);

    // 슬라이드 버튼에 마우스를 올리면 자동 슬라이드를 중지
    slideButtons.forEach(button => {
        button.addEventListener('mouseover', function() {
            clearInterval(timer);
        });
    });

    // 슬라이드 버튼에서 마우스를 떼면 자동 슬라이드를 다시 시작
    slideButtons.forEach(button => {
        button.addEventListener('mouseout', function() {
            timer = setInterval(function() {
                slides[currentSlide].style.opacity = 0;
                slideButtons[currentSlide].classList.remove('active-button');

                currentSlide = (currentSlide+1)%slides.length;
                slides[currentSlide].style.opacity = 1;
                slideButtons[currentSlide].classList.add('active-button');
            }, 5000);
        });
    });
=======
  // banner slider[start]
  let slides = Array.from(document.querySelectorAll('.slide'));
  let currentSlide = 0;
  let slideButtons = Array.from(document.querySelectorAll('.slide-button'));
=======
// banner slider[start]
$(document).ready(function() {
  var bannerSlideIndex = 0;
  var slideTimer = null;
>>>>>>> 25ed067 (home.jsp slide banner change)

  $('.slide-button').hover(function() {
    bannerSlideIndex = $(this).data('slide');
    showSlides(bannerSlideIndex);
  });

  $('.slider').hover(
    function() {
      clearInterval(slideTimer);
    },
    function() {
      slideTimer = setInterval(function() {
        bannerSlideIndex++;
        if (bannerSlideIndex >= $('.slide').length) bannerSlideIndex = 0;
        showSlides(bannerSlideIndex);
      }, 2000);
    }
  );

  function showSlides(n) {
    $('.slide').hide();
    $('.slide-button').css('border', 'none');
    $('.slide').eq(n).show();
    $('.slide-button').eq(n).css('border', '2px solid #0099FF');
  }

  // 슬라이드 쇼 시작 시 첫 번째 슬라이드 표시
  showSlides(0);

  slideTimer = setInterval(function() {
    bannerSlideIndex++;
    if (bannerSlideIndex >= $('.slide').length) bannerSlideIndex = 0;
    showSlides(bannerSlideIndex);
  }, 2000);
});

	
document.addEventListener("DOMContentLoaded", function() {
  //group_slider[start]
  let groupSlideIndex = 0;  // 현재 보고 있는 슬라이드의 인덱스
  const slideGroups = document.querySelector('.slide-groups');
  const groupSlides = document.querySelectorAll('.group_slide');
  const prevButton = document.querySelector('.prev-button');  // 이전 버튼
  const nextButton = document.querySelector('.next-button');  // 다음 버튼

  // 초기 상태 설정
  if(groupSlideIndex === 0) {
    prevButton.style.display = 'none';  // 처음 위치에서는 이전 버튼을 숨깁니다.
  }
  if(groupSlideIndex === groupSlides.length - 5) {
    nextButton.style.display = 'none';  // 마지막 위치에서는 다음 버튼을 숨깁니다.
  }

  // 다음 버튼 클릭 이벤트
  nextButton.addEventListener('click', () => {
    if(groupSlideIndex < groupSlides.length - 5) {
      groupSlideIndex += 5; // 5장씩 이동
      slideGroups.style.transform = `translateX(${-204 * groupSlideIndex}px)`;

      // 상태 업데이트
      if(groupSlideIndex > 0) {
        prevButton.style.display = 'inline-block';  // 이전 버튼을 보이게 합니다.
      }
      if(groupSlideIndex >= groupSlides.length - 5) {
        nextButton.style.display = 'none';  // 마지막 위치에서는 다음 버튼을 숨깁니다.
      }
    }
  });

  // 이전 버튼 클릭 이벤트
  prevButton.addEventListener('click', () => {
    if(groupSlideIndex > 0) {
    	groupSlideIndex -= 5; // 5장씩 이동
      slideGroups.style.transform = `translateX(${-204 * groupSlideIndex}px)`;

      // 상태 업데이트
      if(groupSlideIndex < groupSlides.length - 5) {
        nextButton.style.display = 'inline-block';  // 다음 버튼을 보이게 합니다.
      }
      if(groupSlideIndex === 0) {
        prevButton.style.display = 'none';  // 처음 위치에서는 이전 버튼을 숨깁니다.
      }
    }
  });
<<<<<<< HEAD

>>>>>>> refs/rewritten/test
=======
>>>>>>> 25ed067 (home.jsp slide banner change)
});
