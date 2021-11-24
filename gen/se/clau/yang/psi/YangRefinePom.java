// This is a generated file. Not intended for manual editing.
package se.clau.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangRefinePom extends PsiElement {

  @NotNull
  List<YangConfigStmt> getConfigStmtList();

  @NotNull
  List<YangDefaultStmt> getDefaultStmtList();

  @NotNull
  List<YangDescriptionStmt> getDescriptionStmtList();

  @NotNull
  List<YangIdentifierStmt> getIdentifierStmtList();

  @NotNull
  List<YangMandatoryStmt> getMandatoryStmtList();

  @NotNull
  List<YangMaxElementsStmt> getMaxElementsStmtList();

  @NotNull
  List<YangMinElementsStmt> getMinElementsStmtList();

  @NotNull
  List<YangMustStmt> getMustStmtList();

  @NotNull
  List<YangPresenceStmt> getPresenceStmtList();

  @NotNull
  List<YangReferenceStmt> getReferenceStmtList();

}
