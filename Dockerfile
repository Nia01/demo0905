FROM java:8
EXPOSE 8080
WORKDIR /opt/app
VOLUME /tmp
COPY target/*.jar  app.jar
RUN bash -c 'touch app.jar'
ENTRYPOINT ["java","-Duser.timezone=Asia/Shanghai","-jar","app.jar"]
CMD ["--spring.config.location=/opt/app/conf"]
