
스프링부트,JPA를 이용한 간단한 쇼핑몰2

![ezgif com-gif-maker (4)](https://user-images.githubusercontent.com/69129562/202893022-72b026d6-872c-4ea9-bbf9-8a4b88124441.gif)

![ezgif com-gif-maker (3)](https://user-images.githubusercontent.com/69129562/202893221-ae418d60-da19-4b77-97f2-35fb9463eb01.gif)

stack : Spring Boot, JPA, DataJPA, Querydsl, Thymeleaf, Gradle, Lombok

<br /><br />

aws lightsail의 우분투 서버 구축 성공! 43.200.88.100:8080

하지만 이미지 업로드 실패
  - 상품등록하고 메인페이지에 가보면 이미지 404오류 발견 -> 업로드 경로와 이미지파일 경로를 우분투서버의 파일로 바꾸고 실행 파일질라 에선 이미지 파일이 저장된것 확인 하지만 사이트에선 여전히 엑스박스...
  
오류를 보류하고 배포를 위해 계속 진행 MovaXterm을 종료해도 24시간 서비스되기 위해 백그라운드 실행 시도 
  - nohub java -jar shop2 0.0.1SNAPSHOT.JAR & -> 무한로딩되고 무반응 -> nohub.out log검토
  
 HikariPool-1 - WARN 1211 --- [l-1 housekeeper] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Thread starvation or clock leap detected (housekeeper delta=3m2s477ms579µs45ns). 
  


