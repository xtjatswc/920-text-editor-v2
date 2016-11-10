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
public class RdLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();
        PROPERTY PROPERTY1 = new PROPERTY();
        PROPERTY1.VALUE = "{";
        PROPERTY1.NAME = "indentOpenBrackets";
        PROPERTY PROPERTY2 = new PROPERTY();
        PROPERTY2.VALUE = "}";
        PROPERTY2.NAME = "indentCloseBrackets";
        PROPS1.PROPERTY = new PROPERTY[] { PROPERTY1, PROPERTY2, };

        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";
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

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";
        SEQ SEQ1 = new SEQ();
        SEQ1.text = "{";
        SEQ1.TYPE = "OPERATOR";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = "}";
        SEQ2.TYPE = "OPERATOR";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("KEYWORD1", new String[]{"\\name", "\\alias", "\\title", "\\description", "\\synopsis", "\\usage", "\\arguments", "\\details", "\\value", "\\references", "\\note", "\\author", "\\seealso", "\\examples", "\\keyword", });
        KEYWORDS1.add("KEYWORD2", new String[]{"\\itemize", "\\method", "\\docType", "\\format", "\\source", "\\itemize", "\\section", "\\enumerate", "\\describe", "\\tabular", "\\link", "\\item", "\\eqn", "\\deqn", "\\concept", });
        KEYWORDS1.add("KEYWORD3", new String[]{"\\emph", "\\strong", "\\bold", "\\sQuote", "\\dQuote", "\\code", "\\preformatted", "\\kbd", "\\samp", "\\pkg", "\\file", "\\email", "\\url", "\\var", "\\env", "\\option", "\\command", "\\dfn", "\\cite", "\\acronym", "\\tab", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

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
