In order to dockerize the Spring Boot application, it is necessary to install Docker Desktop.
Once this step done we can start the configuration process.

First, according to the tutorial found at https://spring.io/guides/topicals/spring-boot-docker/ , I wrote the following code in the file named "Dockerfile" in the root:

----- START OF THE CODE -----
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
----- END OF THE CODE -----

Make sure to have the right version of maven to continue. Before doing anything further, I ran "mvn clean install".

From now on, keep the Docker Desktop application running.
We can now chose a build system by executing the following command (from the tutorial):

docker build --build-arg JAR_FILE=target/*.jar -t myorg/myapp .

Now that we have done that, we can replace the content of the Dockerfile by the following one:

----- START OF THE CODE -----
FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
----- END OF THE CODE -----

Once this done, we can build an image with the following command:

docker build -t myorg/myapp .

So, once the image is built, we can run a Docker container based on that image. Use the following command:

docker run -p 8080:8080 -e SERVER_PORT=8080 myorg/myapp

We can actually see the container in the Containers window of Docker Desktop, as well as the port we used (here 8080:8080).

Now, we can access the application at http://localhost:8080 and the dockerization should be completed.

