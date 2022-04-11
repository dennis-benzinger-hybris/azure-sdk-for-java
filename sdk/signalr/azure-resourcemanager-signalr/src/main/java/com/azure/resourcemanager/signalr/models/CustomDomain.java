// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.CustomDomainInner;

/** An immutable client-side representation of CustomDomain. */
public interface CustomDomain {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the domainName property: The custom domain name.
     *
     * @return the domainName value.
     */
    String domainName();

    /**
     * Gets the customCertificate property: Reference to a resource.
     *
     * @return the customCertificate value.
     */
    ResourceReference customCertificate();

    /**
     * Gets the inner com.azure.resourcemanager.signalr.fluent.models.CustomDomainInner object.
     *
     * @return the inner object.
     */
    CustomDomainInner innerModel();

    /** The entirety of the CustomDomain definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithDomainName,
            DefinitionStages.WithCustomCertificate,
            DefinitionStages.WithCreate {
    }
    /** The CustomDomain definition stages. */
    interface DefinitionStages {
        /** The first stage of the CustomDomain definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the CustomDomain definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, resourceName.
             *
             * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this
             *     value from the Azure Resource Manager API or the portal.
             * @param resourceName The name of the resource.
             * @return the next definition stage.
             */
            WithDomainName withExistingSignalR(String resourceGroupName, String resourceName);
        }
        /** The stage of the CustomDomain definition allowing to specify domainName. */
        interface WithDomainName {
            /**
             * Specifies the domainName property: The custom domain name..
             *
             * @param domainName The custom domain name.
             * @return the next definition stage.
             */
            WithCustomCertificate withDomainName(String domainName);
        }
        /** The stage of the CustomDomain definition allowing to specify customCertificate. */
        interface WithCustomCertificate {
            /**
             * Specifies the customCertificate property: Reference to a resource..
             *
             * @param customCertificate Reference to a resource.
             * @return the next definition stage.
             */
            WithCreate withCustomCertificate(ResourceReference customCertificate);
        }
        /**
         * The stage of the CustomDomain definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            CustomDomain create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            CustomDomain create(Context context);
        }
    }
    /**
     * Begins update for the CustomDomain resource.
     *
     * @return the stage of resource update.
     */
    CustomDomain.Update update();

    /** The template for CustomDomain update. */
    interface Update extends UpdateStages.WithDomainName, UpdateStages.WithCustomCertificate {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        CustomDomain apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        CustomDomain apply(Context context);
    }
    /** The CustomDomain update stages. */
    interface UpdateStages {
        /** The stage of the CustomDomain update allowing to specify domainName. */
        interface WithDomainName {
            /**
             * Specifies the domainName property: The custom domain name..
             *
             * @param domainName The custom domain name.
             * @return the next definition stage.
             */
            Update withDomainName(String domainName);
        }
        /** The stage of the CustomDomain update allowing to specify customCertificate. */
        interface WithCustomCertificate {
            /**
             * Specifies the customCertificate property: Reference to a resource..
             *
             * @param customCertificate Reference to a resource.
             * @return the next definition stage.
             */
            Update withCustomCertificate(ResourceReference customCertificate);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    CustomDomain refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    CustomDomain refresh(Context context);
}