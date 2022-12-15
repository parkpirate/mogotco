# MOGOTCO
<img  src="https://user-images.githubusercontent.com/83347312/207089142-e9d840c9-f774-49a1-9e94-0096fd6eea14.png" width="60%" height="100%">

# 팀정보 + 시연영상
## 팀이름 : MOGOTCO  
  
## 팀원
#### 팀장 : 조윤영
#### 팀원 : 박성훈, 박혜정, 신동준  

## 시연영상
#### https://youtu.be/Y84_nNsFm80
<br/>
<br/>

# 프로젝트 정보
## 1. 프로젝트 주제
개발 멘토링 사이트를 구축하여 영상채팅을 통해 개발자에게 도움을 받을 수 있는 공간을 만든다.
## 2. 프로젝트 목적
1. 클라우드 환경 사용(NCP)
1. i-connect API를 이용해 화상 회의를 이용한 멘토링 서비스 구현
1. AI Platform(CLOVA OCR)을 활용한 명함 인식을 통한 신뢰성 높은 멘토가 있는 서비스 구현
1. AI Platform(CLOVA CHATBOT)을 활용한 챗봇 기능 구현
1. 카카오, 깃허브 등 다양한 로그인 API를 활용한 로그인 기능 구현

## 3. 프로젝트 기능 구현
1. 화상 회의를 통해 멘토링 기능 구현
1. 로그인 API(OAuth) 사용해 로그인 및 회원가입 기능
1. CLOVA OCR을 이용한 멘토의 명함 인식 서비스 기능
1. 결제 API 기능
1. 멘토링 카테고리별, type별 검색 기능, 멘토 카테고리별, 회사별 검색 기능
1. 이메일을 통한 멘토링 알림 기능 및 인증기능
1. 리뷰, 평점 기능
1. CLOVA Chatbot을 pop up으로 이용하여 어느곳에서든 문의가 가능한 기능 구현
	
## 4. 프로젝트 역할 분담

|**팀원**|**역할**|
|----|----|
|조윤영|멘토링 결제기능(API,coupon,point사용), 멘토링&멘토 검색기능(메인페이지, 멘토링페이지, 멘토리스트페이지에서 카페고리별, type별, 회사별 검색), 페이징처리&scrolling,CLOVA CHATBOT(문의하기)|
|박성훈|CLOVA OCR(명함 인식 서비스),CLOVA CHATBOT(문의하기), 멘토 위시리스트, admin (전체적 페이지, 멘토 승인)|
|박혜정|회원가입, 일반로그인&소셜로그인(kakao,github)기능, 이메일 사용 기능(회원가입시 인증번호, 멘토링 알림메일, 멘토 승인 메일), 리뷰&평점 기능, Q&A및 자주하는 질문, admin (Q&A)|
|신동준|화상회의기능(API), 멘토링 장소 지도로 주소를 보여줌(API), 멘토링 시간 선택기능(해당 멘토링 가능 시간에 따른 인원별), 멘토 승인 시 멘토링 등록 기능(날짜 선택, 시간 선택, 주소 검색(API)기능)|

## 5. 프로젝트 개발 환경 및 수행 도구
|**협업도구**|**database&framework&개발도구**|**backend**|**frontend**|**API**|
|---|---|---|---|---|
|구들닥스|MYSQL(8.0.17)|java(11.0.15.1)|js|CLOVA OCR|
|네이버카페|Spring Boot(2.7.4)|apache-tomcat(8.5.27)|Html5|CLOVA ChatBot|
|ZOOM|MyBatis(2.2.2)|NCP(Naver Cloud Platform)|CSS|Import|
|Git|Eclipse(4.18.0)||jQuery(3.2.1)|kakao I Connect API|
|GitHub|JUnit(5.8.2)||AJAX|kakao map|
|Gather Town|Spring Boot Maile Sender(2.7.5)||thymeleaf(3.0.15)|github login API|
|Erd Cloud|||BootStrap(4)|kakao login API
|Notion||||kakao 공유하기|
|Figma|

## 6. WBS
![WBS](https://user-images.githubusercontent.com/111735748/206927107-40fc6d9b-70bd-4dcd-b57d-ee9ccdd34eea.jpg)
## 7. 데이터베이스 설계
![mogotco (4)](https://user-images.githubusercontent.com/83347312/206660375-1d1bb75e-1428-46f4-99ef-5ae8baf753ad.png)
## 8. 유저 플로우
<img  src="https://user-images.githubusercontent.com/83347312/206914954-c3f9e2e1-a53b-4a32-a2e6-f3e2233507cb.png" width="100%" height="100%">
<br/>
<br/>

# 프로젝트 내용
주요기능들은 반응형 웹 화면까지 같이 보여주는+ 각자 gif에 어떤 기능 보여주고 싶은지 생각해오기
## 1. 로그인 및 회원가입 기능 
### 1.1 회원가입
> 메인기능소개
- [AJAX] 아이디 중복 확인 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/java/com/mogotco/controller/AjaxController.java#L104)
  - 화면에서 넘겨준 ID를 AjaxController에서 중복체크 후 결과값을 화면으로 넘겨줌.
- [jQuery] 비밀번호 일치 여부 확인 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/user/register.html#L26)
  - keyup 함수를 사용해 타이핑이 시작할때부터 일치 여부를 체크함
- 본인인증기능 (이메일)
  - [JavaScript] 메일 정규식 검증, 유효시간 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/user/register.html#L53)
  - [AJAX] 메일주소를 Controller로 넘겨줌 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/user/register.html#L70)
  - [JavaMailSender] 메일 발송 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/java/com/mogotco/controller/UserController.java#L164)
> 실제 작동 화면
- 아이디 중복 확인, 비밀번호 일치여부확인
![아이디,비밀번호](https://user-images.githubusercontent.com/111735748/207771152-d426c9a8-0edd-47db-986e-1ef4ece2e127.gif)
- 메일 인증 기능
![이메일인증](https://user-images.githubusercontent.com/111735748/207772832-fb18b1a5-af24-4a57-97bf-89912e3797ff.gif)

### 1.2 소셜로그인
> 메인기능소개
- [소셜 로그인 API] 카카오,깃허브 API를 호출해 인가코드를 SNS 서버로부터 받아옴 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/user/login.html#L103)
- [KakaologinAPI Service] 인가코드로 Access Token을 받아오고, Access Token으로 다시 유저정보를 받아옴 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/java/com/mogotco/service/KakaologinAPI.java#L19)
- [SNSLoginController] Service가 받아온 정보를 가져와서 로그인 처리 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/java/com/mogotco/controller/SNSLoginController.java#L34)
> 실제 작동 화면
![소셜로그인](https://user-images.githubusercontent.com/111735748/207778285-825d5081-c64d-45d1-97b1-7f07f90bba96.gif)

### 1.3 마이페이지
> 메인기능소개
- [JavaScript] 회원 정보 수정 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/user/mypage.html#L143)
> 실제 작동 화면
![마이페이지](https://user-images.githubusercontent.com/111735748/207809305-a8a313dc-3d16-4a1a-854b-350f0cb2480c.gif)

### 1.4 비회원시 접근 가능 페이지
> 메인기능소개
- [Controller] 비회원 판단 후 접근가능한 경로 따로 설정 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/java/com/mogotco/controller/MentorController.java#L72)
> 실제 작동 화면
![비회원](https://user-images.githubusercontent.com/111735748/207810951-837d9423-cdee-4596-bfca-65dbaa08f097.gif)


2. 멘토링 검색-전체검색기능, 상(분야별)하위 메뉴바(시간별, 대면종류별, 수강후기순, 별점 순, 사후서비스 유무), 문의하기기능
멘토들은 크롤링을 통해 가지고옴

3. 멘토링 상세 - 멘토링 공유, 오프라인일 경우 지도+마커 뿌려주기, 시간 선택하기<br>
	- 해당 멘토링의 제목 옆에 있는 카카오톡 이모티콘을 클릭하여 원하는 사람에게 카카오톡으로 공유하여 정보를 제공할 수 있습니다.<br><br>
	- 비대면 멘토링 일 시 대면 장소를 클릭하면 kakap map API를 활용하여 주소와 마커를 보여줍니다.`
멘토링 등록시에 데이터베이스에 저장되는 주소를 kakao map API 제공 해주는 자바스크립트 코드의 지도의 주소가 출력되는 부분에  Controller에서 전달 된 데이터를 Thymeleaf를 사용하여 추가 해주어 해당 대면 멘토링의 주소가 화면에 보여지도록 합니다.<br><br>
[📌대면 멘토링 장소 코드 바로가기](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/mentoring/mentoringdetail.html#L331)<br>
[📌해당 Controller 코드 바로가기](https://github.com/finalTeam3/mogotco/blob/master/src/main/java/com/mogotco/controller/MentoringController.java#L670)<br><br>
<img src="https://user-images.githubusercontent.com/80161307/207608178-e8814250-3b57-4ab2-9f74-d2981b80b9f6.gif" width="500" height="450"></img><br>
	- Controller를 통해 받아온 데이터들을 Thymeleaf를 사용하여 시간별로 남은 인원을 화면에서 확인할 수 있게 하였습니다. 또, Thymeleaf 조건문을 활용하여 시간별  구매 가능한 멘토링 인원이 남아 있다면 원하는 시간을 선택할 수 있고, 없다면 해당 시간 버튼이 사라지게 하였습니다.<br><br>
  [📌인원, 시간 선택버튼 코드 바로가기](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/mentoring/mentoringdetail.html#L242)<br>
  [📌해당 Controller 코드 바로가기](https://github.com/finalTeam3/mogotco/blob/master/src/main/java/com/mogotco/controller/MentoringController.java#L670)<br><br>
<img src="https://user-images.githubusercontent.com/80161307/207608196-0871bfa4-8034-4f6c-a9e4-5e7ad581ddda.gif" width="500" height="400"></img>


4. 멘토 - 명함 및 사원증 회사 인증 후 등록(ocr) 및 수정 등록 

6. 구매 - import 결제 기능 ( 기능), 포인트 사용

7. 멘토링 진행 - kako i-connect API를 사용하여 영상으로 멘토링 진행<br><br>
[![참조](https://user-images.githubusercontent.com/80161307/207393712-3f982b3d-5964-439b-8530-dddd732be71e.JPG)](https://connectlive.kakaoi.ai/ "카카오 아이커넥트 바로가기")<br>
	- kakao i-connect live API 를 활용한 진행방식 : 카카오에서 제공해주는 API의 자바스크립트 코드를 활용하여 해당 멘토링의 룸ID에 각각의 시간에 해당하는 멘토링옵션 아이디값을 넣어주어 해당 시간의 고유의 룸이 생기는 방식으로 수업을 진행할 수 있게 됩니다.<br><br>[📌MOGOTCO 멘토링 서비스 페이지 코드 바로가기](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/mentoring/mentoringstart.html#L206)<br> [📌해당 Controller  코드 바로가기](https://github.com/finalTeam3/mogotco/blob/master/src/main/java/com/mogotco/controller/MentoringController.java#L706)<br><br>
	- 멘토링 시작 버튼을 클릭하여 상대방과 서로 화상채팅을 할 수 있고 멘토링 종료 버튼을 클릭하여 화상채팅을 종료할 수 있습니다.<br><br>
<img src="https://user-images.githubusercontent.com/80161307/207506925-4f7e3e58-5a49-43d8-ba4f-1d29f5eb2591.gif" width="500" height="450"></img><br><br>
	- 화면공유하기 버튼을 클릭하면 자신이 원하는 화면을 선택하여 공유할 수 있고, 공유된 화면이 자신과 상대방에게 보여집니다. 그리고 상대방이 공유한 화면도 볼 수 있습니다. 화면공유 중지버튼을 클릭하면 화면 공유가 종료됩니다.<br><br>
<img src="https://user-images.githubusercontent.com/80161307/207507068-830f3a61-c913-4680-a1c7-f91b5da03c21.gif" width="500" height="450"></img>
<br>[멘티들이 화면을 공유한 모습]

## 7. 후기 및 평점
### 7.1 멘토링 후기 및 평점 남기기
> 메인기능소개
- [AJAX, CSS] 리뷰 작성 후 데이터 넘기기 [📌코드 확인](https://github.com/finalTeam3/mogotco/blob/master/src/main/resources/templates/purchase/purchasedetail.html#L287)
> 실제 작동 화면
![리뷰](https://user-images.githubusercontent.com/111735748/207826741-e06826bf-a948-4f3d-ba5b-c959e2d11140.gif)


9. 문의하기 - 챗봇

## 10. 관리자페이지
### 10.1 멘토 승인시 알림 기능
> 메인기능소개
- [JavaMailSender] 멘토 승인시 알림 메일 발송 [📌코드 확인](https://github.com/finalTeam3/mogotcoadmin/blob/master/src/main/java/com/mogotcoadmin/controller/MentorController.java#L103)
> 실제 작동 화면
![관리자](https://user-images.githubusercontent.com/111735748/207832595-864baa7a-0a1a-4633-af9c-7d356cbd2db1.gif)
<br/>
<br/>

# 트러블 슈팅
각자 트러블 슈팅 올리고 싶은거 최대한 정리해서 오기 => 일단 팀적으로전체다 트러블 슈팅을 적고 나중에 포크를 해서 각자 트러블만 남겨두는 걸로!
