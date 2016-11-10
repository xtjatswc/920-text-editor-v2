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
public class JmkLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();
        PROPERTY PROPERTY1 = new PROPERTY();
        PROPERTY1.VALUE = "#";
        PROPERTY1.NAME = "lineComment";
        PROPERTY PROPERTY2 = new PROPERTY();
        PROPERTY2.VALUE = "{";
        PROPERTY2.NAME = "indentOpenBrackets";
        PROPERTY PROPERTY3 = new PROPERTY();
        PROPERTY3.VALUE = "}";
        PROPERTY3.NAME = "indentCloseBrackets";
        PROPERTY PROPERTY4 = new PROPERTY();
        PROPERTY4.VALUE = "true";
        PROPERTY4.NAME = "contextInsensitive";
        PROPS1.PROPERTY = new PROPERTY[] { PROPERTY1, PROPERTY2, PROPERTY3, PROPERTY4, };

        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";
        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";
        SPAN SPAN1 = new SPAN();
        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.ESCAPE = "\\";
        BEGIN BEGIN1 = new BEGIN();
        BEGIN1.text = "\"";
        END END1 = new END();
        END1.text = "\"";
        SPAN1.END = new END[] { END1, };

        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";
        BEGIN BEGIN2 = new BEGIN();
        BEGIN2.text = "'";
        END END2 = new END();
        END2.text = "'";
        SPAN2.END = new END[] { END2, };

        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "{";
        SEQ1.TYPE = "OPERATOR";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = "}";
        SEQ2.TYPE = "OPERATOR";
        SEQ SEQ3 = new SEQ();
        SEQ3.text = "(";
        SEQ3.TYPE = "OPERATOR";
        SEQ SEQ4 = new SEQ();
        SEQ4.text = ")";
        SEQ4.TYPE = "OPERATOR";
        SEQ SEQ5 = new SEQ();
        SEQ5.text = "-";
        SEQ5.TYPE = "OPERATOR";
        SEQ SEQ6 = new SEQ();
        SEQ6.text = "=";
        SEQ6.TYPE = "OPERATOR";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("KEYWORD1", new String[]{"cat", "copy", "create", "delall", "delete", "dirs", "equal", "else", "end", "exec", "first", "forname", "function", "getprop", "glob", "if", "join", "load", "mkdir", "mkdirs", "note", "patsubst", "rename", "rest", "subst", "then", });
        KEYWORDS1.add("KEYWORD2", new String[]{"@", "?", "<", "%", });
        KEYWORDS1.add("KEYWORD3", new String[]{"include", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, };

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
