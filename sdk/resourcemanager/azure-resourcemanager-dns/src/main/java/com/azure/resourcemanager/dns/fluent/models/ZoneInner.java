// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dns.models.ZoneType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes a DNS zone. */
@Fluent
public final class ZoneInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ZoneInner.class);

    /*
     * The etag of the zone.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The properties of the zone.
     */
    @JsonProperty(value = "properties")
    private ZoneProperties innerProperties;

    /**
     * Get the etag property: The etag of the zone.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The etag of the zone.
     *
     * @param etag the etag value to set.
     * @return the ZoneInner object itself.
     */
    public ZoneInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: The properties of the zone.
     *
     * @return the innerProperties value.
     */
    private ZoneProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ZoneInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ZoneInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the maxNumberOfRecordSets property: The maximum number of record sets that can be created in this DNS zone.
     * This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordSets value.
     */
    public Long maxNumberOfRecordSets() {
        return this.innerProperties() == null ? null : this.innerProperties().maxNumberOfRecordSets();
    }

    /**
     * Get the maxNumberOfRecordsPerRecordSet property: The maximum number of records per record set that can be created
     * in this DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     *
     * @return the maxNumberOfRecordsPerRecordSet value.
     */
    public Long maxNumberOfRecordsPerRecordSet() {
        return this.innerProperties() == null ? null : this.innerProperties().maxNumberOfRecordsPerRecordSet();
    }

    /**
     * Get the numberOfRecordSets property: The current number of record sets in this DNS zone. This is a read-only
     * property and any attempt to set this value will be ignored.
     *
     * @return the numberOfRecordSets value.
     */
    public Long numberOfRecordSets() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfRecordSets();
    }

    /**
     * Get the nameServers property: The name servers for this DNS zone. This is a read-only property and any attempt to
     * set this value will be ignored.
     *
     * @return the nameServers value.
     */
    public List<String> nameServers() {
        return this.innerProperties() == null ? null : this.innerProperties().nameServers();
    }

    /**
     * Get the zoneType property: The type of this DNS zone (Public or Private).
     *
     * @return the zoneType value.
     */
    public ZoneType zoneType() {
        return this.innerProperties() == null ? null : this.innerProperties().zoneType();
    }

    /**
     * Set the zoneType property: The type of this DNS zone (Public or Private).
     *
     * @param zoneType the zoneType value to set.
     * @return the ZoneInner object itself.
     */
    public ZoneInner withZoneType(ZoneType zoneType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ZoneProperties();
        }
        this.innerProperties().withZoneType(zoneType);
        return this;
    }

    /**
     * Get the registrationVirtualNetworks property: A list of references to virtual networks that register hostnames in
     * this DNS zone. This is a only when ZoneType is Private.
     *
     * @return the registrationVirtualNetworks value.
     */
    public List<SubResource> registrationVirtualNetworks() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationVirtualNetworks();
    }

    /**
     * Set the registrationVirtualNetworks property: A list of references to virtual networks that register hostnames in
     * this DNS zone. This is a only when ZoneType is Private.
     *
     * @param registrationVirtualNetworks the registrationVirtualNetworks value to set.
     * @return the ZoneInner object itself.
     */
    public ZoneInner withRegistrationVirtualNetworks(List<SubResource> registrationVirtualNetworks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ZoneProperties();
        }
        this.innerProperties().withRegistrationVirtualNetworks(registrationVirtualNetworks);
        return this;
    }

    /**
     * Get the resolutionVirtualNetworks property: A list of references to virtual networks that resolve records in this
     * DNS zone. This is a only when ZoneType is Private.
     *
     * @return the resolutionVirtualNetworks value.
     */
    public List<SubResource> resolutionVirtualNetworks() {
        return this.innerProperties() == null ? null : this.innerProperties().resolutionVirtualNetworks();
    }

    /**
     * Set the resolutionVirtualNetworks property: A list of references to virtual networks that resolve records in this
     * DNS zone. This is a only when ZoneType is Private.
     *
     * @param resolutionVirtualNetworks the resolutionVirtualNetworks value to set.
     * @return the ZoneInner object itself.
     */
    public ZoneInner withResolutionVirtualNetworks(List<SubResource> resolutionVirtualNetworks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ZoneProperties();
        }
        this.innerProperties().withResolutionVirtualNetworks(resolutionVirtualNetworks);
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
