package se.clau.yang;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import se.clau.yang.psi.YangContainerStmt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class YangFoldingBuilder extends FoldingBuilderEx implements DumbAware {
    static String PFX = "PREFIX";
    static String SEP = ":";

    @Override
    public FoldingDescriptor @NotNull [] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {
        // Initialize the group of folding regions that will expand/collapse together.
        FoldingGroup group = FoldingGroup.newGroup(PFX);

        // Initialize the list of folding regions
        List<FoldingDescriptor> descriptors = new ArrayList<>();

        // Get a collection of the literal expressions in the document below root
        Collection<YangContainerStmt> literalExpressions =
                PsiTreeUtil.findChildrenOfType(root, YangContainerStmt.class);

        // Evaluate the collection
        for (final YangContainerStmt foldNode : literalExpressions) {
            String value = foldNode.getText() instanceof String ? (String) foldNode.getText() : null;
            if (value != null && value.startsWith(PFX + SEP)) {
                Project project = foldNode.getProject();
                String key = value.substring(PFX.length() + SEP.length());

                // Get a list of all properties for a given key in the project
                final List<YangContainerStmt> properties = YangUtil.Companion.findProperties(project, key);

                if (properties.size() == 1) {
                    // Add a folding descriptor for the literal expression at this node.
                    descriptors.add(new FoldingDescriptor(foldNode.getNode(),
                            new TextRange(foldNode.getTextRange().getStartOffset() + 1,
                                    foldNode.getTextRange().getEndOffset() - 1),
                            group));
                }
            }
        }
        return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
    }

    /**
     * Gets the Simple Language 'value' string corresponding to the 'key'
     *
     * @param node Node corresponding to PsiLiteralExpression containing a string in the format
     *             SIMPLE_PREFIX_STR + SIMPLE_SEPARATOR_STR + Key, where Key is
     *             defined by the Simple language file.
     */
    @Nullable
    @Override
    public String getPlaceholderText(@NotNull ASTNode node) {
        String retTxt = "...";
        if (node.getPsi() instanceof YangContainerStmt) {
            YangContainerStmt nodeElement = (YangContainerStmt)node.getPsi();
            String key = ((String) nodeElement.getText()).substring(PFX.length() + SEP.length());
            final List<YangContainerStmt> properties = YangUtil.Companion.findProperties(nodeElement.getProject(), key);
            String place = properties.get(0).getText();

            // IMPORTANT: keys can come with no values, so a test for null is needed
            // IMPORTANT: Convert embedded \n to backslash n, so that the string will look
            // like it has LF embedded in it and embedded " to escaped "
            return place == null ? retTxt : place.replaceAll("\n", "\\n").replaceAll("\"", "\\\\\"");
        }
        return retTxt;
    }

    @Override
    public boolean isCollapsedByDefault(@NotNull ASTNode node) {
        return true;
    }

}