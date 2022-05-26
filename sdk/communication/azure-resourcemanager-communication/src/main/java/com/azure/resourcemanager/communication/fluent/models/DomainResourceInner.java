// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.communication.models.DomainManagement;
import com.azure.resourcemanager.communication.models.DomainPropertiesVerificationRecords;
import com.azure.resourcemanager.communication.models.DomainPropertiesVerificationStates;
import com.azure.resourcemanager.communication.models.DomainsProvisioningState;
import com.azure.resourcemanager.communication.models.UserEngagementTracking;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A class representing a Domains resource. */
@Fluent
public final class DomainResourceInner extends Resource {
    /*
     * The properties of a Domains resource.
     */
    @JsonProperty(value = "properties")
    private DomainProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The properties of a Domains resource.
     *
     * @return the innerProperties value.
     */
    private DomainProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public DomainResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DomainResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public DomainsProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the dataLocation property: The location where the Domains resource data is stored at rest.
     *
     * @return the dataLocation value.
     */
    public String dataLocation() {
        return this.innerProperties() == null ? null : this.innerProperties().dataLocation();
    }

    /**
     * Get the fromSenderDomain property: P2 sender domain that is displayed to the email recipients [RFC 5322].
     *
     * @return the fromSenderDomain value.
     */
    public String fromSenderDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().fromSenderDomain();
    }

    /**
     * Get the mailFromSenderDomain property: P1 sender domain that is present on the email envelope [RFC 5321].
     *
     * @return the mailFromSenderDomain value.
     */
    public String mailFromSenderDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().mailFromSenderDomain();
    }

    /**
     * Get the domainManagement property: Describes how a Domains resource is being managed.
     *
     * @return the domainManagement value.
     */
    public DomainManagement domainManagement() {
        return this.innerProperties() == null ? null : this.innerProperties().domainManagement();
    }

    /**
     * Set the domainManagement property: Describes how a Domains resource is being managed.
     *
     * @param domainManagement the domainManagement value to set.
     * @return the DomainResourceInner object itself.
     */
    public DomainResourceInner withDomainManagement(DomainManagement domainManagement) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withDomainManagement(domainManagement);
        return this;
    }

    /**
     * Get the verificationStates property: List of VerificationStatusRecord.
     *
     * @return the verificationStates value.
     */
    public DomainPropertiesVerificationStates verificationStates() {
        return this.innerProperties() == null ? null : this.innerProperties().verificationStates();
    }

    /**
     * Get the verificationRecords property: List of DnsRecord.
     *
     * @return the verificationRecords value.
     */
    public DomainPropertiesVerificationRecords verificationRecords() {
        return this.innerProperties() == null ? null : this.innerProperties().verificationRecords();
    }

    /**
     * Get the validSenderUsernames property: Collection of valid sender usernames. This is a key-value pair where
     * key=username and value=display name.
     *
     * @return the validSenderUsernames value.
     */
    public Map<String, String> validSenderUsernames() {
        return this.innerProperties() == null ? null : this.innerProperties().validSenderUsernames();
    }

    /**
     * Set the validSenderUsernames property: Collection of valid sender usernames. This is a key-value pair where
     * key=username and value=display name.
     *
     * @param validSenderUsernames the validSenderUsernames value to set.
     * @return the DomainResourceInner object itself.
     */
    public DomainResourceInner withValidSenderUsernames(Map<String, String> validSenderUsernames) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withValidSenderUsernames(validSenderUsernames);
        return this;
    }

    /**
     * Get the userEngagementTracking property: Describes whether user engagement tracking is enabled or disabled.
     *
     * @return the userEngagementTracking value.
     */
    public UserEngagementTracking userEngagementTracking() {
        return this.innerProperties() == null ? null : this.innerProperties().userEngagementTracking();
    }

    /**
     * Set the userEngagementTracking property: Describes whether user engagement tracking is enabled or disabled.
     *
     * @param userEngagementTracking the userEngagementTracking value to set.
     * @return the DomainResourceInner object itself.
     */
    public DomainResourceInner withUserEngagementTracking(UserEngagementTracking userEngagementTracking) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DomainProperties();
        }
        this.innerProperties().withUserEngagementTracking(userEngagementTracking);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}