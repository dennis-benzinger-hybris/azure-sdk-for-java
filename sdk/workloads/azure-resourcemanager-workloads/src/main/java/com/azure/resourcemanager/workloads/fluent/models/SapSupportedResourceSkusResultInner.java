// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.workloads.models.SapSupportedSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of supported SKUs for different resources which are part of SAP deployment. */
@Fluent
public final class SapSupportedResourceSkusResultInner {
    /*
     * Gets the list of SAP supported SKUs.
     */
    @JsonProperty(value = "supportedSkus")
    private List<SapSupportedSku> supportedSkus;

    /**
     * Get the supportedSkus property: Gets the list of SAP supported SKUs.
     *
     * @return the supportedSkus value.
     */
    public List<SapSupportedSku> supportedSkus() {
        return this.supportedSkus;
    }

    /**
     * Set the supportedSkus property: Gets the list of SAP supported SKUs.
     *
     * @param supportedSkus the supportedSkus value to set.
     * @return the SapSupportedResourceSkusResultInner object itself.
     */
    public SapSupportedResourceSkusResultInner withSupportedSkus(List<SapSupportedSku> supportedSkus) {
        this.supportedSkus = supportedSkus;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (supportedSkus() != null) {
            supportedSkus().forEach(e -> e.validate());
        }
    }
}