if [ -f ~/jdk-7u80-linux-x64.tar.gz ]; then
	cp ~/jdk-7u80-linux-x64.tar.gz .
fi

docker build -t docker-demo .
