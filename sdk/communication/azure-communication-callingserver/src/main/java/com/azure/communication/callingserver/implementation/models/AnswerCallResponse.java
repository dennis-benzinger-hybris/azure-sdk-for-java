// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response payload of the answer call operation. */
@Immutable
public final class AnswerCallResponse {
    /*
     * The call leg id.
     */
    @JsonProperty(value = "callLegId", access = JsonProperty.Access.WRITE_ONLY)
    private String callLegId;

    /**
     * Get the callLegId property: The call leg id.
     *
     * @return the callLegId value.
     */
    public String getCallLegId() {
        return this.callLegId;
    }
}