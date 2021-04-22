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

public class YangChoiceStmtImpl extends ASTWrapperPsiElement implements YangChoiceStmt {

  public YangChoiceStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitChoiceStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YangCaseStmt> getCaseStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangCaseStmt.class);
  }

  @Override
  @NotNull
  public List<YangConfigStmt> getConfigStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangConfigStmt.class);
  }

  @Override
  @NotNull
  public List<YangDefaultStmt> getDefaultStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDefaultStmt.class);
  }

  @Override
  @NotNull
  public List<YangDescriptionStmt> getDescriptionStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangDescriptionStmt.class);
  }

  @Override
  @NotNull
  public List<YangIdentifierStmt> getIdentifierStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIdentifierStmt.class);
  }

  @Override
  @NotNull
  public List<YangIfFeatureStmt> getIfFeatureStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangIfFeatureStmt.class);
  }

  @Override
  @NotNull
  public List<YangMandatoryStmt> getMandatoryStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangMandatoryStmt.class);
  }

  @Override
  @NotNull
  public List<YangReferenceStmt> getReferenceStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangReferenceStmt.class);
  }

  @Override
  @NotNull
  public List<YangShortCaseStmt> getShortCaseStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangShortCaseStmt.class);
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
  public List<YangWhenStmt> getWhenStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YangWhenStmt.class);
  }

}
