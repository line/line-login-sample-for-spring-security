# [//github.com/line/line-login-sample-for-spring-security](https://github.com/line/line-login-sample-for-spring-security)
Sample of ID Federation with [LINE Login](https://business.line.me/services/login) by [Spring Security](https://projects.spring.io/spring-security/).

# How to run.

```
# Maven
% mvn spring-boot:run -Dsecurity.oauth2.client.client-id=<Your Channel ID> -Dsecurity.oauth2.client.client-secret=<Your Channel Secret>
  
# Gradle
% ./gradlew bootRun -Dsecurity.oauth2.client.client-id=<Your Channel ID> -Dsecurity.oauth2.client.client-secret=<Your Channel Secret>
```