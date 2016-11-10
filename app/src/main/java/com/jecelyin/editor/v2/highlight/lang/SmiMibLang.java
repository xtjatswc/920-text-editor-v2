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
public class SmiMibLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();
        PROPERTY PROPERTY1 = new PROPERTY();
        PROPERTY1.VALUE = "--";
        PROPERTY1.NAME = "lineComment";
        PROPERTY PROPERTY2 = new PROPERTY();
        PROPERTY2.VALUE = "-_";
        PROPERTY2.NAME = "noWordSep";
        PROPERTY PROPERTY3 = new PROPERTY();
        PROPERTY3.VALUE = "{";
        PROPERTY3.NAME = "indentOpenBrackets";
        PROPERTY PROPERTY4 = new PROPERTY();
        PROPERTY4.VALUE = "}";
        PROPERTY4.NAME = "indentCloseBrackets";
        PROPERTY PROPERTY5 = new PROPERTY();
        PROPERTY5.VALUE = ".*::=\\s*\\{.*\\}\\s*$";
        PROPERTY5.NAME = "unindentNextLines";
        PROPERTY PROPERTY6 = new PROPERTY();
        PROPERTY6.VALUE = ".*(::=|AGENT-CAPABILITIES|DESCRIPTION|IMPORTS|MODULE-COMPLIANCE|MODULE-IDENTITY|NOTIFICATION-GROUP|NOTIFICATION-TYPE|OBJECT-GROUP|OBJECT-IDENTITY|OBJECT-TYPE|TEXTUAL-CONVENTION)\\s*$";
        PROPERTY6.NAME = "indentNextLines";
        PROPS1.PROPERTY = new PROPERTY[] { PROPERTY1, PROPERTY2, PROPERTY3, PROPERTY4, PROPERTY5, PROPERTY6, };

        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.IGNORE_CASE = "FALSE";
        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "--";
        EOL_SPAN1.TYPE = "COMMENT1";
        SPAN SPAN1 = new SPAN();
        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        BEGIN BEGIN1 = new BEGIN();
        BEGIN1.text = "\"";
        END END1 = new END();
        END1.text = "\"";
        SPAN1.END = new END[] { END1, };

        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "::=";
        SEQ1.TYPE = "OPERATOR";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = "}";
        SEQ2.TYPE = "OPERATOR";
        SEQ SEQ3 = new SEQ();
        SEQ3.text = "{";
        SEQ3.TYPE = "OPERATOR";
        SEQ SEQ4 = new SEQ();
        SEQ4.text = "OBJECT IDENTIFIER";
        SEQ4.TYPE = "KEYWORD2";
        SEQ SEQ5 = new SEQ();
        SEQ5.text = "SEQUENCE OF";
        SEQ5.TYPE = "KEYWORD2";
        SEQ SEQ6 = new SEQ();
        SEQ6.text = "OCTET STRING";
        SEQ6.TYPE = "KEYWORD2";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("KEYWORD1", new String[]{"ACCESS", "AUGMENTS", "CONTACT-INFO", "CREATION-REQUIRES", "DEFINITIONS", "DEFVAL", "DESCRIPTION", "DISPLAY-HINT", "GROUP", "INCLUDES", "INDEX", "LAST-UPDATED", "MANDATORY-GROUPS", "MAX-ACCESS", "MIN-ACCESS", "MODULE", "NOTIFICATIONS", "OBJECT", "OBJECTS", "ORGANIZATION", "PRODUCT-RELEASE", "REFERENCE", "REVISION", "STATUS", "SYNTAX", "SUPPORTS", "UNITS", "VARIATION", "WRITE-SYNTAX", });
        KEYWORDS1.add("FUNCTION", new String[]{"AGENT-CAPABILITIES", "BEGIN", "END", "FROM", "IMPORTS", "MODULE-COMPLIANCE", "MODULE-IDENTITY", "NOTIFICATION-GROUP", "NOTIFICATION-TYPE", "OBJECT-GROUP", "OBJECT-IDENTITY", "OBJECT-TYPE", "TEXTUAL-CONVENTION", });
        KEYWORDS1.add("KEYWORD2", new String[]{"AutonomousType", "BITS", "Counter32", "Counter64", "DateAndTime", "DisplayString", "Gauge32", "InstancePointer", "INTEGER", "Integer32", "IpAddress", "MacAddress", "Opaque", "PhysAddress", "RowPointer", "RowStatus", "SEQUENCE", "TAddress", "TDomain", "TestAndIncr", "TimeInterval", "TimeStamp", "TimeTicks", "TruthValue", "StorageType", "Unsigned32", "VariablePointer", });
        KEYWORDS1.add("KEYWORD3", new String[]{"accessible-for-notify", "current", "deprecated", "not-accessible", "obsolete", "read-create", "read-only", "read-write", "SIZE", });
        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, };

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
