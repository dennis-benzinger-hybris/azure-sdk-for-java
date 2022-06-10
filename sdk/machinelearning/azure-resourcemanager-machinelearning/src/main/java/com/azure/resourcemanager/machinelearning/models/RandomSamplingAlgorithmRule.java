// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RandomSamplingAlgorithmRule. */
public final class RandomSamplingAlgorithmRule extends ExpandableStringEnum<RandomSamplingAlgorithmRule> {
    /** Static value Random for RandomSamplingAlgorithmRule. */
    public static final RandomSamplingAlgorithmRule RANDOM = fromString("Random");

    /** Static value Sobol for RandomSamplingAlgorithmRule. */
    public static final RandomSamplingAlgorithmRule SOBOL = fromString("Sobol");

    /**
     * Creates or finds a RandomSamplingAlgorithmRule from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RandomSamplingAlgorithmRule.
     */
    @JsonCreator
    public static RandomSamplingAlgorithmRule fromString(String name) {
        return fromString(name, RandomSamplingAlgorithmRule.class);
    }

    /**
     * Gets known RandomSamplingAlgorithmRule values.
     *
     * @return known RandomSamplingAlgorithmRule values.
     */
    public static Collection<RandomSamplingAlgorithmRule> values() {
        return values(RandomSamplingAlgorithmRule.class);
    }
}