// This is a generated file. Not intended for manual editing.
package se.clau.yang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static se.clau.yang.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import se.clau.yang.psi.*;

public class YangUnknownStatement2Impl extends ASTWrapperPsiElement implements YangUnknownStatement2 {

  public YangUnknownStatement2Impl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitUnknownStatement2(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YangString getString() {
    return findChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public List<YangUnknownStatement3> getUnknownStatement3List() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUnknownStatement3.class);
  }

}
