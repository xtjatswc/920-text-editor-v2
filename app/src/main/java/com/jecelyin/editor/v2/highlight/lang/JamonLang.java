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
public class JamonLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "<%--";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "--%>";
        PROPERTY2.NAME = "commentEnd";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.DEFAULT = "LITERAL2";

        IMPORT1.DELEGATE = "INLINE";

        IMPORT2.DELEGATE = "OVERRIDES";

        IMPORT3.DELEGATE = "html::MAIN";


        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "INLINE";
        RULES1.DEFAULT = "LITERAL2";

        SPAN_REGEXP1.DELEGATE = "java::MAIN";
        SPAN_REGEXP1.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP1.HASH_CHAR = "<";

        BEGIN1.text = "<%(args|class|import|java|xargs)>";

        END1.text = "</%$1>";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.DELEGATE = "java::MAIN";
        SPAN_REGEXP2.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP2.HASH_CHAR = "<";

        BEGIN2.text = "<%(?:if|for|java)";

        END2.text = "%>";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "</%(?:if|for)>";
        SEQ_REGEXP1.TYPE = "OPERATOR";
        SEQ_REGEXP1.HASH_CHAR = "<";

        SEQ1.text = "<%else>";
        SEQ1.TYPE = "OPERATOR";

        SPAN_REGEXP3.TYPE = "KEYWORD2";
        SPAN_REGEXP3.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP3.HASH_CHAR = "<";

        BEGIN3.text = "<%(?:abstract|def|doc|escape|extends|frag|method|override)";

        END3.text = ">";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN_REGEXP SPAN_REGEXP4 = new SPAN_REGEXP();
        SPAN_REGEXP4.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP4.HASH_CHAR = "<";

        BEGIN4.text = "</%(?:def|doc|frag|method|override)";

        END4.text = ">";


        SPAN_REGEXP4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "OPERATOR";
        SPAN1.DELEGATE = "java::MAIN";

        BEGIN5.text = "<%";

        END5.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN_REGEXP SPAN_REGEXP5 = new SPAN_REGEXP();
        SPAN_REGEXP5.DELEGATE = "java::MAIN";
        SPAN_REGEXP5.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP5.HASH_CHAR = "<";

        BEGIN6.text = "<&\\|?";

        END6.text = "&>";


        SPAN_REGEXP5.BEGIN = new BEGIN[] { BEGIN6, };

        SEQ SEQ2 = new SEQ();
        SEQ2.text = "</&>";
        SEQ2.TYPE = "OPERATOR";


        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, SPAN_REGEXP4, SPAN_REGEXP5, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "OVERRIDES";
        RULES1.DEFAULT = "LITERAL2";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "MARKUP";
        SPAN1.DELEGATE = "CSS";

        BEGIN1.text = "<style";

        END1.text = "</style>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP1 = new SPAN_REGEXP();
        SPAN_REGEXP1.TYPE = "MARKUP";
        SPAN_REGEXP1.DELEGATE = "JAVASCRIPT";
        SPAN_REGEXP1.HASH_CHAR = "<";

        BEGIN2.text = "<(?i)(script)";

        END2.text = "</$1>";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";
        SPAN2.DELEGATE = "TAGS";

        BEGIN3.text = "<";

        END3.text = ">";


        SPAN2.BEGIN = new BEGIN[] { BEGIN3, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "JAVASCRIPT";
        RULES1.DEFAULT = "LITERAL1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "INLINE";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "INLINE";

        IMPORT2.DELEGATE = "javascript::MAIN";


        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CSS";
        RULES1.DEFAULT = "LITERAL1";

        SPAN1.NO_LINE_BREAK = "TRUE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "INLINE";
        SPAN1.ESCAPE = "\\";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "INLINE";

        IMPORT2.DELEGATE = "css::MAIN";


        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "INLINE_MARKUP";
        RULES1.DEFAULT = "LITERAL1";

        SPAN_REGEXP1.TYPE = "KEYWORD2";
        SPAN_REGEXP1.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP1.HASH_CHAR = "<";

        BEGIN1.text = "<%(?:abstract|def|doc|escape|extends|frag|method|override)";

        END1.text = ">";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP2.HASH_CHAR = "<";

        BEGIN2.text = "</%(?:def|doc|frag|method|override)";

        END2.text = ">";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "OPERATOR";
        SPAN1.DELEGATE = "java::MAIN";

        BEGIN3.text = "<%";

        END3.text = "%>";


        SPAN1.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN_REGEXP SPAN_REGEXP3 = new SPAN_REGEXP();
        SPAN_REGEXP3.DELEGATE = "java::MAIN";
        SPAN_REGEXP3.MATCH_TYPE = "OPERATOR";
        SPAN_REGEXP3.HASH_CHAR = "<";

        BEGIN4.text = "<&\\|?";

        END4.text = "&>";


        SPAN_REGEXP3.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "</&>";
        SEQ1.TYPE = "OPERATOR";


        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, SPAN_REGEXP3, };

        RULES1.SEQ = new SEQ[] { SEQ1, };

        return RULES1;
    }

    private RULES RULES7() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";

        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "INLINE_MARKUP";

        BEGIN1.text = "\"";

        END1.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        IMPORT IMPORT1 = new IMPORT();
        IMPORT1.DELEGATE = "INLINE_MARKUP";

        IMPORT2.DELEGATE = "html::TAGS";


        RULES1.SPAN = new SPAN[] { SPAN1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), RULES7(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}