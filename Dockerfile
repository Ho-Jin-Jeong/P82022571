FROM ubuntu:latest
LABEL authors="hj2"

ENTRYPOINT ["top", "-b"]