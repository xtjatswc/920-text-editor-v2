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
public class PostscriptLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "%";
        PROPERTY1.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "%!";
        EOL_SPAN1.TYPE = "COMMENT2";

        EOL_SPAN2.text = "%?";
        EOL_SPAN2.TYPE = "COMMENT2";

        EOL_SPAN3.text = "%%";
        EOL_SPAN3.TYPE = "COMMENT2";

        EOL_SPAN4.text = "%";
        EOL_SPAN4.TYPE = "COMMENT1";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "LITERAL";

        BEGIN1.text = "(";

        END1.text = ")";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "<";

        END2.text = ">";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        MARK_FOLLOWING MARK_FOLLOWING1 = new MARK_FOLLOWING();
        MARK_FOLLOWING1.text = "/";
        MARK_FOLLOWING1.TYPE = "LABEL";

        SEQ1.text = "}";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "{";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "]";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "[";
        SEQ4.TYPE = "OPERATOR";


        KEYWORDS1.add("LITERAL2", new String[]{"true", "false", "NULL", });
        KEYWORDS1.add("KEYWORD1", new String[]{"pop", "exch", "dup", "copy", "roll", "clear", "count", "mark", "cleartomark", "counttomark", "exec", "if", "ifelse", "for", "repeat", "loop", "exit", "stop", "stopped", "countexecstack", "execstack", "quit", "start", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, EOL_SPAN4, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LITERAL";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "LITERAL";

        BEGIN1.text = "(";

        END1.text = ")";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}