#!/bin/bash

source "ci/jenkins/config.sh"

APP_SCANNER_IMAGE_TAG_LATEST="$APP_NAME-$DEPLOYMENT_ENVIRONMENT-scanner:latest"

docker build --target scanner \
    --build-arg NEXUS_USER --build-arg NEXUS_PASSWORD \
    -t "$APP_SCANNER_IMAGE_TAG_LATEST" \
    -f "$DOCKERFILE_PATH" "$DOCKER_BUILD_PATH"

docker run --rm \
    -e NEXUS_USER -e NEXUS_PASSWORD \
    -e SONARQUBE_TOKEN \
    "$APP_SCANNER_IMAGE_TAG_LATEST" \
    mvn -B -s settings.xml -DskipTests sonar:sonar -Dsonar.login="$SONARQUBE_TOKEN" -Djavax.net.ssl.trustStore=cacerts

# Clean the local registry
docker rmi "$APP_SCANNER_IMAGE_TAG_LATEST"

