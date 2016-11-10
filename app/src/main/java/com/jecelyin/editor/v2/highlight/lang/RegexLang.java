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
public class RegexLang implements LangDefine {
        private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.SET = "FORCED_NUMBER";
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = ",";
        SEQ1.TYPE = "OPERATOR";


        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";

        SEQ1.text = "\\\\";
        SEQ1.TYPE = "NULL";

        SEQ2.text = "\\(";
        SEQ2.TYPE = "NULL";

        SEQ3.text = "\\)";
        SEQ3.TYPE = "NULL";

        SEQ4.text = "\\[";
        SEQ4.TYPE = "NULL";

        SEQ5.text = "\\]";
        SEQ5.TYPE = "NULL";

        SEQ6.text = "\\{";
        SEQ6.TYPE = "NULL";

        SEQ7.text = "\\}";
        SEQ7.TYPE = "NULL";

        SEQ8.text = "\\^";
        SEQ8.TYPE = "NULL";

        SEQ9.text = "\\$";
        SEQ9.TYPE = "NULL";

        SEQ10.text = "\\?";
        SEQ10.TYPE = "NULL";

        SEQ11.text = "\\+";
        SEQ11.TYPE = "NULL";

        SEQ12.text = "\\*";
        SEQ12.TYPE = "NULL";

        SEQ13.text = "\\.";
        SEQ13.TYPE = "NULL";

        SEQ14.text = "\\|";
        SEQ14.TYPE = "NULL";

        SEQ15.text = "^";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "$";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "?";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "*";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "+";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "|";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "\\b";
        SEQ21.TYPE = "KEYWORD1";

        SEQ22.text = "\\d";
        SEQ22.TYPE = "DIGIT";

        SEQ23.text = "\\D";
        SEQ23.TYPE = "LITERAL2";

        SEQ24.text = "\\w";
        SEQ24.TYPE = "KEYWORD3";

        SEQ25.text = ".";
        SEQ25.TYPE = "KEYWORD3";

        SEQ26.text = "\\W";
        SEQ26.TYPE = "LITERAL3";

        SEQ27.text = "\\s";
        SEQ27.TYPE = "KEYWORD4";

        SEQ28.text = "\\S";
        SEQ28.TYPE = "LITERAL4";

        SPAN1.TYPE = "FUNCTION";
        SPAN1.DELEGATE = "MAIN";

        BEGIN1.text = "[^";

        END1.text = "]";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "FUNCTION";
        SPAN2.DELEGATE = "MAIN";

        BEGIN2.text = "(?=";

        END2.text = ")";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "FUNCTION";
        SPAN3.DELEGATE = "MAIN";

        BEGIN3.text = "(?!";

        END3.text = ")";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "FUNCTION";
        SPAN4.DELEGATE = "MAIN";


        END4.text = ")";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "FUNCTION";
        SPAN5.DELEGATE = "MAIN";


        END5.text = ")";


        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "FUNCTION";
        SPAN6.DELEGATE = "MAIN";

        BEGIN6.text = "(?:";

        END6.text = ")";


        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "OPERATOR";
        SPAN7.DELEGATE = "FORCED_NUMBER";

        BEGIN7.text = "{";

        END7.text = "}";


        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.TYPE = "OPERATOR";
        SPAN8.DELEGATE = "MAIN";

        BEGIN8.text = "[";

        END8.text = "]";


        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        SPAN SPAN9 = new SPAN();
        SPAN9.TYPE = "FUNCTION";
        SPAN9.DELEGATE = "MAIN";

        BEGIN9.text = "(";

        END9.text = ")";


        SPAN9.BEGIN = new BEGIN[] { BEGIN9, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, SPAN9, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, SEQ26, SEQ27, SEQ28, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }


}