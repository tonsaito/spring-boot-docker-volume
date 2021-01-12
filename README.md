### How to run a jar file from docker

docker build -t tonsaito/spring-boot-docker-volume .
docker run -v $(pwd)/build/libs:/jars -p 8080:8080 -e JARFILE=sb-docker-volume-0.0.1-SNAPSHOT.jar tonsaito/spring-boot-docker-volume

