// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.util.Context;

/** Samples for Labs Get. */
public final class LabsGetSamples {
    /*
     * x-ms-original-file: specification/education/resource-manager/Microsoft.Education/preview/2021-12-01-preview/examples/LabIncludeBudget.json
     */
    /**
     * Sample code: LabIncludeBudget.
     *
     * @param manager Entry point to EducationManager.
     */
    public static void labIncludeBudget(com.azure.resourcemanager.education.EducationManager manager) {
        manager
            .labs()
            .getWithResponse(
                "{billingAccountName}", "{billingProfileName}", "{invoiceSectionName}", true, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/education/resource-manager/Microsoft.Education/preview/2021-12-01-preview/examples/Lab.json
     */
    /**
     * Sample code: Lab.
     *
     * @param manager Entry point to EducationManager.
     */
    public static void lab(com.azure.resourcemanager.education.EducationManager manager) {
        manager
            .labs()
            .getWithResponse(
                "{billingAccountName}", "{billingProfileName}", "{invoiceSectionName}", false, Context.NONE);
    }
}