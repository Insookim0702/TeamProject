# StableProject 남학생 안정실 프로젝트
- 개발자: 김인수 (기여도 100%)<br>
- 개발 기간 :2018.07.25~ 버전 업 중....<br>
- 사용 언어
 >  - Front-end : JSP/ CSS/ HTML/ JavaScript
 >  - 서버단 및 로직 개발 : Tomcat -v8.5/ Servlet /JAVA
 > - Database :  Oracle Database
![stable_room Used Lang & Tool](https://user-images.githubusercontent.com/42515875/45603666-e79d2200-ba68-11e8-89dc-866848cc4d6d.png)
         
- 개발 목적 : 학교 안 남학생 안정실(침대 9개)에서 근무하면서 수기로 작성하는 입퇴실현황을 데이터베이스에 저장시키고, 데이터베이스에 저장된 입퇴실 정보로 학생들이 침대가 몇개 남았는지 스마트폰으로 확인할 수 있도록 하는 **Web Application**입니다. <br><br><br>
# 개발 세부 내용 : MVC모델. <br>
<br>

|MVC |  해당 파일 |
|--|--|
| MODEL  |  - **DAO.java** <br> 입실과 퇴실에 사용될 시간 클래스<br>```selectAll()```: 그 날에 입퇴실 목록을 전부 form.jsp에 뿌려서 보여준다.<br>```insertregister```: register.jsp에서 받아온 정보를 DB에 저장한다.<br>```getbednum(String no)```: 입퇴실상태 확인해서, 입실상태인 침대번호를 반환한다.<br> - **outDAO.java** <br> ```outdao(String no)``` : DB에 저장되어 있는 데이터에 퇴실시간과 입실을 '퇴실' 로 *update* task를 수행한다. <br> -**loginlogoutDAO.java** <br> ```loginCheck(String id, String pwcheck)``` : login.jsp에서 id와 pwcheck를 DB의 것과 비교하여 맞으면 *관리자* 이름을 반환한다.<br> -**MemberDAO.java** <br>:```duplicateIdCheck()``` : DB에 있는 id 중복확인 함수<br> ```insertMember()```  : DB에 새로운 관리자 회원가입 정보 저장|
|VIEW | - **form.jsp** : 메인 페이지,<br> - **AllView.jsp** : DB로부터 입퇴실 기록 받아와서 form.jsp에 뿌리는 JSP,<br> - **register.jsp** : 입실 페이지(입실 등록),<br>- **out.jsp** : 퇴실하는 페이지,<br> - **login.jsp** : 관리자 로그인하는 페이지,<br> - **msgView.jsp** : 서버에서 전달하는 메시지를 받아서 client에게 보여주는 페이지 ,<br> - **errorView.jsp** : 서버에서 받은 error메시지를 client에 보여주는 페이지, - **singup.jsp** : 관리자 회원가입 페이지<br>|
|Controller | - **Allcontroller.java** : 서버에서 가져온 오늘 날짜 입퇴실 정보를 AllView.jsp에 뿌려준다.,<br> - **outController.java**, <br>  - **registerController.java** : <br> -**loginlogout.java** : login.jsp에서 넘겨받은 id, pw와 DB에 저장된 관리자 id, pw를 확인하여 맞으면 session을 부여하고 관리자 페이지로 전환<br> -**MemberCheckAction.java** : 관리자 회원가입 시 id의 중복확인을 위한 Controller로,  ```MemberDAO.duplicateIdCheck(id)```를 통해서 DB에 관리자 id를 중복확인 한다.temp.jsp로 중복이면 '1' 아니면 '0'을 반환해 준다.<br>- **newprocess.java** : 회원가입에서 signup.jsp에서 받아온 정보를 DB에 저장시킨다.<br> - **outController.java**: out.jsp에서 넘겨받은 침대번호로 퇴실처리한다. *outDAO*를 호출해서 DB에 퇴실시간과 입실상황을 '퇴실'로 *update*  <br> -**registerController.java**: DAO에 ```insertregister```함수를 사용해서 DB에 입실된 정보를 저장시킨다. /입실된 침대번호를 form.jsp에 뿌려줘서 form.jsp에서 입실 상태를 확인할 수 있게 한다.<br>|

                



                
## 일반 사용자가 보는 페이지
<br>
>  - 입퇴실 처리 불가능.
>  - 입퇴실 현황만 확인 가능.
>   ![일반 사용자 페이지](https://user-images.githubusercontent.com/42515875/45603702-334fcb80-ba69-11e8-9952-9d987e2d4962.png)
 
 <br>
 ## 관리자가 보는 페이지<br>
 > - 입퇴실 관리 가능.
 >  - 관리자 회원가입 가능.
 > ![enter image description here](https://user-images.githubusercontent.com/42515875/45603977-a1e15900-ba6a-11e8-98d6-2b02b9ffea2b.png)
<br>
## 입실 등록
<br>
> - 관리자 권한으로 입실처리.
>  - JSTL을 활용하여, **Click**한 **침대번호**를 {param?no=침대번호}을 사용해서 해당 **침대 번호**를 입실 페이지로 자동 전달.
> ![enter image description here](https://user-images.githubusercontent.com/42515875/45604234-5da38800-ba6d-11e8-9c75-fa3c3b53a229.png)
<br>

## 퇴실 기능<br>
> - 메인 화면에 침대 이미지에 **Mouseover**하면 퇴실버튼으로 바뀝니다. **Click** 하면 아래 그림과 같은 퇴실 페이지로 이동합니다.
> - JSTL을 활용하여, **Click**한 **침대번호**를 {param?no=7}을 사용해서 해당 침대 번호 퇴실 페이지로  자동 전달.
> - 퇴실 버튼만 **Click** 하면됨. 
![enter image description here](https://user-images.githubusercontent.com/42515875/45603708-3ba80680-ba69-11e8-8894-cff201cc00a7.png)
<br>

## 관리자 권한으로 다른 관리자 가입시키기<br>
> - JSP/CSS 직접 구현.
>  - 중복확인 기능.
>  - id는 admin+번호 입력으로 가능.
>   - **비밀번호** 및 **비밀번호 확인** 판별.
>    ![enter image description here](https://user-images.githubusercontent.com/42515875/45603720-4ebad680-ba69-11e8-889f-fe0e908da003.png)

<br>
## stable_room Used Lang & Tool<br>        
   >  - Front-end : JSP/ CSS/ HTML/ JavaScript
    >  - 서버단 및 로직 개발 : Servlet /JAVA
    > - Database :  Oracle Database
![stable_room Used Lang & Tool](https://user-images.githubusercontent.com/42515875/45603666-e79d2200-ba68-11e8-89dc-866848cc4d6d.png)
 

