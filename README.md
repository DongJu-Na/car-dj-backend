# 무제

### 디렉토리 구조

```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com.dongju
 ┃ ┃   ┣ 📂common         # 공통 유틸, 예외 처리 등
 ┃ ┃   ┣ 📂global         # 글로벌 설정 (WebSocket 설정 등)
 ┃ ┃   ┣ 📂game           # 게임 도메인
 ┃ ┃   ┃ ┣ 📂controller   # 웹소켓 핸들러 (게임 메시지 처리)
 ┃ ┃   ┃ ┣ 📂service      # 게임 서비스 로직 (차량 배치, 충돌 등)
 ┃ ┃   ┃ ┣ 📂model        # 게임 모델 (Car, Position 등)
 ┃ ┃   ┃ ┗ 📂dto          # 클라이언트와 주고받는 메시지 DTO
 ┃ ┃   ┗ 📂chat           # 채팅 도메인
 ┃ ┃     ┣ 📂controller   # 채팅 메시지 처리 핸들러
 ┃ ┃     ┣ 📂service      # 채팅 서비스 로직
 ┃ ┃     ┣ 📂model        # 채팅 유저 등 도메인 객체
 ┃ ┃     ┗ 📂dto          # 채팅 메시지 DTO
 ┃ ┗ 📂resources
 ┃   ┣ 📜application.yml
 ┃   ┗ 📜static / templates
 ┗ 📂test

```

### Guides
The following guides illustrate how to use some features concretely:

* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

