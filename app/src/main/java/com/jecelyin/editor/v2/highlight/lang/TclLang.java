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
public class TclLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();

        PROPERTY1.VALUE = "{";
        PROPERTY1.NAME = "indentOpenBrackets";

        PROPERTY2.VALUE = "}";
        PROPERTY2.NAME = "indentCloseBrackets";

        PROPERTY3.VALUE = "true";
        PROPERTY3.NAME = "lineUpClosingBracket";

        PROPERTY4.VALUE = "#";
        PROPERTY4.NAME = "lineComment";


        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        RULES1.HIGHLIGHT_DIGITS = "TRUE";
        RULES1.DIGIT_RE = "0x\\p{XDigit}+|\\d+";
        RULES1.IGNORE_CASE = "FALSE";

        EOL_SPAN_REGEXP1.text = "\\\\$";
        EOL_SPAN_REGEXP1.TYPE = "OPERATOR";
        EOL_SPAN_REGEXP1.HASH_CHAR = "\\";

        EOL_SPAN_REGEXP2.text = ";\\s*(?=#)";
        EOL_SPAN_REGEXP2.TYPE = "OPERATOR";
        EOL_SPAN_REGEXP2.DELEGATE = "TCL_COMMENT";
        EOL_SPAN_REGEXP2.HASH_CHAR = ";";

        SPAN_REGEXP1.TYPE = "OPERATOR";
        SPAN_REGEXP1.DELEGATE = "TCL_COMMENT";
        SPAN_REGEXP1.HASH_CHAR = "{";

        BEGIN1.text = "\\{\\s*(?=#)";

        END1.text = "}";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        EOL_SPAN EOL_SPAN1 = new EOL_SPAN();
        EOL_SPAN1.text = "#";
        EOL_SPAN1.AT_WHITESPACE_END = "TRUE";
        EOL_SPAN1.TYPE = "COMMENT1";

        SPAN1.AT_WORD_START = "TRUE";
        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "LITERAL1";
        SPAN1.DELEGATE = "TCL_STRING";

        BEGIN2.text = "\"";

        END2.text = "\"";


        SPAN1.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.TYPE = "NULL";
        SPAN_REGEXP2.DELEGATE = "MAIN";
        SPAN_REGEXP2.HASH_CHAR = "$";

        BEGIN3.text = "\\$(\\w|::)+\\(";

        END3.text = ")";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "NULL";

        BEGIN4.text = "${";

        END4.text = "}";


        SPAN2.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\$(\\w|::)+";
        SEQ_REGEXP1.TYPE = "NULL";
        SEQ_REGEXP1.HASH_CHAR = "$";

        SPAN3.AT_WORD_START = "TRUE";
        SPAN3.NO_LINE_BREAK = "FALSE";
        SPAN3.TYPE = "OPERATOR";
        SPAN3.DELEGATE = "MAIN";

        BEGIN5.text = "{";

        END5.text = "}";


        SPAN3.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN4 = new SPAN();
        SPAN4.NO_LINE_BREAK = "FALSE";
        SPAN4.TYPE = "OPERATOR";
        SPAN4.DELEGATE = "MAIN";

        BEGIN6.text = "[";

        END6.text = "]";


        SPAN4.BEGIN = new BEGIN[] { BEGIN6, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "\\a";
        SEQ1.TYPE = "KEYWORD3";

        SEQ2.text = "\\b";
        SEQ2.TYPE = "KEYWORD3";

        SEQ3.text = "\\f";
        SEQ3.TYPE = "KEYWORD3";

        SEQ4.text = "\\n";
        SEQ4.TYPE = "KEYWORD3";

        SEQ5.text = "\\r";
        SEQ5.TYPE = "KEYWORD3";

        SEQ6.text = "\\t";
        SEQ6.TYPE = "KEYWORD3";

        SEQ7.text = "\\v";
        SEQ7.TYPE = "KEYWORD3";

        SEQ8.text = ";";
        SEQ8.TYPE = "OPERATOR";
        SEQ8.DELEGATE = "MAIN";

        SEQ9.text = "::";
        SEQ9.TYPE = "NULL";

        SEQ10.text = "=";
        SEQ10.TYPE = "OPERATOR";

        SEQ11.text = "!";
        SEQ11.TYPE = "OPERATOR";

        SEQ12.text = ">=";
        SEQ12.TYPE = "OPERATOR";

        SEQ13.text = "<=";
        SEQ13.TYPE = "OPERATOR";

        SEQ14.text = "+";
        SEQ14.TYPE = "OPERATOR";

        SEQ15.text = "-";
        SEQ15.TYPE = "OPERATOR";

        SEQ16.text = "/";
        SEQ16.TYPE = "OPERATOR";

        SEQ17.text = "*";
        SEQ17.TYPE = "OPERATOR";

        SEQ18.text = ">";
        SEQ18.TYPE = "OPERATOR";

        SEQ19.text = "<";
        SEQ19.TYPE = "OPERATOR";

        SEQ20.text = "%";
        SEQ20.TYPE = "OPERATOR";

        SEQ21.text = "&";
        SEQ21.TYPE = "OPERATOR";

        SEQ22.text = "|";
        SEQ22.TYPE = "OPERATOR";

        SEQ23.text = "^";
        SEQ23.TYPE = "OPERATOR";

        SEQ24.text = "~";
        SEQ24.TYPE = "OPERATOR";


        KEYWORDS1.add("KEYWORD2", new String[]{"bind", "button", "canvas", "checkbutton", "destroy", "entry", "focus", "frame", "grab", "image", "label", "listbox", "lower", "menu", "menubutton", "message", "option", "pack", "placer", "radiobutton", "raise", "scale", "scrollbar", "selection", "send", "text", "tk", "tkerror", "tkwait", "toplevel", "update", "winfo", "wm", "debug", "disconnect", "exp_continue", "exp_internal", "exp_open", "exp_pid", "exp_version", "expect", "expect_after", "expect_background", "expect_before", "expect_tty", "expect_user", "fork", "inter_return", "interact", "interpreter", "log_file", "log_user", "match_max", "overlay", "parity", "promptl", "prompt2", "remove_nulls", "send_error", "send_log", "send_tty", "send_user", "sleep", "spawn", "strace", "stty", "system", "timestamp", "trap", "wait", });
        KEYWORDS1.add("KEYWORD3", new String[]{"full_buffer", "timeout", "argv0", "argv", "argc", "tk_version", "tk_library", "tk_strictMotif", "env", "errorCode", "errorInfo", "geometry", "tcl_library", "tcl_patchLevel", "tcl_pkgPath", "tcl_platform", "tcl_precision", "tcl_rcFileName", "tcl_rcRsrcName", "tcl_traceCompile", "tcl_traceExec", "tcl_wordchars", "tcl_nonwordchars", "tcl_version", "tcl_interactive", "exact", "all", "indices", "nocase", "nocomplain", "nonewline", "code", "errorinfo", "errorcode", "atime", "anymore", "args", "body", "compare", "cmdcount", "commands", "ctime", "current", "default", "dev", "dirname", "donesearch", "errorinfo", "executable", "extension", "first", "globals", "gid", "index", "ino", "isdirectory", "isfile", "keep", "last", "level", "length", "library", "locals", "lstat", "match", "mode", "mtime", "names", "nextelement", "nextid", "nlink", "none", "procs", "owned", "range", "readable", "readlink", "redo", "release", "rootname", "script", "show", "size", "startsearch", "stat", "status", "substitute", "tail", "tclversion", "tolower", "toupper", "trim", "trimleft", "trimright", "type", "uid", "variable", "vars", "vdelete", "vinfo", "visibility", "window", "writable", "accelerator", "activeforeground", "activebackground", "anchor", "aspect", "background", "before", "bg", "borderwidth", "bd", "bitmap", "command", "cursor", "default", "expand", "family", "fg", "fill", "font", "force", "foreground", "from", "height", "icon", "question", "warning", "in", "ipadx", "ipady", "justify", "left", "center", "right", "length", "padx", "pady", "offvalue", "onvalue", "orient", "horizontal", "vertical", "outline", "oversrike", "relief", "raised", "sunken", "flat", "groove", "ridge", "solid", "screen", "selectbackground", "selectforeground", "setgrid", "side", "size", "slant", "left", "right", "top", "bottom", "spacing1", "spacing2", "spacing3", "state", "stipple", "takefocus", "tearoff", "textvariable", "title", "to", "type", "abortretryignore", "ok", "okcancel", "retrycancel", "yesno", "yesnocancel", "underline", "value", "variable", "weight", "width", "xscrollcommand", "yscrollcommand", "active", "add", "arc", "aspect", "bitmap", "cascade", "cget", "children", "class", "clear", "client", "create", "colormodel", "command", "configure", "deiconify", "delete", "disabled", "exists", "focusmodel", "flash", "forget", "geometry", "get", "group", "handle", "iconbitmap", "iconify", "iconmask", "iconname", "iconposition", "iconwindow", "idletasks", "insert", "interps", "itemconfigure", "invoke", "line", "mark", "maxsize", "minsize", "move", "name", "normal", "overrideredirect", "oval", "own", "photo", "polygon", "positionfrom", "propagate", "protocol", "ranges", "rectangle", "remove", "resizable", "separator", "slaves", "sizefrom", "state", "tag", "title", "transient", "window", "withdraw", "xview", "yview", "Activate", "Alt", "Any", "B1", "B2", "B3", "Button1", "Button2", "Button3", "ButtonPress", "ButtonRelease", "Double", "Circulate", "Colormap", "Configure", "Control", "Deactivate", "Escape", "Expose", "FocusIn", "FocusOut", "Gravity", "Key", "KeyPress", "KeyRelease", "Lock", "Meta", "Property", "Reparent", "Shift", "Unmap", "Visibility", "Button", "ButtonPress", "ButtonRelease", "Destroy", "Escape", "Enter", "Leave", "Motion", "MenuSelect", "Triple", "all", });
        RULES1.SEQ_REGEXP = new SEQ_REGEXP[] { SEQ_REGEXP1, };

        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, EOL_SPAN_REGEXP2, };

        RULES1.EOL_SPAN = new EOL_SPAN[] { EOL_SPAN1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, SEQ8, SEQ9, SEQ10, SEQ11, SEQ12, SEQ13, SEQ14, SEQ15, SEQ16, SEQ17, SEQ18, SEQ19, SEQ20, SEQ21, SEQ22, SEQ23, SEQ24, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TCL_COMMENT";
        RULES1.DEFAULT = "OPERATOR";

        SEQ_REGEXP1.text = "#.*";
        SEQ_REGEXP1.TYPE = "COMMENT1";
        SEQ_REGEXP1.DELEGATE = "MAIN";
        SEQ_REGEXP1.HASH_CHAR = "#";


        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TCL_STRING";
        RULES1.DEFAULT = "LITERAL1";
        RULES1.ESCAPE = "\\";


        PROPERTY1.VALUE = "";
        PROPERTY1.NAME = "indentOpenBrackets";

        PROPERTY2.VALUE = "";
        PROPERTY2.NAME = "indentCloseBrackets";


        EOL_SPAN_REGEXP EOL_SPAN_REGEXP1 = new EOL_SPAN_REGEXP();
        EOL_SPAN_REGEXP1.text = "\\\\$";
        EOL_SPAN_REGEXP1.TYPE = "OPERATOR";
        EOL_SPAN_REGEXP1.HASH_CHAR = "\\";

        SPAN_REGEXP1.TYPE = "NULL";
        SPAN_REGEXP1.DELEGATE = "MAIN";
        SPAN_REGEXP1.HASH_CHAR = "$";

        BEGIN1.text = "\\$(\\w|::)+\\(";

        END1.text = ")";


        SPAN_REGEXP1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN_REGEXP SPAN_REGEXP2 = new SPAN_REGEXP();
        SPAN_REGEXP2.TYPE = "NULL";
        SPAN_REGEXP2.DELEGATE = "MAIN";
        SPAN_REGEXP2.HASH_CHAR = "$";

        BEGIN2.text = "\\$\\{";

        END2.text = "}";


        SPAN_REGEXP2.BEGIN = new BEGIN[] { BEGIN2, };

        SEQ_REGEXP SEQ_REGEXP1 = new SEQ_REGEXP();
        SEQ_REGEXP1.text = "\\$(\\w|::)+";
        SEQ_REGEXP1.TYPE = "NULL";
        SEQ_REGEXP1.HASH_CHAR = "$";

        SPAN1.NO_LINE_BREAK = "FALSE";
        SPAN1.TYPE = "OPERATOR";
        SPAN1.DELEGATE = "MAIN";

        BEGIN3.text = "[";

        END3.text = "]";


        SPAN1.BEGIN = new BEGIN[] { BEGIN3, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "\\a";
        SEQ1.TYPE = "KEYWORD3";

        SEQ2.text = "\\b";
        SEQ2.TYPE = "KEYWORD3";

        SEQ3.text = "\\f";
        SEQ3.TYPE = "KEYWORD3";

        SEQ4.text = "\\n";
        SEQ4.TYPE = "KEYWORD3";

        SEQ5.text = "\\r";
        SEQ5.TYPE = "KEYWORD3";

        SEQ6.text = "\\t";
        SEQ6.TYPE = "KEYWORD3";

        SEQ7.text = "\\v";
        SEQ7.TYPE = "KEYWORD3";


        RULES1.EOL_SPAN_REGEXP = new EOL_SPAN_REGEXP[] { EOL_SPAN_REGEXP1, };

        RULES1.SPAN = new SPAN[] { SPAN1, };

        RULES1.PROPS = new PROPS[] { PROPS1, };

        RULES1.SPAN_REGEXP = new SPAN_REGEXP[] { SPAN_REGEXP1, SPAN_REGEXP2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}