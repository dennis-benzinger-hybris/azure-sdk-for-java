// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ToneValue. */
public final class ToneValue extends ExpandableStringEnum<ToneValue> {
    /** Static value tone0 for ToneValue. */
    public static final ToneValue TONE0 = fromString("tone0");

    /** Static value tone1 for ToneValue. */
    public static final ToneValue TONE1 = fromString("tone1");

    /** Static value tone2 for ToneValue. */
    public static final ToneValue TONE2 = fromString("tone2");

    /** Static value tone3 for ToneValue. */
    public static final ToneValue TONE3 = fromString("tone3");

    /** Static value tone4 for ToneValue. */
    public static final ToneValue TONE4 = fromString("tone4");

    /** Static value tone5 for ToneValue. */
    public static final ToneValue TONE5 = fromString("tone5");

    /** Static value tone6 for ToneValue. */
    public static final ToneValue TONE6 = fromString("tone6");

    /** Static value tone7 for ToneValue. */
    public static final ToneValue TONE7 = fromString("tone7");

    /** Static value tone8 for ToneValue. */
    public static final ToneValue TONE8 = fromString("tone8");

    /** Static value tone9 for ToneValue. */
    public static final ToneValue TONE9 = fromString("tone9");

    /** Static value star for ToneValue. */
    public static final ToneValue STAR = fromString("star");

    /** Static value pound for ToneValue. */
    public static final ToneValue POUND = fromString("pound");

    /** Static value a for ToneValue. */
    public static final ToneValue A = fromString("a");

    /** Static value b for ToneValue. */
    public static final ToneValue B = fromString("b");

    /** Static value c for ToneValue. */
    public static final ToneValue C = fromString("c");

    /** Static value d for ToneValue. */
    public static final ToneValue D = fromString("d");

    /** Static value flash for ToneValue. */
    public static final ToneValue FLASH = fromString("flash");

    /**
     * Creates or finds a ToneValue from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ToneValue.
     */
    @JsonCreator
    public static ToneValue fromString(String name) {
        return fromString(name, ToneValue.class);
    }

    /** @return known ToneValue values. */
    public static Collection<ToneValue> values() {
        return values(ToneValue.class);
    }
}