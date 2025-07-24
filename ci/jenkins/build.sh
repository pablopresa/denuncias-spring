#!/bin/bash

source "ci/jenkins/config.sh"

echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USER" --password-stdin "$DOCKER_REGISTRY_DOWNLOAD"

docker build --target builder \
    --build-arg NEXUS_USER --build-arg NEXUS_PASSWORD \
    -t "$APP_BUILDER_IMAGE_TAG_LATEST" \
    -f "$DOCKERFILE_PATH" "$DOCKER_BUILD_PATH"
