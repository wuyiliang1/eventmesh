<div align="center">


<br /><br />
<img src="resources/logo.png" width="256">
<br />

[![CI status](https://img.shields.io/github/actions/workflow/status/apache/eventmesh/ci.yml?logo=github&style=for-the-badge)](https://github.com/apache/eventmesh/actions/workflows/ci.yml)
[![CodeCov](https://img.shields.io/codecov/c/gh/apache/eventmesh/master?logo=codecov&style=for-the-badge)](https://codecov.io/gh/apache/eventmesh)
[![Code Quality: Java](https://img.shields.io/lgtm/grade/java/g/apache/eventmesh.svg?logo=lgtm&logoWidth=18&style=for-the-badge)](https://lgtm.com/projects/g/apache/eventmesh/context:java)
[![Total Alerts](https://img.shields.io/lgtm/alerts/g/apache/eventmesh.svg?logo=lgtm&logoWidth=18&style=for-the-badge)](https://lgtm.com/projects/g/apache/eventmesh/alerts/)

[![License](https://img.shields.io/github/license/apache/eventmesh?style=for-the-badge)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![GitHub Release](https://img.shields.io/github/v/release/apache/eventmesh?style=for-the-badge)](https://github.com/apache/eventmesh/releases)
[![Slack Status](https://img.shields.io/badge/slack-join_chat-blue.svg?logo=slack&style=for-the-badge)](https://join.slack.com/t/apacheeventmesh/shared_invite/zt-1t1816dli-I0t3OE~IpdYWrZbIWhMbXg)

[📦 文档(英文)](https://eventmesh.apache.org/docs/introduction) |
[📔 例子](https://github.com/apache/eventmesh/tree/master/eventmesh-examples) |
[⚙️ 路线图](https://eventmesh.apache.org/docs/roadmap) |
[🌐 英文版](README.zh-CN.md)
</div>


# Apache EventMesh

**Apache EventMesh** 是用于构建分布式[事件驱动](https://en.wikipedia.org/wiki/Event-driven_architecture)应用程序的新一代无服务器事件中间件。

### EventMesh 架构

![EventMesh Architecture](resources/eventmesh-architecture-4.png)

### EventMesh Dashboard

![EventMesh Dashboard](resources/dashboard.png)

## 特性

Apache EventMesh提供了许多功能来帮助用户实现他们的目标，以下是一些EventMesh的关键特点：

- 基于 [CloudEvents](https://cloudevents.io) 规范构建。
- 快速可扩展的Connector，[connectors](https://github.com/apache/eventmesh/tree/master/eventmesh-connectors)，例如作为Saas、CloudService和数据库等的source 或sink。.
- 快速可扩展的存储层，使用 [JDBC](https://en.wikipedia.org/wiki/Java_Database_Connectivity)和[Apache RocketMQ](https://rocketmq.apache.org), [Apache Kafka](https://kafka.apache.org), [Apache Pulsar](https://pulsar.apache.org), [RabbitMQ](https://rabbitmq.com), [Redis](https://redis.io), [Pravega](https://cncf.pravega.io), 和 [RDMS](https://en.wikipedia.org/wiki/Relational_database)（正在进行中）集成。
- 快速可扩展的控制器，例如 [Consul](https://consulproject.org/en/), [Nacos](https://nacos.io), [ETCD](https://etcd.io) 和 [Zookeeper](https://zookeeper.apache.org/)。
- 至少一次的可靠性投递。
- 在多个EventMesh部署之间传递事件。
- 通过目录服务进行事件模式管理。
- 通过 [Serverless workflow](https://serverlessworkflow.io/) 引擎实现强大的事件编排。
- 强大的事件过滤和转换功能。
- 快速、无缝的可扩展性。
- 易于函数开发和框架集成。

## 路线图

请前往[路线图](https://eventmesh.apache.org/docs/roadmap)查看Apache EventMesh的版本历史和新功能。.

## 社区

- [EventMesh-site](https://github.com/apache/eventmesh-site): Apache EventMesh 的官方网站资源。
- [EventMesh-workflow](https://github.com/apache/eventmesh-workflow): 用于在 EventMesh 上进行事件编排的无服务器工作流运行时。
- [EventMesh-dashboard](https://github.com/apache/eventmesh-dashboard): EventMesh 的运维控制台。
- [EventMesh-catalog](https://github.com/apache/eventmesh-catalog): 使用 AsyncAPI 进行事件模式管理的目录服务。
- [EventMesh-go](https://github.com/apache/eventmesh-go): EventMesh 运行时的 Go 语言实现。

## 快速开始

Here are the guidelines:

[第1步: 部署EventMesh Store](https://eventmesh.apache.org/docs/instruction/store)

[第2步: 启动EventMesh Runtime](https://eventmesh.apache.org/docs/instruction/runtime)

[第3步: 运行示例](https://eventmesh.apache.org/docs/instruction/demo)

另外，如果您更喜欢使用Docker，则我们还为您提供了Docker版本的指南：

[第1步: 使用Docker部署EventMesh Store](https://eventmesh.apache.org/docs/instruction/store-with-docker)

[第2步: 使用Docker启动EventMesh Runtime](https://eventmesh.apache.org/docs/instruction/runtime-with-docker)

[第3步: 运行示例](https://eventmesh.apache.org/docs/instruction/demo)

## 贡献

每个贡献者在推动 Apache EventMesh 的健康发展中都发挥了重要作用。我们真诚感谢所有为代码和文档作出贡献的贡献者。

- [贡献指南](https://eventmesh.apache.org/community/contribute/contribute)
- [Good First Issues](https://github.com/apache/eventmesh/issues?q=is%3Aopen+is%3Aissue+label%3A%22good+first+issue%22)

这里是[贡献者列表](https://github.com/apache/eventmesh/graphs/contributors)，感谢大家！ :)

<a href="https://github.com/apache/eventmesh/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=apache/eventmesh" />
</a>


## CNCF Landscape

<div align="center">

<img src="https://landscape.cncf.io/images/left-logo.svg" width="150"/>
<img src="https://landscape.cncf.io/images/right-logo.svg" width="200"/>

Apache EventMesh enriches the <a href="https://landscape.cncf.io/serverless?license=apache-license-2-0">CNCF Cloud Native Landscape.</a>

</div>

## License

Apache EventMesh 的开源协议遵循 [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).

## Community

| 微信小助手                                              | 微信公众号                                             | Slack                                                        |
| ------------------------------------------------------- | ------------------------------------------------------ | ------------------------------------------------------------ |
| <img src="resources/wechat-assistant.jpg" width="128"/> | <img src="resources/wechat-official.jpg" width="128"/> | [加入 Slack ](https://join.slack.com/t/apacheeventmesh/shared_invite/zt-1t1816dli-I0t3OE~IpdYWrZbIWhMbXg) |

双周会议 : [#Tencent meeting](https://meeting.tencent.com/dm/wes6Erb9ioVV) : 346-6926-0133

双周会议记录 : [bilibili](https://space.bilibili.com/1057662180)

### 邮件名单

| 名称    | 描述                              | 订阅                                                  | 取消订阅                                                    | 邮件列表存档                                                 |
| ------- | --------------------------------- | ----------------------------------------------------- | ----------------------------------------------------------- | ------------------------------------------------------------ |
| 用户    | 用户支持与用户问题                | [订阅](mailto:users-subscribe@eventmesh.apache.org)   | [取消订阅](mailto:users-unsubscribe@eventmesh.apache.org)   | [邮件存档](https://lists.apache.org/list.html?users@eventmesh.apache.org) |
| 开发    | 开发相关 (设计文档， Issues等等.) | [订阅](mailto:dev-subscribe@eventmesh.apache.org)     | [取消订阅](mailto:dev-unsubscribe@eventmesh.apache.org)     | [邮件存档](https://lists.apache.org/list.html?dev@eventmesh.apache.org) |
| Commits | 所有与仓库相关的 commits 信息通知 | [订阅](mailto:commits-subscribe@eventmesh.apache.org) | [取消订阅](mailto:commits-unsubscribe@eventmesh.apache.org) | [邮件存档](https://lists.apache.org/list.html?commits@eventmesh.apache.org) |
| Issues  | Issues 或者 PR 提交和代码Review   | [订阅](mailto:issues-subscribe@eventmesh.apache.org)  | [取消订阅](mailto:issues-unsubscribe@eventmesh.apache.org)  | [邮件存档](https://lists.apache.org/list.html?issues@eventmesh.apache.org) |

