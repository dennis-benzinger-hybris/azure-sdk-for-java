// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Compute node information related to a AmlCompute. */
@Immutable
public final class AmlComputeNodeInformation {
    /*
     * Node ID. ID of the compute node.
     */
    @JsonProperty(value = "nodeId", access = JsonProperty.Access.WRITE_ONLY)
    private String nodeId;

    /*
     * Private IP address. Private IP address of the compute node.
     */
    @JsonProperty(value = "privateIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String privateIpAddress;

    /*
     * Public IP address. Public IP address of the compute node.
     */
    @JsonProperty(value = "publicIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIpAddress;

    /*
     * Port. SSH port number of the node.
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Integer port;

    /*
     * State of the compute node. Values are idle, running, preparing,
     * unusable, leaving and preempted.
     */
    @JsonProperty(value = "nodeState", access = JsonProperty.Access.WRITE_ONLY)
    private NodeState nodeState;

    /*
     * Run ID. ID of the Experiment running on the node, if any else null.
     */
    @JsonProperty(value = "runId", access = JsonProperty.Access.WRITE_ONLY)
    private String runId;

    /**
     * Get the nodeId property: Node ID. ID of the compute node.
     *
     * @return the nodeId value.
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Get the privateIpAddress property: Private IP address. Private IP address of the compute node.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Get the publicIpAddress property: Public IP address. Public IP address of the compute node.
     *
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Get the port property: Port. SSH port number of the node.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Get the nodeState property: State of the compute node. Values are idle, running, preparing, unusable, leaving and
     * preempted.
     *
     * @return the nodeState value.
     */
    public NodeState nodeState() {
        return this.nodeState;
    }

    /**
     * Get the runId property: Run ID. ID of the Experiment running on the node, if any else null.
     *
     * @return the runId value.
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}