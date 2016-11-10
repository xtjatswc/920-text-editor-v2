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
public class MacroschedulerLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "/*";
        PROPERTY1.NAME = "commentStart";

        PROPERTY2.VALUE = "*/";
        PROPERTY2.NAME = "commentEnd";

        PROPERTY3.VALUE = "//";
        PROPERTY3.NAME = "lineComment";

        PROPERTY4.VALUE = "{";
        PROPERTY4.NAME = "indentOpenBrackets";

        PROPERTY5.VALUE = "}";
        PROPERTY5.NAME = "indentCloseBrackets";

        PROPERTY6.VALUE = "(";
        PROPERTY6.NAME = "unalignedOpenBrackets";

        PROPERTY7.VALUE = ")";
        PROPERTY7.NAME = "unalignedCloseBrackets";

        PROPERTY8.VALUE = "\\s*(((if|while)\\s*\\(|else\\s*|else\\s+if\\s*\\(|for\\s*\\(.*\\))[^{;]*)";
        PROPERTY8.NAME = "indentNextLine";

        PROPERTY9.VALUE = "^.*(default:\\s*|case.*:.*)$";
        PROPERTY9.NAME = "unindentThisLine";

        PROPERTY10.VALUE = ":";
        PROPERTY10.NAME = "electricKeys";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "(0x[\\p{XDigit}]+[lL]?|[\\p{Digit}]+(e[\\p{Digit}]*)?[lLdDfF]?)";
        RULES1.IGNORE_CASE = "FALSE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "/*";

        END1.text = "*/";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "///";
        EOL_SPAN1.TYPE = "COMMENT3";
        EOL_SPAN1.DELEGATE = "DOC_COMMENT";

        EOL_SPAN2.text = "//";
        EOL_SPAN2.TYPE = "COMMENT2";

        EOL_SPAN3.text = "///";
        EOL_SPAN3.TYPE = "COMMENT4";

        SPAN2.NO_LINE_BREAK = "FALSE";
        SPAN2.TYPE = "LITERAL3";

        BEGIN2.text = "@\"";

        END2.text = "\"";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_LINE_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL1";
        SPAN3.ESCAPE = "\\";

        BEGIN3.text = "\"";

        END3.text = "\"";


        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "TRUE";
        SPAN4.TYPE = "LITERAL1";
        SPAN4.ESCAPE = "\\";

        BEGIN4.text = "'";

        END4.text = "'";


        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        EOL_SPAN EOL_SPAN4 = new EOL_SPAN();
        EOL_SPAN4.text = "#if";
        EOL_SPAN4.TYPE = "KEYWORD2";

        EOL_SPAN5.text = "#else";
        EOL_SPAN5.TYPE = "KEYWORD2";

        EOL_SPAN6.text = "#endif";
        EOL_SPAN6.TYPE = "KEYWORD2";

        SEQ1.text = "~";
        SEQ1.TYPE = "OPERATOR";

        SEQ2.text = "!";
        SEQ2.TYPE = "OPERATOR";

        SEQ3.text = ":";
        SEQ3.TYPE = "OPERATOR";

        SEQ4.text = ";";
        SEQ4.TYPE = "OPERATOR";

        SEQ5.text = "{";
        SEQ5.TYPE = "OPERATOR";

        SEQ6.text = "}";
        SEQ6.TYPE = "OPERATOR";

        SEQ7.text = ",";
        SEQ7.TYPE = "OPERATOR";

        SEQ8.text = ".";
        SEQ8.TYPE = "OPERATOR";

        SEQ9.text = "!";
        SEQ9.TYPE = "OPERATOR";

        SEQ10.text = "[";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "]";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = "+";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "-";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = ">";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "<";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "=";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "*";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = "/";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "\\";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "^";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "|";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "&";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "%";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "?";
        SEQ24.TYPE = "OPERATOR";

        MARK_PREVIOUS1.text = "(";
        MARK_PREVIOUS1.TYPE = "FUNCTION";
        MARK_PREVIOUS1.MATCH_TYPE = "OPERATOR";

        SEQ25.text = ")";
        SEQ25.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD1", new String[]{"AddDialogHandler", "AddTrayHandler", "AddTrayIcon", "AppendFile", "ArrayCount", "ArraySort", "Ascii", "Ask", "Assigned", "BlockInput", "CSVFileToArray", "CapsOff", "CapsOn", "ChangeDirectory", "CloseDialog", "CloseWindow", "CompareBitmaps", "ConCat", "CopyFile", "CopyFolder", "CountFiles", "CreateDir", "Crypt", "DBClose", "DBConnect", "DBExec", "DBQuery", "DDEPoke", "DDERequest", "DateStamp", "Day", "DayOfWeek", "DelTrayIcon", "DeleteFile", "DeleteFolder", "Dialog", "EditIniFile", "Else", "End", "EndDialog", "EndIf", "EndWhile", "ExecuteFile", "Exit", "ExportData", "ExtractFileExt", "ExtractFileName", "ExtractFilePath", "FTPDelFile", "FTPGetDirList", "FTPGetFile", "FTPMakeDir", "FTPPutFile", "FTPRemoveDir", "FTPRenameFile", "FileDate", "FileSize", "FileTime", "FindImagePos", "FindWindowWithText", "GetActiveWindow", "GetCaretPos", "GetCheckBox", "GetClipBoard", "GetControlText", "GetCursorPos", "GetDate", "GetDialogAction", "GetDialogProperty", "GetEnvVar", "GetFileList", "GetFocusedObject", "GetListItem", "GetPixelColor", "GetRectCheckSum", "GetScreenRes", "GetTextAtPoint", "GetTextInRect", "GetTextReset", "GetTime", "GetTreeNode", "GetWindowHandle", "GetWindowList", "GetWindowNames", "GetWindowPos", "GetWindowProcess", "GetWindowSize", "GetWindowText", "GetWindowTextEx", "GoSub", "Goto", "HTTPRequest", "Hour", "If", "IfDirExists", "IfFileChanged", "IfFileExists", "IfWindowOpen", "Input", "IsConnectedToInternet", "KillProcess", "LClick", "LDblClick", "LDown", "LTrim", "LUp", "LabelToVar", "Len", "Length", "LibFree", "LibFunc", "LibFuncW", "LibLoad", "LowerCase", "MClick", "MDblClick", "MDown", "MUp", "Macro", "Message", "MessageModal", "MidStr", "Min", "Month", "MouseMove", "MouseMoveRel", "MouseOver", "MoveFile", "MoveWindow", "NumOff", "NumOn", "OnEvent", "PlayWav", "Position", "Press", "ProcessExists", "PushButton", "PutClipBoard", "RClick", "RDblClick", "RDown", "RGB", "RTrim", "RUp", "ReadFile", "ReadIniFile", "ReadLn", "RegEx", "RegistryDelKey", "RegistryDelVal", "RegistryReadKey", "RegistryWriteKey", "Release", "Remark", "RenameFile", "Repeat", "ResetDialogAction", "ResizeWindow", "RetrievePOP3", "RunProgram", "SMTPSendMail", "ScreenCapture", "ScrollOff", "ScrollOn", "Sec", "SelectMenu", "Send", "SendText", "Separate", "SetCheckBox", "SetControlText", "SetDialogObjectColor", "SetDialogObjectFocus", "SetDialogObjectFont", "SetDialogObjectVisible", "SetDialogProperty", "SetEnvVar", "SetFocus", "Show", "ShutDownWindows", "SkipLabel", "SoWrite", "SoWriteLn", "StringReplace", "TelnetClose", "TelnetConnect", "TelnetSend", "TelnetWaitFor", "TimeStamp", "Toolbar", "Trim", "Until", "UpperCase", "Wait", "WaitClipBoard", "WaitCursorChanged", "WaitKeyDown", "WaitPixelColor", "WaitProcessExists", "WaitProcessTerminated", "WaitReady", "WaitRectChanged", "WaitScreenImage", "WaitScreenText", "WaitWindowChanged", "WaitWindowClosed", "WaitWindowOpen", "While", "WindowAction", "WriteLn", "XLAddSheet", "XLCreate", "XLDelCol", "XLDelRow", "XLDelSheet", "XLGetCell", "XLGetSheetDims", "XLOpen", "XLQuit", "XLRun", "XLSave", "XLSetCell", "Year", });
        KEYWORDS1.add("KEYWORD2", new String[]{"Include", "Label", "VBEnd", "VBEval", "VBRun", "VBStart", });
        KEYWORDS1.add("KEYWORD3", new String[]{"Abs", "Add", "ArcTan", "Cos", "Exp", "Frac", "Int", "Let", "Ln", "Pi", "Power", "Random", "Round", "Sin", "Sqr", "Sqrt", "Sub", "Trunc", "Base64", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, EOL_SPAN2, EOL_SPAN3, EOL_SPAN4, EOL_SPAN5, EOL_SPAN6, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, SEQ25, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DOC_COMMENT";
        RULES1.DEFAULT = "COMMENT3";
        RULES1.IGNORE_CASE = "TRUE";

        SPAN1.TYPE = "COMMENT1";

        BEGIN1.text = "<--";

        END1.text = "-->";


        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "MARKUP";
        SPAN2.DELEGATE = "xml::TAGS";

        BEGIN2.text = "<";

        END2.text = ">";


        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}