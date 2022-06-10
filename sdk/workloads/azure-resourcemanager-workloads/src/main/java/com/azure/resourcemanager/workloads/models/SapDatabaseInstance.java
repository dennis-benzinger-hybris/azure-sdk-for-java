// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.workloads.fluent.models.SapDatabaseInstanceInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of SapDatabaseInstance. */
public interface SapDatabaseInstance {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the subnet property: The database subnet.
     *
     * @return the subnet value.
     */
    String subnet();

    /**
     * Gets the databaseSid property: The database SID.
     *
     * @return the databaseSid value.
     */
    String databaseSid();

    /**
     * Gets the databaseType property: The SAP database type.
     *
     * @return the databaseType value.
     */
    String databaseType();

    /**
     * Gets the ipAddress property: The database IP Address.
     *
     * @return the ipAddress value.
     */
    String ipAddress();

    /**
     * Gets the vmDetails property: The list of virtual machines.
     *
     * @return the vmDetails value.
     */
    List<DatabaseVmDetails> vmDetails();

    /**
     * Gets the status property: Defines the SAP Instance status.
     *
     * @return the status value.
     */
    SapVirtualInstanceStatus status();

    /**
     * Gets the provisioningState property: Defines the provisioning states.
     *
     * @return the provisioningState value.
     */
    SapVirtualInstanceProvisioningState provisioningState();

    /**
     * Gets the errors property: Defines the Database Instance errors.
     *
     * @return the errors value.
     */
    SapVirtualInstanceError errors();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.workloads.fluent.models.SapDatabaseInstanceInner object.
     *
     * @return the inner object.
     */
    SapDatabaseInstanceInner innerModel();

    /** The entirety of the SapDatabaseInstance definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The SapDatabaseInstance definition stages. */
    interface DefinitionStages {
        /** The first stage of the SapDatabaseInstance definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the SapDatabaseInstance definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the SapDatabaseInstance definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, sapVirtualInstanceName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param sapVirtualInstanceName The name of the Virtual Instances for SAP.
             * @return the next definition stage.
             */
            WithCreate withExistingSapVirtualInstance(String resourceGroupName, String sapVirtualInstanceName);
        }
        /**
         * The stage of the SapDatabaseInstance definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            SapDatabaseInstance create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            SapDatabaseInstance create(Context context);
        }
        /** The stage of the SapDatabaseInstance definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
    }
    /**
     * Begins update for the SapDatabaseInstance resource.
     *
     * @return the stage of resource update.
     */
    SapDatabaseInstance.Update update();

    /** The template for SapDatabaseInstance update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        SapDatabaseInstance apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        SapDatabaseInstance apply(Context context);
    }
    /** The SapDatabaseInstance update stages. */
    interface UpdateStages {
        /** The stage of the SapDatabaseInstance update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Gets or sets the Resource tags..
             *
             * @param tags Gets or sets the Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    SapDatabaseInstance refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    SapDatabaseInstance refresh(Context context);
}