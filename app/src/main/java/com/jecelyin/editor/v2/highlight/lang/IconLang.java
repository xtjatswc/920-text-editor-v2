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
public class IconLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "#";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = "{";
        PROPERTY2.NAME = "indentOpenBrackets";

        PROPERTY3.VALUE = "}";
        PROPERTY3.NAME = "indentCloseBrackets";

        PROPERTY4.VALUE = "|.\\\\:,+-*/=?^!@%<>&";
        PROPERTY4.NAME = "wordBreakChars";

        PROPERTY5.VALUE = "true";
        PROPERTY5.NAME = "contextInsensitive";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "~===";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "===";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "|||";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ">>=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = ">>";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "<<=";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "<<";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "~==";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "==";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "||";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "++";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "**";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "--";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "<->";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "<-";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "op:=";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "<=";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "<";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = ">=";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ">";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "~=";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = ":=:";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = ":=";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "-:";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "+:";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = "~";
        SEQ26.TYPE = "OPERATOR";

        SEQ27.text = ":";
        SEQ27.TYPE = "OPERATOR";

        SEQ28.text = "!";
        SEQ28.TYPE = "OPERATOR";

        SEQ29.text = "|";
        SEQ29.TYPE = "OPERATOR";

        SEQ30.text = "&";
        SEQ30.TYPE = "OPERATOR";

        SEQ31.text = "not";
        SEQ31.TYPE = "OPERATOR";

        SEQ32.text = "*";
        SEQ32.TYPE = "OPERATOR";

        SEQ33.text = "?";
        SEQ33.TYPE = "OPERATOR";

        SEQ34.text = "@";
        SEQ34.TYPE = "OPERATOR";

        SEQ35.text = "^";
        SEQ35.TYPE = "OPERATOR";

        SEQ36.text = "%";
        SEQ36.TYPE = "OPERATOR";

        SEQ37.text = "-";
        SEQ37.TYPE = "OPERATOR";

        SEQ38.text = "+";
        SEQ38.TYPE = "OPERATOR";

        SEQ39.text = "=";
        SEQ39.TYPE = "OPERATOR";

        SEQ40.text = "/";
        SEQ40.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ41.text = ")";
        SEQ41.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"break", "end", "fail", "global", "invocable", "link", "local", "procedure", "record", "return", "static", "suspend", });
        KEYWORDS1.add("KEYWORD3", new String[]{"&allocated", "&ascii", "&clock", "&collections", "&cset", "&current", "&date", "&dateline", "&digits", "&dump", "&e", "&error", "&errornumber", "&errortext", "&errorvalue", "&errout", "&fail", "&features", "&file", "&host", "&input", "&lcase", "&letters", "&level", "&line", "&main", "&null", "&output", "&phi", "&pi", "&pos", "&progname", "&random", "&regions", "&source", "&storage", "&subject", "&time", "&trace", "&ucase", "&version", "$define", "$else", "$endif", "$error", "$ifdef", "$ifndef", "$include", "$line", "$undef", "_MACINTOSH", "_MS_WINDOWS_NT", "_MS_WINDOWS", "_MSDOS_386", "_MSDOS", "_OS2", "_PIPES", "_PRESENTATION_MGR", "_SYSTEM_FUNCTION", "_UNIX", "_VMS", "_WINDOW_FUNCTIONS", "_X_WINDOW_SYSTEM", });
        KEYWORDS1.add("KEYWORD4", new String[]{"co-expression", "cset", "file", "integer", "list", "null", "real", "set", "string", "table", "window", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, SEQ38, SEQ39, SEQ40, SEQ41, };

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