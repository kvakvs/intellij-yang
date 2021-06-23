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
WhiteSpace     = {LineTerminator} | [ \t\f]

Comment              = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}
TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

PLUS          = "+"
ESC           = "\\"[^ ]
CHAR          = {ESC} | [^\'\"\\]
UnquotedString = [^\"\'{};\s+]

//--- String literals wrapped in double quotes
STRING_BAD1   = \" ({CHAR} | \') *
StringLiteral1 = {STRING_BAD1} \" | {Identifier}

//--- String literals wrapped in double quotes
STRING_BAD2    = \' ({CHAR} | \") *
StringLiteral2 = {STRING_BAD2} \' | {Identifier}

// A string can be either double or single quoted
StringLiteral_Either = {StringLiteral1} | {StringLiteral2}

// A string can be split into multiple fragments separated by a +
StringLiteral = {StringLiteral_Either} ({PLUS} {StringLiteral_Either}) *

Identifier_Start = [/.a-zA-Z_0-9\-]
Identifier_Body  = [a-zA-Z0-9_\-.:] *
Identifier       = {Identifier_Start} {Identifier_Body}

%state VALUE_MODE

%%
<YYINITIAL> {
  ";"                     { return YangTypes.YANG_SEMICOLON; }
  {PLUS}                  { return YangTypes.YANG_PLUS; }
  "{"                     { return YangTypes.YANG_LEFT_BRACE; }
  "}"                     { return YangTypes.YANG_RIGHT_BRACE; }
  // {Identifier}? "action"
  // {Identifier}? "anydata"
  {Identifier}? "anyxml"  { yybegin(VALUE_MODE); return YangTypes.YANG_ANYXML_KEYWORD; }
  {Identifier}? "argument"              { yybegin(VALUE_MODE); return YangTypes.YANG_ARGUMENT_KEYWORD; }
  {Identifier}? "augment"               { yybegin(VALUE_MODE); return YangTypes.YANG_AUGMENT_KEYWORD; }
  {Identifier}? "base"                  { yybegin(VALUE_MODE); return YangTypes.YANG_BASE_KEYWORD; }
  {Identifier}? "belongs-to"            { yybegin(VALUE_MODE); return YangTypes.YANG_BELONGS_TO_KEYWORD; }
  {Identifier}? "bit"                   { yybegin(VALUE_MODE); return YangTypes.YANG_BIT_KEYWORD; }
  {Identifier}? "case"                  { yybegin(VALUE_MODE); return YangTypes.YANG_CASE_KEYWORD; }
  {Identifier}? "choice"                { yybegin(VALUE_MODE); return YangTypes.YANG_CHOICE_KEYWORD; }
  {Identifier}? "config"                { yybegin(VALUE_MODE); return YangTypes.YANG_CONFIG_KEYWORD; }
  {Identifier}? "contact"               { yybegin(VALUE_MODE); return YangTypes.YANG_CONTACT_KEYWORD; }
  {Identifier}? "container"             { yybegin(VALUE_MODE); return YangTypes.YANG_CONTAINER_KEYWORD; }
  {Identifier}? "default"               { yybegin(VALUE_MODE); return YangTypes.YANG_DEFAULT_KEYWORD; }
  {Identifier}? "description"           { yybegin(VALUE_MODE); return YangTypes.YANG_DESCRIPTION_KEYWORD; }
  {Identifier}? "deviate"               { yybegin(VALUE_MODE); return YangTypes.YANG_DEVIATE_KEYWORD; }
  {Identifier}? "deviation"             { yybegin(VALUE_MODE); return YangTypes.YANG_DEVIATION_KEYWORD; }
  {Identifier}? "enum"                  { yybegin(VALUE_MODE); return YangTypes.YANG_ENUM_KEYWORD; }
  {Identifier}? "error-app-tag"         { yybegin(VALUE_MODE); return YangTypes.YANG_ERROR_APP_TAG_KEYWORD; }
  {Identifier}? "error-message"         { yybegin(VALUE_MODE); return YangTypes.YANG_ERROR_MESSAGE_KEYWORD; }
  {Identifier}? "extension"             { yybegin(VALUE_MODE); return YangTypes.YANG_EXTENSION_KEYWORD; }
  {Identifier}? "fraction-digits"       { yybegin(VALUE_MODE); return YangTypes.YANG_FRACTION_DIGITS_KEYWORD; }
  {Identifier}? "grouping"              { yybegin(VALUE_MODE); return YangTypes.YANG_GROUPING_KEYWORD; }
  {Identifier}? "identity"              { yybegin(VALUE_MODE); return YangTypes.YANG_IDENTITY_KEYWORD; }
  {Identifier}? "if-feature"            { yybegin(VALUE_MODE); return YangTypes.YANG_IF_FEATURE_KEYWORD; }
  {Identifier}? "feature"               { yybegin(VALUE_MODE); return YangTypes.YANG_FEATURE_KEYWORD; }
  {Identifier}? "import"                { yybegin(VALUE_MODE); return YangTypes.YANG_IMPORT_KEYWORD; }
  {Identifier}? "include"               { yybegin(VALUE_MODE); return YangTypes.YANG_INCLUDE_KEYWORD; }
  {Identifier}? "input"                 { yybegin(VALUE_MODE); return YangTypes.YANG_INPUT_KEYWORD; }
  {Identifier}? "key"                   { yybegin(VALUE_MODE); return YangTypes.YANG_KEY_KEYWORD; }
  {Identifier}? "leaf-list"             { yybegin(VALUE_MODE); return YangTypes.YANG_LEAF_LIST_KEYWORD; }
  {Identifier}? "leaf"                  { yybegin(VALUE_MODE); return YangTypes.YANG_LEAF_KEYWORD; }
  {Identifier}? "length"                { yybegin(VALUE_MODE); return YangTypes.YANG_LENGTH_KEYWORD; }
  {Identifier}? "list"                  { yybegin(VALUE_MODE); return YangTypes.YANG_LIST_KEYWORD; }
  {Identifier}? "mandatory"             { yybegin(VALUE_MODE); return YangTypes.YANG_MANDATORY_KEYWORD; }
  {Identifier}? "max-elements"          { yybegin(VALUE_MODE); return YangTypes.YANG_MAX_ELEMENTS_KEYWORD; }
  {Identifier}? "min-elements"          { yybegin(VALUE_MODE); return YangTypes.YANG_MIN_ELEMENTS_KEYWORD; }
  // {Identifier}? "modifier"
  {Identifier}? "submodule"             { yybegin(VALUE_MODE); return YangTypes.YANG_SUBMODULE_KEYWORD; }
  {Identifier}? "module"                { yybegin(VALUE_MODE); return YangTypes.YANG_MODULE_KEYWORD; }
  {Identifier}? "must"                  { yybegin(VALUE_MODE); return YangTypes.YANG_MUST_KEYWORD; }
  {Identifier}? "namespace"             { yybegin(VALUE_MODE); return YangTypes.YANG_NAMESPACE_KEYWORD; }
  {Identifier}? "notification"          { yybegin(VALUE_MODE); return YangTypes.YANG_NOTIFICATION_KEYWORD; }
  {Identifier}? "ordered-by"            { yybegin(VALUE_MODE); return YangTypes.YANG_ORDERED_BY_KEYWORD; }
  {Identifier}? "organization"          { yybegin(VALUE_MODE); return YangTypes.YANG_ORGANIZATION_KEYWORD; }
  {Identifier}? "output"                { yybegin(VALUE_MODE); return YangTypes.YANG_OUTPUT_KEYWORD; }
  {Identifier}? "path"                  { yybegin(VALUE_MODE); return YangTypes.YANG_PATH_KEYWORD; }
  {Identifier}? "pattern"               { yybegin(VALUE_MODE); return YangTypes.YANG_PATTERN_KEYWORD; }
  {Identifier}? "position"              { yybegin(VALUE_MODE); return YangTypes.YANG_POSITION_KEYWORD; }
  {Identifier}? "prefix"                { yybegin(VALUE_MODE); return YangTypes.YANG_PREFIX_KEYWORD; }
  {Identifier}? "presence"              { yybegin(VALUE_MODE); return YangTypes.YANG_PRESENCE_KEYWORD; }
  {Identifier}? "range"                 { yybegin(VALUE_MODE); return YangTypes.YANG_RANGE_KEYWORD; }
  {Identifier}? "reference"             { yybegin(VALUE_MODE); return YangTypes.YANG_REFERENCE_KEYWORD; }
  {Identifier}? "refine"                { yybegin(VALUE_MODE); return YangTypes.YANG_REFINE_KEYWORD; }
  {Identifier}? "require-instance"      { yybegin(VALUE_MODE); return YangTypes.YANG_REQUIRE_INSTANCE_KEYWORD; }
  {Identifier}? "revision"              { yybegin(VALUE_MODE); return YangTypes.YANG_REVISION_KEYWORD; }
  {Identifier}? "revision-date"         { yybegin(VALUE_MODE); return YangTypes.YANG_REVISION_DATE_KEYWORD; }
  {Identifier}? "rpc"                   { yybegin(VALUE_MODE); return YangTypes.YANG_RPC_KEYWORD; }
  {Identifier}? "status"                { yybegin(VALUE_MODE); return YangTypes.YANG_STATUS_KEYWORD; }
  // SUBMODULE keyword moved up before "MODULE"
  {Identifier}? "type"                  { yybegin(VALUE_MODE); return YangTypes.YANG_TYPE_KEYWORD; }
  {Identifier}? "typedef"               { yybegin(VALUE_MODE); return YangTypes.YANG_TYPEDEF_KEYWORD; }
  {Identifier}? "unique"                { yybegin(VALUE_MODE); return YangTypes.YANG_UNIQUE_KEYWORD; }
  {Identifier}? "units"                 { yybegin(VALUE_MODE); return YangTypes.YANG_UNITS_KEYWORD; }
  {Identifier}? "uses"                  { yybegin(VALUE_MODE); return YangTypes.YANG_USES_KEYWORD; }
  {Identifier}? "value"                 { yybegin(VALUE_MODE); return YangTypes.YANG_VALUE_KEYWORD; }
  {Identifier}? "when"                  { yybegin(VALUE_MODE); return YangTypes.YANG_WHEN_KEYWORD; }
  {Identifier}? "yang-version"          { yybegin(VALUE_MODE); return YangTypes.YANG_YANG_VERSION_KEYWORD; }
  {Identifier}? "yin-element"           { yybegin(VALUE_MODE); return YangTypes.YANG_YIN_ELEMENT_KEYWORD; }
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

  // string literals: with double quotes, and single quotes
  {StringLiteral}         { return YangTypes.YANG_STRING_LITERAL; }
  {UnquotedString}        { return YangTypes.YANG_UNQUOTED_STRING; }

  // Treat comments as White Space
  {Comment}               { return com.intellij.psi.TokenType.WHITE_SPACE; }
  {WhiteSpace}+           { return com.intellij.psi.TokenType.WHITE_SPACE; }

  ";"                     { yybegin(YYINITIAL); return YangTypes.YANG_SEMICOLON; }
  "{"                     { yybegin(YYINITIAL); return YangTypes.YANG_LEFT_BRACE; }
  {PLUS}                  { return YangTypes.YANG_PLUS; } // allow plus to concat strings

}

[^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
