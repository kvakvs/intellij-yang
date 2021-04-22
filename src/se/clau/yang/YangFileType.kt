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
package se.clau.yang

import se.clau.yang.icons.YangIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class YangFileType private constructor() :
    LanguageFileType(YangLanguage.INSTANCE) {
    override fun getName(): String {
        return "Yang Data Model"
    }

    override fun getDescription(): String {
        return """
            YANG is a data modeling language used to model configuration and
            state data manipulated by the Network Configuration Protocol
            (NETCONF), NETCONF remote procedure calls, and NETCONF notifications.
            
            """.trimIndent()
    }

    override fun getDefaultExtension(): String {
        return "yang"
    }

    override fun getIcon(): Icon? {
        return YangIcons.FILE
    }

    companion object {
        @JvmField
        val INSTANCE = YangFileType()
    }
}