From openjdk:14
EXPOSE 8080
ADD target/spring-boot-aws.jar spring-boot-aws.jar
ENTRYPOINT ["java","-jar","/spring-boot-aws.jar"]