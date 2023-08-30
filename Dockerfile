FROM eclipse-termurin:17
COPY target/devops devops1
CMD [ "java","-jar","devops1" ]