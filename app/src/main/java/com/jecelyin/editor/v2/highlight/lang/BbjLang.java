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
public class BbjLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = ",+-=<>/?^&*";
        PROPERTY3.NAME = "wordBreakChars";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.NO_LINE_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL1";
        SPAN2.ESCAPE = "\\";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "//";
        EOL_SPAN1.TYPE = "COMMENT2";

        EOL_SPAN2.text = "REM";
        EOL_SPAN2.TYPE = "COMMENT2";

        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = ">=";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = "<=";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = "+";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "-";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "/";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = "*";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = ">";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "<";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "<>";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "^";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "and";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "or";
        SEQ13.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        MARK_PREVIOUS1.AT_LINE_START = "TRUE";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        MARK_PREVIOUS2.text = "(";
        MARK_PREVIOUS2.TYPE = "FUNCTION";
        MARK_PREVIOUS2.MATCH_TYPE = "OPERATOR";

        SEQ14.text = ")";
        SEQ14.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"CHDIR", "CISAM", "CLOSE", "CONTINUE", "DIRECT", "DIR", "DISABLE", "DOM", "DUMP", "ENABLE", "END", "ENDTRACE", "ERASE", "EXTRACT", "FID", "FILE", "FIN", "FIND", "FROM", "IND", "INDEXED", "INPUT", "INPUTE", "INPUTN", "IOL", "IOLIST", "KEY", "KEYF", "KEYL", "KEYN", "KEYP", "KGEN", "KNUM", "LIST", "LOAD", "LOCK", "MERGE", "MKDIR", "MKEYED", "OPEN", "PREFIX", "PRINT", "READ_RESOURCE", "READ", "RECORD", "REMOVE", "RENAME", "RESCLOSE", "RESFIRST", "RESGET", "RESINFO", "RESNEXT", "RESOPEN", "REV", "RMDIR", "SAVE", "SELECT", "SERIAL", "SETDAY", "SETDRIVE", "SETTRACE", "SIZ", "SORT", "SQLCHN", "SQLCLOSE", "SQLERR", "SQLEXEC", "SQLFETCH", "SQLLIST", "SQLOPEN", "SQLPREP", "SQLSET", "SQLTABLES", "SQLTMPL", "SQLUNT", "STRING", "TABLE", "TBL", "TIM", "UNLOCK", "WHERE", "WRITE", "XFID", "XFILE", "XFIN", });
        KEYWORDS1.add("KEYWORD3", new String[]{"ADDR", "ALL", "AUTO", "BEGIN", "BREAK", "CALL", "CASE", "CHN", "CLEAR", "CTL", "DATA", "DAY", "DEF", "DEFAULT", "DEFEND", "DELETE", "DIM", "DREAD", "DROP", "EDIT", "ELSE", "ENDIF", "ENTER", "ERR", "ESCAPE", "ESCOFF", "ESCON", "EXECUTE", "EXIT", "EXITTO", "FI", "FOR", "GOSUB", "GOTO", "IF", "IFF", "INITFILE", "IOR", "LET", "NEXT", "NOT", "ON", "OPTS", "OR", "PFX", "PRECISION", "RELEASE", "RENUM", "REPEAT", "RESET", "RESTORE", "RETRY", "RETURN", "RUN", "SET_CASE_SENSITIVE_OFF", "SET_CASE_SENSITIVE_ON", "SETERR", "SETESC", "SETOPTS", "SETTIME", "SSN", "START", "STEP", "STOP", "SWEND", "SWITCH", "THEN", "TO", "UNT", "UNTIL", "WAIT", "WEND", "WHILE", "XOR", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, MARK_PREVIOUS2, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

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