// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EnqueueReplicationServerType. */
public final class EnqueueReplicationServerType extends ExpandableStringEnum<EnqueueReplicationServerType> {
    /** Static value EnqueueReplicator1 for EnqueueReplicationServerType. */
    public static final EnqueueReplicationServerType ENQUEUE_REPLICATOR1 = fromString("EnqueueReplicator1");

    /** Static value EnqueueReplicator2 for EnqueueReplicationServerType. */
    public static final EnqueueReplicationServerType ENQUEUE_REPLICATOR2 = fromString("EnqueueReplicator2");

    /**
     * Creates or finds a EnqueueReplicationServerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnqueueReplicationServerType.
     */
    @JsonCreator
    public static EnqueueReplicationServerType fromString(String name) {
        return fromString(name, EnqueueReplicationServerType.class);
    }

    /**
     * Gets known EnqueueReplicationServerType values.
     *
     * @return known EnqueueReplicationServerType values.
     */
    public static Collection<EnqueueReplicationServerType> values() {
        return values(EnqueueReplicationServerType.class);
    }
}