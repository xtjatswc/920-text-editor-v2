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
public class TexLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "%";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "{}";
        PROPERTY2.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "MARKUP";
        SPAN1.DELEGATE = "MATH";

        BEGIN1.text = "$$";

        END1.text = "$$";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";
        SPAN2.DELEGATE = "MATH";

        BEGIN2.text = "$";

        END2.text = "$";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "MARKUP";
        SPAN3.DELEGATE = "MATH";

        BEGIN3.text = "\\[";

        END3.text = "\\]";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "\\$";
        SEQ1.TYPE = "KEYWORD1";

        SEQ2.text = "\\\\";
        SEQ2.TYPE = "KEYWORD1";

        SEQ3.text = "\\%";
        SEQ3.TYPE = "KEYWORD1";

        SPAN4.TYPE = "COMMENT1";

        BEGIN4.text = "\\iffalse";

        END4.text = "\\fi";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "KEYWORD1";
        SPAN5.DELEGATE = "VERBATIM";

        BEGIN5.text = "\\begin{verbatim}";

        END5.text = "\\end{verbatim}";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.NO_LINE_BREAK = "TRUE";
        SPAN6.TYPE = "KEYWORD1";
        SPAN6.DELEGATE = "VERBATIM";

        BEGIN6.text = "\\verb|";

        END6.text = "|";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "\\";
        MARK_FOLLOWING1.TYPE = "KEYWORD1";

        EOL_SPAN1.text = "%";
        EOL_SPAN1.TYPE = "COMMENT1";

        SEQ4.text = "{";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "}";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "[";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "]";
        SEQ7.TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "MATH";
        RULES1.DEFAULT = "MARKUP";

        SEQ1.text = "\\$";
        SEQ1.TYPE = "KEYWORD3";

        SEQ2.text = "\\\\";
        SEQ2.TYPE = "KEYWORD3";

        SEQ3.text = "\\%";
        SEQ3.TYPE = "KEYWORD3";

        MARK_FOLLOWING1.text = "\\";
        MARK_FOLLOWING1.TYPE = "KEYWORD3";

        SEQ4.text = ")";
        SEQ4.TYPE = "KEYWORD2";

        SEQ5.text = "(";
        SEQ5.TYPE = "KEYWORD2";

        SEQ6.text = "{";
        SEQ6.TYPE = "KEYWORD2";

        SEQ7.text = "}";
        SEQ7.TYPE = "KEYWORD2";

        SEQ8.text = "[";
        SEQ8.TYPE = "KEYWORD2";

        SEQ9.text = "]";
        SEQ9.TYPE = "KEYWORD2";

        SEQ10.text = "=";
        SEQ10.TYPE = "KEYWORD2";

        SEQ11.text = "!";
        SEQ11.TYPE = "KEYWORD2";

        SEQ12.text = "+";
        SEQ12.TYPE = "KEYWORD2";

        SEQ13.text = "-";
        SEQ13.TYPE = "KEYWORD2";

        SEQ14.text = "/";
        SEQ14.TYPE = "KEYWORD2";

        SEQ15.text = "*";
        SEQ15.TYPE = "KEYWORD2";

        SEQ16.text = ">";
        SEQ16.TYPE = "KEYWORD2";

        SEQ17.text = "<";
        SEQ17.TYPE = "KEYWORD2";

        SEQ18.text = "&";
        SEQ18.TYPE = "KEYWORD2";

        SEQ19.text = "|";
        SEQ19.TYPE = "KEYWORD2";

        SEQ20.text = "^";
        SEQ20.TYPE = "KEYWORD2";

        SEQ21.text = "~";
        SEQ21.TYPE = "KEYWORD2";

        SEQ22.text = ".";
        SEQ22.TYPE = "KEYWORD2";

        SEQ23.text = ",";
        SEQ23.TYPE = "KEYWORD2";

        SEQ24.text = ";";
        SEQ24.TYPE = "KEYWORD2";

        SEQ25.text = "?";
        SEQ25.TYPE = "KEYWORD2";

        SEQ26.text = ":";
        SEQ26.TYPE = "KEYWORD2";

        SEQ27.text = "'";
        SEQ27.TYPE = "KEYWORD2";

        SEQ28.text = "\"";
        SEQ28.TYPE = "KEYWORD2";

        SEQ29.text = "`";
        SEQ29.TYPE = "KEYWORD2";

        EOL_SPAN1.text = "%";
        EOL_SPAN1.TYPE = "COMMENT1";


        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "VERBATIM";
        RULES1.DEFAULT = "NULL";

    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}