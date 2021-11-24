/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package se.clau.yang.lexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;
import se.clau.yang.psi.YangTypes;

%%

%{
  public _YangLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _YangLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType


LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace = {LineTerminator} | [ \t\f]

Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*


ESC = "\\"[^ ]
CHAR = {ESC} | [^\'\"\\]
STRING_BAD1 = \" ({CHAR} | \') *
STRING_BAD2 = \' ({CHAR} | \") *
StringLiteral = {STRING_BAD1} \" | {STRING_BAD2} \' | {Identifier}

Identifier = [/.a-zA-Z_0-9\-][a-zA-Z0-9_\-.:]*

%state VALUE_MODE

%%
<YYINITIAL> {
  ";"                     { return YangTypes.YANG_SEMICOLON; }
  "+"                     { return YangTypes.YANG_PLUS; }
  "{"                     { return YangTypes.YANG_LEFT_BRACE; }
  "}"                     { return YangTypes.YANG_RIGHT_BRACE; }
  "anyxml"                { yybegin(VALUE_MODE); return YangTypes.YANG_ANYXML_KEYWORD; }
  "argument"              { yybegin(VALUE_MODE); return YangTypes.YANG_ARGUMENT_KEYWORD; }
  "augment"               { yybegin(VALUE_MODE); return YangTypes.YANG_AUGMENT_KEYWORD; }
  "base"                  { yybegin(VALUE_MODE); return YangTypes.YANG_BASE_KEYWORD; }
  "belongs-to"            { yybegin(VALUE_MODE); return YangTypes.YANG_BELONGS_TO_KEYWORD; }
  "bit"                   { yybegin(VALUE_MODE); return YangTypes.YANG_BIT_KEYWORD; }
  "case"                  { yybegin(VALUE_MODE); return YangTypes.YANG_CASE_KEYWORD; }
  "choice"                { yybegin(VALUE_MODE); return YangTypes.YANG_CHOICE_KEYWORD; }
  "config"                { yybegin(VALUE_MODE); return YangTypes.YANG_CONFIG_KEYWORD; }
  "contact"               { yybegin(VALUE_MODE); return YangTypes.YANG_CONTACT_KEYWORD; }
  "container"             { yybegin(VALUE_MODE); return YangTypes.YANG_CONTAINER_KEYWORD; }
  "default"               { yybegin(VALUE_MODE); return YangTypes.YANG_DEFAULT_KEYWORD; }
  "description"           { yybegin(VALUE_MODE); return YangTypes.YANG_DESCRIPTION_KEYWORD; }
  "enum"                  { yybegin(VALUE_MODE); return YangTypes.YANG_ENUM_KEYWORD; }
  "error-app_tag"         { yybegin(VALUE_MODE); return YangTypes.YANG_ERROR_APP_TAG_KEYWORD; }
  "error-message"         { yybegin(VALUE_MODE); return YangTypes.YANG_ERROR_MESSAGE_KEYWORD; }
  "extension"             { yybegin(VALUE_MODE); return YangTypes.YANG_EXTENSION_KEYWORD; }
  "deviation"             { yybegin(VALUE_MODE); return YangTypes.YANG_DEVIATION_KEYWORD; }
  "deviate"               { yybegin(VALUE_MODE); return YangTypes.YANG_DEVIATE_KEYWORD; }
  "feature"               { yybegin(VALUE_MODE); return YangTypes.YANG_FEATURE_KEYWORD; }
  "fraction-digits"       { yybegin(VALUE_MODE); return YangTypes.YANG_FRACTION_DIGITS_KEYWORD; }
  "grouping"              { yybegin(VALUE_MODE); return YangTypes.YANG_GROUPING_KEYWORD; }
  "identity"              { yybegin(VALUE_MODE); return YangTypes.YANG_IDENTITY_KEYWORD; }
  "if-feature"            { yybegin(VALUE_MODE); return YangTypes.YANG_IF_FEATURE_KEYWORD; }
  "import"                { yybegin(VALUE_MODE); return YangTypes.YANG_IMPORT_KEYWORD; }
  "include"               { yybegin(VALUE_MODE); return YangTypes.YANG_INCLUDE_KEYWORD; }
  "input"                 { yybegin(VALUE_MODE); return YangTypes.YANG_INPUT_KEYWORD; }
  "key"                   { yybegin(VALUE_MODE); return YangTypes.YANG_KEY_KEYWORD; }
  "leaf"                  { yybegin(VALUE_MODE); return YangTypes.YANG_LEAF_KEYWORD; }
  "leaf-list"             { yybegin(VALUE_MODE); return YangTypes.YANG_LEAF_LIST_KEYWORD; }
  "length"                { yybegin(VALUE_MODE); return YangTypes.YANG_LENGTH_KEYWORD; }
  "list"                  { yybegin(VALUE_MODE); return YangTypes.YANG_LIST_KEYWORD; }
  "mandatory"             { yybegin(VALUE_MODE); return YangTypes.YANG_MANDATORY_KEYWORD; }
  "max-elements"          { yybegin(VALUE_MODE); return YangTypes.YANG_MAX_ELEMENTS_KEYWORD; }
  "min-elements"          { yybegin(VALUE_MODE); return YangTypes.YANG_MIN_ELEMENTS_KEYWORD; }
  "module"                { yybegin(VALUE_MODE); return YangTypes.YANG_MODULE_KEYWORD; }
  "must"                  { yybegin(VALUE_MODE); return YangTypes.YANG_MUST_KEYWORD; }
  "namespace"             { yybegin(VALUE_MODE); return YangTypes.YANG_NAMESPACE_KEYWORD; }
  "notification"          { yybegin(VALUE_MODE); return YangTypes.YANG_NOTIFICATION_KEYWORD; }
  "ordered-by"            { yybegin(VALUE_MODE); return YangTypes.YANG_ORDERED_BY_KEYWORD; }
  "organization"          { yybegin(VALUE_MODE); return YangTypes.YANG_ORGANIZATION_KEYWORD; }
  "output"                { yybegin(VALUE_MODE); return YangTypes.YANG_OUTPUT_KEYWORD; }
  "path"                  { yybegin(VALUE_MODE); return YangTypes.YANG_PATH_KEYWORD; }
  "pattern"               { yybegin(VALUE_MODE); return YangTypes.YANG_PATTERN_KEYWORD; }
  "position"              { yybegin(VALUE_MODE); return YangTypes.YANG_POSITION_KEYWORD; }
  "prefix"                { yybegin(VALUE_MODE); return YangTypes.YANG_PREFIX_KEYWORD; }
  "presence"              { yybegin(VALUE_MODE); return YangTypes.YANG_PRESENCE_KEYWORD; }
  "range"                 { yybegin(VALUE_MODE); return YangTypes.YANG_RANGE_KEYWORD; }
  "reference"             { yybegin(VALUE_MODE); return YangTypes.YANG_REFERENCE_KEYWORD; }
  "refine"                { yybegin(VALUE_MODE); return YangTypes.YANG_REFINE_KEYWORD; }
  "require-instance"      { yybegin(VALUE_MODE); return YangTypes.YANG_REQUIRE_INSTANCE_KEYWORD; }
  "revision"              { yybegin(VALUE_MODE); return YangTypes.YANG_REVISION_KEYWORD; }
  "revision-date"         { yybegin(VALUE_MODE); return YangTypes.YANG_REVISION_DATE_KEYWORD; }
  "rpc"                   { yybegin(VALUE_MODE); return YangTypes.YANG_RPC_KEYWORD; }
  "status"                { yybegin(VALUE_MODE); return YangTypes.YANG_STATUS_KEYWORD; }
  "submodule"             { yybegin(VALUE_MODE); return YangTypes.YANG_SUBMODULE_KEYWORD; }
  "type"                  { yybegin(VALUE_MODE); return YangTypes.YANG_TYPE_KEYWORD; }
  "typedef"               { yybegin(VALUE_MODE); return YangTypes.YANG_TYPEDEF_KEYWORD; }
  "unique"                { yybegin(VALUE_MODE); return YangTypes.YANG_UNIQUE_KEYWORD; }
  "units"                 { yybegin(VALUE_MODE); return YangTypes.YANG_UNITS_KEYWORD; }
  "uses"                  { yybegin(VALUE_MODE); return YangTypes.YANG_USES_KEYWORD; }
  "value"                 { yybegin(VALUE_MODE); return YangTypes.YANG_VALUE_KEYWORD; }
  "when"                  { yybegin(VALUE_MODE); return YangTypes.YANG_WHEN_KEYWORD; }
  "yang-version"          { yybegin(VALUE_MODE); return YangTypes.YANG_YANG_VERSION_KEYWORD; }
  "yin-element"           { yybegin(VALUE_MODE); return YangTypes.YANG_YIN_ELEMENT_KEYWORD; }
  //"add"                   { yybegin(VALUE_MODE); return YANG_ADD_KEYWORD; }
  //"current"               { yybegin(VALUE_MODE); return YANG_CURRENT_KEYWORD; }
  //"delete"                { yybegin(VALUE_MODE); return YANG_DELETE_KEYWORD; }
  //"deprecated"            { yybegin(VALUE_MODE); return YANG_DEPRECATED_KEYWORD; }
  //"false"                 { yybegin(VALUE_MODE); return YANG_FALSE_KEYWORD; }
  //"max"                   { yybegin(VALUE_MODE); return YANG_MAX_KEYWORD; }
  //"min"                   { yybegin(VALUE_MODE); return YANG_MIN_KEYWORD; }
  //"not_supported"         { yybegin(VALUE_MODE); return YANG_NOT_SUPPORTED_KEYWORD; }
  //"obsolete"              { yybegin(VALUE_MODE); return YANG_OBSOLETE_KEYWORD; }
  //"replace"               { yybegin(VALUE_MODE); return YANG_REPLACE_KEYWORD; }
  //"system"                { yybegin(VALUE_MODE); return YANG_SYSTEM_KEYWORD; }
  //"true"                  { yybegin(VALUE_MODE); return YANG_TRUE_KEYWORD; }
  //"unbounded"             { yybegin(VALUE_MODE); return YANG_UNBOUNDED_KEYWORD; }
  //"user"                  { yybegin(VALUE_MODE); return YANG_USER_KEYWORD; }

  {Identifier}            { yybegin(VALUE_MODE); return YangTypes.YANG_IDENTIFIER; }

  // Treat comments as White Space
  {Comment}               { return com.intellij.psi.TokenType.WHITE_SPACE; }
  {WhiteSpace}+           { return com.intellij.psi.TokenType.WHITE_SPACE; }

}

<VALUE_MODE> {

  /* string literal */
  {StringLiteral}         { return YangTypes.YANG_STRING_LITERAL; }

  // Treat comments as White Space
  {Comment}               { return com.intellij.psi.TokenType.WHITE_SPACE; }
  {WhiteSpace}+           { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "+"                     { return YangTypes.YANG_PLUS; }
  ";"                     { yybegin(YYINITIAL); return YangTypes.YANG_SEMICOLON; }
  "{"                     { yybegin(YYINITIAL); return YangTypes.YANG_LEFT_BRACE; }

}

[^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
