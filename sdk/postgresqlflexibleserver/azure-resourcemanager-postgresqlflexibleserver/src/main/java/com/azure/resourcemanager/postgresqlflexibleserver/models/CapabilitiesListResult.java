// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.CapabilityPropertiesInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** location capability. */
@Immutable
public final class CapabilitiesListResult {
    /*
     * A list of supported capabilities.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<CapabilityPropertiesInner> value;

    /*
     * Link to retrieve next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of CapabilitiesListResult class. */
    public CapabilitiesListResult() {
    }

    /**
     * Get the value property: A list of supported capabilities.
     *
     * @return the value value.
     */
    public List<CapabilityPropertiesInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to retrieve next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
