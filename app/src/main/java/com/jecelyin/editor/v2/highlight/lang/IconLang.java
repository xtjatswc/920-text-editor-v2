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
        PROPERTY4.VALUE = "|.\\\\:,+-*/=?^!@%<>&";
        PROPERTY4.NAME = "wordBreakChars";
        PROPERTY PROPERTY5 = new PROPERTY();
        PROPERTY5.VALUE = "true";
        PROPERTY5.NAME = "contextInsensitive";
        PROPS1.PROPERTY = new PROPERTY[] { PROPERTY1, PROPERTY2, PROPERTY3, PROPERTY4, PROPERTY5, };

        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";
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
        SPAN2.TYPE = "LITERAL2";
        SPAN2.ESCAPE = "\\";
        BEGIN BEGIN2 = new BEGIN();
        BEGIN2.text = "'";
        END END2 = new END();
        END2.text = "'";
        SPAN2.END = new END[] { END2, };

        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "~===";
        SEQ1.TYPE = "OPERATOR";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = "===";
        SEQ2.TYPE = "OPERATOR";
        SEQ SEQ3 = new SEQ();
        SEQ3.text = "|||";
        SEQ3.TYPE = "OPERATOR";
        SEQ SEQ4 = new SEQ();
        SEQ4.text = ">>=";
        SEQ4.TYPE = "OPERATOR";
        SEQ SEQ5 = new SEQ();
        SEQ5.text = ">>";
        SEQ5.TYPE = "OPERATOR";
        SEQ SEQ6 = new SEQ();
        SEQ6.text = "<<=";
        SEQ6.TYPE = "OPERATOR";
        SEQ SEQ7 = new SEQ();
        SEQ7.text = "<<";
        SEQ7.TYPE = "OPERATOR";
        SEQ SEQ8 = new SEQ();
        SEQ8.text = "~==";
        SEQ8.TYPE = "OPERATOR";
        SEQ SEQ9 = new SEQ();
        SEQ9.text = "==";
        SEQ9.TYPE = "OPERATOR";
        SEQ SEQ10 = new SEQ();
        SEQ10.text = "||";
        SEQ10.TYPE = "OPERATOR";
        SEQ SEQ11 = new SEQ();
        SEQ11.text = "++";
        SEQ11.TYPE = "OPERATOR";
        SEQ SEQ12 = new SEQ();
        SEQ12.text = "**";
        SEQ12.TYPE = "OPERATOR";
        SEQ SEQ13 = new SEQ();
        SEQ13.text = "--";
        SEQ13.TYPE = "OPERATOR";
        SEQ SEQ14 = new SEQ();
        SEQ14.text = "<->";
        SEQ14.TYPE = "OPERATOR";
        SEQ SEQ15 = new SEQ();
        SEQ15.text = "<-";
        SEQ15.TYPE = "OPERATOR";
        SEQ SEQ16 = new SEQ();
        SEQ16.text = "op:=";
        SEQ16.TYPE = "OPERATOR";
        SEQ SEQ17 = new SEQ();
        SEQ17.text = "<=";
        SEQ17.TYPE = "OPERATOR";
        SEQ SEQ18 = new SEQ();
        SEQ18.text = "<";
        SEQ18.TYPE = "OPERATOR";
        SEQ SEQ19 = new SEQ();
        SEQ19.text = ">=";
        SEQ19.TYPE = "OPERATOR";
        SEQ SEQ20 = new SEQ();
        SEQ20.text = ">";
        SEQ20.TYPE = "OPERATOR";
        SEQ SEQ21 = new SEQ();
        SEQ21.text = "~=";
        SEQ21.TYPE = "OPERATOR";
        SEQ SEQ22 = new SEQ();
        SEQ22.text = ":=:";
        SEQ22.TYPE = "OPERATOR";
        SEQ SEQ23 = new SEQ();
        SEQ23.text = ":=";
        SEQ23.TYPE = "OPERATOR";
        SEQ SEQ24 = new SEQ();
        SEQ24.text = "-:";
        SEQ24.TYPE = "OPERATOR";
        SEQ SEQ25 = new SEQ();
        SEQ25.text = "+:";
        SEQ25.TYPE = "OPERATOR";
        SEQ SEQ26 = new SEQ();
        SEQ26.text = "~";
        SEQ26.TYPE = "OPERATOR";
        SEQ SEQ27 = new SEQ();
        SEQ27.text = ":";
        SEQ27.TYPE = "OPERATOR";
        SEQ SEQ28 = new SEQ();
        SEQ28.text = "!";
        SEQ28.TYPE = "OPERATOR";
        SEQ SEQ29 = new SEQ();
        SEQ29.text = "|";
        SEQ29.TYPE = "OPERATOR";
        SEQ SEQ30 = new SEQ();
        SEQ30.text = "&";
        SEQ30.TYPE = "OPERATOR";
        SEQ SEQ31 = new SEQ();
        SEQ31.text = "not";
        SEQ31.TYPE = "OPERATOR";
        SEQ SEQ32 = new SEQ();
        SEQ32.text = "*";
        SEQ32.TYPE = "OPERATOR";
        SEQ SEQ33 = new SEQ();
        SEQ33.text = "?";
        SEQ33.TYPE = "OPERATOR";
        SEQ SEQ34 = new SEQ();
        SEQ34.text = "@";
        SEQ34.TYPE = "OPERATOR";
        SEQ SEQ35 = new SEQ();
        SEQ35.text = "^";
        SEQ35.TYPE = "OPERATOR";
        SEQ SEQ36 = new SEQ();
        SEQ36.text = "%";
        SEQ36.TYPE = "OPERATOR";
        SEQ SEQ37 = new SEQ();
        SEQ37.text = "-";
        SEQ37.TYPE = "OPERATOR";
        SEQ SEQ38 = new SEQ();
        SEQ38.text = "+";
        SEQ38.TYPE = "OPERATOR";
        SEQ SEQ39 = new SEQ();
        SEQ39.text = "=";
        SEQ39.TYPE = "OPERATOR";
        SEQ SEQ40 = new SEQ();
        SEQ40.text = "/";
        SEQ40.TYPE = "OPERATOR";
        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";
        SEQ SEQ41 = new SEQ();
        SEQ41.text = ")";
        SEQ41.TYPE = "OPERATOR";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("KEYWORD1", new String[]{"by", "case", "create", "default", "do", "else", "every", "if", "initial", "next", "of", "repeat", "then", "to", "until", "while", });
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
