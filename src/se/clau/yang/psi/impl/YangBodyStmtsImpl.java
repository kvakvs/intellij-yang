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

public class YangBodyStmtsImpl extends ASTWrapperPsiElement implements YangBodyStmts {

  public YangBodyStmtsImpl(@NotNull ASTNode node) {
    super(node);
  }

  public <R> R accept(@NotNull YangVisitor<R> visitor) {
    return visitor.visitBodyStmts(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangAugmentStmt> getAugmentStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangAugmentStmt.class);
  }

  @Override
  @NotNull
  public List<YangDataDefStmt> getDataDefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDataDefStmt.class);
  }

  @Override
  @NotNull
  public List<YangDeviationStmt> getDeviationStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDeviationStmt.class);
  }

  @Override
  @NotNull
  public List<YangExtensionStmt> getExtensionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangExtensionStmt.class);
  }

  @Override
  @NotNull
  public List<YangFeatureStmt> getFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangFeatureStmt.class);
  }

  @Override
  @NotNull
  public List<YangGroupingStmt> getGroupingStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangGroupingStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentityStmt> getIdentityStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentityStmt.class);
  }

  @Override
  @NotNull
  public List<YangNotificationStmt> getNotificationStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangNotificationStmt.class);
  }

  @Override
  @NotNull
  public List<YangRpcStmt> getRpcStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangRpcStmt.class);
  }

  @Override
  @NotNull
  public List<YangTypedefStmt> getTypedefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangTypedefStmt.class);
  }

}
