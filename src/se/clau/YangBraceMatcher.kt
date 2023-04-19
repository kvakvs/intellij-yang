package se.clau

import com.intellij.codeInsight.highlighting.PairedBraceMatcherAdapter
import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.openapi.editor.highlighter.HighlighterIterator
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import se.clau.yang.YangFileType
import se.clau.yang.YangLanguage
import se.clau.yang.psi.YangTypes

class YangBraceMatcher : PairedBraceMatcherAdapter(YangBaseBraceMatcher(), YangLanguage.INSTANCE) {
    override fun isLBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean =
        isBrace(iterator, fileText, fileType, true)

    override fun isRBraceToken(iterator: HighlighterIterator, fileText: CharSequence, fileType: FileType): Boolean =
        isBrace(iterator, fileText, fileType, false)

    private fun isBrace(
        iterator: HighlighterIterator,
        fileText: CharSequence,
        fileType: FileType,
        left: Boolean
    ): Boolean {
        if (fileType != YangFileType.INSTANCE) return false
        val pair = findPair(left, iterator, fileText, fileType) ?: return false
        val brace = pair.leftBraceType
        // Non angle bracket handled by `YangBaseBraceMatcher`
        return (brace == YangTypes.YANG_LEFT_BRACE || brace == YangTypes.YANG_RIGHT_BRACE)
    }

}

private class YangBaseBraceMatcher : PairedBraceMatcher {

    override fun getPairs() = PAIRS

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, next: IElementType?): Boolean =
        next in InsertPairBraceBefore

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int): Int = openingBraceOffset

    companion object {
        private val PAIRS: Array<BracePair> = arrayOf(
            BracePair(YangTypes.YANG_LEFT_BRACE, YangTypes.YANG_RIGHT_BRACE, true /* structural */),
        )

        private val InsertPairBraceBefore = TokenSet.orSet(
        )
    }
}

