#!/usr/bin/env bash

fuser -k 8761/tcp
fuser -k 9097/tcp

chmod +x ./eureka/target/eureka-1.0-SNAPSHOT.jar
java -jar ./eureka/target/*.jar