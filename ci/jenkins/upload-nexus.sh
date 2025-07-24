#!/bin/bash

source "ci/jenkins/config.sh"

# Image Tags 
IMAGE_VERSION="$GIT_COMMIT_SHORT"
APP_IMAGE_TAG="$DOCKER_REGISTRY_UPLOAD/$APP_IMAGE_PATH:$IMAGE_VERSION"    
APP_IMAGE_TAG_LATEST="$DOCKER_REGISTRY_UPLOAD/$APP_IMAGE_PATH:latest"    

echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USER" --password-stdin "$DOCKER_REGISTRY_UPLOAD"

# Build Docker Image                                                                    
docker build --tag "$APP_IMAGE_TAG" \
    --build-arg NEXUS_USER --build-arg NEXUS_PASSWORD \
    -f "$DOCKERFILE_PATH" "$DOCKER_BUILD_PATH"
	
docker tag "$APP_IMAGE_TAG" "$APP_IMAGE_TAG_LATEST"

# Upload the Image to Nexus
docker push "$APP_IMAGE_TAG"
docker push "$APP_IMAGE_TAG_LATEST"

# Clean the local registry
docker rmi "$APP_IMAGE_TAG" "$APP_IMAGE_TAG_LATEST"

# Debug message
DEPLOY_MESSAGE="La imagen a deployar es: 

$APP_IMAGE_TAG" 
docker run --rm nexus.bps.net:5000/bps/cowsay:latest cowsay -W100 "$DEPLOY_MESSAGE"

