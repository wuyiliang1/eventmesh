#
# Licensed to the Apache Software Foundation (ASF) under one
# or more contributor license agreements.  See the NOTICE file
# distributed with this work for additional information
# regarding copyright ownership.  The ASF licenses this file
# to you under the Apache License, Version 2.0 (the
# "License"); you may not use this file except in compliance
# with the License.  You may obtain a copy of the License at
#
#   http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing,
# software distributed under the License is distributed on an
# "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
# KIND, either express or implied.  See the License for the
# specific language governing permissions and limitations
# under the License.
#

FROM docker.io/centos:7

MAINTAINER mikexue <mike_xwm@126.com>

ENV JAVA_VERSION 8u77
ENV BUILD_VERSION b03

RUN yum -y install wget; wget --no-cookies --no-check-certificate --header "Cookie: oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/$JAVA_VERSION-$BUILD_VERSION/jdk-$JAVA_VERSION-linux-x64.rpm" -O /tmp/jdk-8-linux-x64.rpm; yum -y install /tmp/jdk-8-linux-x64.rpm

# JDK stripping
RUN rm -f /usr/java/jdk1.8.0_77/src.zip /usr/java/jdk1.8.0_77/javafx-src.zip
RUN rm -rf /usr/java/jdk1.8.0_77/lib/missioncontrol/ /usr/java/jdk1.8.0_77/lib/visualvm/ /usr/java/jdk1.8.0_77/db/

RUN alternatives --install /usr/bin/java java /usr/java/latest/bin/java 1
RUN alternatives --install /usr/bin/javac javac /usr/java/latest/bin/javac 1

ENV JAVA_HOME /usr/java/latest
ENV JRE_HOME $JAVA_HOME/jre
ENV CLASSPATH .:$JAVA_HOME/lib/:$JRE_HOME/lib/
ENV PATH $PATH:$JAVA_HOME/bin
