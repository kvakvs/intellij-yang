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
package com.intellij.lang.yang.editor

import com.intellij.lang.yang.YangParserDefinition
import com.intellij.lang.yang.lexer.YangLexer
import com.intellij.lang.yang.psi.YangTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType

class YangSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return YangLexer()
    }

    override fun getTokenHighlights(type: IElementType): Array<TextAttributesKey> {
        if (type === TokenType.BAD_CHARACTER) {
            return pack(ILLEGAL)
        }
        if (YangParserDefinition.COMMENTS.contains(type)) {
            return pack(COMMENT)
        }
        if (type === YangTypes.YANG_STRING || type === YangTypes.YANG_STRING_LITERAL) {
            return pack(STRING)
        }
        if (type === YangTypes.YANG_PLUS) {
            return pack(OP_SIGN)
        }
        if (type === YangTypes.YANG_LEFT_BRACE || type === YangTypes.YANG_RIGHT_BRACE) {
            return pack(BRACES)
        }
        if (type === YangTypes.YANG_SEMICOLON) {
            return pack(SEMICOLON)
        }
        if (type === YangTypes.YANG_IDENTIFIER) {
            return pack(UNKNOWN)
        }
        return if (YangTypes.YANG_ANYXML_KEYWORD === type || YangTypes.YANG_ARGUMENT_KEYWORD === type || YangTypes.YANG_AUGMENT_KEYWORD === type || YangTypes.YANG_BASE_KEYWORD === type || YangTypes.YANG_BELONGS_TO_KEYWORD === type || YangTypes.YANG_BIT_KEYWORD === type || YangTypes.YANG_CASE_KEYWORD === type || YangTypes.YANG_CHOICE_KEYWORD === type || YangTypes.YANG_CONFIG_KEYWORD === type || YangTypes.YANG_CONTACT_KEYWORD === type || YangTypes.YANG_CONTAINER_KEYWORD === type || YangTypes.YANG_DEFAULT_KEYWORD === type || YangTypes.YANG_DESCRIPTION_KEYWORD === type || YangTypes.YANG_ENUM_KEYWORD === type || YangTypes.YANG_ERROR_APP_TAG_KEYWORD === type || YangTypes.YANG_ERROR_MESSAGE_KEYWORD === type || YangTypes.YANG_EXTENSION_KEYWORD === type || YangTypes.YANG_DEVIATION_KEYWORD === type || YangTypes.YANG_DEVIATE_KEYWORD === type || YangTypes.YANG_FEATURE_KEYWORD === type || YangTypes.YANG_FRACTION_DIGITS_KEYWORD === type || YangTypes.YANG_GROUPING_KEYWORD === type || YangTypes.YANG_IDENTITY_KEYWORD === type || YangTypes.YANG_IF_FEATURE_KEYWORD === type || YangTypes.YANG_IMPORT_KEYWORD === type || YangTypes.YANG_INCLUDE_KEYWORD === type || YangTypes.YANG_INPUT_KEYWORD === type || YangTypes.YANG_KEY_KEYWORD === type || YangTypes.YANG_LEAF_KEYWORD === type || YangTypes.YANG_LEAF_LIST_KEYWORD === type || YangTypes.YANG_LENGTH_KEYWORD === type || YangTypes.YANG_LIST_KEYWORD === type || YangTypes.YANG_MANDATORY_KEYWORD === type || YangTypes.YANG_MAX_ELEMENTS_KEYWORD === type || YangTypes.YANG_MIN_ELEMENTS_KEYWORD === type || YangTypes.YANG_MODULE_KEYWORD === type || YangTypes.YANG_MUST_KEYWORD === type || YangTypes.YANG_NAMESPACE_KEYWORD === type || YangTypes.YANG_NOTIFICATION_KEYWORD === type || YangTypes.YANG_ORDERED_BY_KEYWORD === type || YangTypes.YANG_ORGANIZATION_KEYWORD === type || YangTypes.YANG_OUTPUT_KEYWORD === type || YangTypes.YANG_PATH_KEYWORD === type || YangTypes.YANG_PATTERN_KEYWORD === type || YangTypes.YANG_POSITION_KEYWORD === type || YangTypes.YANG_PREFIX_KEYWORD === type || YangTypes.YANG_PRESENCE_KEYWORD === type || YangTypes.YANG_RANGE_KEYWORD === type || YangTypes.YANG_REFERENCE_KEYWORD === type || YangTypes.YANG_REFINE_KEYWORD === type || YangTypes.YANG_REQUIRE_INSTANCE_KEYWORD === type || YangTypes.YANG_REVISION_KEYWORD === type || YangTypes.YANG_REVISION_DATE_KEYWORD === type || YangTypes.YANG_RPC_KEYWORD === type || YangTypes.YANG_STATUS_KEYWORD === type || YangTypes.YANG_SUBMODULE_KEYWORD === type || YangTypes.YANG_TYPE_KEYWORD === type || YangTypes.YANG_TYPEDEF_KEYWORD === type || YangTypes.YANG_UNIQUE_KEYWORD === type || YangTypes.YANG_UNITS_KEYWORD === type || YangTypes.YANG_USES_KEYWORD === type || YangTypes.YANG_VALUE_KEYWORD === type || YangTypes.YANG_WHEN_KEYWORD === type || YangTypes.YANG_YANG_VERSION_KEYWORD === type || YangTypes.YANG_YIN_ELEMENT_KEYWORD === type
        ) {
            pack(KEYWORD)
        } else EMPTY
    }

    companion object {
        val ILLEGAL = TextAttributesKey.createTextAttributesKey(
            "YANG_ILLEGAL",
            DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE
        )
        val COMMENT = TextAttributesKey.createTextAttributesKey(
            "YANG_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val STRING = TextAttributesKey.createTextAttributesKey(
            "YANG_STRING",
            DefaultLanguageHighlighterColors.STRING
        )
        val KEYWORD = TextAttributesKey.createTextAttributesKey(
            "YANG_KEYWORD",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val BRACES = TextAttributesKey.createTextAttributesKey(
            "YANG_BRACES",
            DefaultLanguageHighlighterColors.BRACES
        )
        val OP_SIGN = TextAttributesKey.createTextAttributesKey(
            "YANG_OP_SIGN",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val SEMICOLON = TextAttributesKey.createTextAttributesKey(
            "YANG_SEMICOLON",
            DefaultLanguageHighlighterColors.SEMICOLON
        )
        val UNKNOWN = TextAttributesKey.createTextAttributesKey(
            "YANG_UNKNOWN",
            DefaultLanguageHighlighterColors.CONSTANT
        )
    }
}