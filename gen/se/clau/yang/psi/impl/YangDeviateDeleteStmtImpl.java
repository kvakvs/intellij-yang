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

public class YangDeviateDeleteStmtImpl extends ASTWrapperPsiElement implements YangDeviateDeleteStmt {

  public YangDeviateDeleteStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitDeviateDeleteStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangDefaultStmt> getDefaultStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDefaultStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

  @Override
  @NotNull
  public List<YangMustStmt> getMustStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMustStmt.class);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public List<YangUniqueStmt> getUniqueStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUniqueStmt.class);
  }

  @Override
  @NotNull
  public List<YangUnitsStmt> getUnitsStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangUnitsStmt.class);
  }

}
