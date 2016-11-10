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
public class ApplescriptLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "false";
        PROPERTY1.NAME = "doubleBracketIndent";

        PROPERTY2.VALUE = "(*";
        PROPERTY2.NAME = "commentStart";

        PROPERTY3.VALUE = "*)";
        PROPERTY3.NAME = "commentEnd";

        PROPERTY4.VALUE = "--";
        PROPERTY4.NAME = "lineComment";

        PROPERTY5.VALUE = ",+-=<>/?^&*";
        PROPERTY5.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "(*";

        END1.text = "*)";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "--";
        EOL_SPAN1.TYPE = "COMMENT1";

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

        BEGIN3.text = "'";

        END3.text = "'";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "(";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ")";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "+";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "-";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "^";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "*";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "/";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = "&";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "<=";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = ">";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = ">=";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "=";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "­";
        SEQ14.TYPE = "OPERATOR";

        SEQ_REGEXP1.text = "application[\\t\\s]+responses";
        SEQ_REGEXP1.AT_WORD_START = "TRUE";
        SEQ_REGEXP1.TYPE = "LITERAL2";
        SEQ_REGEXP1.HASH_CHAR = "application";

        SEQ_REGEXP2.text = "current[\\t\\s]+application";
        SEQ_REGEXP2.AT_WORD_START = "TRUE";
        SEQ_REGEXP2.TYPE = "LITERAL2";
        SEQ_REGEXP2.HASH_CHAR = "current";

        SEQ_REGEXP3.text = "white[\\t\\s]+space";
        SEQ_REGEXP3.AT_WORD_START = "TRUE";
        SEQ_REGEXP3.TYPE = "LITERAL2";
        SEQ_REGEXP3.HASH_CHAR = "white";

        SEQ_REGEXP4.text = "all[\\t\\s]+caps";
        SEQ_REGEXP4.TYPE = "LITERAL2";
        SEQ_REGEXP4.HASH_CHAR = "all";

        SEQ_REGEXP5.text = "all[\\t\\s]+lowercase";
        SEQ_REGEXP5.AT_WORD_START = "TRUE";
        SEQ_REGEXP5.TYPE = "LITERAL2";
        SEQ_REGEXP5.HASH_CHAR = "all";

        SEQ_REGEXP6.text = "small[\\t\\s]+caps";
        SEQ_REGEXP6.AT_WORD_START = "TRUE";
        SEQ_REGEXP6.TYPE = "LITERAL2";
        SEQ_REGEXP6.HASH_CHAR = "small";

        SEQ_REGEXP7.text = "missing[\\t\\s]+value";
        SEQ_REGEXP7.AT_WORD_START = "TRUE";
        SEQ_REGEXP7.TYPE = "KEYWORD3";
        SEQ_REGEXP7.HASH_CHAR = "missing";


        KEYWORDS1.add("LITERAL2", new String[]{"it", "me", "version", "pi", "result", "space", "tab", "anything", "case", "diacriticals", "expansion", "hyphens", "punctuation", "bold", "condensed", "expanded", "hidden", "italic", "outline", "plain", "shadow", "strikethrough", "subscript", "superscript", "underline", "ask", "no", "yes", "false", "true", "weekday", "monday", "mon", "tuesday", "tue", "wednesday", "wed", "thursday", "thu", "friday", "fri", "saturday", "sat", "sunday", "sun", "month", "january", "jan", "february", "feb", "march", "mar", "april", "apr", "may", "june", "jun", "july", "jul", "august", "aug", "september", "sep", "october", "oct", "november", "nov", "december", "dec", "minutes", "hours", "days", "weeks", });
        KEYWORDS1.add("KEYWORD1", new String[]{"script", "property", "prop", "end", "copy", "to", "set", "global", "local", "on", "to", "of", "in", "given", "with", "without", "return", "continue", "tell", "if", "then", "else", "repeat", "times", "while", "until", "from", "exit", "try", "error", "considering", "ignoring", "timeout", "transaction", "my", "get", "put", "into", "is", });
        KEYWORDS1.add("KEYWORD2", new String[]{"each", "some", "every", "whose", "where", "id", "index", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "last", "front", "back", "st", "nd", "rd", "th", "middle", "named", "through", "thru", "before", "after", "beginning", "the", });
        KEYWORDS1.add("KEYWORD3", new String[]{"close", "copy", "count", "delete", "duplicate", "exists", "launch", "make", "move", "open", "print", "quit", "reopen", "run", "save", "saving", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, SEQ_REGEXP2, SEQ_REGEXP3, SEQ_REGEXP4, SEQ_REGEXP5, SEQ_REGEXP6, SEQ_REGEXP7, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, };

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