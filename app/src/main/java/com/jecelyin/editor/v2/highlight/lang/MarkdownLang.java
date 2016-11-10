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
public class MarkdownLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "4";
        PROPERTY1.NAME = "tabSize";

        PROPERTY2.VALUE = "4";
        PROPERTY2.NAME = "indentSize";

        PROPERTY3.VALUE = "120";
        PROPERTY3.NAME = "maxLineLen";

        PROPERTY4.VALUE = "<!--";
        PROPERTY4.NAME = "commentStart";

        PROPERTY5.VALUE = "-->";
        PROPERTY5.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";
        SPAN2.AT_LINE_START = "TRUE";
        SPAN2.DELEGATE = "html::JAVASCRIPT";

        BEGIN2.text = "<script";

        END2.text = "</script>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "<hr\\b([^<>])*?/?>";
        SEQ_REGEXP1.TYPE = "MARKUP";
        SEQ_REGEXP1.AT_LINE_START = "TRUE";

        SPAN_REGEXP1.TYPE = "MARKUP";
        SPAN_REGEXP1.AT_LINE_START = "TRUE";
        SPAN_REGEXP1.DELEGATE = "BLOCK_HTML_TAGS";
        SPAN_REGEXP1.HASH_CHAR = "<";

        BEGIN3.text = "<(p|div|h[1-6]|blockquote|pre|table|dl|ol|ul|noscript|form|fieldset|iframe|math|ins|del)\\b";

        END3.text = "</$1>";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "<";
        SEQ1.TYPE = "NULL";

        SPAN3.TYPE = "MARKUP";
        SPAN3.DELEGATE = "INLINE_MARKUP";

        BEGIN4.text = "<";

        END4.text = ">";


        SPAN3.BEGIN = new BEGIN[] { BEGIN4, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "MARKDOWN";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "INLINE_MARKUP";
        RULES1.DEFAULT = "MARKUP";

        IMPORT1.DELEGATE = "html::TAGS";


        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "BLOCK_HTML_TAGS";
        RULES1.DEFAULT = "MARKUP";

        EOL_SPAN_REGEXP1.text = "[\\S]+";
        EOL_SPAN_REGEXP1.TYPE = "INVALID";
        EOL_SPAN_REGEXP1.AT_LINE_START = "TRUE";

        EOL_SPAN_REGEXP2.text = "{1,3}[\\S]+";
        EOL_SPAN_REGEXP2.TYPE = "INVALID";
        EOL_SPAN_REGEXP2.AT_LINE_START = "TRUE";

        EOL_SPAN_REGEXP3.text = "( {4}|\\t)";
        EOL_SPAN_REGEXP3.AT_LINE_START = "TRUE";
        EOL_SPAN_REGEXP3.DELEGATE = "html::MAIN";

        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "MARKDOWN";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN_REGEXP1.text = "[ \\t]*(>[ \\t]{1})+";
        EOL_SPAN_REGEXP1.HASH_CHARS = " >";
        EOL_SPAN_REGEXP1.AT_LINE_START = "TRUE";
        EOL_SPAN_REGEXP1.DELEGATE = "MARKDOWN_BLOCKQUOTE";
        EOL_SPAN_REGEXP1.MATCH_TYPE = "LITERAL3";

        SEQ1.text = "*";
        SEQ1.TYPE = "NULL";

        SEQ2.text = "_";
        SEQ2.TYPE = "NULL";

        SEQ3.text = "\\][";
        SEQ3.TYPE = "NULL";

        SEQ_REGEXP1.text = "\\\\[\\Q*_\\`[](){}#+.!-\\E]";
        SEQ_REGEXP1.TYPE = "NULL";
        SEQ_REGEXP1.HASH_CHAR = "\\";

        SPAN1.TYPE = "LITERAL2";
        SPAN1.AT_LINE_START = "TRUE";
        SPAN1.DELEGATE = "ruby::MAIN";

        BEGIN1.text = "``` ruby";

        END1.text = "```";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL2";
        SPAN2.AT_LINE_START = "TRUE";

        BEGIN2.text = "```";

        END2.text = "```";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.HASH_CHARS = "`";
        SPAN_REGEXP1.TYPE = "LITERAL2";

        BEGIN3.text = "(`{1,2})";

        END3.text = "$1";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN3, };

        EOL_SPAN_REGEXP EOL_SPAN_REGEXP2 = new EOL_SPAN_REGEXP();
        EOL_SPAN_REGEXP2.text = "( {4,}|\\t+)\\S";
        EOL_SPAN_REGEXP2.HASH_CHARS = " 	";
        EOL_SPAN_REGEXP2.TYPE = "LITERAL2";
        EOL_SPAN_REGEXP2.AT_LINE_START = "TRUE";

        EOL_SPAN_REGEXP3.text = "[=-]+";
        EOL_SPAN_REGEXP3.HASH_CHARS = "=-";
        EOL_SPAN_REGEXP3.TYPE = "KEYWORD1";
        EOL_SPAN_REGEXP3.AT_LINE_START = "TRUE";

        EOL_SPAN_REGEXP4.text = "#{1,6}[ \\t]*(.+?)";
        EOL_SPAN_REGEXP4.TYPE = "KEYWORD1";
        EOL_SPAN_REGEXP4.AT_LINE_START = "TRUE";
        EOL_SPAN_REGEXP4.HASH_CHAR = "#";

        EOL_SPAN_REGEXP5.text = "[ ]{0,2}([ ]?[-_*][ ]?){3,}[ \\t]*";
        EOL_SPAN_REGEXP5.HASH_CHARS = "-*_ 	";
        EOL_SPAN_REGEXP5.TYPE = "KEYWORD1";
        EOL_SPAN_REGEXP5.AT_LINE_START = "TRUE";

        SEQ_REGEXP2.text = "[ \\t]{0,}[*+-][ \\t]+";
        SEQ_REGEXP2.HASH_CHARS = "+-* 	";
        SEQ_REGEXP2.TYPE = "KEYWORD2";
        SEQ_REGEXP2.AT_LINE_START = "TRUE";

        SEQ_REGEXP3.text = "[ \\t]{0,}\\d+\\.[ \\t]+";
        SEQ_REGEXP3.HASH_CHARS = "0123456789 	";
        SEQ_REGEXP3.TYPE = "KEYWORD2";
        SEQ_REGEXP3.AT_LINE_START = "TRUE";

        EOL_SPAN_REGEXP6.text = "\\[(.*?)\\]\\:";
        EOL_SPAN_REGEXP6.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN_REGEXP6.TYPE = "LABEL";
        EOL_SPAN_REGEXP6.DELEGATE = "LINK_LABEL_DEFINITION";

        SPAN_REGEXP2.HASH_CHARS = " ![";
        SPAN_REGEXP2.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP2.TYPE = "KEYWORD4";
        SPAN_REGEXP2.AT_LINE_START = "FALSE";
        SPAN_REGEXP2.DELEGATE = "LINK_INLINE_URL_TITLE";
        SPAN_REGEXP2.MATCH_TYPE = "OPERATOR";

        BEGIN4.text = "!?\\[[\\p{Alnum}\\p{Blank}]*";

        END4.text = "\\]";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN_REGEXP SPAN_REGEXP3 = new SPAN_REGEXP();
        SPAN_REGEXP3.HASH_CHARS = "*_";
        SPAN_REGEXP3.AT_WORD_START = "TRUE";
        SPAN_REGEXP3.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP3.TYPE = "LITERAL3";

        BEGIN5.text = "(\\*\\*|__)";

        END5.text = "$1";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN_REGEXP SPAN_REGEXP4 = new SPAN_REGEXP();
        SPAN_REGEXP4.HASH_CHARS = "*_";
        SPAN_REGEXP4.AT_WORD_START = "TRUE";
        SPAN_REGEXP4.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP4.TYPE = "LITERAL4";

        BEGIN6.text = "(\\*|_)";

        END6.text = "$1";


        SPAN_REGEXP4.BEGIN = new BEGIN[] { BEGIN6, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, };

        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, EOL_SPAN_REGEXP2, EOL_SPAN_REGEXP3, EOL_SPAN_REGEXP4, EOL_SPAN_REGEXP5, EOL_SPAN_REGEXP6, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, SPAN_REGEXP4, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LINK_LABEL_DEFINITION";
        RULES1.DEFAULT = "KEYWORD3";

        SEQ_REGEXP1.text = "\\\\[\\Q*_\\`[](){}#+.!-\\E]";
        SEQ_REGEXP1.TYPE = "NULL";
        SEQ_REGEXP1.HASH_CHAR = "\\";

        SEQ1.text = "\"";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "(";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ")";
        SEQ3.TYPE = "OPERATOR";

        IMPORT1.DELEGATE = "MARKDOWN";


        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LINK_INLINE_URL_TITLE";

        SEQ1.text = "]";
        SEQ1.TYPE = "OPERATOR";

        SPAN_REGEXP1.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP1.TYPE = "KEYWORD4";
        SPAN_REGEXP1.AT_LINE_START = "FALSE";
        SPAN_REGEXP1.DELEGATE = "LINK_INLINE_LABEL_CLOSE";
        SPAN_REGEXP1.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP1.HASH_CHAR = "[";

        BEGIN1.text = "\\[";

        END1.text = "\\]";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP2.TYPE = "KEYWORD4";
        SPAN_REGEXP2.AT_LINE_START = "FALSE";
        SPAN_REGEXP2.DELEGATE = "LINK_INLINE_URL_TITLE_CLOSE";
        SPAN_REGEXP2.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP2.HASH_CHAR = "(";

        BEGIN2.text = "\\(";

        END2.text = "\\)";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LINK_INLINE_URL_TITLE_CLOSE";
        RULES1.DEFAULT = "KEYWORD3";

        EOL_SPAN1.text = ")";
        EOL_SPAN1.TYPE = "NULL";
        EOL_SPAN1.DELEGATE = "MAIN";
        EOL_SPAN1.MATCH_TYPE = "OPERATOR";


        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LINK_INLINE_LABEL_CLOSE";
        RULES1.DEFAULT = "LABEL";

        EOL_SPAN1.text = "]";
        EOL_SPAN1.TYPE = "NULL";
        EOL_SPAN1.DELEGATE = "MAIN";
        EOL_SPAN1.MATCH_TYPE = "OPERATOR";


        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "MARKDOWN_BLOCKQUOTE";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "<";
        SEQ1.TYPE = "NULL";

        SPAN1.TYPE = "MARKUP";
        SPAN1.DELEGATE = "INLINE_MARKUP";

        BEGIN1.text = "<";

        END1.text = ">";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "*";
        SEQ2.TYPE = "NULL";

        SEQ3.text = "_";
        SEQ3.TYPE = "NULL";

        SEQ4.text = "\\][";
        SEQ4.TYPE = "NULL";

        SEQ_REGEXP1.text = "\\\\[\\Q*_\\`[](){}#+.!-\\E]";
        SEQ_REGEXP1.TYPE = "NULL";
        SEQ_REGEXP1.HASH_CHAR = "\\";

        SPAN_REGEXP1.HASH_CHARS = "`";
        SPAN_REGEXP1.TYPE = "LITERAL2";

        BEGIN2.text = "(`{1,2})";

        END2.text = "$1";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN_REGEXP EOL_SPAN_REGEXP1 = new EOL_SPAN_REGEXP();
        EOL_SPAN_REGEXP1.text = "( {4,}|\\t+)\\S";
        EOL_SPAN_REGEXP1.HASH_CHARS = " 	";
        EOL_SPAN_REGEXP1.TYPE = "LITERAL2";

        EOL_SPAN_REGEXP2.text = "[=-]+";
        EOL_SPAN_REGEXP2.HASH_CHARS = "=-";
        EOL_SPAN_REGEXP2.TYPE = "KEYWORD1";

        EOL_SPAN_REGEXP3.text = "#{1,6}[ \\t]*(.+?)";
        EOL_SPAN_REGEXP3.TYPE = "KEYWORD1";
        EOL_SPAN_REGEXP3.HASH_CHAR = "#";

        EOL_SPAN_REGEXP4.text = "[ ]{0,2}([ ]?[-_*][ ]?){3,}[ \\t]*";
        EOL_SPAN_REGEXP4.HASH_CHARS = "-*_ 	";
        EOL_SPAN_REGEXP4.TYPE = "KEYWORD1";

        SEQ_REGEXP2.text = "[ \\t]{0,}[*+-][ \\t]+";
        SEQ_REGEXP2.HASH_CHARS = "*+- 	";
        SEQ_REGEXP2.TYPE = "KEYWORD2";

        SEQ_REGEXP3.text = "[ \\t]{0,}\\d+\\.[ \\t]+";
        SEQ_REGEXP3.HASH_CHARS = "0123456789 	";
        SEQ_REGEXP3.TYPE = "KEYWORD2";

        EOL_SPAN_REGEXP5.text = "\\[(.*?)\\]\\:";
        EOL_SPAN_REGEXP5.TYPE = "LABEL";
        EOL_SPAN_REGEXP5.DELEGATE = "LINK_LABEL_DEFINITION";

        SPAN_REGEXP2.HASH_CHARS = " ![";
        SPAN_REGEXP2.NO_LINE_BREAK = "TRUE";
        SPAN_REGEXP2.TYPE = "KEYWORD4";
        SPAN_REGEXP2.AT_LINE_START = "FALSE";
        SPAN_REGEXP2.DELEGATE = "LINK_INLINE_URL_TITLE";
        SPAN_REGEXP2.MATCH_TYPE = "OPERATOR";

        BEGIN3.text = "!?\\[[\\p{Alnum}\\p{Blank}]*";

        END3.text = "\\]";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN_REGEXP SPAN_REGEXP3 = new SPAN_REGEXP();
        SPAN_REGEXP3.HASH_CHARS = "*_";
        SPAN_REGEXP3.TYPE = "LITERAL3";

        BEGIN4.text = "(\\*\\*|__)";

        END4.text = "$1";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN_REGEXP SPAN_REGEXP4 = new SPAN_REGEXP();
        SPAN_REGEXP4.HASH_CHARS = "*_";
        SPAN_REGEXP4.TYPE = "LITERAL4";

        BEGIN5.text = "(\\*|_)";

        END5.text = "$1";


        SPAN_REGEXP4.BEGIN = new BEGIN[] { BEGIN5, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, };

        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, EOL_SPAN_REGEXP2, EOL_SPAN_REGEXP3, EOL_SPAN_REGEXP4, EOL_SPAN_REGEXP5, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, SPAN_REGEXP4, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}