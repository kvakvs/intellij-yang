// This is a generated file. Not intended for manual editing.
package se.clau.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangTypeStmt extends PsiElement {

  @NotNull
  YangString getString();

  @NotNull
  List<YangTypeBodyStmts> getTypeBodyStmtsList();

  @NotNull
  List<YangTypeStmt> getTypeStmtList();

}
