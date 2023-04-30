docker stop dockerized-chambeaya-srv
docker rm dockerized-chambeaya-srv

docker pull ghcr.io/kixzeit/dockerized-chambeaya

docker run -d \
-e SPC=https://config.kixzeit \
--name=dockerized-chambeaya-srv \
--restart=unless-stopped \
-p:9090:8080 \
ghcr.io/kixzeit/dockerized-chambeya
