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
public class RestLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = ".. ";
        PROPERTY1.NAME = "lineComment";

        PROPERTY2.VALUE = ".*::$";
        PROPERTY2.NAME = "indentNextLines";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN1.text = "__";
        EOL_SPAN1.TYPE = "KEYWORD3";
        EOL_SPAN1.AT_LINE_START = "TRUE";

        EOL_SPAN2.text = ".. _";
        EOL_SPAN2.TYPE = "KEYWORD3";
        EOL_SPAN2.AT_LINE_START = "TRUE";

        SEQ_REGEXP1.text = "={3,}";
        SEQ_REGEXP1.TYPE = "LABEL";
        SEQ_REGEXP1.HASH_CHAR = "===";

        SEQ_REGEXP2.text = "-{3,}";
        SEQ_REGEXP2.TYPE = "LABEL";
        SEQ_REGEXP2.HASH_CHAR = "---";

        SEQ_REGEXP3.text = "~{3,}";
        SEQ_REGEXP3.TYPE = "LABEL";
        SEQ_REGEXP3.HASH_CHAR = "~~~";

        SEQ_REGEXP4.text = "#{3,}";
        SEQ_REGEXP4.TYPE = "LABEL";
        SEQ_REGEXP4.HASH_CHAR = "###";

        SEQ_REGEXP5.text = "\"{3,}";
        SEQ_REGEXP5.TYPE = "LABEL";
        SEQ_REGEXP5.HASH_CHAR = "\"\"\"";

        SEQ_REGEXP6.text = "\\^{3,}";
        SEQ_REGEXP6.TYPE = "LABEL";
        SEQ_REGEXP6.HASH_CHAR = "^^^";

        SEQ_REGEXP7.text = "\\+{3,}";
        SEQ_REGEXP7.TYPE = "LABEL";
        SEQ_REGEXP7.HASH_CHAR = "+++";

        SEQ_REGEXP8.text = "\\*{3,}";
        SEQ_REGEXP8.TYPE = "LABEL";
        SEQ_REGEXP8.HASH_CHAR = "***";

        SEQ_REGEXP9.text = "\\.\\.\\s\\|[^|]+\\|";
        SEQ_REGEXP9.TYPE = "LITERAL3";
        SEQ_REGEXP9.AT_LINE_START = "TRUE";
        SEQ_REGEXP9.HASH_CHAR = "..";

        SEQ_REGEXP10.text = "\\|[^|]+\\|";
        SEQ_REGEXP10.TYPE = "LITERAL4";
        SEQ_REGEXP10.AT_LINE_START = "FALSE";
        SEQ_REGEXP10.HASH_CHAR = "|";

        SEQ_REGEXP11.text = "\\.\\.\\s[A-z][A-z0-9-_]+::";
        SEQ_REGEXP11.TYPE = "LITERAL2";
        SEQ_REGEXP11.AT_LINE_START = "TRUE";
        SEQ_REGEXP11.HASH_CHAR = "..";

        SEQ_REGEXP12.text = "\\*\\*[^*]+\\*\\*";
        SEQ_REGEXP12.TYPE = "KEYWORD2";
        SEQ_REGEXP12.AT_LINE_START = "FALSE";
        SEQ_REGEXP12.HASH_CHAR = "**";

        SEQ_REGEXP13.text = "\\*[^\\s*][^*]*\\*";
        SEQ_REGEXP13.TYPE = "KEYWORD4";
        SEQ_REGEXP13.AT_LINE_START = "FALSE";
        SEQ_REGEXP13.HASH_CHAR = "*";

        EOL_SPAN3.text = "..";
        EOL_SPAN3.TYPE = "COMMENT1";
        EOL_SPAN3.AT_LINE_START = "TRUE";

        SEQ_REGEXP14.text = "`[A-z0-9]+[^`]+`_{1,2}";
        SEQ_REGEXP14.TYPE = "LABEL";
        SEQ_REGEXP14.HASH_CHAR = "`";

        SEQ_REGEXP15.text = "\\[[0-9]+\\]_";
        SEQ_REGEXP15.TYPE = "LABEL";
        SEQ_REGEXP15.HASH_CHAR = "[";

        SEQ_REGEXP16.text = "\\[#[A-z0-9_]*\\]_";
        SEQ_REGEXP16.TYPE = "LABEL";
        SEQ_REGEXP16.HASH_CHAR = "[#";

        SEQ1.text = "[*]_";
        SEQ1.TYPE = "LABEL";

        SEQ_REGEXP17.text = "\\[[A-z][A-z0-9_-]*\\]_";
        SEQ_REGEXP17.TYPE = "LABEL";
        SEQ_REGEXP17.HASH_CHAR = "[";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "``";

        END1.text = "``";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD1";

        BEGIN2.text = "`";

        END2.text = "`";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ_REGEXP SEQ_REGEXP18 = new SEQ_REGEXP();
        SEQ_REGEXP18.text = "`{3,}";
        SEQ_REGEXP18.TYPE = "LABEL";
        SEQ_REGEXP18.HASH_CHAR = "```";

        SEQ_REGEXP19.text = ":[A-z][A-z0-9 	=\\s\\t_]*:";
        SEQ_REGEXP19.TYPE = "KEYWORD1";
        SEQ_REGEXP19.HASH_CHAR = ":";

        SEQ_REGEXP20.text = "\\+-[+-]+";
        SEQ_REGEXP20.TYPE = "LABEL";
        SEQ_REGEXP20.HASH_CHAR = "+-";

        SEQ_REGEXP21.text = "\\+=[+=]+";
        SEQ_REGEXP21.TYPE = "LABEL";
        SEQ_REGEXP21.HASH_CHAR = "+?";


        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}