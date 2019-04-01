FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE 27017 8761

ENTRYPOINT ["java","-jar","/app.jar"]

# docker build -t persist .
# docker run -p 9097:9097 --net=host persist