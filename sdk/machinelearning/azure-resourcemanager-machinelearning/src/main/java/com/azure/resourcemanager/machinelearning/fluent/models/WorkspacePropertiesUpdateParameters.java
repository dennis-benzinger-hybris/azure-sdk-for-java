// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.models.PublicNetworkAccess;
import com.azure.resourcemanager.machinelearning.models.ServiceManagedResourcesSettings;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters for updating the properties of a machine learning workspace. */
@Fluent
public final class WorkspacePropertiesUpdateParameters {
    /*
     * The description of this workspace.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The friendly name for this workspace.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * The compute name for image build
     */
    @JsonProperty(value = "imageBuildCompute")
    private String imageBuildCompute;

    /*
     * The service managed resource settings.
     */
    @JsonProperty(value = "serviceManagedResourcesSettings")
    private ServiceManagedResourcesSettings serviceManagedResourcesSettings;

    /*
     * The user assigned identity resource id that represents the workspace
     * identity.
     */
    @JsonProperty(value = "primaryUserAssignedIdentity")
    private String primaryUserAssignedIdentity;

    /*
     * Whether requests from Public Network are allowed.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * ARM id of the application insights associated with this workspace.
     */
    @JsonProperty(value = "applicationInsights")
    private String applicationInsights;

    /*
     * ARM id of the container registry associated with this workspace.
     */
    @JsonProperty(value = "containerRegistry")
    private String containerRegistry;

    /**
     * Get the description property: The description of this workspace.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this workspace.
     *
     * @param description the description value to set.
     * @return the WorkspacePropertiesUpdateParameters object itself.
     */
    public WorkspacePropertiesUpdateParameters withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the friendlyName property: The friendly name for this workspace.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The friendly name for this workspace.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the WorkspacePropertiesUpdateParameters object itself.
     */
    public WorkspacePropertiesUpdateParameters withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the imageBuildCompute property: The compute name for image build.
     *
     * @return the imageBuildCompute value.
     */
    public String imageBuildCompute() {
        return this.imageBuildCompute;
    }

    /**
     * Set the imageBuildCompute property: The compute name for image build.
     *
     * @param imageBuildCompute the imageBuildCompute value to set.
     * @return the WorkspacePropertiesUpdateParameters object itself.
     */
    public WorkspacePropertiesUpdateParameters withImageBuildCompute(String imageBuildCompute) {
        this.imageBuildCompute = imageBuildCompute;
        return this;
    }

    /**
     * Get the serviceManagedResourcesSettings property: The service managed resource settings.
     *
     * @return the serviceManagedResourcesSettings value.
     */
    public ServiceManagedResourcesSettings serviceManagedResourcesSettings() {
        return this.serviceManagedResourcesSettings;
    }

    /**
     * Set the serviceManagedResourcesSettings property: The service managed resource settings.
     *
     * @param serviceManagedResourcesSettings the serviceManagedResourcesSettings value to set.
     * @return the WorkspacePropertiesUpdateParameters object itself.
     */
    public WorkspacePropertiesUpdateParameters withServiceManagedResourcesSettings(
        ServiceManagedResourcesSettings serviceManagedResourcesSettings) {
        this.serviceManagedResourcesSettings = serviceManagedResourcesSettings;
        return this;
    }

    /**
     * Get the primaryUserAssignedIdentity property: The user assigned identity resource id that represents the
     * workspace identity.
     *
     * @return the primaryUserAssignedIdentity value.
     */
    public String primaryUserAssignedIdentity() {
        return this.primaryUserAssignedIdentity;
    }

    /**
     * Set the primaryUserAssignedIdentity property: The user assigned identity resource id that represents the
     * workspace identity.
     *
     * @param primaryUserAssignedIdentity the primaryUserAssignedIdentity value to set.
     * @return the WorkspacePropertiesUpdateParameters object itself.
     */
    public WorkspacePropertiesUpdateParameters withPrimaryUserAssignedIdentity(String primaryUserAssignedIdentity) {
        this.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether requests from Public Network are allowed.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WorkspacePropertiesUpdateParameters object itself.
     */
    public WorkspacePropertiesUpdateParameters withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the applicationInsights property: ARM id of the application insights associated with this workspace.
     *
     * @return the applicationInsights value.
     */
    public String applicationInsights() {
        return this.applicationInsights;
    }

    /**
     * Set the applicationInsights property: ARM id of the application insights associated with this workspace.
     *
     * @param applicationInsights the applicationInsights value to set.
     * @return the WorkspacePropertiesUpdateParameters object itself.
     */
    public WorkspacePropertiesUpdateParameters withApplicationInsights(String applicationInsights) {
        this.applicationInsights = applicationInsights;
        return this;
    }

    /**
     * Get the containerRegistry property: ARM id of the container registry associated with this workspace.
     *
     * @return the containerRegistry value.
     */
    public String containerRegistry() {
        return this.containerRegistry;
    }

    /**
     * Set the containerRegistry property: ARM id of the container registry associated with this workspace.
     *
     * @param containerRegistry the containerRegistry value to set.
     * @return the WorkspacePropertiesUpdateParameters object itself.
     */
    public WorkspacePropertiesUpdateParameters withContainerRegistry(String containerRegistry) {
        this.containerRegistry = containerRegistry;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceManagedResourcesSettings() != null) {
            serviceManagedResourcesSettings().validate();
        }
    }
}