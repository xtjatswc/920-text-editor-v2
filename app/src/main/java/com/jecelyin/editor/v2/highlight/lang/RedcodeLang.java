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
public class RedcodeLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ";";
        PROPERTY1.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DEFAULT = "MARKUP";
        RULES1.IGNORE_CASE = "TRUE";

        EOL_SPAN1.text = ";redcode";
        EOL_SPAN1.TYPE = "COMMENT2";

        EOL_SPAN2.text = ";author";
        EOL_SPAN2.TYPE = "COMMENT2";

        EOL_SPAN3.text = ";name";
        EOL_SPAN3.TYPE = "COMMENT2";

        EOL_SPAN4.text = ";strategy";
        EOL_SPAN4.TYPE = "COMMENT2";

        EOL_SPAN5.text = ";password";
        EOL_SPAN5.TYPE = "COMMENT2";

        EOL_SPAN6.text = ";";
        EOL_SPAN6.TYPE = "COMMENT1";

        SEQ1.text = ".AB";
        SEQ1.TYPE = "KEYWORD3";

        SEQ2.text = ".BA";
        SEQ2.TYPE = "KEYWORD3";

        SEQ3.text = ".A";
        SEQ3.TYPE = "KEYWORD3";

        SEQ4.text = ".B";
        SEQ4.TYPE = "KEYWORD3";

        SEQ5.text = ".F";
        SEQ5.TYPE = "KEYWORD3";

        SEQ6.text = ".X";
        SEQ6.TYPE = "KEYWORD3";

        SEQ7.text = ".I";
        SEQ7.TYPE = "KEYWORD3";

        SEQ8.text = ",";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = ":";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "(";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = ")";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "+";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "-";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "/";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "%";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "==";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "!=";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "<=";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = ">=";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "<";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = ">";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "&&";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "||";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "!";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "=";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = "$";
        SEQ26.TYPE = "LITERAL1";

        SEQ27.text = "@";
        SEQ27.TYPE = "LITERAL1";

        SEQ28.text = "#";
        SEQ28.TYPE = "LITERAL1";

        SEQ29.text = "*";
        SEQ29.TYPE = "LITERAL1";

        SEQ30.text = "{";
        SEQ30.TYPE = "LITERAL1";

        SEQ31.text = "}";
        SEQ31.TYPE = "LITERAL1";


        KEYWORDS1.add("KEYWORD1", new String[]{"DAT", "MOV", "ADD", "SUB", "MUL", "DIV", "MOD", "JMP", "JMZ", "JMN", "DJN", "SPL", "SLT", "CMP", "SEQ", "SNE", "NOP", "LDP", "STP", });
        KEYWORDS1.add("KEYWORD2", new String[]{"EQU", "ORG", "FOR", "ROF", "END", "PIN", "CORESIZE", "MAXPROCESSES", "MAXCYCLES", "MAXLENGTH", "MINDISTANCE", "ROUNDS", "PSPACESIZE", "CURLINE", "VERSION", "WARRIORS", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, EOL_SPAN4, EOL_SPAN5, EOL_SPAN6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, };

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