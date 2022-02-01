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

public class YangTypeStmtImpl extends ASTWrapperPsiElement implements YangTypeStmt {

  public YangTypeStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YangVisitor visitor) {
    visitor.visitTypeStmt(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) accept((YangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangString getString() {
    return findNotNullChildByClass(YangString.class);
  }

  @Override
  @Nullable
  public YangTypeBodyStmts getTypeBodyStmts() {
    return findChildByClass(YangTypeBodyStmts.class);
  }

}