# 📚 Books Management System `v1.0`

 **Spring Framework 실습 프로젝트**
 *도서 등록, 수정, 조회 기능을 구현하며 **Git Flow 협업 전략** 학습용으로 사용됩니다.

***

## Tech Stack
* **Framework**: `Spring Boot 2.7.18`
* **JDK**: `Java 11`
* **Build Tool**: `Maven`
* **Database**: `MySQL` (DB Name: **books**)
* **Library**: 
    * `Spring Web`, `Spring Data JPA`, `Thymeleaf`
    * `Spring AOP`, `JUnit5`, `DevTools`

***

## Git Branch Strategy `(팀원 필독!)`
본 프로젝트는 효율적인 협업을 위해 아래와 같은 **브랜치 전략**을 사용합니다.  

> **⚠️ [주의]** 모든 작업은 반드시 본인의 **기능 브랜치**에서 진행해 주세요!

| 브랜치명 | 역할 | 담당자 |
| :--- | :--- | :--- |
| **`main`** | **최종 배포** 및 완성본 관리 | 팀장 |
| **`dev`** | **개발 통합** 브랜치 (기능 합류점) | 공통 |
| **`feature/add`** | 도서 **등록** 기능 구현 | 담당자 A |
| **`feature/update`** | 도서 **수정** 기능 구현 | 담당자 B |
| **`feature/select`** | 도서 **조회** 기능 구현 | 담당자 C |

### ⚠️ 협업 규칙 (Protocol)
1. **Sync**: 작업 시작 전 반드시 `dev` 브랜치를 **최신 상태(Pull)**로 유지하세요.
2. **PR**: 기능 구현 완료 후 `dev`로 **`Pull Request(PR)`**를 날리고 팀장 승인을 받으세요.
3. **Merge**: 승인되지 않은 코드는 `dev`에 직접 합칠 수 없습니다.

***

## ⚙️ Configuration
`src/main/resources/application.yaml` 설정값입니다. 
**`password`** 부분만 본인 환경에 맞춰 수정하세요.

```yaml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/books?serverTimezone=UTC
    username: root
    password: YOUR_PASSWORD_HERE
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
