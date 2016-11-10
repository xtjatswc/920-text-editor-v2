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
public class CvsCommitLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();
        PROPERTY PROPERTY1 = new PROPERTY();
        PROPERTY1.VALUE = "true";
        PROPERTY1.NAME = "contextInsensitive";
        PROPS1.PROPERTY = new PROPERTY[] { PROPERTY1, };

        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "FALSE";
        RULES1.IGNORE_CASE = "TRUE";
        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "CVS:";
        EOL_SPAN1.TYPE = "COMMENT1";
        EOL_SPAN1.AT_LINE_START = "TRUE";
        EOL_SPAN1.DELEGATE = "CHANGED";
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CHANGED";
        RULES1.DEFAULT = "COMMENT2";
        SEQ SEQ1 = new SEQ();
        SEQ1.text = "CVS:";
        SEQ1.TYPE = "COMMENT1";
        SEQ1.AT_LINE_START = "TRUE";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = "Committing in";
        SEQ2.TYPE = "KEYWORD1";
        SEQ SEQ3 = new SEQ();
        SEQ3.text = "Added Files:";
        SEQ3.TYPE = "KEYWORD1";
        SEQ SEQ4 = new SEQ();
        SEQ4.text = "Modified Files:";
        SEQ4.TYPE = "KEYWORD1";
        SEQ SEQ5 = new SEQ();
        SEQ5.text = "Removed Files:";
        SEQ5.TYPE = "KEYWORD1";
        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}
