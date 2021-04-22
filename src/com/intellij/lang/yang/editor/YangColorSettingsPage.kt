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

import com.intellij.lang.yang.icons.YangIcons
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class YangColorSettingsPage : ColorSettingsPage {
    override fun getIcon(): Icon? {
        return YangIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return YangSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """module acme-foo {
  namespace "http://acme.example.com/foo";
  prefix "acfoo";

import my-extensions {
  prefix "myext";
}
  list interface {
    key "name";
    leaf name {
      type string;
  }

// This is a line comment 
/*** This is a block comment ***/

  leaf mtu {
    type uint32;
    description "The MTU of the interface.";
    myext:c-define "MY-MTU";  }

// This isn't supposed to be here 
%%%%%
}
"""
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String, TextAttributesKey>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<ColorDescriptor> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): String {
        return "Yang"
    }

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Illegal", YangSyntaxHighlighter.ILLEGAL),
            AttributesDescriptor("Comment", YangSyntaxHighlighter.COMMENT),
            AttributesDescriptor("String", YangSyntaxHighlighter.STRING),
            AttributesDescriptor("Keyword", YangSyntaxHighlighter.KEYWORD),
            AttributesDescriptor("Braces", YangSyntaxHighlighter.BRACES),
            AttributesDescriptor("Operator", YangSyntaxHighlighter.OP_SIGN),
            AttributesDescriptor("Semicolon", YangSyntaxHighlighter.SEMICOLON),
            AttributesDescriptor(
                "Unknown Statement",
                YangSyntaxHighlighter.UNKNOWN
            )
        )
    }
}