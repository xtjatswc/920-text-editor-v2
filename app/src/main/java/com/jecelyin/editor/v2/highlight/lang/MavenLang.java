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
public class MavenLang implements LangDefine {
        private PROPS PROPS1() {
        PROPS PROPS1 = new PROPS();
        PROPERTY PROPERTY1 = new PROPERTY();
        PROPERTY1.VALUE = "<!--";
        PROPERTY1.NAME = "commentStart";
        PROPERTY PROPERTY2 = new PROPERTY();
        PROPERTY2.VALUE = "-->";
        PROPERTY2.NAME = "commentEnd";
        PROPS1.PROPERTY = new PROPERTY[] { PROPERTY1, PROPERTY2, };

        return PROPS1;
    }

    private RULES RULES1() {
        RULES RULES1 = new RULES();
        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "COMMENT1";
        BEGIN BEGIN1 = new BEGIN();
        BEGIN1.text = "<!--";
        END END1 = new END();
        END1.text = "-->";
        SPAN1.END = new END[] { END1, };

        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "KEYWORD4";
        BEGIN BEGIN2 = new BEGIN();
        BEGIN2.text = "${";
        END END2 = new END();
        END2.text = "}";
        SPAN2.END = new END[] { END2, };

        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "KEYWORD2";
        SPAN3.DELEGATE = "ENTITY-TAGS";
        BEGIN BEGIN3 = new BEGIN();
        BEGIN3.text = "<!ENTITY";
        END END3 = new END();
        END3.text = ">";
        SPAN3.END = new END[] { END3, };

        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD2";
        SPAN4.DELEGATE = "CDATA";
        BEGIN BEGIN4 = new BEGIN();
        BEGIN4.text = "<![CDATA[";
        END END4 = new END();
        END4.text = "]]>";
        SPAN4.END = new END[] { END4, };

        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "KEYWORD2";
        SPAN5.DELEGATE = "DTD-TAGS";
        BEGIN BEGIN5 = new BEGIN();
        BEGIN5.text = "<!";
        END END5 = new END();
        END5.text = ">";
        SPAN5.END = new END[] { END5, };

        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "KEYWORD3";
        BEGIN BEGIN6 = new BEGIN();
        BEGIN6.text = "<?";
        END END6 = new END();
        END6.text = ">";
        SPAN6.END = new END[] { END6, };

        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SPAN SPAN7 = new SPAN();
        SPAN7.TYPE = "MARKUP";
        SPAN7.DELEGATE = "TAGS";
        BEGIN BEGIN7 = new BEGIN();
        BEGIN7.text = "<";
        END END7 = new END();
        END7.text = ">";
        SPAN7.END = new END[] { END7, };

        SPAN7.BEGIN = new BEGIN[] { BEGIN7, };

        SPAN SPAN8 = new SPAN();
        SPAN8.NO_WORD_BREAK = "TRUE";
        SPAN8.TYPE = "LITERAL2";
        BEGIN BEGIN8 = new BEGIN();
        BEGIN8.text = "&";
        END END8 = new END();
        END8.text = ";";
        SPAN8.END = new END[] { END8, };

        SPAN8.BEGIN = new BEGIN[] { BEGIN8, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("KEYWORD4", new String[]{"true", "false", "default", });
        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, SPAN7, SPAN8, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES2() {
        RULES RULES1 = new RULES();
        RULES1.SET = "TAGS";
        RULES1.DEFAULT = "MARKUP";
        RULES1.NO_WORD_SEP = "-_";
        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "COMMENT1";
        BEGIN BEGIN1 = new BEGIN();
        BEGIN1.text = "<!--";
        END END1 = new END();
        END1.text = "-->";
        SPAN1.END = new END[] { END1, };

        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "LITERAL1";
        SPAN2.DELEGATE = "STRING";
        BEGIN BEGIN2 = new BEGIN();
        BEGIN2.text = "\"";
        END END2 = new END();
        END2.text = "\"";
        SPAN2.END = new END[] { END2, };

        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        SPAN3.DELEGATE = "STRING";
        BEGIN BEGIN3 = new BEGIN();
        BEGIN3.text = "'";
        END END3 = new END();
        END3.text = "'";
        SPAN3.END = new END[] { END3, };

        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "KEYWORD4";
        BEGIN BEGIN4 = new BEGIN();
        BEGIN4.text = "${";
        END END4 = new END();
        END4.text = "}";
        SPAN4.END = new END[] { END4, };

        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "/>";
        SEQ1.TYPE = "MARKUP";
        SEQ1.DELEGATE = "maven::MAIN";
        MARK_PREVIOUS MARK_PREVIOUS1 = new MARK_PREVIOUS();
        MARK_PREVIOUS1.text = ":";
        MARK_PREVIOUS1.TYPE = "LABEL";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = ":";
        SEQ2.TYPE = "OPERATOR";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("KEYWORD1", new String[]{"project", });
        KEYWORDS1.add("KEYWORD2", new String[]{"basedir", "project.baseUri", "maven.build.timestamp", "maven.build.timestamp.format", "activation", "activeByDefault", "address", "arch", "archive", "artifactId", "build", "checksumPolicy", "ciManagement", "classifier", "comments", "configuration", "connection", "contributors", "defaultGoal", "dependencies", "dependencyManagement", "description", "developerConnection", "developers", "directory", "distribution", "distributionManagement", "downloadUrl", "email", "enabled", "excludeDefaults", "excludes", "exclusions", "executions", "exists", "extensions", "family", "file", "filtering", "filters", "finalName", "goals", "groupId", "id", "inceptionYear", "includes", "inherited", "issueManagement", "jdk", "layout", "licenses", "mailingLists", "maven", "message", "missing", "modelVersion", "modules", "name", "notifiers", "optional", "organization", "organizationUrl", "os", "otherArchives", "outputDirectory", "packaging", "parent", "phase", "pluginManagement", "pluginRepositories", "plugins", "post", "prerequisites", "profiles", "properties", "property", "relativePath", "releases", "relocation", "reportSets", "reporting", "reports", "repositories", "repository", "resources", "roles", "scm", "scope", "scriptSourceDirectory", "sendOnError", "sendOnFailure", "sendOnSuccess", "sendOnWarning", "site", "snapshotRepository", "snapshots", "sourceDirectory", "status", "subscribe", "system", "systemPath", "tag", "targetPath", "testOutputDirectory", "testResources", "testSourceDirectory", "timezone", "type", "uniqueVersion", "unsubscribe", "updatePolicy", "url", "value", "version", });
        KEYWORDS1.add("KEYWORD3", new String[]{"contributor", "dependency", "developer", "exclude", "exclusion", "execution", "extension", "filter", "goal", "include", "license", "mailingList", "module", "notifier", "otherArchive", "plugin", "pluginRepository", "profile", "report", "reportSet", "repository", "resource", "role", "testResource", });
        RULES1.MARK_PREVIOUS = new MARK_PREVIOUS[] { MARK_PREVIOUS1, };

        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES3() {
        RULES RULES1 = new RULES();
        RULES1.SET = "DTD-TAGS";
        RULES1.DEFAULT = "KEYWORD2";
        RULES1.IGNORE_CASE = "FALSE";
        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "COMMENT1";
        BEGIN BEGIN1 = new BEGIN();
        BEGIN1.text = "<!--";
        END END1 = new END();
        END1.text = "-->";
        SPAN1.END = new END[] { END1, };

        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";
        BEGIN BEGIN2 = new BEGIN();
        BEGIN2.text = "--";
        END END2 = new END();
        END2.text = "--";
        SPAN2.END = new END[] { END2, };

        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.NO_WORD_BREAK = "TRUE";
        SPAN3.TYPE = "LITERAL2";
        BEGIN BEGIN3 = new BEGIN();
        BEGIN3.text = "%";
        END END3 = new END();
        END3.text = ";";
        SPAN3.END = new END[] { END3, };

        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL1";
        BEGIN BEGIN4 = new BEGIN();
        BEGIN4.text = "\"";
        END END4 = new END();
        END4.text = "\"";
        SPAN4.END = new END[] { END4, };

        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SPAN SPAN5 = new SPAN();
        SPAN5.TYPE = "LITERAL1";
        BEGIN BEGIN5 = new BEGIN();
        BEGIN5.text = "'";
        END END5 = new END();
        END5.text = "'";
        SPAN5.END = new END[] { END5, };

        SPAN5.BEGIN = new BEGIN[] { BEGIN5, };

        SPAN SPAN6 = new SPAN();
        SPAN6.TYPE = "KEYWORD2";
        SPAN6.DELEGATE = "MAIN";
        BEGIN BEGIN6 = new BEGIN();
        BEGIN6.text = "[";
        END END6 = new END();
        END6.text = "]";
        SPAN6.END = new END[] { END6, };

        SPAN6.BEGIN = new BEGIN[] { BEGIN6, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "(";
        SEQ1.TYPE = "OPERATOR";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = ")";
        SEQ2.TYPE = "OPERATOR";
        SEQ SEQ3 = new SEQ();
        SEQ3.text = "|";
        SEQ3.TYPE = "OPERATOR";
        SEQ SEQ4 = new SEQ();
        SEQ4.text = "?";
        SEQ4.TYPE = "OPERATOR";
        SEQ SEQ5 = new SEQ();
        SEQ5.text = "*";
        SEQ5.TYPE = "OPERATOR";
        SEQ SEQ6 = new SEQ();
        SEQ6.text = "+";
        SEQ6.TYPE = "OPERATOR";
        SEQ SEQ7 = new SEQ();
        SEQ7.text = ",";
        SEQ7.TYPE = "OPERATOR";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("KEYWORD1", new String[]{"CDATA", "EMPTY", "INCLUDE", "IGNORE", "NDATA", "#IMPLIED", "#PCDATA", "#REQUIRED", });
        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, SPAN5, SPAN6, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, SEQ3, SEQ4, SEQ5, SEQ6, SEQ7, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES4() {
        RULES RULES1 = new RULES();
        RULES1.SET = "ENTITY-TAGS";
        RULES1.DEFAULT = "KEYWORD2";
        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "COMMENT1";
        BEGIN BEGIN1 = new BEGIN();
        BEGIN1.text = "<!--";
        END END1 = new END();
        END1.text = "-->";
        SPAN1.END = new END[] { END1, };

        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SPAN SPAN2 = new SPAN();
        SPAN2.TYPE = "COMMENT1";
        BEGIN BEGIN2 = new BEGIN();
        BEGIN2.text = "--";
        END END2 = new END();
        END2.text = "--";
        SPAN2.END = new END[] { END2, };

        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        SPAN SPAN3 = new SPAN();
        SPAN3.TYPE = "LITERAL1";
        BEGIN BEGIN3 = new BEGIN();
        BEGIN3.text = "\"";
        END END3 = new END();
        END3.text = "\"";
        SPAN3.END = new END[] { END3, };

        SPAN3.BEGIN = new BEGIN[] { BEGIN3, };

        SPAN SPAN4 = new SPAN();
        SPAN4.TYPE = "LITERAL1";
        BEGIN BEGIN4 = new BEGIN();
        BEGIN4.text = "'";
        END END4 = new END();
        END4.text = "'";
        SPAN4.END = new END[] { END4, };

        SPAN4.BEGIN = new BEGIN[] { BEGIN4, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "=";
        SEQ1.TYPE = "OPERATOR";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = "%";
        SEQ2.TYPE = "OPERATOR";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("KEYWORD1", new String[]{"SYSTEM", });
        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, SPAN3, SPAN4, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES5() {
        RULES RULES1 = new RULES();
        RULES1.SET = "CDATA";
        RULES1.DEFAULT = "COMMENT2";
        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("LITERAL2", new String[]{"true", "yes", "false", });
        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    private RULES RULES6() {
        RULES RULES1 = new RULES();
        RULES1.SET = "STRING";
        RULES1.DEFAULT = "LITERAL1";
        SPAN SPAN1 = new SPAN();
        SPAN1.TYPE = "KEYWORD4";
        BEGIN BEGIN1 = new BEGIN();
        BEGIN1.text = "${";
        END END1 = new END();
        END1.text = "}";
        SPAN1.END = new END[] { END1, };

        SPAN1.BEGIN = new BEGIN[] { BEGIN1, };

        SEQ SEQ1 = new SEQ();
        SEQ1.text = "\\\"";
        SEQ1.TYPE = "NULL";
        SEQ SEQ2 = new SEQ();
        SEQ2.text = "\"";
        SEQ2.TYPE = "MARKUP";
        SEQ2.DELEGATE = "TAGS";
        SPAN SPAN2 = new SPAN();
        SPAN2.NO_WORD_BREAK = "TRUE";
        SPAN2.TYPE = "LITERAL2";
        BEGIN BEGIN2 = new BEGIN();
        BEGIN2.text = "&";
        END END2 = new END();
        END2.text = ";";
        SPAN2.END = new END[] { END2, };

        SPAN2.BEGIN = new BEGIN[] { BEGIN2, };

        KEYWORDS KEYWORDS1 = new KEYWORDS();
        KEYWORDS1.add("LITERAL2", new String[]{"true", "yes", "false", });
        RULES1.SPAN = new SPAN[] { SPAN1, SPAN2, };

        RULES1.SEQ = new SEQ[] { SEQ1, SEQ2, };

        RULES1.KEYWORDS = new KEYWORDS[] { KEYWORDS1, };

        return RULES1;
    }

    public RULES[] RULES() {
        return new RULES[] {RULES1(), RULES2(), RULES3(), RULES4(), RULES5(), RULES6(), };
    }

    public PROPS[] PROPS() {
        return new PROPS[] {PROPS1(), };
    }


}
