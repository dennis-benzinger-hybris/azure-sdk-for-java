// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Group connectivity details. */
@Fluent
public final class GroupConnectivityInformation {
    /*
     * Group ID.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * Member name.
     */
    @JsonProperty(value = "memberName", access = JsonProperty.Access.WRITE_ONLY)
    private String memberName;

    /*
     * List of customer visible FQDNs.
     */
    @JsonProperty(value = "customerVisibleFqdns")
    private List<String> customerVisibleFqdns;

    /*
     * Internal FQDN.
     */
    @JsonProperty(value = "internalFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String internalFqdn;

    /*
     * Redirect map ID.
     */
    @JsonProperty(value = "redirectMapId")
    private String redirectMapId;

    /*
     * PrivateLinkService ARM region.
     */
    @JsonProperty(value = "privateLinkServiceArmRegion")
    private String privateLinkServiceArmRegion;

    /**
     * Get the groupId property: Group ID.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the memberName property: Member name.
     *
     * @return the memberName value.
     */
    public String memberName() {
        return this.memberName;
    }

    /**
     * Get the customerVisibleFqdns property: List of customer visible FQDNs.
     *
     * @return the customerVisibleFqdns value.
     */
    public List<String> customerVisibleFqdns() {
        return this.customerVisibleFqdns;
    }

    /**
     * Set the customerVisibleFqdns property: List of customer visible FQDNs.
     *
     * @param customerVisibleFqdns the customerVisibleFqdns value to set.
     * @return the GroupConnectivityInformation object itself.
     */
    public GroupConnectivityInformation withCustomerVisibleFqdns(List<String> customerVisibleFqdns) {
        this.customerVisibleFqdns = customerVisibleFqdns;
        return this;
    }

    /**
     * Get the internalFqdn property: Internal FQDN.
     *
     * @return the internalFqdn value.
     */
    public String internalFqdn() {
        return this.internalFqdn;
    }

    /**
     * Get the redirectMapId property: Redirect map ID.
     *
     * @return the redirectMapId value.
     */
    public String redirectMapId() {
        return this.redirectMapId;
    }

    /**
     * Set the redirectMapId property: Redirect map ID.
     *
     * @param redirectMapId the redirectMapId value to set.
     * @return the GroupConnectivityInformation object itself.
     */
    public GroupConnectivityInformation withRedirectMapId(String redirectMapId) {
        this.redirectMapId = redirectMapId;
        return this;
    }

    /**
     * Get the privateLinkServiceArmRegion property: PrivateLinkService ARM region.
     *
     * @return the privateLinkServiceArmRegion value.
     */
    public String privateLinkServiceArmRegion() {
        return this.privateLinkServiceArmRegion;
    }

    /**
     * Set the privateLinkServiceArmRegion property: PrivateLinkService ARM region.
     *
     * @param privateLinkServiceArmRegion the privateLinkServiceArmRegion value to set.
     * @return the GroupConnectivityInformation object itself.
     */
    public GroupConnectivityInformation withPrivateLinkServiceArmRegion(String privateLinkServiceArmRegion) {
        this.privateLinkServiceArmRegion = privateLinkServiceArmRegion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}