// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkloadKind. */
public final class WorkloadKind extends ExpandableStringEnum<WorkloadKind> {
    /** Static value WordPress for WorkloadKind. */
    public static final WorkloadKind WORD_PRESS = fromString("WordPress");

    /**
     * Creates or finds a WorkloadKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkloadKind.
     */
    @JsonCreator
    public static WorkloadKind fromString(String name) {
        return fromString(name, WorkloadKind.class);
    }

    /**
     * Gets known WorkloadKind values.
     *
     * @return known WorkloadKind values.
     */
    public static Collection<WorkloadKind> values() {
        return values(WorkloadKind.class);
    }
}