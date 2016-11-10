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
public class CLang implements LangDefine {
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

        PROPERTY5.VALUE = "{";
        PROPERTY5.NAME = "indentOpenBrackets";

        PROPERTY6.VALUE = "}";
        PROPERTY6.NAME = "indentCloseBrackets";

        PROPERTY7.VALUE = "(";
        PROPERTY7.NAME = "unalignedOpenBrackets";

        PROPERTY8.VALUE = ")";
        PROPERTY8.NAME = "unalignedCloseBrackets";

        PROPERTY9.VALUE = "(?!^\\s*(#|//)).*(\\b(if|while|for)\\s*\\(.*\\)|\\b(else|do)\\b)[^{;]*$";
        PROPERTY9.NAME = "indentNextLine";

        PROPERTY10.VALUE = "^\\s*((case\\b.*|[\\p{Alpha}_][\\p{Alnum}_]*)\\s*:(?!:)).*$";
        PROPERTY10.NAME = "unindentThisLine";

        PROPERTY11.VALUE = ":";
        PROPERTY11.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "#";
        EOL_SPAN1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN1.TYPE = "KEYWORD2";
        EOL_SPAN1.DELEGATE = "CPP";

        IMPORT1.DELEGATE = "LEX";

        IMPORT2.DELEGATE = "CORE";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "LEX";
        RULES1.IGNORE_CASE = "FALSE";

        IMPORT1.DELEGATE = "COMMENTS";

        IMPORT2.DELEGATE = "C_LEXER";


        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "C_LEXER";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "L\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "L'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "\\";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "??(";
        SEQ1.TYPE = "LITERAL4";

        SEQ2.text = "??/";
        SEQ2.TYPE = "LITERAL4";

        SEQ3.text = "??)";
        SEQ3.TYPE = "LITERAL4";

        SEQ4.text = "??'";
        SEQ4.TYPE = "LITERAL4";

        SEQ5.text = "??<";
        SEQ5.TYPE = "LITERAL4";

        SEQ6.text = "??!";
        SEQ6.TYPE = "LITERAL4";

        SEQ7.text = "??>";
        SEQ7.TYPE = "LITERAL4";

        SEQ8.text = "??-";
        SEQ8.TYPE = "LITERAL4";

        SEQ9.text = "??=";
        SEQ9.TYPE = "LITERAL4";

        SEQ10.text = "<:";
        SEQ10.TYPE = "LITERAL4";

        SEQ11.text = ":>";
        SEQ11.TYPE = "LITERAL4";

        SEQ12.text = "<%";
        SEQ12.TYPE = "LITERAL4";

        SEQ13.text = "%>";
        SEQ13.TYPE = "LITERAL4";

        SEQ14.text = "%:";
        SEQ14.TYPE = "LITERAL4";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.AT_WHITESPACE_END = "TRUE";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        MARK_PREVIOUS2.text = "(";
        MARK_PREVIOUS2.TYPE = "FUNCTION";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";

        SEQ15.text = "=";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "!";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "+";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "-";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "/";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "*";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = ">";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "<";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "%";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "&";
        SEQ24.TYPE = "OPERATOR";

        SEQ25.text = "|";
        SEQ25.TYPE = "OPERATOR";

        SEQ26.text = "^";
        SEQ26.TYPE = "OPERATOR";

        SEQ27.text = "~";
        SEQ27.TYPE = "OPERATOR";

        SEQ28.text = "?";
        SEQ28.TYPE = "OPERATOR";

        SEQ29.text = ":";
        SEQ29.TYPE = "OPERATOR";

        SEQ30.text = ".";
        SEQ30.TYPE = "OPERATOR";

        SEQ31.text = ",";
        SEQ31.TYPE = "OPERATOR";

        SEQ32.text = "[";
        SEQ32.TYPE = "OPERATOR";

        SEQ33.text = "]";
        SEQ33.TYPE = "OPERATOR";

        SEQ34.text = ")";
        SEQ34.TYPE = "OPERATOR";

        SEQ35.text = "}";
        SEQ35.TYPE = "OPERATOR";

        SEQ36.text = "{";
        SEQ36.TYPE = "OPERATOR";

        SEQ37.text = ";";
        SEQ37.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD3", new String[]{"and", "and_eq", "bitand", "bitor", "compl", "not", "not_eq", "or", "or_eq", "xor", "xor_eq", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, SEQ29, SEQ30, SEQ31, SEQ32, SEQ33, SEQ34, SEQ35, SEQ36, SEQ37, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CORE";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";


        KEYWORDS1.add("KEYWORD1", new String[]{"auto", "break", "case", "const", "continue", "default", "do", "else", "for", "goto", "if", "inline", "register", "return", "sizeof", "static", "switch", "void", "volatile", "while", });
        KEYWORDS1.add("KEYWORD2", new String[]{"asm", "extern", });
        KEYWORDS1.add("KEYWORD3", new String[]{"bool", "char", "double", "enum", "float", "int", "long", "short", "signed", "struct", "union", "unsigned", "typedef", "restrict", "_Bool", "_Complex", "_Pragma", "_Imaginary", });
        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "COMMENTS";

        SEQ1.text = "/**/";
        SEQ1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT3";
        SPAN1.DELEGATE = "doxygen::DOXYGEN";

        BEGIN1.text = "/**<";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT3";
        SPAN2.DELEGATE = "doxygen::DOXYGEN";

        BEGIN2.text = "/**";

        END2.text = "*/";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "///<";
        EOL_SPAN1.TYPE = "COMMENT3";
        EOL_SPAN1.DELEGATE = "doxygen::DOXYGEN";

        EOL_SPAN2.text = "///";
        EOL_SPAN2.TYPE = "COMMENT3";
        EOL_SPAN2.DELEGATE = "doxygen::DOXYGEN";

        SPAN3.TYPE = "COMMENT3";
        SPAN3.DELEGATE = "doxygen::DOXYGEN";

        BEGIN3.text = "/*!<";

        END3.text = "*/";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "COMMENT3";
        SPAN4.DELEGATE = "doxygen::DOXYGEN";

        BEGIN4.text = "/*!";

        END4.text = "*/";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        EOL_SPAN EOL_SPAN3 = new EOL_SPAN();
        EOL_SPAN3.text = "//!<";
        EOL_SPAN3.TYPE = "COMMENT3";
        EOL_SPAN3.DELEGATE = "doxygen::DOXYGEN";

        EOL_SPAN4.text = "//!";
        EOL_SPAN4.TYPE = "COMMENT3";
        EOL_SPAN4.DELEGATE = "doxygen::DOXYGEN";

        SPAN5.TYPE = "COMMENT1";

        BEGIN5.text = "/*";

        END5.text = "*/";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        EOL_SPAN EOL_SPAN5 = new EOL_SPAN();
        EOL_SPAN5.text = "//";
        EOL_SPAN5.TYPE = "COMMENT1";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CPP";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN_REGEXP1.text = "include\\b";
        EOL_SPAN_REGEXP1.TYPE = "MARKUP";
        EOL_SPAN_REGEXP1.DELEGATE = "INCLUDE";
        EOL_SPAN_REGEXP1.HASH_CHAR = "include";

        EOL_SPAN_REGEXP2.text = "define\\b";
        EOL_SPAN_REGEXP2.TYPE = "MARKUP";
        EOL_SPAN_REGEXP2.DELEGATE = "DEFINE";
        EOL_SPAN_REGEXP2.HASH_CHAR = "define";

        EOL_SPAN_REGEXP3.text = "endif\\b";
        EOL_SPAN_REGEXP3.TYPE = "MARKUP";
        EOL_SPAN_REGEXP3.DELEGATE = "LEX";
        EOL_SPAN_REGEXP3.HASH_CHAR = "endif";

        EOL_SPAN_REGEXP4.text = "elif\\b";
        EOL_SPAN_REGEXP4.TYPE = "MARKUP";
        EOL_SPAN_REGEXP4.DELEGATE = "CONDITION";
        EOL_SPAN_REGEXP4.HASH_CHAR = "elif";

        EOL_SPAN_REGEXP5.text = "if\\b";
        EOL_SPAN_REGEXP5.TYPE = "MARKUP";
        EOL_SPAN_REGEXP5.DELEGATE = "CONDITION";
        EOL_SPAN_REGEXP5.HASH_CHAR = "if";

        IMPORT1.DELEGATE = "LEX";


        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, EOL_SPAN_REGEXP2, EOL_SPAN_REGEXP3, EOL_SPAN_REGEXP4, EOL_SPAN_REGEXP5, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "INCLUDE";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";

        BEGIN1.text = "<";

        END1.text = ">";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "LEX";


        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    private RULES RULES8() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DEFINE";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "#";
        SEQ1.TYPE = "OPERATOR";

        IMPORT1.DELEGATE = "LEX";

        IMPORT2.DELEGATE = "CORE";


        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES9() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CONDITION";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "[0-9][0-9a-zA-Z]*";
        RULES1.IGNORE_CASE = "FALSE";

        IMPORT1.DELEGATE = "LEX";


        RULES1.IMPORT = new IMPORT[] { IMPORT1, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), RULES8(), RULES9(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}