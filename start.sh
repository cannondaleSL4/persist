#!/usr/bin/env bash

fuser -k 9097/tcp

cd "$(dirname "$0")"

mvn clean install

chmod +x ./target/fxquotes.persist-1.0-SNAPSHOT.jar
java -jar ./target/*.jar