// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.yang.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.psi.*;

public class YangGroupingStmtImpl extends ASTWrapperPsiElement implements YangGroupingStmt {

  public YangGroupingStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitGroupingStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangDataDefStmt> getDataDefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDataDefStmt.class);
  }

  @Override
  @NotNull
  public List<YangDescriptionStmt> getDescriptionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDescriptionStmt.class);
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
  public List<YangReferenceStmt> getReferenceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangReferenceStmt.class);
  }

  @Override
  @NotNull
  public List<YangStatusStmt> getStatusStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangStatusStmt.class);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @NotNull
  public List<YangTypedefStmt> getTypedefStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangTypedefStmt.class);
  }

}
