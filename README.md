# StableProject 남학생 안정실 프로젝트
- 개발자: 김인수 (기여도 100%)<br>
- 사용 언어
         

- 개발 기간 :2018.07.25~ 버전 업 중....<br>
- 개발 세부 내용 : MVC모델로 개발하였습니다. <br>

|MVC |  해당 파일 |
|--|--|
| MODEL  |  DAO.java,<br> - outDAO.java <br> |
|VIEW | - **form.jsp** : 메인 페이지,<br> - **AllView.jsp** : DB로부터 입퇴실 기록 받아와서 form.jsp에 뿌리는 JSP,<br> - **register.jsp** : 입실 페이지(입실 등록),<br>- **out.jsp** : 퇴실하는 페이지,<br> - **login.jsp** : 관리자 로그인하는 페이지,<br> - **msgView.jsp** : 서버에서 전달하는 메시지를 받아서 client에게 보여주는 페이지 ,<br> - **errorView.jsp** : 서버에서 받은 error메시지를 client에 보여주는 페이지, - **singup.jsp** : 관리자 회원가입 페이지<br>|
|Controller | - **Allcontroller.java** : 서버에서 가져온 오늘 날짜 입퇴실 정보를 AllView.jsp에 뿌려준다.,<br> - **outController.java**, <br>  - **registerController.java** : <br> -**loginlogout.java** : login.jsp에서 넘겨받은 id, pw와 DB에 저장된 관리자 id, pw를 확인하여 맞으면 session을 부여하고 관리자 페이지로 전환<br> -**MemberCheckAction.java** : 관리자 회원가입 시 id의 중복확인을 위한 Controller로,  ```MemberDAO.duplicateIdCheck(id)```를 통해서 DB에 관리자 id를 중복확인 한다.temp.jsp로 중복이면 '1' 아니면 '0'을 반환해 준다.<br>- ** ** :<br><br>|

                



학생들이 안정실에 침대를 이용할 때 입퇴실 현황을 간편히 하기 위해 학번과 이름 그리고 전화번호를 입력하면 DB에 저장되고, 침대의 그림상                 태는 사용중으로 바뀝니다. 퇴실하면 퇴실상태로 DB의 값에 따라 변합다.<br>
                
## 일반 사용자가 보는 페이지
>  - 입퇴실 처리 불가능.
>  - 입퇴실 현황만 확인 가능.
>   ![일반 사용자 페이지](https://user-images.githubusercontent.com/42515875/45603702-334fcb80-ba69-11e8-9952-9d987e2d4962.png)
 ## 관리자가 보는 페이지
 > - 입퇴실 관리 가능.
 >  - 관리자 회원가입 가능.
 > ![enter image description here](https://user-images.githubusercontent.com/42515875/45603977-a1e15900-ba6a-11e8-98d6-2b02b9ffea2b.png)

## 입실 등록
> - 관리자 권한으로 입실처리.
>  - JSTL을 활용하여, **Click**한 **침대번호**를 {param?no=침대번호}을 사용해서 해당 **침대 번호**를 입실 페이지로 자동 전달.
> ![enter image description here](https://user-images.githubusercontent.com/42515875/45604234-5da38800-ba6d-11e8-9c75-fa3c3b53a229.png)
## 퇴실 기능
> - 메인 화면에 침대 이미지에 **Mouseover**하면 퇴실버튼으로 바뀝니다. **Click** 하면 아래 그림과 같은 퇴실 페이지로 이동합니다.
> - JSTL을 활용하여, **Click**한 **침대번호**를 {param?no=7}을 사용해서 해당 침대 번호 퇴실 페이지로  자동 전달.
> - 퇴실 버튼만 **Click** 하면됨. 
![enter image description here](https://user-images.githubusercontent.com/42515875/45603708-3ba80680-ba69-11e8-8894-cff201cc00a7.png)


## 관리자 권한으로 다른 관리자 가입시키기
> - JSP/CSS 직접 구현.
>  - 중복확인 기능.
>  - id는 admin+번호 입력으로 가능.
>   - **비밀번호** 및 **비밀번호 확인** 판별.
>    ![enter image description here](https://user-images.githubusercontent.com/42515875/45603720-4ebad680-ba69-11e8-889f-fe0e908da003.png)


## stable_room Used Lang & Tool        
   >  - Front-end : JSP/ CSS/ HTML/ JavaScript
    >  - 서버단 및 로직 개발 : Servlet /JAVA
    > - Database :  Oracle Database
![stable_room Used Lang & Tool](https://user-images.githubusercontent.com/42515875/45603666-e79d2200-ba68-11e8-89dc-866848cc4d6d.png)
 



