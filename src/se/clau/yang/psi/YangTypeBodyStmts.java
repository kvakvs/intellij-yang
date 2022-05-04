// This is a generated file. Not intended for manual editing.
package se.clau.yang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface YangTypeBodyStmts extends PsiElement {

  @Nullable
  YangBitsSpecification getBitsSpecification();

  @Nullable
  YangDecimal64Specification getDecimal64Specification();

  @Nullable
  YangEnumSpecification getEnumSpecification();

  @Nullable
  YangIdentifierStmt getIdentifierStmt();

  @Nullable
  YangIdentityrefSpecification getIdentityrefSpecification();

  @Nullable
  YangLeafrefSpecification getLeafrefSpecification();

  @Nullable
  YangNumericalRestrictions getNumericalRestrictions();

  @Nullable
  YangRequireInstanceStmt getRequireInstanceStmt();

  @Nullable
  YangStringRestrictions getStringRestrictions();

  @Nullable
  YangUnionSpecification getUnionSpecification();

}
