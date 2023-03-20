#FROM openjdk:8-jdk

FROM ubuntu:20.04
RUN apt-get update && apt-get install -y openjdk-8-jdk
RUN apt-get install -y git
RUN apt-get install -y maven

# Set environment variables
ENV USERNAME=stg
ENV USER_UID=1000
ENV USER_GID=1000
ENV HOME=/home/$USERNAME

# Set HCC environment variables
ENV MAVEN_REPO=$HOME/.m2/repository
ENV HCC_HOME=/home/stg/hcc-gap-recommender
ENV HCC_EXPERIMENTS=$HCC_HOME/experiments
ENV HCC_LIBS=$HCC_HOME/lib

# Add group and user
RUN groupadd --gid $USER_GID $USERNAME \
    && useradd --uid $USER_UID --gid $USER_GID -d $HOME -m -s /bin/bash $USERNAME

# Set ownership and permissions for home directory
RUN chown -R $USERNAME:$USERNAME $HOME \
    && chmod 700 $HOME

# Switch to the new user
USER $USERNAME
WORKDIR $HOME

# Clone UVA HCC Tools
RUN git clone https://github.com/soneyahossain/hcc-gap-recommender.git
RUN cd hcc-gap-recommender && git checkout docker-demo

# Grab local tarball for 1.7
ADD jdk-7u80-linux-x64.tar.gz .

ENV JDK_1_7=/home/stg/jdk1.7.0_80 
ENV JDK_1_8=/usr/lib/jvm/java-8-openjdk-amd64/

# Build support libs for HCC
WORKDIR $HCC_HOME
RUN ls
RUN ls scripts
RUN ./scripts/install_all.sh

