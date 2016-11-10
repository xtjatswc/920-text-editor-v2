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
public class DssslLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<!--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "-->";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = ";";
        PROPERTY3.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = ";";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<!--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "'(";
        SEQ1.TYPE = "NULL";

        MARK_FOLLOWING1.text = "'";
        MARK_FOLLOWING1.TYPE = "LITERAL1";

        SPAN2.TYPE = "LITERAL1";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "KEYWORD2";

        BEGIN3.text = "$";

        END3.text = "$";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "KEYWORD2";

        BEGIN4.text = "%";

        END4.text = "%";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        MARK_FOLLOWING MARK_FOLLOWING2 = new MARK_FOLLOWING();
        MARK_FOLLOWING2.text = "#";
        MARK_FOLLOWING2.TYPE = "LITERAL2";

        SPAN5.TYPE = "KEYWORD2";
        SPAN5.DELEGATE = "xml::ENTITY-TAGS";

        BEGIN5.text = "<!ENTITY";

        END5.text = ">";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "KEYWORD2";
        SPAN6.DELEGATE = "xml::CDATA";

        BEGIN6.text = "<![CDATA[";

        END6.text = "]]>";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "KEYWORD2";
        SPAN7.DELEGATE = "xml::DTD-TAGS";

        BEGIN7.text = "<!";

        END7.text = ">";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "<=";
        SEQ2.TYPE = "NULL";

        SPAN8.TYPE = "MARKUP";
        SPAN8.DELEGATE = "xml::TAGS";

        BEGIN8.text = "</style-specification";

        END8.text = ">";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.TYPE = "MARKUP";
        SPAN9.DELEGATE = "xml::TAGS";

        BEGIN9.text = "</style-sheet";

        END9.text = ">";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        SPAN SPAN10 = new SPAN();
        SPAN10.TYPE = "MARKUP";
        SPAN10.DELEGATE = "xml::TAGS";

        BEGIN10.text = "<style-specification";

        END10.text = ">";


        SPAN10.BEGIN = new BEGIN[] { BEGIN10, };

        SPAN SPAN11 = new SPAN();
        SPAN11.TYPE = "MARKUP";
        SPAN11.DELEGATE = "xml::TAGS";

        BEGIN11.text = "<external-specification";

        END11.text = ">";


        SPAN11.BEGIN = new BEGIN[] { BEGIN11, };

        SPAN SPAN12 = new SPAN();
        SPAN12.TYPE = "MARKUP";
        SPAN12.DELEGATE = "xml::TAGS";

        BEGIN12.text = "<style-sheet";

        END12.text = ">";


        SPAN12.BEGIN = new BEGIN[] { BEGIN12, };

        SPAN SPAN13 = new SPAN();
        SPAN13.NO_WORD_BREAK = "TRUE";
        SPAN13.TYPE = "LITERAL2";

        BEGIN13.text = "&";

        END13.text = ";";


        SPAN13.BEGIN = new BEGIN[] { BEGIN13, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();

        KEYWORDS1.add("KEYWORD1", new String[]{"and", "cond", "define", "else", "lambda", "or", "quote", "if", "let", "let*", "loop", "not", "list", "append", "children", "normalize", });
        KEYWORDS1.add("KEYWORD2", new String[]{"car", "cdr", "cons", "node-list-first", "node-list-rest", });
        KEYWORDS1.add("FUNCTION", new String[]{"external-procedure", "root", "make", "process-children", "current-node", "node", "empty-sosofo", "default", "attribute-string", "select-elements", "with-mode", "literal", "process-node-list", "element", "mode", "gi", "sosofo-append", "sequence", });
        KEYWORDS1.add("KEYWORD3", new String[]{"eq?", "null?", "pair?", "zero?", "equal?", "node-list-empty?", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, SPAN10, SPAN11, SPAN12, SPAN13, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.MARK_FOLLOWING = new MARK_FOLLOWING[] { MARK_FOLLOWING1, MARK_FOLLOWING2, };

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