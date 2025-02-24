/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.storage.rabbitmq.config;

import org.apache.eventmesh.common.config.Config;
import org.apache.eventmesh.common.config.ConfigFiled;

import com.rabbitmq.client.BuiltinExchangeType;

import lombok.Data;

@Data
@Config(prefix = "eventMesh.server.rabbitmq", path = "classPath://rabbitmq-client.properties")
public class ConfigurationHolder {

    @ConfigFiled(field = "host")
    private String host;

    @ConfigFiled(field = "port")
    private int port;

    @ConfigFiled(field = "username")
    private String username;

    @ConfigFiled(field = "passwd")
    private String passwd;

    @ConfigFiled(field = "virtualHost")
    private String virtualHost;

    @ConfigFiled(field = "exchangeType")
    private BuiltinExchangeType exchangeType;

    @ConfigFiled(field = "exchangeName")
    private String exchangeName;

    @ConfigFiled(field = "routingKey")
    private String routingKey;

    @ConfigFiled(field = "queueName")
    private String queueName;

    @ConfigFiled(field = "autoAck")
    private boolean autoAck;
}
