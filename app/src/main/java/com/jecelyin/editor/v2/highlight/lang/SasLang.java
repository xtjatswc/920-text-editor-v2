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
public class SasLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "(.*%?do.*;|\\s*proc .*;|\\s*data .*;|\\s*%macro\\s?.*;|define event \\S+\\s*;)";
        PROPERTY1.NAME = "indentNextLines";

        PROPERTY2.VALUE = "^\\s*(else.*|end\\s*|elsif.*|rescue.*|when.*)$";
        PROPERTY2.NAME = "unindentThisLine";

        PROPERTY3.VALUE = "^\\s*(end\\s*|else.*|rescue.*|elsif.*|when.*)$";
        PROPERTY3.NAME = "unindentNextLines";

        PROPERTY4.VALUE = "/*";
        PROPERTY4.NAME = "commentStart";

        PROPERTY5.VALUE = "*/";
        PROPERTY5.NAME = "commentEnd";

        PROPERTY6.VALUE = "*";
        PROPERTY6.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";
        RULES1.NO_WORD_SEP = "_";

        SPAN_REGEXP1.AT_WHITESPACE_END = "TRUE";
        SPAN_REGEXP1.TYPE = "COMMENT2";
        SPAN_REGEXP1.HASH_CHAR = "*";

        BEGIN1.text = "[*][^;]*[;][\\s]*[*]";

        END1.text = ";";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.AT_WHITESPACE_END = "TRUE";
        SPAN_REGEXP2.TYPE = "COMMENT2";
        SPAN_REGEXP2.HASH_CHAR = "/*";

        BEGIN2.text = "([/][*][*][/][\\s]*[*])|([/][*](.)*[*][/][\\s]*[*])";

        END2.text = ";";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN_REGEXP SPAN_REGEXP3 = new SPAN_REGEXP();
        SPAN_REGEXP3.AT_WHITESPACE_END = "TRUE";
        SPAN_REGEXP3.TYPE = "COMMENT2";
        SPAN_REGEXP3.HASH_CHAR = "*";

        BEGIN3.text = "[*]";

        END3.text = ";";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN_REGEXP SPAN_REGEXP4 = new SPAN_REGEXP();
        SPAN_REGEXP4.TYPE = "COMMENT2";
        SPAN_REGEXP4.HASH_CHAR = ";";

        BEGIN4.text = "[;][\\s]*[*][^;]*[;][\\s]*[*]";

        END4.text = ";";


        SPAN_REGEXP4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN_REGEXP SPAN_REGEXP5 = new SPAN_REGEXP();
        SPAN_REGEXP5.TYPE = "COMMENT2";
        SPAN_REGEXP5.HASH_CHAR = ";";

        BEGIN5.text = "[;][\\s]*[/][*](.)*[*][/][\\s]*[*]";

        END5.text = ";";


        SPAN_REGEXP5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN_REGEXP SPAN_REGEXP6 = new SPAN_REGEXP();
        SPAN_REGEXP6.TYPE = "COMMENT2";
        SPAN_REGEXP6.HASH_CHAR = ";";

        BEGIN6.text = "[;][\\s]*[*]";

        END6.text = ";";


        SPAN_REGEXP6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "COMMENT2";

        BEGIN7.text = "%*";

        END7.text = ";";


        SPAN1.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN8.text = "/*";

        END8.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "FALSE";
        SPAN3.TYPE = "LITERAL1";

        BEGIN9.text = "'";

        END9.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "FALSE";
        SPAN4.TYPE = "LITERAL2";

        BEGIN10.text = "\"";

        END10.text = "\"";


        SPAN4.BEGIN = new BEGIN[] { BEGIN10, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "PROC ANOVA";
        SEQ1.AT_WORD_START = "TRUE";
        SEQ1.TYPE = "KEYWORD1";

        SEQ2.text = "PROC APPEND";
        SEQ2.AT_WORD_START = "TRUE";
        SEQ2.TYPE = "KEYWORD1";

        SEQ3.text = "PROC BOXPLOT";
        SEQ3.AT_WORD_START = "TRUE";
        SEQ3.TYPE = "KEYWORD1";

        SEQ4.text = "PROC CONTENTS";
        SEQ4.AT_WORD_START = "TRUE";
        SEQ4.TYPE = "KEYWORD1";

        SEQ5.text = "PROC DATASETS";
        SEQ5.AT_WORD_START = "TRUE";
        SEQ5.TYPE = "KEYWORD1";

        SEQ6.text = "PROC DELETE";
        SEQ6.AT_WORD_START = "TRUE";
        SEQ6.TYPE = "KEYWORD1";

        SEQ7.text = "PROC FORMAT";
        SEQ7.AT_WORD_START = "TRUE";
        SEQ7.TYPE = "KEYWORD1";

        SEQ8.text = "PROC FREQ";
        SEQ8.AT_WORD_START = "TRUE";
        SEQ8.TYPE = "KEYWORD1";

        SEQ9.text = "PROC IMPORT";
        SEQ9.AT_WORD_START = "TRUE";
        SEQ9.TYPE = "KEYWORD1";

        SEQ10.text = "PROC MEANS";
        SEQ10.AT_WORD_START = "TRUE";
        SEQ10.TYPE = "KEYWORD1";

        SEQ11.text = "PROC PRINTTO";
        SEQ11.AT_WORD_START = "TRUE";
        SEQ11.TYPE = "KEYWORD1";

        SEQ12.text = "PROC PRINT";
        SEQ12.AT_WORD_START = "TRUE";
        SEQ12.TYPE = "KEYWORD1";

        SEQ13.text = "PROC REPORT";
        SEQ13.AT_WORD_START = "TRUE";
        SEQ13.TYPE = "KEYWORD1";

        SEQ14.text = "PROC SORT";
        SEQ14.AT_WORD_START = "TRUE";
        SEQ14.TYPE = "KEYWORD1";

        SEQ15.text = "PROC SQL";
        SEQ15.AT_WORD_START = "TRUE";
        SEQ15.TYPE = "KEYWORD1";

        SEQ16.text = "PROC UNIVARIATE";
        SEQ16.AT_WORD_START = "TRUE";
        SEQ16.TYPE = "KEYWORD1";

        SEQ17.text = "DATA";
        SEQ17.AT_WHITESPACE_END = "TRUE";
        SEQ17.TYPE = "KEYWORD1";

        SEQ18.text = "%INCLUDE";
        SEQ18.AT_WORD_START = "TRUE";
        SEQ18.TYPE = "FUNCTION";

        SEQ19.text = "PROC";
        SEQ19.AT_WORD_START = "TRUE";
        SEQ19.TYPE = "KEYWORD1";

        SEQ20.text = "RUN;";
        SEQ20.AT_WORD_START = "TRUE";
        SEQ20.TYPE = "KEYWORD1";

        SEQ21.text = "QUIT;";
        SEQ21.AT_WORD_START = "TRUE";
        SEQ21.TYPE = "KEYWORD1";

        SEQ22.text = "%macro";
        SEQ22.AT_WORD_START = "TRUE";
        SEQ22.TYPE = "KEYWORD1";

        SEQ23.text = "%mend";
        SEQ23.AT_WORD_START = "TRUE";
        SEQ23.TYPE = "KEYWORD1";

        SEQ_REGEXP1.text = "%\\S+\\s*\\(";
        SEQ_REGEXP1.AT_WHITESPACE_END = "TRUE";
        SEQ_REGEXP1.TYPE = "KEYWORD3";
        SEQ_REGEXP1.HASH_CHAR = "%";

        SEQ_REGEXP2.text = "(&*\\w+)+(\\.+|,|;|\\s|$|\\}|\\))";
        SEQ_REGEXP2.TYPE = "MARKUP";
        SEQ_REGEXP2.HASH_CHAR = "&";

        SEQ_REGEXP3.text = "(DATA)[\\s]*[=]";
        SEQ_REGEXP3.TYPE = "KEYWORD2";
        SEQ_REGEXP3.HASH_CHAR = "DATA";

        SEQ24.text = "=";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "<";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = ">";
        SEQ26.TYPE = "OPERATOR";

        SEQ27.text = "|";
        SEQ27.TYPE = "OPERATOR";

        SEQ28.text = "~";
        SEQ28.TYPE = "OPERATOR";

        SEQ29.text = "^";
        SEQ29.TYPE = "OPERATOR";

        SEQ30.text = "@";
        SEQ30.TYPE = "OPERATOR";

        SEQ31.text = "?";
        SEQ31.TYPE = "OPERATOR";

        SEQ32.text = "/";
        SEQ32.TYPE = "OPERATOR";

        SEQ33.text = ".";
        SEQ33.TYPE = "OPERATOR";

        SEQ34.text = "-";
        SEQ34.TYPE = "OPERATOR";

        SEQ35.text = "+";
        SEQ35.TYPE = "OPERATOR";

        SEQ36.text = "*";
        SEQ36.TYPE = "OPERATOR";

        SEQ37.text = "!";
        SEQ37.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD3", new String[]{"%ABORT", "%BQUOTE", "%DO", "%ELSE", "%END", "%EVAL", "%Global", "%GOTO", "%IF", "%INC", "%INCLUDE", "%INDEX", "%INPUT", "%LENGTH", "%LET", "%LOCAL", "%LOWCASE", "%MACRO", "%MEND", "%NRBQUOTE", "%NRQUOTE", "%NRSTR", "%PUT", "%QSCAN", "%QSUBSTR", "%Quote", "%RUN", "%SCAN", "%STR", "%SUBSTR", "%SYMDEL", "%SYSEXEC", "%SYSFUNC", "%THEN", "%TO", "%UNTIL", "%WHILE", "%WINDOW", "%UPCASE", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, SPAN_REGEXP4, SPAN_REGEXP5, SPAN_REGEXP6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, };

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