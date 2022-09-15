#FROM openjdk:8
#EXPOSE 8080
#ARG JAR_FILE=target/*.jar
#ADD target/demoawsjar.jar demoawsjar.jar
#COPY /target/demoawsjar.jar demoawsjar.jar
#COPY configDetails.xml /etc/wadConfig/configDetails.xml
#COPY /target/classes/application.properties application.properties
#ENTRYPOINT ["java","-jar","demoawsjar.jar"]

#FROM tomcat
#COPY demoawswar.war /usr/local/tomcat/webapps/