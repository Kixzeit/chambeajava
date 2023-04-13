docker stop dockerized-examen-srv
docker rm dockerized-examen-srv

docker pull ghcr.io/kixzeit/dockerized-examen

docker run -d \
-e SPC=https://config.kixzeit \
--name=dockerized-examen-srv \
--restart=unless-stopped \
-p:9090:8080 \
ghcr.io/kixzeit/dockerized-examen
