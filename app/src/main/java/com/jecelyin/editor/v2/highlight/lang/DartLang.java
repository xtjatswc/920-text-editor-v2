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
public class DartLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = ",+-=<>/?^&*";
        PROPERTY4.NAME = "wordBreakChars";

        PROPERTY5.VALUE = "{[";
        PROPERTY5.NAME = "indentOpenBrackets";

        PROPERTY6.VALUE = "]}";
        PROPERTY6.NAME = "indentCloseBrackets";

        PROPERTY7.VALUE = "(";
        PROPERTY7.NAME = "unalignedOpenBrackets";

        PROPERTY8.VALUE = ")";
        PROPERTY8.NAME = "unalignedCloseBrackets";

        PROPERTY9.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY9.NAME = "indentNextLine";

        PROPERTY10.VALUE = "^.*(default:\\s*|case.*:.*)$";
        PROPERTY10.NAME = "unindentThisLine";

        PROPERTY11.VALUE = ":";
        PROPERTY11.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DART_LITERAL1";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN_REGEXP1.TYPE = "LITERAL4";
        SPAN_REGEXP1.DELEGATE = "DART_EXPRESSION";
        SPAN_REGEXP1.HASH_CHAR = "$";

        BEGIN1.text = "\\$\\{";

        END1.text = "}";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\$[_a-zA-Z][_a-zA-Z0-9]*";
        SEQ_REGEXP1.TYPE = "LITERAL4";
        SEQ_REGEXP1.HASH_CHAR = "$";


        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DART_EXPRESSION";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";

        SPAN1.TYPE = "COMMENT3";

        BEGIN1.text = "/**";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";

        BEGIN2.text = "/*";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "@\"\"\"";

        END3.text = "\"\"\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL1";

        BEGIN4.text = "@'''";

        END4.text = "'''";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.NO_LINE_BREAK = "TRUE";
        SPAN5.TYPE = "LITERAL1";
        SPAN5.ESCAPE = "\\";

        BEGIN5.text = "@\"";

        END5.text = "\"";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.NO_LINE_BREAK = "TRUE";
        SPAN6.TYPE = "LITERAL1";
        SPAN6.ESCAPE = "\\";

        BEGIN6.text = "@'";

        END6.text = "'";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "LITERAL1";
        SPAN7.DELEGATE = "DART_LITERAL1";

        BEGIN7.text = "\"\"\"";

        END7.text = "\"\"\"";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "LITERAL1";
        SPAN8.DELEGATE = "DART_LITERAL1";

        BEGIN8.text = "'''";

        END8.text = "'''";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.NO_LINE_BREAK = "TRUE";
        SPAN9.TYPE = "LITERAL1";
        SPAN9.DELEGATE = "DART_LITERAL1";
        SPAN9.ESCAPE = "\\";

        BEGIN9.text = "\"";

        END9.text = "\"";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN10 = new SPAN();
        SPAN10.NO_LINE_BREAK = "TRUE";
        SPAN10.TYPE = "LITERAL1";
        SPAN10.DELEGATE = "DART_LITERAL1";
        SPAN10.ESCAPE = "\\";

        BEGIN10.text = "'";

        END10.text = "'";


        SPAN10.BEGIN = new BEGIN[] { BEGIN10, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "!";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ">=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "<=";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "+";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "-";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "/";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "*";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = ">";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "<";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "%";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "&";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "|";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "^";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "<<";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = ">>>";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = ">>";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "~/";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = ".";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ";";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "]";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "[";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "}";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "{";
        SEQ24.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ25.text = ")";
        SEQ25.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"is", "implements", "const", "new", });
        KEYWORDS1.add("KEYWORD3", new String[]{"bool", "int", "double", "num", "void", });
        KEYWORDS1.add("KEYWORD4", new String[]{"AssertionError", "Clock", "Collection", "Comparable", "Date", "Dispatcher", "Duration", "Expect", "FallThroughError", "Function", "HashMap", "HashSet", "Hashable", "Isolate", "Iterable", "Iterator", "LinkedHashMap", "List", "Map", "Match", "Math", "Object", "Pattern", "Promise", "Proxy", "Queue", "ReceivePort", "RegExp", "SendPort", "Set", "StopWatch", "String", "StringBuffer", "Strings", "TimeZone", "TypeError", "BadNumberFormatException", "ClosureArgumentMismatchException", "EmptyQueueException", "Exception", "ExpectException", "IllegalAccessException", "IllegalArgumentException", "IllegalJSRegExpException", "IndexOutOfRangeException", "IntegerDivisionByZeroException", "NoMoreElementsException", "NoSuchMethodException", "NotImplementedException", "NullPointerException", "ObjectNotClosureException", "OutOfMemoryException", "StackOverflowException", "UnsupportedOperationException", "WrongArgumentCountException", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, SPAN10, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "//-->";
        SEQ1.TYPE = "COMMENT2";

        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        EOL_SPAN2.text = "#!";
        EOL_SPAN2.TYPE = "KEYWORD2";

        SEQ2.text = "#library";
        SEQ2.TYPE = "KEYWORD2";

        SEQ3.text = "#import";
        SEQ3.TYPE = "KEYWORD2";

        SEQ4.text = "#source";
        SEQ4.TYPE = "KEYWORD2";

        SEQ5.text = "#resource";
        SEQ5.TYPE = "KEYWORD2";


        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "DART_EXPRESSION";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}