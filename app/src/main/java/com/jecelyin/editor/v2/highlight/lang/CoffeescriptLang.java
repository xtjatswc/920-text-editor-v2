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
public class CoffeescriptLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "###";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "###";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "#";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = ",+-=<>/?^&*";
        PROPERTY4.NAME = "wordBreakChars";

        PROPERTY5.VALUE = "((\\s*|.*\\s+)([\\-=]>|[\\+\\-\\*/%\\\\<>=\\!&\\|\\^~]|(.*:|<<|>>|>>>|\\+=|\\-=|\\*=|/=|%=|<=|>=|==|===|\\!=|\\!==|is|isnt|not|and|or|&&|\\|\\||of|in|loop))|\\s*(if|else|try|catch|finally|class|while|until|for)(\\s*|\\s+.*))\\s*";
        PROPERTY5.NAME = "indentNextLines";

        PROPERTY6.VALUE = "^\\s*(else|catch|finally)(\\s*|\\s+.*)$";
        PROPERTY6.NAME = "unindentThisLine";

        PROPERTY7.VALUE = "^\\s*(else|catch|finally)(\\s*|\\s+.*)$";
        PROPERTY7.NAME = "unindentNextLines";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0b[01]+)|(0o[0-7]+)|(0x\\p{XDigit}+)|(\\d*\\.?\\d+(e[+-]?\\d+)?)";
        RULES1.IGNORE_CASE = "FALSE";
        RULES1.NO_WORD_SEP = "$_";

        SPAN_REGEXP1.HASH_CHARS = "###";
        SPAN_REGEXP1.TYPE = "COMMENT2";

        BEGIN1.text = "###(?!#)";

        END1.text = "#{3,}";
        END1.REGEXP = "TRUE";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "doubleQuoteLiteral";
        SPAN1.ESCAPE = "\\";

        BEGIN2.text = "\"\"\"";

        END2.text = "\"\"\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL2";
        SPAN2.ESCAPE = "\\";

        BEGIN3.text = "'''";

        END3.text = "'''";


        SPAN2.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "FALSE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "doubleQuoteLiteral";
        SPAN3.ESCAPE = "\\";

        BEGIN4.text = "\"";

        END4.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "FALSE";
        SPAN4.TYPE = "LITERAL2";
        SPAN4.ESCAPE = "\\";

        BEGIN5.text = "'";

        END5.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "LITERAL1";
        SPAN5.DELEGATE = "javascript::MAIN";

        BEGIN6.text = "`";

        END6.text = "`";


        SPAN5.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "MARKUP";
        SPAN6.DELEGATE = "hereRegexp";
        SPAN6.ESCAPE = "\\";

        BEGIN7.text = "///";

        END7.text = "///";


        SPAN6.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.AT_WORD_START = "TRUE";
        SPAN_REGEXP2.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP2.TYPE = "MARKUP";
        SPAN_REGEXP2.ESCAPE = "\\";
        SPAN_REGEXP2.HASH_CHAR = "/";

        BEGIN8.text = "/(?![\\s=*])";

        END8.text = "/[igmy]{0,4}";
        END8.REGEXP = "TRUE";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN8, };

        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ1.text = ")";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "{";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "}";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "[";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "]";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = ".";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "+";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "/";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "*";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "&";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "|";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "\\";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "-";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "%";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "=";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "<";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = ">";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = ":";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "!";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ";";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "^";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "~";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "?";
        SEQ23.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "@([\\p{L}\\p{Nl}\\$_][\\p{L}\\p{Nl}\\p{Nd}\\$_]*)";
        SEQ_REGEXP1.TYPE = "KEYWORD3";

        SEQ_REGEXP2.text = "([\\p{L}\\p{Nl}\\$_][\\p{L}\\p{Nl}\\p{Nd}\\$_]*)(?=\\s*(?:[:\\.]|\\?\\.))";
        SEQ_REGEXP2.TYPE = "KEYWORD4";

        SEQ_REGEXP3.text = "for\\s+own(?![\\p{L}\\p{Nl}\\p{Nd}\\$_])";
        SEQ_REGEXP3.HASH_CHARS = "for ";
        SEQ_REGEXP3.AT_WORD_START = "TRUE";
        SEQ_REGEXP3.TYPE = "KEYWORD1";


        KEYWORDS1.add("KEYWORD1", new String[]{"if", "else", "new", "return", "try", "catch", "finally", "throw", "break", "continue", "for", "in", "while", "loop", "delete", "instanceof", "typeof", "switch", "extends", "class", "constructor", "do", "then", "unless", "until", "of", "by", "when", "and", "or", "not", "is", "isnt", });
        KEYWORDS1.add("KEYWORD3", new String[]{"this", "super", "prototype", "Array", "Boolean", "Date", "Function", "Global", "Math", "Number", "Object", "RegExp", "String", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "doubleQuoteLiteral";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";

        SPAN1.TYPE = "OPERATOR";
        SPAN1.DELEGATE = "MAIN";

        BEGIN1.text = "#{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "hereRegexp";
        RULES1.DEFAULT = "MARKUP";
        RULES1.ESCAPE = "\\";

        SPAN1.TYPE = "OPERATOR";
        SPAN1.DELEGATE = "MAIN";

        BEGIN1.text = "#{";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "#";
        EOL_SPAN1.TYPE = "COMMENT1";


        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}