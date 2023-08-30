FROM eclipse-termurin:17
COPY target/devops devops
CMD [ "java","-jar","devops.jar" ]