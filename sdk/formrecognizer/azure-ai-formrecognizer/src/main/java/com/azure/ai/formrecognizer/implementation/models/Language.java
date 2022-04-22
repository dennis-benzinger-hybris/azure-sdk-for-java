// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Language. */
public final class Language extends ExpandableStringEnum<Language> {
    /** Static value af for Language. */
    public static final Language AF = fromString("af");

    /** Static value ast for Language. */
    public static final Language AST = fromString("ast");

    /** Static value bi for Language. */
    public static final Language BI = fromString("bi");

    /** Static value br for Language. */
    public static final Language BR = fromString("br");

    /** Static value ca for Language. */
    public static final Language CA = fromString("ca");

    /** Static value ceb for Language. */
    public static final Language CEB = fromString("ceb");

    /** Static value ch for Language. */
    public static final Language CH = fromString("ch");

    /** Static value co for Language. */
    public static final Language CO = fromString("co");

    /** Static value crh for Language. */
    public static final Language CRH = fromString("crh");

    /** Static value cs for Language. */
    public static final Language CS = fromString("cs");

    /** Static value csb for Language. */
    public static final Language CSB = fromString("csb");

    /** Static value da for Language. */
    public static final Language DA = fromString("da");

    /** Static value de for Language. */
    public static final Language DE = fromString("de");

    /** Static value en for Language. */
    public static final Language EN = fromString("en");

    /** Static value es for Language. */
    public static final Language ES = fromString("es");

    /** Static value et for Language. */
    public static final Language ET = fromString("et");

    /** Static value eu for Language. */
    public static final Language EU = fromString("eu");

    /** Static value fi for Language. */
    public static final Language FI = fromString("fi");

    /** Static value fil for Language. */
    public static final Language FIL = fromString("fil");

    /** Static value fj for Language. */
    public static final Language FJ = fromString("fj");

    /** Static value fr for Language. */
    public static final Language FR = fromString("fr");

    /** Static value fur for Language. */
    public static final Language FUR = fromString("fur");

    /** Static value fy for Language. */
    public static final Language FY = fromString("fy");

    /** Static value ga for Language. */
    public static final Language GA = fromString("ga");

    /** Static value gd for Language. */
    public static final Language GD = fromString("gd");

    /** Static value gil for Language. */
    public static final Language GIL = fromString("gil");

    /** Static value gl for Language. */
    public static final Language GL = fromString("gl");

    /** Static value gv for Language. */
    public static final Language GV = fromString("gv");

    /** Static value hni for Language. */
    public static final Language HNI = fromString("hni");

    /** Static value hsb for Language. */
    public static final Language HSB = fromString("hsb");

    /** Static value ht for Language. */
    public static final Language HT = fromString("ht");

    /** Static value hu for Language. */
    public static final Language HU = fromString("hu");

    /** Static value ia for Language. */
    public static final Language IA = fromString("ia");

    /** Static value id for Language. */
    public static final Language ID = fromString("id");

    /** Static value it for Language. */
    public static final Language IT = fromString("it");

    /** Static value iu for Language. */
    public static final Language IU = fromString("iu");

    /** Static value ja for Language. */
    public static final Language JA = fromString("ja");

    /** Static value jv for Language. */
    public static final Language JV = fromString("jv");

    /** Static value kaa for Language. */
    public static final Language KAA = fromString("kaa");

    /** Static value kac for Language. */
    public static final Language KAC = fromString("kac");

    /** Static value kea for Language. */
    public static final Language KEA = fromString("kea");

    /** Static value kha for Language. */
    public static final Language KHA = fromString("kha");

    /** Static value kl for Language. */
    public static final Language KL = fromString("kl");

    /** Static value ko for Language. */
    public static final Language KO = fromString("ko");

    /** Static value ku for Language. */
    public static final Language KU = fromString("ku");

    /** Static value kw for Language. */
    public static final Language KW = fromString("kw");

    /** Static value lb for Language. */
    public static final Language LB = fromString("lb");

    /** Static value ms for Language. */
    public static final Language MS = fromString("ms");

    /** Static value mww for Language. */
    public static final Language MWW = fromString("mww");

    /** Static value nap for Language. */
    public static final Language NAP = fromString("nap");

    /** Static value nl for Language. */
    public static final Language NL = fromString("nl");

    /** Static value no for Language. */
    public static final Language NO = fromString("no");

    /** Static value oc for Language. */
    public static final Language OC = fromString("oc");

    /** Static value pl for Language. */
    public static final Language PL = fromString("pl");

    /** Static value pt for Language. */
    public static final Language PT = fromString("pt");

    /** Static value quc for Language. */
    public static final Language QUC = fromString("quc");

    /** Static value rm for Language. */
    public static final Language RM = fromString("rm");

    /** Static value sco for Language. */
    public static final Language SCO = fromString("sco");

    /** Static value sl for Language. */
    public static final Language SL = fromString("sl");

    /** Static value sq for Language. */
    public static final Language SQ = fromString("sq");

    /** Static value sv for Language. */
    public static final Language SV = fromString("sv");

    /** Static value sw for Language. */
    public static final Language SW = fromString("sw");

    /** Static value tet for Language. */
    public static final Language TET = fromString("tet");

    /** Static value tr for Language. */
    public static final Language TR = fromString("tr");

    /** Static value tt for Language. */
    public static final Language TT = fromString("tt");

    /** Static value uz for Language. */
    public static final Language UZ = fromString("uz");

    /** Static value vo for Language. */
    public static final Language VO = fromString("vo");

    /** Static value wae for Language. */
    public static final Language WAE = fromString("wae");

    /** Static value yua for Language. */
    public static final Language YUA = fromString("yua");

    /** Static value za for Language. */
    public static final Language ZA = fromString("za");

    /** Static value zh-Hans for Language. */
    public static final Language ZH_HANS = fromString("zh-Hans");

    /** Static value zh-Hant for Language. */
    public static final Language ZH_HANT = fromString("zh-Hant");

    /** Static value zu for Language. */
    public static final Language ZU = fromString("zu");

    /**
     * Creates or finds a Language from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Language.
     */
    @JsonCreator
    public static Language fromString(String name) {
        return fromString(name, Language.class);
    }

    /** @return known Language values. */
    public static Collection<Language> values() {
        return values(Language.class);
    }
}