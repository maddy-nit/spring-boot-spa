# Spring Boot SPA
This project is to create a single CRUD SPA (Single Page Application) with a RESTful backend. The only functionality the app should feature is the maintenance of a single list of first and last names and corresponding phone numbers. We should be able to view, add, edit and delete the names and phone numbers.

## Prerequisite
----------------

- Ubuntu/Centos or any other linux distro
- JDK 1.8 or higher
- Docker

## Tools Required
----------------

** JDK 1.8 or higher **

- Follow [this](https://www.digitalocean.com/community/tutorials/how-to-install-java-on-centos-and-fedora) to download java on Centos 7

- Note- Please try to keep it 1.8 as our live servers use the same

** Docker **

Execute the following command to install docker properly-

```
wget https://download.docker.com/linux/centos/7/x86_64/stable/Packages/containerd.io-1.2.2-3.el7.x86_64.rpm
wget https://download.docker.com/linux/centos/7/x86_64/stable/Packages/docker-ce-cli-18.09.0-3.el7.x86_64.rpm
wget https://download.docker.com/linux/centos/7/x86_64/stable/Packages/docker-ce-18.09.0-3.el7.x86_64.rpm
yum install -y containerd.io-1.2.2-3.el7.x86_64.rpm
yum install -y docker-ce-cli-18.09.0-3.el7.x86_64.rpm
yum install -y docker-ce-18.09.0-3.el7.x86_64.rpm
docker -v;systemctl status docker;systemctl start docker;systemctl status docker
```

then configure the Docker daemon using following steps-

Step 1: Create config file as daemon.json

```
mkdir /data/;mkdir /data/docker-data;vi /etc/docker/daemon.json
{
    "graph": "/data/docker-data"
}
```

Step 2: Reload and start daemon by

```
systemctl daemon-reload
systemctl start docker
```

** Apache Maven 3.3.9 **

Use the following steps to install-

```
yum install -y git maven
```

** Git 2 or above **

Follow [this](https://www.digitalocean.com/community/tutorials/how-to-install-git-on-centos-7) to install git and upgrade two packages(if you have old versions) curl and nss to work -

```
yum upgrade -y nss;yum upgrade -y curl
```

## Additional steps to build the project in Devlopement
----------------

Clone from repo from bitbucket repo-

```
git clone https://github.com/maddy-nit/spring-boot-spa.git
```

and open this cloned project in any in IDE(like Eclipse)

- Run clean to remove existing mvn repo
- Run build/install to install dependencies described in pom.xml
- Run spring-boot: run goal to run as server


## Setup a new server in Production
----------------
- Start jar in backgroud -
```
nohup java -jar docker-ws-[0.0.10].jar &
```

:+1: This is great. It looks Great. It's ready to use Java now ! :shipit:

**Warning - These  steps might not work in other linux distributions except Centos 7.**