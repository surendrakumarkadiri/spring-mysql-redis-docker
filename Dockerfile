#base package 
FROM java:8
VOLUME /tmp
COPY /target/sping-mysql-redis-docker-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080/tcp
RUN bash -c 'touch /demo.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]