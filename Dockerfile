FROM openjdk:8
EXPOSE 9595
ADD target/spring-javatechie-cicd-git-action.jar	spring-javatechie-cicd-git-action.jar
ENTRYPOINT ["java","-jar","/spring-javatechie-cicd-git-action.jar"]