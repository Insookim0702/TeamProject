## 창업 with 데이터
- 개발자: 김인수 (기여도 40%)<br>
- 개발 기간 :2018.08.13~ 2018.08.24<br>
- 기여 내용: 
> 1. 백앤드 개발
>       - 게시판 쓰기, 읽기, 변경, 삭제 CRUD기능 구현(front아님.)
>       - 로그인 및 회원가입 기능 구현.(front 아님.)
>       - 사용자의 희망 창업 구의 상주인구, 유동인구, 직장인구, 유사 점포수를 입력하면 랜덤 포레스트 분석기법을 사용해서 R로 ＇예상매출액＇을 제공              하는 process logic 설계 및 back-end 개발
> 2. '네이버로 로그인하기' API를 사용해 로그인 기능 제공.
> 3.  PM 
>- 사용 언어
>  - Front-end : ejs/ CSS/ HTML/ JavaScript
>  - 서버단 및 로직 개발 : Node.js/ ejs
- 사용 언어
 >  - Front-end : ejs/ CSS/ HTML/ JavaScript
 >  - 서버단 및 로직 개발 : Node.js/ ejs
 > - Database :  MySQL
![enter image description here](https://user-images.githubusercontent.com/42515875/45925911-a15c2d00-bf58-11e8-92b6-eb144f79fed8.png)
- 설명
>  - 서울시에 카페창업을 희망하는 예비 창업자들에게 csv같은 raw data를 가공해서 제공하므로서 유의미한 창업 의사결정에 도움을 주는 서비스입니다.
>  - 각 '구'별 '유동인구', '상주인구', '직장인구' 데이터를 시각화해서 제공합니다.
>   - 사용자의 희망 창업 구의 상주인구, 유동인구, 직장인구, 유사 점포수를 입력하면 랜덤포레스트분석기법을 사용해서 R로 '예상매출액'을 제공합니다.
>   - 창업관련 강의를 제공함으로써 창업자가 창업에 대한 지식을 갖게 도움을 줍니다.
# 개발 세부 내용 : MVC모델. <br>
<br>


# 개발 세부 내용 <br>
 - javascript를 사용해 서버 개발
<br>


## 예상매출액 분석 페이지
![예상매출액 분석 결과 도출](https://user-images.githubusercontent.com/42515875/46077532-2bf89280-c1cc-11e8-8712-215505c81fe5.png)

## 게시판 구현
1. 게시판 목록 화면.
![enter image description here](https://user-images.githubusercontent.com/42515875/45925909-9903f200-bf58-11e8-8b5c-a0ce684a1ee2.png)
2.  게시판 - 글 읽기 페이지
![enter image description here](https://user-images.githubusercontent.com/42515875/45925907-973a2e80-bf58-11e8-991a-3af1c4d2c391.png)
3. 게시판 - 글쓰기 페이지
![enter image description here](https://user-images.githubusercontent.com/42515875/45925908-97d2c500-bf58-11e8-9c30-c940e7dba837.png)
## '네이버 아이디로 로그인하기' API 적용
![네이버](https://user-images.githubusercontent.com/42515875/45925915-b20ca300-bf58-11e8-9661-cf9be80b7c9a.png)
## 창업자 학습 페이지
![enter image description here](https://user-images.githubusercontent.com/42515875/45925920-b89b1a80-bf58-11e8-93cd-535b3b2636b1.png)
