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
public class SlateLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "[";
        PROPERTY1.NAME = "unalignedOpenBrackets";

        PROPERTY2.VALUE = "]";
        PROPERTY2.NAME = "unalignedCloseBrackets";

        PROPERTY3.VALUE = "\"";
        PROPERTY3.NAME = "commentStart";

        PROPERTY4.VALUE = "\"";
        PROPERTY4.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "-?\\d+([./]\\d+)?";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "#";
        MARK_FOLLOWING1.TYPE = "LITERAL2";

        SEQ1.text = "@";
        SEQ1.TYPE = "MARKUP";

        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD1";

        BEGIN3.text = "|";

        END3.text = "|";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        MARK_FOLLOWING MARK_FOLLOWING2 = new MARK_FOLLOWING();
        MARK_FOLLOWING2.text = "&";
        MARK_FOLLOWING2.TYPE = "LITERAL4";

        MARK_FOLLOWING3.text = "`";
        MARK_FOLLOWING3.TYPE = "KEYWORD2";

        MARK_FOLLOWING4.text = "$\\";
        MARK_FOLLOWING4.TYPE = "LITERAL3";

        MARK_FOLLOWING5.text = "$";
        MARK_FOLLOWING5.TYPE = "LITERAL3";

        SEQ2.text = "[";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "]";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "{";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "}";
        SEQ5.TYPE = "OPERATOR";


        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, MARK_FOLLOWING3, MARK_FOLLOWING4, MARK_FOLLOWING5, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}