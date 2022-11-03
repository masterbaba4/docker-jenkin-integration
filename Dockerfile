# FROM maven:jdk-17.0.5.8-hotspot as stage1

FROM openjdk:11
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ONBUILD ADD target/sample_dev-0.0.1-SNAPSHOT.jar docker-jenkins-integration.jar
# COPY  target/sample_dev-0.0.1-SNAPSHOT.jar docker-jenkins-integration.jar
# RUN -f pom.xml clean package
EXPOSE 8080
# ENTRYPOINT exec java $JAVA_OPTS -jar docker-jenkins-integration.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
# ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar sampledev.jar
ENTRYPOINT [  "java","-jar","sample_dev-0.0.1-SNAPSHOT.jar" ]