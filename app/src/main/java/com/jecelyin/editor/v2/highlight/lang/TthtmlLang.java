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
public class TthtmlLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<!--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "-->";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "#";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = ",+-=<>/?^&*";
        PROPERTY4.NAME = "wordBreakChars";

        PROPERTY5.VALUE = "{";
        PROPERTY5.NAME = "indentOpenBrackets";

        PROPERTY6.VALUE = "}";
        PROPERTY6.NAME = "indentCloseBrackets";

        PROPERTY7.VALUE = "[";
        PROPERTY7.NAME = "indentOpenBrackets";

        PROPERTY8.VALUE = "]";
        PROPERTY8.NAME = "indentCloseBrackets";

        PROPERTY9.VALUE = "(";
        PROPERTY9.NAME = "unalignedOpenBrackets";

        PROPERTY10.VALUE = ")";
        PROPERTY10.NAME = "unalignedCloseBrackets";

        PROPERTY11.VALUE = "true";
        PROPERTY11.NAME = "lineUpClosingBracket";

        PROPERTY12.VALUE = "(FOREACH|FOR|WHILE|IF|ELSIF|ELSE|UNLESS|SWITCH|CASE|TRY|CATCH)(\\s.*?)?;";
        PROPERTY12.NAME = "indentNextLine";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "'";

        END2.text = "'";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVASCRIPT";
        RULES1.DEFAULT = "MARKUP";
        RULES1.IGNORE_CASE = "TRUE";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "javascript::MAIN";

        SEQ2.text = "SRC=";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "html::MAIN";


        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS";
        RULES1.DEFAULT = "MARKUP";

        SEQ1.text = ">";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "css::MAIN";


        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";
        SPAN2.DELEGATE = "JAVASCRIPT";

        BEGIN2.text = "<SCRIPT";

        END2.text = "</SCRIPT>";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "MARKUP";
        SPAN3.DELEGATE = "CSS";

        BEGIN3.text = "<STYLE";

        END3.text = "</STYLE>";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD2";
        SPAN4.DELEGATE = "xml::DTD-TAGS";

        BEGIN4.text = "<!";

        END4.text = ">";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "MARKUP";
        SPAN5.DELEGATE = "TAGS";

        BEGIN5.text = "<";

        END5.text = ">";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.NO_WORD_BREAK = "TRUE";
        SPAN6.TYPE = "LITERAL2";

        BEGIN6.text = "&";

        END6.text = ";";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "COMMENT2";

        BEGIN7.text = "[%#";

        END7.text = "%]";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.DELEGATE = "perl::MAIN";
        SPAN_REGEXP1.HASH_CHAR = "[%";

        BEGIN8.text = "\\[%\\s*?PERL\\s*?%\\]";

        END8.text = "\\[%\\s*?END\\s*?%\\]";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "LITERAL3";
        SPAN8.DELEGATE = "TT";

        BEGIN9.text = "[%";

        END9.text = "%]";


        SPAN8.BEGIN = new BEGIN[] { BEGIN9, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TT";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "KEYWORD2";
        SPAN1.DELEGATE = "perl::VARIABLE";

        BEGIN1.text = "${";

        END1.text = "}";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\$#?[\\w:]+";
        SEQ_REGEXP1.TYPE = "KEYWORD2";
        SEQ_REGEXP1.HASH_CHAR = "$";

        MARK_PREVIOUS1.text = ".";
        MARK_PREVIOUS1.TYPE = "KEYWORD4";
        MARK_PREVIOUS1.MATCH_TYPE = "CONTEXT";

        MARK_PREVIOUS2.text = "(";
        MARK_PREVIOUS2.TYPE = "FUNCTION";
        MARK_PREVIOUS2.MATCH_TYPE = "CONTEXT";

        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

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

        SEQ15.text = "~";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = ".";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "}";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "{";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = ",";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = ";";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "]";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "[";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "?";
        SEQ23.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"template", "component", "loop", "error", "content", });
        KEYWORDS1.add("FUNCTION", new String[]{"format", "upper", "lower", "ucfirst", "lcfirst", "trim", "collapse", "html", "html_entity", "html_para", "html_break", "html_para_break", "html_line_break", "uri", "url", "indent", "truncate", "repeat", "remove", "replace", "redirect", "eval", "evaltt", "perl", "evalperl", "stdout", "stderr", "null", "latex", });
        KEYWORDS1.add("KEYWORD3", new String[]{"defined", "length", "repeat", "replace", "match", "search", "split", "chunk", "list", "hash", "size", "keys", "values", "each", "sort", "nsort", "import", "defined", "exists", "item", "first", "last", "max", "reverse", "join", "grep", "unshift", "push", "shift", "pop", "unique", "merge", "slice", "splice", "count", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}