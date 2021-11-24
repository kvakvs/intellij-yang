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

public class YangIdentityrefSpecificationImpl extends ASTWrapperPsiElement implements YangIdentityrefSpecification {

  public YangIdentityrefSpecificationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitIdentityrefSpecification(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangBaseStmt getBaseStmt() {
    return findNotNullChildByClass(YangBaseStmt.class);
  }

}
