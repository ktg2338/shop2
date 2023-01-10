
스프링부트,JPA를 이용한 간단한 쇼핑몰2

![ezgif com-gif-maker (4)](https://user-images.githubusercontent.com/69129562/202893022-72b026d6-872c-4ea9-bbf9-8a4b88124441.gif)

![ezgif com-gif-maker (3)](https://user-images.githubusercontent.com/69129562/202893221-ae418d60-da19-4b77-97f2-35fb9463eb01.gif)

stack : Spring Boot, JPA, DataJPA, Querydsl, Thymeleaf, Gradle, Lombok

<br />

|API 종류|HTTP Method|기능|URL|설명|
|--------|---|-----|----|---------------------|
|Cart|Post|장바구니 상품주문|/cart|장바구니의 상품을 주문한다.|
|Cart|Get|장바구니 내역|/cart|장바구니에 담긴 상품을 조회한다.|
|Cart|Patch|장바구니 수정|/cartItem/{cartItemId}|장바구니 내역을 수정한다.|
|Cart|Delete|장바구니 삭제|/cartItem/{cartItemId}|장바구니 내역을 삭제한다.|
|Cart|Post|장바구니 상품추가|/cart/orders|기존 장바구니에 상품을 추가한다.|
|Item|Get|상품추가 폼(admin)|/admin/item/new|관리자 상품추가 폼| 
|Item|Post|상품추가(admin)|/admin/item/new|관리자 상품추가|
|Item|Get|상품수정 폼(admin)|/admin/item/{itemId}|관리자 상품수정 폼|
|Item|Post|상품정보 수정(admin)|/admin/item/{itemId}|관리자 상품정보 수정|
|Item|Get|상품관리(admin)|/admin/items,/admin/items/{page}|관리자 상품 관리창 Pageable|
|Item|Get|상품정보|/item/{itemId}|  |
|Main|Get|메인페이지 Pageable관리|/|메인페이지의 상품을 표시하는 최대 갯수와 페이징을 한다|
|Member|Get|회원가입 폼|/new|  |
|Member|Post|회원가입|/new|  |
|Member|Get|로그인 폼|/login|  |
|Member|Get|로그인 오류|/login/error|아이디와 비밀번호 validation|
|Order|Post|주문|/order|  |
|Order|Get|주문 내역|/orders,/orders/{page}|주문내역 Pageable|
|Order|Post|주문 취소|/order/{orderId}/cancel|   |


aws lightsail의 우분투 서버 구축 성공! 43.200.88.100:8080

하지만 이미지 업로드 실패
  - 상품등록하고 메인페이지에 가보면 이미지 404오류 발견 -> 업로드 경로와 이미지파일 경로를 우분투서버의 파일로 바꾸고 실행 파일질라 에선 이미지 파일이 저장된것 확인 하지만 사이트에선 여전히 엑스박스...
  
오류를 보류하고 배포를 위해 계속 진행 MovaXterm을 종료해도 24시간 서비스되기 위해 백그라운드 실행 시도 
  - nohub java -jar shop2 0.0.1SNAPSHOT.JAR & -> 무한로딩되고 무반응 -> nohub.out log검토
  
 HikariPool-1 - WARN 1211 --- [l-1 housekeeper] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Thread starvation or clock leap detected (housekeeper delta=3m2s477ms579µs45ns). 
  
|제목|내용|설명|
|------|---|---|
|테스트1|테스트2|테스트3|
|테스트1|테스트2|테스트3|
|테스트1|테스트2|테스트3|
