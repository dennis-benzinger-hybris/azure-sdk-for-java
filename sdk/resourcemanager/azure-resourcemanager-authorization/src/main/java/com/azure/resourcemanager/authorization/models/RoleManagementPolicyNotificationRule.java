// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** The role management policy notification rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("RoleManagementPolicyNotificationRule")
@Fluent
public final class RoleManagementPolicyNotificationRule extends RoleManagementPolicyRule {
    /*
     * The type of notification.
     */
    @JsonProperty(value = "notificationType")
    private NotificationDeliveryMechanism notificationType;

    /*
     * The notification level.
     */
    @JsonProperty(value = "notificationLevel")
    private NotificationLevel notificationLevel;

    /*
     * The recipient type.
     */
    @JsonProperty(value = "recipientType")
    private RecipientType recipientType;

    /*
     * The list of notification recipients.
     */
    @JsonProperty(value = "notificationRecipients")
    private List<String> notificationRecipients;

    /*
     * Determines if the notification will be sent to the recipient type
     * specified in the policy rule.
     */
    @JsonProperty(value = "isDefaultRecipientsEnabled")
    private Boolean isDefaultRecipientsEnabled;

    /**
     * Get the notificationType property: The type of notification.
     *
     * @return the notificationType value.
     */
    public NotificationDeliveryMechanism notificationType() {
        return this.notificationType;
    }

    /**
     * Set the notificationType property: The type of notification.
     *
     * @param notificationType the notificationType value to set.
     * @return the RoleManagementPolicyNotificationRule object itself.
     */
    public RoleManagementPolicyNotificationRule withNotificationType(NotificationDeliveryMechanism notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * Get the notificationLevel property: The notification level.
     *
     * @return the notificationLevel value.
     */
    public NotificationLevel notificationLevel() {
        return this.notificationLevel;
    }

    /**
     * Set the notificationLevel property: The notification level.
     *
     * @param notificationLevel the notificationLevel value to set.
     * @return the RoleManagementPolicyNotificationRule object itself.
     */
    public RoleManagementPolicyNotificationRule withNotificationLevel(NotificationLevel notificationLevel) {
        this.notificationLevel = notificationLevel;
        return this;
    }

    /**
     * Get the recipientType property: The recipient type.
     *
     * @return the recipientType value.
     */
    public RecipientType recipientType() {
        return this.recipientType;
    }

    /**
     * Set the recipientType property: The recipient type.
     *
     * @param recipientType the recipientType value to set.
     * @return the RoleManagementPolicyNotificationRule object itself.
     */
    public RoleManagementPolicyNotificationRule withRecipientType(RecipientType recipientType) {
        this.recipientType = recipientType;
        return this;
    }

    /**
     * Get the notificationRecipients property: The list of notification recipients.
     *
     * @return the notificationRecipients value.
     */
    public List<String> notificationRecipients() {
        return this.notificationRecipients;
    }

    /**
     * Set the notificationRecipients property: The list of notification recipients.
     *
     * @param notificationRecipients the notificationRecipients value to set.
     * @return the RoleManagementPolicyNotificationRule object itself.
     */
    public RoleManagementPolicyNotificationRule withNotificationRecipients(List<String> notificationRecipients) {
        this.notificationRecipients = notificationRecipients;
        return this;
    }

    /**
     * Get the isDefaultRecipientsEnabled property: Determines if the notification will be sent to the recipient type
     * specified in the policy rule.
     *
     * @return the isDefaultRecipientsEnabled value.
     */
    public Boolean isDefaultRecipientsEnabled() {
        return this.isDefaultRecipientsEnabled;
    }

    /**
     * Set the isDefaultRecipientsEnabled property: Determines if the notification will be sent to the recipient type
     * specified in the policy rule.
     *
     * @param isDefaultRecipientsEnabled the isDefaultRecipientsEnabled value to set.
     * @return the RoleManagementPolicyNotificationRule object itself.
     */
    public RoleManagementPolicyNotificationRule withIsDefaultRecipientsEnabled(Boolean isDefaultRecipientsEnabled) {
        this.isDefaultRecipientsEnabled = isDefaultRecipientsEnabled;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoleManagementPolicyNotificationRule withId(String id) {
        super.withId(id);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RoleManagementPolicyNotificationRule withTarget(RoleManagementPolicyRuleTarget target) {
        super.withTarget(target);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}