// This is a generated file. Not intended for manual editing.
package se.clau.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangIdentifierStmt extends PsiElement {

  @Nullable
  YangEndStatement getEndStatement();

  @Nullable
  YangString getString();

  @NotNull
  List<YangUnknownStatement> getUnknownStatementList();

}
