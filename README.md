#  💼 Fintech - 대출 심사 프로젝트
> Kafka 를 이용한 Multi-Module 대출 심사 프로젝트
## 📌 주요 기능:
- **대출 심사 요청 API (POST)**
- **대출 결과 요청 API (GET)**
- **서비스 모듈 구현**
- **Kafka를 통한 대출 심사 데이터 처리**
- **CB사 모형 서버 구현**

## 🛠️ Tech Stack

- **Language**: `Kotlin`
- **JDK**: `JDK 11`
- **Build**: `Gradle 7.3.1`
- **DataBase**: `MySQL`
- **Framework**: `SpringBoot Multi Module`
- **Caching**: `Redis 3.3.3`
- **Containerization**: `Docker 27.1.1`
- **Proxy Server**: `Nginx`
- **Spring Boot**: `2.6.3`
- **Libraries**:
    - `Spring Data JPA`
    - `Apache Kafka`


## ⛓️ 프로젝트 기능
- **대출 심사 요청 API (POST)**: 대출 심사 요청을 처리
- **대출 결과 요청 API (GET)**: 대출 심사 결과를 조회
- **서비스 모듈 구현**: 대출 심사 및 처리 로직을 포함 모듈
- **카프카 구현**: Kafka를 통해 대출 심사 요청을 CONSUMER를 통해 CSS로 전달.
- **CB사 모형 서버 구현**: CB사 모형에 따라 대출 심사를 수행하는 서버 구현


**기타 세부 사항**
- Nginx를 통한 Proxy 서버를 CONSUMER 애플리케이션과 CSS 애플리케이션 사이 구축
- 모든 애플리케이션은 Docker를 통해 실행 가능한 파일로 생성
- 데이터베이스와 관련된 구현(예: Redis, JPA 등)은 Domain 모듈에 포함