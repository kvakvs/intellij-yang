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
package com.intellij.lang.yang.psi

import com.intellij.lang.yang.YangLanguage
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType

interface YangTokenTypeSets {
    companion object {
        val COMMENT: IElementType = YangElementType("COMMENT")
        val YANG_FILE = IFileElementType("YANGFILE", YangLanguage.INSTANCE)
        val WHITE_SPACE = TokenType.WHITE_SPACE
        val BAD_CHARACTER = TokenType.BAD_CHARACTER
    }
}