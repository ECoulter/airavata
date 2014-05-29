/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.airavata.persistance.registry.jpa.model;

import org.apache.openjpa.persistence.DataCache;

import javax.persistence.*;

@DataCache
@Entity
@Table(name = "NODE_OUTPUT")
@IdClass(NodeOutput_PK.class)
public class NodeOutput {
    @Id
    @Column(name = "NODE_INSTANCE_ID")
    private String nodeId;
    @Id
    @Column(name = "OUTPUT_KEY")
    private String outputKey;
    @Column(name = "OUTPUT_KEY_TYPE")
    private String outputKeyType;
    @Column(name = "METADATA")
    private String metadata;
    @Column(name = "VALUE")
    private String value;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name = "NODE_INSTANCE_ID")
    private WorkflowNodeDetail node;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public WorkflowNodeDetail getNode() {
        return node;
    }

    public void setNode(WorkflowNodeDetail node) {
        this.node = node;
    }

    public String getOutputKey() {
        return outputKey;
    }

    public void setOutputKey(String outputKey) {
        this.outputKey = outputKey;
    }

    public String getOutputKeyType() {
        return outputKeyType;
    }

    public void setOutputKeyType(String outputKeyType) {
        this.outputKeyType = outputKeyType;
    }
}
