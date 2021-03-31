FROM openjdk:8-jdk-alpine
ADD ./build/libs/demo-0.0.1-SNAPSHOT.jar zeju-istio-demo.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=deploy" , "-Xms256m", "-Xmx512m", "-jar", "./zeju-istio-demo.jar"]
