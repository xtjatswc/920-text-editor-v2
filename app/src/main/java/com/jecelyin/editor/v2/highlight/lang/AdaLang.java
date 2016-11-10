/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;
import com.jecelyin.editor.v2.highlight.syntax.*;
/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class AdaLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "--";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = ".*(begin|declare|do|else|elsif|exception|generic|is|loop|private|record|select|tagged|then|with|=>|:=)\\s*(--.*)?$";
        PROPERTY2.NAME = "indentNextLines";

        PROPERTY3.VALUE = "^\\s*end\\b.*;";
        PROPERTY3.NAME = "unindentThisLine";

        PROPERTY4.VALUE = "^\\s*end\\b.*;";
        PROPERTY4.NAME = "unindentNextLines";

        PROPERTY5.VALUE = ";";
        PROPERTY5.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = "--#";
        EOL_SPAN1.TYPE = "COMMENT2";

        EOL_SPAN2.text = "--";
        EOL_SPAN2.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = ")";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "(";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "..";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ".all";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = ":=";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "/=";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "=>";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "=";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<>";
        SEQ9.TYPE = "NULL";

        SEQ10.text = "<<";
        SEQ10.TYPE = "LABEL";

        SEQ11.text = ">>";
        SEQ11.TYPE = "LABEL";

        SEQ12.text = ">=";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "<=";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ">";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "<";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "&";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "+";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "-";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "/";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "**";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "*";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "'access";
        SEQ22.TYPE = "KEYWORD3";

        SEQ23.text = "'address";
        SEQ23.TYPE = "KEYWORD3";

        SEQ24.text = "'adjacent";
        SEQ24.TYPE = "KEYWORD3";

        SEQ25.text = "'aft";
        SEQ25.TYPE = "KEYWORD3";

        SEQ26.text = "'alignment";
        SEQ26.TYPE = "KEYWORD3";

        SEQ27.text = "'base";
        SEQ27.TYPE = "KEYWORD3";

        SEQ28.text = "'bit_order";
        SEQ28.TYPE = "KEYWORD3";

        SEQ29.text = "'body_version";
        SEQ29.TYPE = "KEYWORD3";

        SEQ30.text = "'callable";
        SEQ30.TYPE = "KEYWORD3";

        SEQ31.text = "'caller";
        SEQ31.TYPE = "KEYWORD3";

        SEQ32.text = "'ceiling";
        SEQ32.TYPE = "KEYWORD3";

        SEQ33.text = "'class";
        SEQ33.TYPE = "KEYWORD3";

        SEQ34.text = "'component_size";
        SEQ34.TYPE = "KEYWORD3";

        SEQ35.text = "'compose";
        SEQ35.TYPE = "KEYWORD3";

        SEQ36.text = "'constrained";
        SEQ36.TYPE = "KEYWORD3";

        SEQ37.text = "'copy_size";
        SEQ37.TYPE = "KEYWORD3";

        SEQ38.text = "'count";
        SEQ38.TYPE = "KEYWORD3";

        SEQ39.text = "'definite";
        SEQ39.TYPE = "KEYWORD3";

        SEQ40.text = "'delta";
        SEQ40.TYPE = "KEYWORD3";

        SEQ41.text = "'denorm";
        SEQ41.TYPE = "KEYWORD3";

        SEQ42.text = "'digits";
        SEQ42.TYPE = "KEYWORD3";

        SEQ43.text = "'exponent";
        SEQ43.TYPE = "KEYWORD3";

        SEQ44.text = "'external_tag";
        SEQ44.TYPE = "KEYWORD3";

        SEQ45.text = "'first";
        SEQ45.TYPE = "KEYWORD3";

        SEQ46.text = "'first_bit";
        SEQ46.TYPE = "KEYWORD3";

        SEQ47.text = "'floor";
        SEQ47.TYPE = "KEYWORD3";

        SEQ48.text = "'fore";
        SEQ48.TYPE = "KEYWORD3";

        SEQ49.text = "'fraction";
        SEQ49.TYPE = "KEYWORD3";

        SEQ50.text = "'has_same_storage";
        SEQ50.TYPE = "KEYWORD3";

        SEQ51.text = "'identity";
        SEQ51.TYPE = "KEYWORD3";

        SEQ52.text = "'image";
        SEQ52.TYPE = "KEYWORD3";

        SEQ53.text = "'class'input";
        SEQ53.TYPE = "KEYWORD3";

        SEQ54.text = "'input";
        SEQ54.TYPE = "KEYWORD3";

        SEQ55.text = "'last";
        SEQ55.TYPE = "KEYWORD3";

        SEQ56.text = "'last_bit";
        SEQ56.TYPE = "KEYWORD3";

        SEQ57.text = "'leading_part";
        SEQ57.TYPE = "KEYWORD3";

        SEQ58.text = "'length";
        SEQ58.TYPE = "KEYWORD3";

        SEQ59.text = "'machine";
        SEQ59.TYPE = "KEYWORD3";

        SEQ60.text = "'machine_emax";
        SEQ60.TYPE = "KEYWORD3";

        SEQ61.text = "'machine_emin";
        SEQ61.TYPE = "KEYWORD3";

        SEQ62.text = "'machine_mantissa";
        SEQ62.TYPE = "KEYWORD3";

        SEQ63.text = "'machine_overflows";
        SEQ63.TYPE = "KEYWORD3";

        SEQ64.text = "'machine_radix";
        SEQ64.TYPE = "KEYWORD3";

        SEQ65.text = "'machine_rounding";
        SEQ65.TYPE = "KEYWORD3";

        SEQ66.text = "'machine_rounds";
        SEQ66.TYPE = "KEYWORD3";

        SEQ67.text = "'max";
        SEQ67.TYPE = "KEYWORD3";

        SEQ68.text = "'max_alignment_for_allocation";
        SEQ68.TYPE = "KEYWORD3";

        SEQ69.text = "'max_size_in_storage_elements";
        SEQ69.TYPE = "KEYWORD3";

        SEQ70.text = "'min";
        SEQ70.TYPE = "KEYWORD3";

        SEQ71.text = "'mod";
        SEQ71.TYPE = "KEYWORD3";

        SEQ72.text = "'model";
        SEQ72.TYPE = "KEYWORD3";

        SEQ73.text = "'model_emin";
        SEQ73.TYPE = "KEYWORD3";

        SEQ74.text = "'model_epsilon";
        SEQ74.TYPE = "KEYWORD3";

        SEQ75.text = "'model_mantissa";
        SEQ75.TYPE = "KEYWORD3";

        SEQ76.text = "'model_small";
        SEQ76.TYPE = "KEYWORD3";

        SEQ77.text = "'modulus";
        SEQ77.TYPE = "KEYWORD3";

        SEQ78.text = "'old";
        SEQ78.TYPE = "KEYWORD3";

        SEQ79.text = "'class'output";
        SEQ79.TYPE = "KEYWORD3";

        SEQ80.text = "'output";
        SEQ80.TYPE = "KEYWORD3";

        SEQ81.text = "'overlaps_storage";
        SEQ81.TYPE = "KEYWORD3";

        SEQ82.text = "'partition_id";
        SEQ82.TYPE = "KEYWORD3";

        SEQ83.text = "'pos";
        SEQ83.TYPE = "KEYWORD3";

        SEQ84.text = "'position";
        SEQ84.TYPE = "KEYWORD3";

        SEQ85.text = "'pred";
        SEQ85.TYPE = "KEYWORD3";

        SEQ86.text = "'priority";
        SEQ86.TYPE = "KEYWORD3";

        SEQ87.text = "'range";
        SEQ87.TYPE = "KEYWORD3";

        SEQ88.text = "'class'read";
        SEQ88.TYPE = "KEYWORD3";

        SEQ89.text = "'read";
        SEQ89.TYPE = "KEYWORD3";

        SEQ90.text = "'remainder";
        SEQ90.TYPE = "KEYWORD3";

        SEQ91.text = "'result";
        SEQ91.TYPE = "KEYWORD3";

        SEQ92.text = "'round";
        SEQ92.TYPE = "KEYWORD3";

        SEQ93.text = "'rounding";
        SEQ93.TYPE = "KEYWORD3";

        SEQ94.text = "'safe_first";
        SEQ94.TYPE = "KEYWORD3";

        SEQ95.text = "'safe_last";
        SEQ95.TYPE = "KEYWORD3";

        SEQ96.text = "'scale";
        SEQ96.TYPE = "KEYWORD3";

        SEQ97.text = "'scaling";
        SEQ97.TYPE = "KEYWORD3";

        SEQ98.text = "'signed_zeros";
        SEQ98.TYPE = "KEYWORD3";

        SEQ99.text = "'size";
        SEQ99.TYPE = "KEYWORD3";

        SEQ100.text = "'small";
        SEQ100.TYPE = "KEYWORD3";

        SEQ101.text = "'storage_pool";
        SEQ101.TYPE = "KEYWORD3";

        SEQ102.text = "'storage_size";
        SEQ102.TYPE = "KEYWORD3";

        SEQ103.text = "'stream_size";
        SEQ103.TYPE = "KEYWORD3";

        SEQ104.text = "'succ";
        SEQ104.TYPE = "KEYWORD3";

        SEQ105.text = "'tag";
        SEQ105.TYPE = "KEYWORD3";

        SEQ106.text = "'terminated";
        SEQ106.TYPE = "KEYWORD3";

        SEQ107.text = "'truncation";
        SEQ107.TYPE = "KEYWORD3";

        SEQ108.text = "'unbiased_rounding";
        SEQ108.TYPE = "KEYWORD3";

        SEQ109.text = "'unchecked_access";
        SEQ109.TYPE = "KEYWORD3";

        SEQ110.text = "'val";
        SEQ110.TYPE = "KEYWORD3";

        SEQ111.text = "'valid";
        SEQ111.TYPE = "KEYWORD3";

        SEQ112.text = "'value";
        SEQ112.TYPE = "KEYWORD3";

        SEQ113.text = "'version";
        SEQ113.TYPE = "KEYWORD3";

        SEQ114.text = "'wide_image";
        SEQ114.TYPE = "KEYWORD3";

        SEQ115.text = "'wide_value";
        SEQ115.TYPE = "KEYWORD3";

        SEQ116.text = "'wide_width";
        SEQ116.TYPE = "KEYWORD3";

        SEQ117.text = "'width";
        SEQ117.TYPE = "KEYWORD3";

        SEQ118.text = "'wide_wide_image";
        SEQ118.TYPE = "KEYWORD3";

        SEQ119.text = "'wide_wide_value";
        SEQ119.TYPE = "KEYWORD3";

        SEQ120.text = "'wide_wide_width";
        SEQ120.TYPE = "KEYWORD3";

        SEQ121.text = "'class'write";
        SEQ121.TYPE = "KEYWORD3";

        SEQ122.text = "'write";
        SEQ122.TYPE = "KEYWORD3";

        SEQ123.text = "pragma all_calls_remote";
        SEQ123.TYPE = "KEYWORD3";

        SEQ124.text = "pragma assert";
        SEQ124.TYPE = "KEYWORD3";

        SEQ125.text = "pragma assertion_policy";
        SEQ125.TYPE = "KEYWORD3";

        SEQ126.text = "pragma asynchronous";
        SEQ126.TYPE = "KEYWORD3";

        SEQ127.text = "pragma atomic";
        SEQ127.TYPE = "KEYWORD3";

        SEQ128.text = "pragma atomic_components";
        SEQ128.TYPE = "KEYWORD3";

        SEQ129.text = "pragma attach_handler";
        SEQ129.TYPE = "KEYWORD3";

        SEQ130.text = "pragma controlled";
        SEQ130.TYPE = "KEYWORD3";

        SEQ131.text = "pragma convention";
        SEQ131.TYPE = "KEYWORD3";

        SEQ132.text = "pragma cpu";
        SEQ132.TYPE = "KEYWORD3";

        SEQ133.text = "pragma default_storage_pool";
        SEQ133.TYPE = "KEYWORD3";

        SEQ134.text = "pragma detect_blocking";
        SEQ134.TYPE = "KEYWORD3";

        SEQ135.text = "pragma discard_names";
        SEQ135.TYPE = "KEYWORD3";

        SEQ136.text = "pragma dispatching_domain";
        SEQ136.TYPE = "KEYWORD3";

        SEQ137.text = "pragma elaborate";
        SEQ137.TYPE = "KEYWORD3";

        SEQ138.text = "pragma elaborate_all";
        SEQ138.TYPE = "KEYWORD3";

        SEQ139.text = "pragma elaborate_body";
        SEQ139.TYPE = "KEYWORD3";

        SEQ140.text = "pragma export";
        SEQ140.TYPE = "KEYWORD3";

        SEQ141.text = "pragma import";
        SEQ141.TYPE = "KEYWORD3";

        SEQ142.text = "pragma independent";
        SEQ142.TYPE = "KEYWORD3";

        SEQ143.text = "pragam independent_components";
        SEQ143.TYPE = "KEYWORD3";

        SEQ144.text = "pragma inline";
        SEQ144.TYPE = "KEYWORD3";

        SEQ145.text = "pragma inspection_point";
        SEQ145.TYPE = "KEYWORD3";

        SEQ146.text = "pragma interrupt_handler";
        SEQ146.TYPE = "KEYWORD3";

        SEQ147.text = "pragma interrupt_priority";
        SEQ147.TYPE = "KEYWORD3";

        SEQ148.text = "pragma linker_options";
        SEQ148.TYPE = "KEYWORD3";

        SEQ149.text = "pragma list";
        SEQ149.TYPE = "KEYWORD3";

        SEQ150.text = "pragma locking_policy";
        SEQ150.TYPE = "KEYWORD3";

        SEQ151.text = "pragma no_return";
        SEQ151.TYPE = "KEYWORD3";

        SEQ152.text = "pragma normalize_scalars";
        SEQ152.TYPE = "KEYWORD3";

        SEQ153.text = "pragma optimize";
        SEQ153.TYPE = "KEYWORD3";

        SEQ154.text = "pragma pack";
        SEQ154.TYPE = "KEYWORD3";

        SEQ155.text = "pragma page";
        SEQ155.TYPE = "KEYWORD3";

        SEQ156.text = "pragma partition_elaboration_policy";
        SEQ156.TYPE = "KEYWORD3";

        SEQ157.text = "pragma preelaborate_initialization";
        SEQ157.TYPE = "KEYWORD3";

        SEQ158.text = "pragma preelaborate";
        SEQ158.TYPE = "KEYWORD3";

        SEQ159.text = "pragma priority";
        SEQ159.TYPE = "KEYWORD3";

        SEQ160.text = "pragma priority_specific_dispatching";
        SEQ160.TYPE = "KEYWORD3";

        SEQ161.text = "pragma profile";
        SEQ161.TYPE = "KEYWORD3";

        SEQ162.text = "pragma pure";
        SEQ162.TYPE = "KEYWORD3";

        SEQ163.text = "pragma queuing_policy";
        SEQ163.TYPE = "KEYWORD3";

        SEQ164.text = "pragma relative_deadline";
        SEQ164.TYPE = "KEYWORD3";

        SEQ165.text = "pragma remote_call_interface";
        SEQ165.TYPE = "KEYWORD3";

        SEQ166.text = "pragma remote_types";
        SEQ166.TYPE = "KEYWORD3";

        SEQ167.text = "pragma restrictions";
        SEQ167.TYPE = "KEYWORD3";

        SEQ168.text = "pragma reviewable";
        SEQ168.TYPE = "KEYWORD3";

        SEQ169.text = "pragma shared_passive";
        SEQ169.TYPE = "KEYWORD3";

        SEQ170.text = "pragma storage_size";
        SEQ170.TYPE = "KEYWORD3";

        SEQ171.text = "pragma suppress";
        SEQ171.TYPE = "KEYWORD3";

        SEQ172.text = "pragma task_dispatching_policy";
        SEQ172.TYPE = "KEYWORD3";

        SEQ173.text = "pragma unchecked_union";
        SEQ173.TYPE = "KEYWORD3";

        SEQ174.text = "pragma unsuppress";
        SEQ174.TYPE = "KEYWORD3";

        SEQ175.text = "pragma volatile";
        SEQ175.TYPE = "KEYWORD3";

        SEQ176.text = "pragma volatile_components";
        SEQ176.TYPE = "KEYWORD3";

        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        KEYWORDS1.add("LITERAL1", new String[]{"false", "true", });
        KEYWORDS1.add("KEYWORD1", new String[]{"entry", "function", "procedure", });
        KEYWORDS1.add("KEYWORD2", new String[]{"abort", "abs", "abstract", "accept", "access", "aliased", "all", "and", "array", "at", "begin", "body", "case", "constant", "declare", "delay", "delta", "digits", "do", "else", "elsif", "end", "exception", "exit", "for", "generic", "goto", "if", "in", "interface", "is", "limited", "loop", "mod", "new", "not", "null", "of", "or", "others", "out", "overriding", "package", "private", "protected", "raise", "range", "record", "rem", "renames", "requeue", "return", "reverse", "select", "separate", "some", "subtype", "synchronized", "tagged", "task", "terminate", "then", "type", "until", "use", "when", "while", "with", "xor", });
        KEYWORDS1.add("KEYWORD3", new String[]{"pragma", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, SEQ38, SEQ39, SEQ40, SEQ41, SEQ42, SEQ43, SEQ44, SEQ45, SEQ46, SEQ47, SEQ48, SEQ49, SEQ50, SEQ51, SEQ52, SEQ53, SEQ54, SEQ55, SEQ56, SEQ57, SEQ58, SEQ59, SEQ60, SEQ61, SEQ62, SEQ63, SEQ64, SEQ65, SEQ66, SEQ67, SEQ68, SEQ69, SEQ70, SEQ71, SEQ72, SEQ73, SEQ74, SEQ75, SEQ76, SEQ77, SEQ78, SEQ79, SEQ80, SEQ81, SEQ82, SEQ83, SEQ84, SEQ85, SEQ86, SEQ87, SEQ88, SEQ89, SEQ90, SEQ91, SEQ92, SEQ93, SEQ94, SEQ95, SEQ96, SEQ97, SEQ98, SEQ99, SEQ100, SEQ101, SEQ102, SEQ103, SEQ104, SEQ105, SEQ106, SEQ107, SEQ108, SEQ109, SEQ110, SEQ111, SEQ112, SEQ113, SEQ114, SEQ115, SEQ116, SEQ117, SEQ118, SEQ119, SEQ120, SEQ121, SEQ122, SEQ123, SEQ124, SEQ125, SEQ126, SEQ127, SEQ128, SEQ129, SEQ130, SEQ131, SEQ132, SEQ133, SEQ134, SEQ135, SEQ136, SEQ137, SEQ138, SEQ139, SEQ140, SEQ141, SEQ142, SEQ143, SEQ144, SEQ145, SEQ146, SEQ147, SEQ148, SEQ149, SEQ150, SEQ151, SEQ152, SEQ153, SEQ154, SEQ155, SEQ156, SEQ157, SEQ158, SEQ159, SEQ160, SEQ161, SEQ162, SEQ163, SEQ164, SEQ165, SEQ166, SEQ167, SEQ168, SEQ169, SEQ170, SEQ171, SEQ172, SEQ173, SEQ174, SEQ175, SEQ176, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}