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
public class KotlinLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();
        PROPERTY PROPERTY1 = new PROPERTY();
        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";
        PROPERTY PROPERTY2 = new PROPERTY();
        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";
        PROPERTY PROPERTY3 = new PROPERTY();
        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";
        PROPERTY PROPERTY4 = new PROPERTY();
        PROPERTY4.VALUE = ",+-=<>/?^&*";
        PROPERTY4.NAME = "wordBreakChars";
        PROPERTY PROPERTY5 = new PROPERTY();
        PROPERTY5.VALUE = "{[";
        PROPERTY5.NAME = "indentOpenBrackets";
        PROPERTY PROPERTY6 = new PROPERTY();
        PROPERTY6.VALUE = "]}";
        PROPERTY6.NAME = "indentCloseBrackets";
        PROPERTY PROPERTY7 = new PROPERTY();
        PROPERTY7.VALUE = "(";
        PROPERTY7.NAME = "unalignedOpenBrackets";
        PROPERTY PROPERTY8 = new PROPERTY();
        PROPERTY8.VALUE = ")";
        PROPERTY8.NAME = "unalignedCloseBrackets";
        PROPERTY PROPERTY9 = new PROPERTY();
        PROPERTY9.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY9.NAME = "indentNextLine";
        PROPERTY PROPERTY10 = new PROPERTY();
        PROPERTY10.VALUE = "^.*(else:\\s*|when.*:.*)$";
        PROPERTY10.NAME = "unindentThisLine";
        PROPS1.PROPERTY = new PROPERTY[] { PROPERTY1, PROPERTY2, PROPERTY3, PROPERTY4, PROPERTY5, PROPERTY6, PROPERTY7, PROPERTY8, PROPERTY9, PROPERTY10, };

        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";
        RULES1.IGNORE_CASE = "FALSE";
        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "COMMENT3";
        BEGIN BEGIN1 = new BEGIN();
        BEGIN1.text = "/**";
        END END1 = new END();
        END1.text = "*/";
        SPAN1.END = new END[] { END1, };

        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";
        BEGIN BEGIN2 = new BEGIN();
        BEGIN2.text = "/*";
        END END2 = new END();
        END2.text = "*/";
        SPAN2.END = new END[] { END2, };

        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "\\";
        BEGIN BEGIN3 = new BEGIN();
        BEGIN3.text = "\"";
        END END3 = new END();
        END3.text = "\"";
        SPAN3.END = new END[] { END3, };

        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "\\";
        BEGIN BEGIN4 = new BEGIN();
        BEGIN4.text = "'";
        END END4 = new END();
        END4.text = "'";
        SPAN4.END = new END[] { END4, };

        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.NO_LINE_BREAK = "FALSE";
        SPAN5.TYPE = "LITERAL1";
        SPAN5.ESCAPE = "\\";
        BEGIN BEGIN5 = new BEGIN();
        BEGIN5.text = "\"\"\"";
        END END5 = new END();
        END5.text = "\"\"\"";
        SPAN5.END = new END[] { END5, };

        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";
        SEQ SEQ1 = new SEQ();
        SEQ1.text = ")";
        SEQ1.TYPE = "OPERATOR";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = "//-->";
        SEQ2.TYPE = "COMMENT2";
        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";
        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "/[^\\p{Blank}]*?/";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.HASH_CHAR = "/";
        SEQ SEQ3 = new SEQ();
        SEQ3.text = "<!--";
        SEQ3.TYPE = "COMMENT1";
        SEQ SEQ4 = new SEQ();
        SEQ4.text = "->";
        SEQ4.TYPE = "OPERATOR";
        SEQ SEQ5 = new SEQ();
        SEQ5.text = "=";
        SEQ5.TYPE = "OPERATOR";
        SEQ SEQ6 = new SEQ();
        SEQ6.text = "!";
        SEQ6.TYPE = "OPERATOR";
        SEQ SEQ7 = new SEQ();
        SEQ7.text = ">=";
        SEQ7.TYPE = "OPERATOR";
        SEQ SEQ8 = new SEQ();
        SEQ8.text = "<=";
        SEQ8.TYPE = "OPERATOR";
        SEQ SEQ9 = new SEQ();
        SEQ9.text = "+";
        SEQ9.TYPE = "OPERATOR";
        SEQ SEQ10 = new SEQ();
        SEQ10.text = "-";
        SEQ10.TYPE = "OPERATOR";
        SEQ SEQ11 = new SEQ();
        SEQ11.text = "/";
        SEQ11.TYPE = "OPERATOR";
        SEQ SEQ12 = new SEQ();
        SEQ12.text = "*";
        SEQ12.TYPE = "OPERATOR";
        SEQ SEQ13 = new SEQ();
        SEQ13.text = ">";
        SEQ13.TYPE = "OPERATOR";
        SEQ SEQ14 = new SEQ();
        SEQ14.text = "<";
        SEQ14.TYPE = "OPERATOR";
        SEQ SEQ15 = new SEQ();
        SEQ15.text = "%";
        SEQ15.TYPE = "OPERATOR";
        SEQ SEQ16 = new SEQ();
        SEQ16.text = "&";
        SEQ16.TYPE = "OPERATOR";
        SEQ SEQ17 = new SEQ();
        SEQ17.text = "|";
        SEQ17.TYPE = "OPERATOR";
        SEQ SEQ18 = new SEQ();
        SEQ18.text = "^";
        SEQ18.TYPE = "OPERATOR";
        SEQ SEQ19 = new SEQ();
        SEQ19.text = "~";
        SEQ19.TYPE = "OPERATOR";
        SEQ SEQ20 = new SEQ();
        SEQ20.text = ".";
        SEQ20.TYPE = "OPERATOR";
        SEQ SEQ21 = new SEQ();
        SEQ21.text = "}";
        SEQ21.TYPE = "OPERATOR";
        SEQ SEQ22 = new SEQ();
        SEQ22.text = "{";
        SEQ22.TYPE = "OPERATOR";
        SEQ SEQ23 = new SEQ();
        SEQ23.text = ",";
        SEQ23.TYPE = "OPERATOR";
        SEQ SEQ24 = new SEQ();
        SEQ24.text = ";";
        SEQ24.TYPE = "OPERATOR";
        SEQ SEQ25 = new SEQ();
        SEQ25.text = "]";
        SEQ25.TYPE = "OPERATOR";
        SEQ SEQ26 = new SEQ();
        SEQ26.text = "::";
        SEQ26.TYPE = "OPERATOR";
        SEQ SEQ27 = new SEQ();
        SEQ27.text = "[";
        SEQ27.TYPE = "OPERATOR";
        SEQ SEQ28 = new SEQ();
        SEQ28.text = "?";
        SEQ28.TYPE = "OPERATOR";
        MARK_PREVIOUS MARK_PREVIOUS2 = new MARK_PREVIOUS();
        MARK_PREVIOUS2.text = ":";
        MARK_PREVIOUS2.AT_WHITESPACE_END = "TRUE";
        MARK_PREVIOUS2.TYPE = "LABEL";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";
        SEQ SEQ29 = new SEQ();
        SEQ29.text = ":";
        SEQ29.TYPE = "OPERATOR";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("LITERAL2", new String[]{"this", "null", "false", "true", });
        KEYWORDS1.add("KEYWORD1", new String[]{"break", "continue", "else", "for", "when", "fun", "if", "return", "vararg", "var", "val", "by", "while", "class", "companion", "trait", "object", "abstract", "override", "catch", "finally", "do", "enum", "constructor", "typealias", "is", "as", "public", "internal", "protected", "private", "inner", "super", "throw", "throws", "transient", "try", "volatile", "in", "out", });
        KEYWORDS1.add("KEYWORD2", new String[]{"open", "attribute", "inline", "data", "get", "set", "package", "import", "it", });
        KEYWORDS1.add("KEYWORD3", new String[]{"Any", "Boolean", "Byte", "Unit", "String", "Int", "Short", "Long", "Double", "Float", "Char", "Array", "init", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, };

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
