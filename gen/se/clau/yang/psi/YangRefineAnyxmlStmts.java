// This is a generated file. Not intended for manual editing.
package se.clau.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRefineAnyxmlStmts extends PsiElement {

  @NotNull
  List<YangConfigStmt> getConfigStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangMandatoryStmt> getMandatoryStmtList();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

}
