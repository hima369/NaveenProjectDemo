# install O/S and JDK
# Clubbed image of them
FROM openjdk:8-jdk-alpine

# copy the jar file to VM
COPY target/bootapp-0.0.1-SNAPSHOT.jar /tmp/bootapp.jar

# RUN java -jar /tmp/bootapp.jar  : while creating an image
# CMD java -jar /tmp/bootapp.jar  : while container is spawned

CMD ["java", "-jar", "/tmp/bootapp.jar"]