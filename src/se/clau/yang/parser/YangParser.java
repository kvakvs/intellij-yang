// This is a generated file. Not intended for manual editing.
package se.clau.yang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static se.clau.yang.psi.YangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class YangParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType type, PsiBuilder builder) {
    parseLight(type, builder);
    return builder.getTreeBuilt();
  }

  public void parseLight(IElementType type, PsiBuilder builder) {
    boolean result;
    builder = adapt_builder_(type, builder, this, null);
    Marker marker = enter_section_(builder, 0, _COLLAPSE_, null);
    result = parse_root_(type, builder);
    exit_section_(builder, 0, marker, type, result, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType type, PsiBuilder builder) {
    return parse_root_(type, builder, 0);
  }

  static boolean parse_root_(IElementType type, PsiBuilder builder, int level) {
    return yang(builder, level + 1);
  }

  /* ********************************************************** */
  // ANYXML_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | config_stmt
  //     | mandatory_stmt | status_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE))
  public static boolean anyxml_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "anyxml_stmt")) return false;
    if (!nextTokenIs(builder, YANG_ANYXML_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_ANYXML_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && anyxml_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_ANYXML_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | config_stmt
  //     | mandatory_stmt | status_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE)
  private static boolean anyxml_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "anyxml_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = anyxml_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | config_stmt
  //     | mandatory_stmt | status_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE
  private static boolean anyxml_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "anyxml_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && anyxml_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | config_stmt
  //     | mandatory_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean anyxml_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "anyxml_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!anyxml_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "anyxml_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | must_stmt | config_stmt
  //     | mandatory_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean anyxml_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "anyxml_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = mandatory_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // ARGUMENT_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (unknown_statement2)? (yin_element_stmt)?
  //   RIGHT_BRACE))
  public static boolean argument_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_stmt")) return false;
    if (!nextTokenIs(builder, YANG_ARGUMENT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_ARGUMENT_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && argument_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_ARGUMENT_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (unknown_statement2)? (yin_element_stmt)?
  //   RIGHT_BRACE)
  private static boolean argument_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = argument_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (unknown_statement2)? (yin_element_stmt)?
  //   RIGHT_BRACE
  private static boolean argument_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && argument_stmt_2_1_1(builder, level + 1);
    result = result && argument_stmt_2_1_2(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (unknown_statement2)?
  private static boolean argument_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_stmt_2_1_1")) return false;
    argument_stmt_2_1_1_0(builder, level + 1);
    return true;
  }

  // (unknown_statement2)
  private static boolean argument_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_stmt_2_1_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = unknown_statement2(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (yin_element_stmt)?
  private static boolean argument_stmt_2_1_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_stmt_2_1_2")) return false;
    argument_stmt_2_1_2_0(builder, level + 1);
    return true;
  }

  // (yin_element_stmt)
  private static boolean argument_stmt_2_1_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "argument_stmt_2_1_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = yin_element_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // AUGMENT_KEYWORD string LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt | case_stmt)+
  //   RIGHT_BRACE
  public static boolean augment_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "augment_stmt")) return false;
    if (!nextTokenIs(builder, YANG_AUGMENT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_AUGMENT_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && augment_stmt_3(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_AUGMENT_STMT, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt | case_stmt)+
  private static boolean augment_stmt_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "augment_stmt_3")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = augment_stmt_3_0(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!augment_stmt_3_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "augment_stmt_3", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt | case_stmt
  private static boolean augment_stmt_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "augment_stmt_3_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    if (!result) result = case_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // BASE_KEYWORD string end_statement
  public static boolean base_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "base_stmt")) return false;
    if (!nextTokenIs(builder, YANG_BASE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_BASE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_BASE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // BELONGS_TO_KEYWORD string LEFT_BRACE
  //   prefix_stmt
  //   RIGHT_BRACE
  public static boolean belongs_to_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "belongs_to_stmt")) return false;
    if (!nextTokenIs(builder, YANG_BELONGS_TO_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_BELONGS_TO_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && prefix_stmt(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_BELONGS_TO_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // BIT_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | position_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE))
  public static boolean bit_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "bit_stmt")) return false;
    if (!nextTokenIs(builder, YANG_BIT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_BIT_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && bit_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_BIT_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | position_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE)
  private static boolean bit_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "bit_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = bit_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt | position_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE
  private static boolean bit_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "bit_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && bit_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | position_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean bit_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "bit_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!bit_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "bit_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | position_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean bit_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "bit_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = position_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // bit_stmt (bit_stmt | identifier_stmt)*
  public static boolean bits_specification(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "bits_specification")) return false;
    if (!nextTokenIs(builder, YANG_BIT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = bit_stmt(builder, level + 1);
    result = result && bits_specification_1(builder, level + 1);
    exit_section_(builder, marker, YANG_BITS_SPECIFICATION, result);
    return result;
  }

  // (bit_stmt | identifier_stmt)*
  private static boolean bits_specification_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "bits_specification_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!bits_specification_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "bits_specification_1", pos)) break;
    }
    return true;
  }

  // bit_stmt | identifier_stmt
  private static boolean bits_specification_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "bits_specification_1_0")) return false;
    boolean result;
    result = bit_stmt(builder, level + 1);
    if (!result) result = identifier_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // (( identifier_stmt| extension_stmt | feature_stmt | identity_stmt 
  //   | typedef_stmt | grouping_stmt | data_def_stmt | augment_stmt | rpc_stmt 
  //   | notification_stmt | deviation_stmt) )*
  public static boolean body_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "body_stmts")) return false;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_BODY_STMTS, "<body stmts>");
    while (true) {
      int pos = current_position_(builder);
      if (!body_stmts_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "body_stmts", pos)) break;
    }
    exit_section_(builder, level, marker, true, false, null);
    return true;
  }

  // identifier_stmt| extension_stmt | feature_stmt | identity_stmt 
  //   | typedef_stmt | grouping_stmt | data_def_stmt | augment_stmt | rpc_stmt 
  //   | notification_stmt | deviation_stmt
  private static boolean body_stmts_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "body_stmts_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = extension_stmt(builder, level + 1);
    if (!result) result = feature_stmt(builder, level + 1);
    if (!result) result = identity_stmt(builder, level + 1);
    if (!result) result = typedef_stmt(builder, level + 1);
    if (!result) result = grouping_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    if (!result) result = augment_stmt(builder, level + 1);
    if (!result) result = rpc_stmt(builder, level + 1);
    if (!result) result = notification_stmt(builder, level + 1);
    if (!result) result = deviation_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // CASE_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt )*
  //   RIGHT_BRACE))
  public static boolean case_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "case_stmt")) return false;
    if (!nextTokenIs(builder, YANG_CASE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_CASE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && case_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_CASE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt )*
  //   RIGHT_BRACE)
  private static boolean case_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "case_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = case_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt )*
  //   RIGHT_BRACE
  private static boolean case_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "case_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && case_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt )*
  private static boolean case_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "case_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!case_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "case_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt
  private static boolean case_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "case_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // CHOICE_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | default_stmt | config_stmt 
  //   | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt)*
  //   RIGHT_BRACE))
  public static boolean choice_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "choice_stmt")) return false;
    if (!nextTokenIs(builder, YANG_CHOICE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_CHOICE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && choice_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_CHOICE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | default_stmt | config_stmt 
  //   | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt)*
  //   RIGHT_BRACE)
  private static boolean choice_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "choice_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = choice_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | default_stmt | config_stmt 
  //   | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt)*
  //   RIGHT_BRACE
  private static boolean choice_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "choice_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && choice_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | default_stmt | config_stmt 
  //   | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt)*
  private static boolean choice_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "choice_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!choice_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "choice_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | default_stmt | config_stmt 
  //   | mandatory_stmt | status_stmt | description_stmt | reference_stmt | short_case_stmt | case_stmt
  private static boolean choice_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "choice_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = default_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = mandatory_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = short_case_stmt(builder, level + 1);
    if (!result) result = case_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // string
  public static boolean config_arg(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "config_arg")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_CONFIG_ARG, "<config arg>");
    result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // CONFIG_KEYWORD config_arg end_statement
  public static boolean config_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "config_stmt")) return false;
    if (!nextTokenIs(builder, YANG_CONFIG_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_CONFIG_KEYWORD);
    result = result && config_arg(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_CONFIG_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // CONTACT_KEYWORD string end_statement
  public static boolean contact_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "contact_stmt")) return false;
    if (!nextTokenIs(builder, YANG_CONTACT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_CONTACT_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_CONTACT_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // CONTAINER_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt 
  //     | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt )* 
  //   RIGHT_BRACE))
  public static boolean container_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "container_stmt")) return false;
    if (!nextTokenIs(builder, YANG_CONTAINER_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_CONTAINER_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && container_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_CONTAINER_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt 
  //     | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt )* 
  //   RIGHT_BRACE)
  private static boolean container_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "container_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = container_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt 
  //     | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt )* 
  //   RIGHT_BRACE
  private static boolean container_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "container_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && container_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt 
  //     | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt )*
  private static boolean container_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "container_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!container_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "container_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | must_stmt | presence_stmt 
  //     | config_stmt | status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt
  private static boolean container_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "container_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = presence_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = typedef_stmt(builder, level + 1);
    if (!result) result = grouping_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // container_stmt | leaf_stmt | leaf_list_stmt | list_stmt | choice_stmt 
  //   | anyxml_stmt | uses_stmt | import_stmt | organization_stmt | description_stmt 
  //   | revision_stmt
  public static boolean data_def_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "data_def_stmt")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_DATA_DEF_STMT, "<data def stmt>");
    result = container_stmt(builder, level + 1);
    if (!result) result = leaf_stmt(builder, level + 1);
    if (!result) result = leaf_list_stmt(builder, level + 1);
    if (!result) result = list_stmt(builder, level + 1);
    if (!result) result = choice_stmt(builder, level + 1);
    if (!result) result = anyxml_stmt(builder, level + 1);
    if (!result) result = uses_stmt(builder, level + 1);
    if (!result) result = import_stmt(builder, level + 1);
    if (!result) result = organization_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = revision_stmt(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // numerical_restrictions? 
  //   (identifier_stmt)* fraction_digits_stmt | fraction_digits_stmt (identifier_stmt)* 
  //   numerical_restrictions?
  public static boolean decimal64_specification(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_DECIMAL_64_SPECIFICATION, "<decimal 64 specification>");
    result = decimal64_specification_0(builder, level + 1);
    if (!result) result = decimal64_specification_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // numerical_restrictions? 
  //   (identifier_stmt)* fraction_digits_stmt
  private static boolean decimal64_specification_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = decimal64_specification_0_0(builder, level + 1);
    result = result && decimal64_specification_0_1(builder, level + 1);
    result = result && fraction_digits_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // numerical_restrictions?
  private static boolean decimal64_specification_0_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification_0_0")) return false;
    numerical_restrictions(builder, level + 1);
    return true;
  }

  // (identifier_stmt)*
  private static boolean decimal64_specification_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification_0_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!decimal64_specification_0_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "decimal64_specification_0_1", pos)) break;
    }
    return true;
  }

  // (identifier_stmt)
  private static boolean decimal64_specification_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = identifier_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // fraction_digits_stmt (identifier_stmt)* 
  //   numerical_restrictions?
  private static boolean decimal64_specification_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = fraction_digits_stmt(builder, level + 1);
    result = result && decimal64_specification_1_1(builder, level + 1);
    result = result && decimal64_specification_1_2(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt)*
  private static boolean decimal64_specification_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!decimal64_specification_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "decimal64_specification_1_1", pos)) break;
    }
    return true;
  }

  // (identifier_stmt)
  private static boolean decimal64_specification_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification_1_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = identifier_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // numerical_restrictions?
  private static boolean decimal64_specification_1_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "decimal64_specification_1_2")) return false;
    numerical_restrictions(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // DEFAULT_KEYWORD string end_statement
  public static boolean default_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "default_stmt")) return false;
    if (!nextTokenIs(builder, YANG_DEFAULT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_DEFAULT_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_DEFAULT_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // DESCRIPTION_KEYWORD string end_statement
  public static boolean description_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "description_stmt")) return false;
    if (!nextTokenIs(builder, YANG_DESCRIPTION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_DESCRIPTION_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_DESCRIPTION_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // DEVIATE_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt
  //     | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )*
  //   RIGHT_BRACE))
  public static boolean deviate_add_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_add_stmt")) return false;
    if (!nextTokenIs(builder, YANG_DEVIATE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_DEVIATE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && deviate_add_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_DEVIATE_ADD_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt
  //     | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )*
  //   RIGHT_BRACE)
  private static boolean deviate_add_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_add_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = deviate_add_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt
  //     | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )*
  //   RIGHT_BRACE
  private static boolean deviate_add_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_add_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && deviate_add_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt
  //     | mandatory_stmt  | min_elements_stmt  | max_elements_stmt )*
  private static boolean deviate_add_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_add_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!deviate_add_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "deviate_add_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt | config_stmt
  //     | mandatory_stmt  | min_elements_stmt  | max_elements_stmt
  private static boolean deviate_add_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_add_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = units_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = unique_stmt(builder, level + 1);
    if (!result) result = default_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = mandatory_stmt(builder, level + 1);
    if (!result) result = min_elements_stmt(builder, level + 1);
    if (!result) result = max_elements_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // DEVIATE_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt )*
  //   RIGHT_BRACE))
  public static boolean deviate_delete_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_delete_stmt")) return false;
    if (!nextTokenIs(builder, YANG_DEVIATE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_DEVIATE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && deviate_delete_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_DEVIATE_DELETE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt )*
  //   RIGHT_BRACE)
  private static boolean deviate_delete_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_delete_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = deviate_delete_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt )*
  //   RIGHT_BRACE
  private static boolean deviate_delete_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_delete_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && deviate_delete_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt )*
  private static boolean deviate_delete_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_delete_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!deviate_delete_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "deviate_delete_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |units_stmt | must_stmt | unique_stmt | default_stmt
  private static boolean deviate_delete_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_delete_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = units_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = unique_stmt(builder, level + 1);
    if (!result) result = default_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // DEVIATE_KEYWORD string (SEMICOLON |
  //   (LEFT_BRACE identifier_stmt? RIGHT_BRACE))
  public static boolean deviate_not_supported_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_not_supported_stmt")) return false;
    if (!nextTokenIs(builder, YANG_DEVIATE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_DEVIATE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && deviate_not_supported_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_DEVIATE_NOT_SUPPORTED_STMT, result);
    return result;
  }

  // SEMICOLON |
  //   (LEFT_BRACE identifier_stmt? RIGHT_BRACE)
  private static boolean deviate_not_supported_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_not_supported_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = deviate_not_supported_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE identifier_stmt? RIGHT_BRACE
  private static boolean deviate_not_supported_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_not_supported_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && deviate_not_supported_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // identifier_stmt?
  private static boolean deviate_not_supported_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_not_supported_stmt_2_1_1")) return false;
    identifier_stmt(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // DEVIATE_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt
  //     | min_elements_stmt | max_elements_stmt )*
  //   RIGHT_BRACE))
  public static boolean deviate_replace_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_replace_stmt")) return false;
    if (!nextTokenIs(builder, YANG_DEVIATE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_DEVIATE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && deviate_replace_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_DEVIATE_REPLACE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt
  //     | min_elements_stmt | max_elements_stmt )*
  //   RIGHT_BRACE)
  private static boolean deviate_replace_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_replace_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = deviate_replace_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt
  //     | min_elements_stmt | max_elements_stmt )*
  //   RIGHT_BRACE
  private static boolean deviate_replace_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_replace_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && deviate_replace_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt
  //     | min_elements_stmt | max_elements_stmt )*
  private static boolean deviate_replace_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_replace_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!deviate_replace_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "deviate_replace_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |type_stmt | units_stmt | default_stmt | config_stmt | mandatory_stmt
  //     | min_elements_stmt | max_elements_stmt
  private static boolean deviate_replace_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviate_replace_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = type_stmt(builder, level + 1);
    if (!result) result = units_stmt(builder, level + 1);
    if (!result) result = default_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = mandatory_stmt(builder, level + 1);
    if (!result) result = min_elements_stmt(builder, level + 1);
    if (!result) result = max_elements_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // DEVIATION_KEYWORD string LEFT_BRACE
  //   (identifier_stmt |description_stmt | reference_stmt | deviate_not_supported_stmt
  //     | deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)+
  //   RIGHT_BRACE
  public static boolean deviation_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviation_stmt")) return false;
    if (!nextTokenIs(builder, YANG_DEVIATION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_DEVIATION_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && deviation_stmt_3(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_DEVIATION_STMT, result);
    return result;
  }

  // (identifier_stmt |description_stmt | reference_stmt | deviate_not_supported_stmt
  //     | deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt)+
  private static boolean deviation_stmt_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviation_stmt_3")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = deviation_stmt_3_0(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!deviation_stmt_3_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "deviation_stmt_3", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  // identifier_stmt |description_stmt | reference_stmt | deviate_not_supported_stmt
  //     | deviate_add_stmt | deviate_replace_stmt | deviate_delete_stmt
  private static boolean deviation_stmt_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "deviation_stmt_3_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = deviate_not_supported_stmt(builder, level + 1);
    if (!result) result = deviate_add_stmt(builder, level + 1);
    if (!result) result = deviate_replace_stmt(builder, level + 1);
    if (!result) result = deviate_delete_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // (SEMICOLON) | (LEFT_BRACE identifier_stmt? RIGHT_BRACE)
  public static boolean end_statement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "end_statement")) return false;
    if (!nextTokenIs(builder, "<end statement>", YANG_LEFT_BRACE, YANG_SEMICOLON)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_END_STATEMENT, "<end statement>");
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = end_statement_1(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // LEFT_BRACE identifier_stmt? RIGHT_BRACE
  private static boolean end_statement_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "end_statement_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && end_statement_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // identifier_stmt?
  private static boolean end_statement_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "end_statement_1_1")) return false;
    identifier_stmt(builder, level + 1);
    return true;
  }

  /* ********************************************************** */
  // enum_stmt (identifier_stmt | enum_stmt )*
  public static boolean enum_specification(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_specification")) return false;
    if (!nextTokenIs(builder, YANG_ENUM_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = enum_stmt(builder, level + 1);
    result = result && enum_specification_1(builder, level + 1);
    exit_section_(builder, marker, YANG_ENUM_SPECIFICATION, result);
    return result;
  }

  // (identifier_stmt | enum_stmt )*
  private static boolean enum_specification_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_specification_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!enum_specification_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "enum_specification_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | enum_stmt
  private static boolean enum_specification_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_specification_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = enum_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // ENUM_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE))
  public static boolean enum_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_stmt")) return false;
    if (!nextTokenIs(builder, YANG_ENUM_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_ENUM_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && enum_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_ENUM_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE)
  private static boolean enum_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = enum_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE
  private static boolean enum_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && enum_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean enum_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!enum_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "enum_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |value_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean enum_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "enum_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = value_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // ERROR_APP_TAG_KEYWORD string end_statement
  public static boolean error_app_tag_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "error_app_tag_stmt")) return false;
    if (!nextTokenIs(builder, YANG_ERROR_APP_TAG_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_ERROR_APP_TAG_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_ERROR_APP_TAG_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // ERROR_MESSAGE_KEYWORD string end_statement
  public static boolean error_message_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "error_message_stmt")) return false;
    if (!nextTokenIs(builder, YANG_ERROR_MESSAGE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_ERROR_MESSAGE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_ERROR_MESSAGE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // EXTENSION_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE))
  public static boolean extension_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "extension_stmt")) return false;
    if (!nextTokenIs(builder, YANG_EXTENSION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_EXTENSION_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && extension_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_EXTENSION_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE)
  private static boolean extension_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "extension_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = extension_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE
  private static boolean extension_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "extension_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && extension_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean extension_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "extension_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!extension_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "extension_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // unknown_statement | argument_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean extension_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "extension_stmt_2_1_1_0")) return false;
    boolean result;
    result = unknown_statement(builder, level + 1);
    if (!result) result = argument_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // FEATURE_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE))
  public static boolean feature_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "feature_stmt")) return false;
    if (!nextTokenIs(builder, YANG_FEATURE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_FEATURE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && feature_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_FEATURE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE)
  private static boolean feature_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "feature_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = feature_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE
  private static boolean feature_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "feature_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && feature_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean feature_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "feature_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!feature_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "feature_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | if_feature_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean feature_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "feature_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // FRACTION_DIGITS_KEYWORD string end_statement
  public static boolean fraction_digits_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "fraction_digits_stmt")) return false;
    if (!nextTokenIs(builder, YANG_FRACTION_DIGITS_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_FRACTION_DIGITS_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_FRACTION_DIGITS_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // GROUPING_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt )* 
  //   RIGHT_BRACE))
  public static boolean grouping_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "grouping_stmt")) return false;
    if (!nextTokenIs(builder, YANG_GROUPING_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_GROUPING_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && grouping_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_GROUPING_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt )* 
  //   RIGHT_BRACE)
  private static boolean grouping_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "grouping_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = grouping_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt )* 
  //   RIGHT_BRACE
  private static boolean grouping_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "grouping_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && grouping_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt )*
  private static boolean grouping_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "grouping_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!grouping_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "grouping_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |status_stmt | description_stmt | reference_stmt | typedef_stmt 
  //     | grouping_stmt | data_def_stmt
  private static boolean grouping_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "grouping_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = typedef_stmt(builder, level + 1);
    if (!result) result = grouping_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // IDENTIFIER string? (end_statement | (LEFT_BRACE
  //   unknown_statement*
  //   RIGHT_BRACE))
  public static boolean identifier_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identifier_stmt")) return false;
    if (!nextTokenIs(builder, YANG_IDENTIFIER)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_IDENTIFIER);
    result = result && identifier_stmt_1(builder, level + 1);
    result = result && identifier_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_IDENTIFIER_STMT, result);
    return result;
  }

  // string?
  private static boolean identifier_stmt_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identifier_stmt_1")) return false;
    string(builder, level + 1);
    return true;
  }

  // end_statement | (LEFT_BRACE
  //   unknown_statement*
  //   RIGHT_BRACE)
  private static boolean identifier_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identifier_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = end_statement(builder, level + 1);
    if (!result) result = identifier_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   unknown_statement*
  //   RIGHT_BRACE
  private static boolean identifier_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identifier_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && identifier_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // unknown_statement*
  private static boolean identifier_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identifier_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!unknown_statement(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "identifier_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTITY_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE))
  public static boolean identity_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identity_stmt")) return false;
    if (!nextTokenIs(builder, YANG_IDENTITY_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_IDENTITY_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && identity_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_IDENTITY_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE)
  private static boolean identity_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identity_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = identity_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE
  private static boolean identity_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identity_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && identity_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt )*
  private static boolean identity_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identity_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!identity_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "identity_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | base_stmt | status_stmt | description_stmt | reference_stmt
  private static boolean identity_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identity_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = base_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // base_stmt
  public static boolean identityref_specification(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "identityref_specification")) return false;
    if (!nextTokenIs(builder, YANG_BASE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = base_stmt(builder, level + 1);
    exit_section_(builder, marker, YANG_IDENTITYREF_SPECIFICATION, result);
    return result;
  }

  /* ********************************************************** */
  // IF_FEATURE_KEYWORD string end_statement
  public static boolean if_feature_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "if_feature_stmt")) return false;
    if (!nextTokenIs(builder, YANG_IF_FEATURE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_IF_FEATURE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_IF_FEATURE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // IMPORT_KEYWORD string LEFT_BRACE
  //   prefix_stmt  (revision_date_stmt )?
  //   RIGHT_BRACE
  public static boolean import_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "import_stmt")) return false;
    if (!nextTokenIs(builder, YANG_IMPORT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_IMPORT_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && prefix_stmt(builder, level + 1);
    result = result && import_stmt_4(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_IMPORT_STMT, result);
    return result;
  }

  // (revision_date_stmt )?
  private static boolean import_stmt_4(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "import_stmt_4")) return false;
    import_stmt_4_0(builder, level + 1);
    return true;
  }

  // (revision_date_stmt )
  private static boolean import_stmt_4_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "import_stmt_4_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = revision_date_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // INCLUDE_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (revision_date_stmt )?
  //   RIGHT_BRACE))
  public static boolean include_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "include_stmt")) return false;
    if (!nextTokenIs(builder, YANG_INCLUDE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_INCLUDE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && include_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_INCLUDE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (revision_date_stmt )?
  //   RIGHT_BRACE)
  private static boolean include_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "include_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = include_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (revision_date_stmt )?
  //   RIGHT_BRACE
  private static boolean include_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "include_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && include_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (revision_date_stmt )?
  private static boolean include_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "include_stmt_2_1_1")) return false;
    include_stmt_2_1_1_0(builder, level + 1);
    return true;
  }

  // (revision_date_stmt )
  private static boolean include_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "include_stmt_2_1_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = revision_date_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // INPUT_KEYWORD LEFT_BRACE
  //   (identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt )*
  //   RIGHT_BRACE
  public static boolean input_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_stmt")) return false;
    if (!nextTokenIs(builder, YANG_INPUT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, YANG_INPUT_KEYWORD, YANG_LEFT_BRACE);
    result = result && input_stmt_2(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_INPUT_STMT, result);
    return result;
  }

  // (identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean input_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_stmt_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!input_stmt_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "input_stmt_2", pos)) break;
    }
    return true;
  }

  // identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean input_stmt_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "input_stmt_2_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = typedef_stmt(builder, level + 1);
    if (!result) result = grouping_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // KEY_KEYWORD string end_statement
  public static boolean key_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "key_stmt")) return false;
    if (!nextTokenIs(builder, YANG_KEY_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_KEY_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_KEY_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // LEAF_LIST_KEYWORD string LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt 
  //     | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt 
  //     | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE
  public static boolean leaf_list_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "leaf_list_stmt")) return false;
    if (!nextTokenIs(builder, YANG_LEAF_LIST_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEAF_LIST_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && leaf_list_stmt_3(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_LEAF_LIST_STMT, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt 
  //     | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt 
  //     | description_stmt | reference_stmt )*
  private static boolean leaf_list_stmt_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "leaf_list_stmt_3")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!leaf_list_stmt_3_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "leaf_list_stmt_3", pos)) break;
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt 
  //     | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt 
  //     | description_stmt | reference_stmt
  private static boolean leaf_list_stmt_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "leaf_list_stmt_3_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = type_stmt(builder, level + 1);
    if (!result) result = units_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = min_elements_stmt(builder, level + 1);
    if (!result) result = max_elements_stmt(builder, level + 1);
    if (!result) result = ordered_by_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // LEAF_KEYWORD string LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt 
  //     | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt 
  //     | reference_stmt )*
  //   RIGHT_BRACE
  public static boolean leaf_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "leaf_stmt")) return false;
    if (!nextTokenIs(builder, YANG_LEAF_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEAF_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && leaf_stmt_3(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_LEAF_STMT, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt 
  //     | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt 
  //     | reference_stmt )*
  private static boolean leaf_stmt_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "leaf_stmt_3")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!leaf_stmt_3_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "leaf_stmt_3", pos)) break;
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | type_stmt | units_stmt | must_stmt 
  //     | default_stmt | config_stmt | mandatory_stmt | status_stmt | description_stmt 
  //     | reference_stmt
  private static boolean leaf_stmt_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "leaf_stmt_3_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = type_stmt(builder, level + 1);
    if (!result) result = units_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = default_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = mandatory_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // path_stmt
  public static boolean leafref_specification(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "leafref_specification")) return false;
    if (!nextTokenIs(builder, YANG_PATH_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = path_stmt(builder, level + 1);
    exit_section_(builder, marker, YANG_LEAFREF_SPECIFICATION, result);
    return result;
  }

  /* ********************************************************** */
  // LENGTH_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE))
  public static boolean length_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "length_stmt")) return false;
    if (!nextTokenIs(builder, YANG_LENGTH_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LENGTH_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && length_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_LENGTH_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE)
  private static boolean length_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "length_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = length_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE
  private static boolean length_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "length_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && length_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  private static boolean length_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "length_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!length_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "length_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean length_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "length_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = error_message_stmt(builder, level + 1);
    if (!result) result = error_app_tag_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // (import_stmt | include_stmt )*
  public static boolean linkage_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "linkage_stmts")) return false;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_LINKAGE_STMTS, "<linkage stmts>");
    while (true) {
      int pos = current_position_(builder);
      if (!linkage_stmts_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "linkage_stmts", pos)) break;
    }
    exit_section_(builder, level, marker, true, false, null);
    return true;
  }

  // import_stmt | include_stmt
  private static boolean linkage_stmts_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "linkage_stmts_0")) return false;
    boolean result;
    result = import_stmt(builder, level + 1);
    if (!result) result = include_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // LIST_KEYWORD string LEFT_BRACE  
  //   (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt 
  //     | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt 
  //     | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )* 
  //   RIGHT_BRACE
  public static boolean list_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "list_stmt")) return false;
    if (!nextTokenIs(builder, YANG_LIST_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LIST_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && list_stmt_3(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_LIST_STMT, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt 
  //     | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt 
  //     | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean list_stmt_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "list_stmt_3")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!list_stmt_3_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "list_stmt_3", pos)) break;
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | must_stmt | key_stmt | unique_stmt 
  //     | config_stmt | min_elements_stmt | max_elements_stmt | ordered_by_stmt | status_stmt 
  //     | description_stmt | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean list_stmt_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "list_stmt_3_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = key_stmt(builder, level + 1);
    if (!result) result = unique_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = min_elements_stmt(builder, level + 1);
    if (!result) result = max_elements_stmt(builder, level + 1);
    if (!result) result = ordered_by_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = typedef_stmt(builder, level + 1);
    if (!result) result = grouping_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // string
  public static boolean mandatory_arg(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "mandatory_arg")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_MANDATORY_ARG, "<mandatory arg>");
    result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // MANDATORY_KEYWORD mandatory_arg end_statement
  public static boolean mandatory_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "mandatory_stmt")) return false;
    if (!nextTokenIs(builder, YANG_MANDATORY_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_MANDATORY_KEYWORD);
    result = result && mandatory_arg(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_MANDATORY_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // MAX_ELEMENTS_KEYWORD max_value_arg end_statement
  public static boolean max_elements_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "max_elements_stmt")) return false;
    if (!nextTokenIs(builder, YANG_MAX_ELEMENTS_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_MAX_ELEMENTS_KEYWORD);
    result = result && max_value_arg(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_MAX_ELEMENTS_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // string
  public static boolean max_value_arg(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "max_value_arg")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_MAX_VALUE_ARG, "<max value arg>");
    result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // (organization_stmt | contact_stmt | description_stmt | reference_stmt )*
  public static boolean meta_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "meta_stmts")) return false;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_META_STMTS, "<meta stmts>");
    while (true) {
      int pos = current_position_(builder);
      if (!meta_stmts_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "meta_stmts", pos)) break;
    }
    exit_section_(builder, level, marker, true, false, null);
    return true;
  }

  // organization_stmt | contact_stmt | description_stmt | reference_stmt
  private static boolean meta_stmts_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "meta_stmts_0")) return false;
    boolean result;
    result = organization_stmt(builder, level + 1);
    if (!result) result = contact_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // MIN_ELEMENTS_KEYWORD min_value_arg end_statement
  public static boolean min_elements_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "min_elements_stmt")) return false;
    if (!nextTokenIs(builder, YANG_MIN_ELEMENTS_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_MIN_ELEMENTS_KEYWORD);
    result = result && min_value_arg(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_MIN_ELEMENTS_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // string
  public static boolean min_value_arg(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "min_value_arg")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_MIN_VALUE_ARG, "<min value arg>");
    result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // (yang_version_stmt | namespace_stmt | prefix_stmt)+
  public static boolean module_header_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "module_header_stmts")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_MODULE_HEADER_STMTS, "<module header stmts>");
    result = module_header_stmts_0(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!module_header_stmts_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "module_header_stmts", pos)) break;
    }
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // yang_version_stmt | namespace_stmt | prefix_stmt
  private static boolean module_header_stmts_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "module_header_stmts_0")) return false;
    boolean result;
    result = yang_version_stmt(builder, level + 1);
    if (!result) result = namespace_stmt(builder, level + 1);
    if (!result) result = prefix_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // MODULE_KEYWORD string LEFT_BRACE
  //   module_header_stmts linkage_stmts meta_stmts revision_stmts body_stmts
  //   RIGHT_BRACE
  public static boolean module_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "module_stmt")) return false;
    if (!nextTokenIs(builder, YANG_MODULE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_MODULE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && module_header_stmts(builder, level + 1);
    result = result && linkage_stmts(builder, level + 1);
    result = result && meta_stmts(builder, level + 1);
    result = result && revision_stmts(builder, level + 1);
    result = result && body_stmts(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_MODULE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // MUST_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE))
  public static boolean must_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "must_stmt")) return false;
    if (!nextTokenIs(builder, YANG_MUST_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_MUST_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && must_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_MUST_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE)
  private static boolean must_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "must_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = must_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE
  private static boolean must_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "must_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && must_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  private static boolean must_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "must_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!must_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "must_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean must_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "must_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = error_message_stmt(builder, level + 1);
    if (!result) result = error_app_tag_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // NAMESPACE_KEYWORD string end_statement
  public static boolean namespace_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "namespace_stmt")) return false;
    if (!nextTokenIs(builder, YANG_NAMESPACE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_NAMESPACE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_NAMESPACE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // NOTIFICATION_KEYWORD string (SEMICOLON |
  //   (LEFT_BRACE (identifier_stmt |if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  //   RIGHT_BRACE))
  public static boolean notification_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "notification_stmt")) return false;
    if (!nextTokenIs(builder, YANG_NOTIFICATION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_NOTIFICATION_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && notification_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_NOTIFICATION_STMT, result);
    return result;
  }

  // SEMICOLON |
  //   (LEFT_BRACE (identifier_stmt |if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  //   RIGHT_BRACE)
  private static boolean notification_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "notification_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = notification_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE (identifier_stmt |if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  //   RIGHT_BRACE
  private static boolean notification_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "notification_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && notification_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean notification_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "notification_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!notification_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "notification_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean notification_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "notification_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = typedef_stmt(builder, level + 1);
    if (!result) result = grouping_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // range_stmt
  public static boolean numerical_restrictions(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "numerical_restrictions")) return false;
    if (!nextTokenIs(builder, YANG_RANGE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = range_stmt(builder, level + 1);
    exit_section_(builder, marker, YANG_NUMERICAL_RESTRICTIONS, result);
    return result;
  }

  /* ********************************************************** */
  // string
  public static boolean ordered_by_arg(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ordered_by_arg")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_ORDERED_BY_ARG, "<ordered by arg>");
    result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // ORDERED_BY_KEYWORD ordered_by_arg end_statement
  public static boolean ordered_by_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "ordered_by_stmt")) return false;
    if (!nextTokenIs(builder, YANG_ORDERED_BY_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_ORDERED_BY_KEYWORD);
    result = result && ordered_by_arg(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_ORDERED_BY_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // ORGANIZATION_KEYWORD string end_statement
  public static boolean organization_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "organization_stmt")) return false;
    if (!nextTokenIs(builder, YANG_ORGANIZATION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_ORGANIZATION_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_ORGANIZATION_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // OUTPUT_KEYWORD LEFT_BRACE
  //   (identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt )*
  //   RIGHT_BRACE
  public static boolean output_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "output_stmt")) return false;
    if (!nextTokenIs(builder, YANG_OUTPUT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, YANG_OUTPUT_KEYWORD, YANG_LEFT_BRACE);
    result = result && output_stmt_2(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_OUTPUT_STMT, result);
    return result;
  }

  // (identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt )*
  private static boolean output_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "output_stmt_2")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!output_stmt_2_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "output_stmt_2", pos)) break;
    }
    return true;
  }

  // identifier_stmt |typedef_stmt | grouping_stmt | data_def_stmt
  private static boolean output_stmt_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "output_stmt_2_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = typedef_stmt(builder, level + 1);
    if (!result) result = grouping_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // PATH_KEYWORD string end_statement
  public static boolean path_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "path_stmt")) return false;
    if (!nextTokenIs(builder, YANG_PATH_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_PATH_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_PATH_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // PATTERN_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE))
  public static boolean pattern_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "pattern_stmt")) return false;
    if (!nextTokenIs(builder, YANG_PATTERN_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_PATTERN_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && pattern_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_PATTERN_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE)
  private static boolean pattern_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "pattern_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = pattern_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )* 
  //   RIGHT_BRACE
  private static boolean pattern_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "pattern_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && pattern_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  private static boolean pattern_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "pattern_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!pattern_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "pattern_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean pattern_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "pattern_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = error_message_stmt(builder, level + 1);
    if (!result) result = error_app_tag_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // POSITION_KEYWORD string end_statement
  public static boolean position_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "position_stmt")) return false;
    if (!nextTokenIs(builder, YANG_POSITION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_POSITION_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_POSITION_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // PREFIX_KEYWORD string end_statement
  public static boolean prefix_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "prefix_stmt")) return false;
    if (!nextTokenIs(builder, YANG_PREFIX_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_PREFIX_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_PREFIX_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // PRESENCE_KEYWORD string end_statement
  public static boolean presence_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "presence_stmt")) return false;
    if (!nextTokenIs(builder, YANG_PRESENCE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_PRESENCE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_PRESENCE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // RANGE_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE))
  public static boolean range_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "range_stmt")) return false;
    if (!nextTokenIs(builder, YANG_RANGE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_RANGE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && range_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_RANGE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE)
  private static boolean range_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "range_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = range_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  //   RIGHT_BRACE
  private static boolean range_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "range_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && range_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt )*
  private static boolean range_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "range_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!range_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "range_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | error_message_stmt | error_app_tag_stmt | description_stmt | reference_stmt
  private static boolean range_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "range_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = error_message_stmt(builder, level + 1);
    if (!result) result = error_app_tag_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // REFERENCE_KEYWORD string end_statement
  public static boolean reference_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "reference_stmt")) return false;
    if (!nextTokenIs(builder, YANG_REFERENCE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_REFERENCE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_REFERENCE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // identifier_stmt | must_stmt | config_stmt | mandatory_stmt
  //   | description_stmt | reference_stmt
  static boolean refine_anyxml_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_anyxml_stmts")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = mandatory_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // identifier_stmt | description_stmt | reference_stmt
  static boolean refine_case_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_case_stmts")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // identifier_stmt | default_stmt | config_stmt | mandatory_stmt
  //   | description_stmt | reference_stmt
  static boolean refine_choice_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_choice_stmts")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = default_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = mandatory_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // identifier_stmt | must_stmt | presence_stmt | config_stmt
  //   | description_stmt | reference_stmt
  static boolean refine_container_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_container_stmts")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = presence_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // identifier_stmt | must_stmt | config_stmt | min_elements_stmt
  //   | max_elements_stmt | description_stmt | reference_stmt
  static boolean refine_leaf_list_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_leaf_list_stmts")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = min_elements_stmt(builder, level + 1);
    if (!result) result = max_elements_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // identifier_stmt | must_stmt | default_stmt | config_stmt
  //   | mandatory_stmt | description_stmt | reference_stmt
  static boolean refine_leaf_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_leaf_stmts")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = default_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = mandatory_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // identifier_stmt | must_stmt | config_stmt | min_elements_stmt
  //   | max_elements_stmt | description_stmt | reference_stmt
  static boolean refine_list_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_list_stmts")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = must_stmt(builder, level + 1);
    if (!result) result = config_stmt(builder, level + 1);
    if (!result) result = min_elements_stmt(builder, level + 1);
    if (!result) result = max_elements_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // REFINE_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts
  //     | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts)*
  //   RIGHT_BRACE))
  public static boolean refine_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_stmt")) return false;
    if (!nextTokenIs(builder, YANG_REFINE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_REFINE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && refine_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_REFINE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts
  //     | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts)*
  //   RIGHT_BRACE)
  private static boolean refine_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = refine_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts
  //     | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts)*
  //   RIGHT_BRACE
  private static boolean refine_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && refine_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts
  //     | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts)*
  private static boolean refine_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!refine_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "refine_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // refine_container_stmts | refine_leaf_stmts | refine_leaf_list_stmts
  //     | refine_list_stmts | refine_choice_stmts | refine_case_stmts | refine_anyxml_stmts
  private static boolean refine_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "refine_stmt_2_1_1_0")) return false;
    boolean result;
    result = refine_container_stmts(builder, level + 1);
    if (!result) result = refine_leaf_stmts(builder, level + 1);
    if (!result) result = refine_leaf_list_stmts(builder, level + 1);
    if (!result) result = refine_list_stmts(builder, level + 1);
    if (!result) result = refine_choice_stmts(builder, level + 1);
    if (!result) result = refine_case_stmts(builder, level + 1);
    if (!result) result = refine_anyxml_stmts(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // string
  public static boolean require_instance_arg(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "require_instance_arg")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_REQUIRE_INSTANCE_ARG, "<require instance arg>");
    result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // REQUIRE_INSTANCE_KEYWORD require_instance_arg end_statement
  public static boolean require_instance_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "require_instance_stmt")) return false;
    if (!nextTokenIs(builder, YANG_REQUIRE_INSTANCE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_REQUIRE_INSTANCE_KEYWORD);
    result = result && require_instance_arg(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_REQUIRE_INSTANCE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // REVISION_DATE_KEYWORD string end_statement
  public static boolean revision_date_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_date_stmt")) return false;
    if (!nextTokenIs(builder, YANG_REVISION_DATE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_REVISION_DATE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_REVISION_DATE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // REVISION_KEYWORD string (SEMICOLON | (LEFT_BRACE  
  //   (description_stmt )? (reference_stmt )? 
  //   RIGHT_BRACE))
  public static boolean revision_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmt")) return false;
    if (!nextTokenIs(builder, YANG_REVISION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_REVISION_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && revision_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_REVISION_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE  
  //   (description_stmt )? (reference_stmt )? 
  //   RIGHT_BRACE)
  private static boolean revision_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = revision_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE  
  //   (description_stmt )? (reference_stmt )? 
  //   RIGHT_BRACE
  private static boolean revision_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && revision_stmt_2_1_1(builder, level + 1);
    result = result && revision_stmt_2_1_2(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (description_stmt )?
  private static boolean revision_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmt_2_1_1")) return false;
    revision_stmt_2_1_1_0(builder, level + 1);
    return true;
  }

  // (description_stmt )
  private static boolean revision_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmt_2_1_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = description_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (reference_stmt )?
  private static boolean revision_stmt_2_1_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmt_2_1_2")) return false;
    revision_stmt_2_1_2_0(builder, level + 1);
    return true;
  }

  // (reference_stmt )
  private static boolean revision_stmt_2_1_2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmt_2_1_2_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = reference_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // (revision_stmt )*
  public static boolean revision_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmts")) return false;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_REVISION_STMTS, "<revision stmts>");
    while (true) {
      int pos = current_position_(builder);
      if (!revision_stmts_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "revision_stmts", pos)) break;
    }
    exit_section_(builder, level, marker, true, false, null);
    return true;
  }

  // (revision_stmt )
  private static boolean revision_stmts_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "revision_stmts_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = revision_stmt(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // RPC_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt
  //     | typedef_stmt | grouping_stmt | input_stmt | output_stmt )*
  //   RIGHT_BRACE))
  public static boolean rpc_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rpc_stmt")) return false;
    if (!nextTokenIs(builder, YANG_RPC_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_RPC_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && rpc_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_RPC_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt
  //     | typedef_stmt | grouping_stmt | input_stmt | output_stmt )*
  //   RIGHT_BRACE)
  private static boolean rpc_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rpc_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = rpc_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt
  //     | typedef_stmt | grouping_stmt | input_stmt | output_stmt )*
  //   RIGHT_BRACE
  private static boolean rpc_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rpc_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && rpc_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt
  //     | typedef_stmt | grouping_stmt | input_stmt | output_stmt )*
  private static boolean rpc_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rpc_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!rpc_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "rpc_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |if_feature_stmt  | status_stmt | description_stmt | reference_stmt
  //     | typedef_stmt | grouping_stmt | input_stmt | output_stmt
  private static boolean rpc_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "rpc_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = typedef_stmt(builder, level + 1);
    if (!result) result = grouping_stmt(builder, level + 1);
    if (!result) result = input_stmt(builder, level + 1);
    if (!result) result = output_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // container_stmt | leaf_stmt | leaf_list_stmt | list_stmt | anyxml_stmt
  public static boolean short_case_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "short_case_stmt")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_SHORT_CASE_STMT, "<short case stmt>");
    result = container_stmt(builder, level + 1);
    if (!result) result = leaf_stmt(builder, level + 1);
    if (!result) result = leaf_list_stmt(builder, level + 1);
    if (!result) result = list_stmt(builder, level + 1);
    if (!result) result = anyxml_stmt(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // string
  public static boolean status_arg(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "status_arg")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_STATUS_ARG, "<status arg>");
    result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // STATUS_KEYWORD status_arg end_statement
  public static boolean status_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "status_stmt")) return false;
    if (!nextTokenIs(builder, YANG_STATUS_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_STATUS_KEYWORD);
    result = result && status_arg(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_STATUS_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // ( STRING_LITERAL (PLUS STRING_LITERAL)* ) | "!"
  public static boolean string(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "string")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_STRING, "<string>");
    result = string_0(builder, level + 1);
    if (!result) result = consumeToken(builder, "!");
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // STRING_LITERAL (PLUS STRING_LITERAL)*
  private static boolean string_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "string_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_STRING_LITERAL);
    result = result && string_0_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (PLUS STRING_LITERAL)*
  private static boolean string_0_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "string_0_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!string_0_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "string_0_1", pos)) break;
    }
    return true;
  }

  // PLUS STRING_LITERAL
  private static boolean string_0_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "string_0_1_0")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeTokens(builder, 0, YANG_PLUS, YANG_STRING_LITERAL);
    exit_section_(builder, marker, null, result);
    return result;
  }

  /* ********************************************************** */
  // length_stmt | pattern_stmt
  public static boolean string_restrictions(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "string_restrictions")) return false;
    if (!nextTokenIs(builder, "<string restrictions>", YANG_LENGTH_KEYWORD, YANG_PATTERN_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_STRING_RESTRICTIONS, "<string restrictions>");
    result = length_stmt(builder, level + 1);
    if (!result) result = pattern_stmt(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // (yang_version_stmt | belongs_to_stmt)+
  public static boolean submodule_header_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "submodule_header_stmts")) return false;
    if (!nextTokenIs(builder, "<submodule header stmts>", YANG_BELONGS_TO_KEYWORD, YANG_YANG_VERSION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_SUBMODULE_HEADER_STMTS, "<submodule header stmts>");
    result = submodule_header_stmts_0(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!submodule_header_stmts_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "submodule_header_stmts", pos)) break;
    }
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // yang_version_stmt | belongs_to_stmt
  private static boolean submodule_header_stmts_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "submodule_header_stmts_0")) return false;
    boolean result;
    result = yang_version_stmt(builder, level + 1);
    if (!result) result = belongs_to_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // SUBMODULE_KEYWORD string LEFT_BRACE
  //   submodule_header_stmts linkage_stmts meta_stmts revision_stmts body_stmts
  //   RIGHT_BRACE
  public static boolean submodule_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "submodule_stmt")) return false;
    if (!nextTokenIs(builder, YANG_SUBMODULE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SUBMODULE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && submodule_header_stmts(builder, level + 1);
    result = result && linkage_stmts(builder, level + 1);
    result = result && meta_stmts(builder, level + 1);
    result = result && revision_stmts(builder, level + 1);
    result = result && body_stmts(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_SUBMODULE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // numerical_restrictions | enum_specification | string_restrictions
  //    | leafref_specification | identityref_specification | require_instance_stmt
  //    | bits_specification | union_specification | decimal64_specification
  //    | identifier_stmt
  public static boolean type_body_stmts(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_body_stmts")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_TYPE_BODY_STMTS, "<type body stmts>");
    result = numerical_restrictions(builder, level + 1);
    if (!result) result = enum_specification(builder, level + 1);
    if (!result) result = string_restrictions(builder, level + 1);
    if (!result) result = leafref_specification(builder, level + 1);
    if (!result) result = identityref_specification(builder, level + 1);
    if (!result) result = require_instance_stmt(builder, level + 1);
    if (!result) result = bits_specification(builder, level + 1);
    if (!result) result = union_specification(builder, level + 1);
    if (!result) result = decimal64_specification(builder, level + 1);
    if (!result) result = identifier_stmt(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // TYPE_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   ( type_stmt | type_body_stmts )*
  //   RIGHT_BRACE))
  public static boolean type_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_stmt")) return false;
    if (!nextTokenIs(builder, YANG_TYPE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_TYPE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && type_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_TYPE_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   ( type_stmt | type_body_stmts )*
  //   RIGHT_BRACE)
  private static boolean type_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = type_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   ( type_stmt | type_body_stmts )*
  //   RIGHT_BRACE
  private static boolean type_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && type_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // ( type_stmt | type_body_stmts )*
  private static boolean type_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!type_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "type_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // type_stmt | type_body_stmts
  private static boolean type_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "type_stmt_2_1_1_0")) return false;
    boolean result;
    result = type_stmt(builder, level + 1);
    if (!result) result = type_body_stmts(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // TYPEDEF_KEYWORD string LEFT_BRACE
  //   ( type_stmt | identifier_stmt | units_stmt | default_stmt | status_stmt
  //    | description_stmt | reference_stmt )+
  //   RIGHT_BRACE
  public static boolean typedef_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typedef_stmt")) return false;
    if (!nextTokenIs(builder, YANG_TYPEDEF_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_TYPEDEF_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && typedef_stmt_3(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_TYPEDEF_STMT, result);
    return result;
  }

  // ( type_stmt | identifier_stmt | units_stmt | default_stmt | status_stmt
  //    | description_stmt | reference_stmt )+
  private static boolean typedef_stmt_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typedef_stmt_3")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = typedef_stmt_3_0(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!typedef_stmt_3_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "typedef_stmt_3", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  // type_stmt | identifier_stmt | units_stmt | default_stmt | status_stmt
  //    | description_stmt | reference_stmt
  private static boolean typedef_stmt_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "typedef_stmt_3_0")) return false;
    boolean result;
    result = type_stmt(builder, level + 1);
    if (!result) result = identifier_stmt(builder, level + 1);
    if (!result) result = units_stmt(builder, level + 1);
    if (!result) result = default_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // type_stmt (identifier_stmt | type_stmt )+
  public static boolean union_specification(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "union_specification")) return false;
    if (!nextTokenIs(builder, YANG_TYPE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = type_stmt(builder, level + 1);
    result = result && union_specification_1(builder, level + 1);
    exit_section_(builder, marker, YANG_UNION_SPECIFICATION, result);
    return result;
  }

  // (identifier_stmt | type_stmt )+
  private static boolean union_specification_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "union_specification_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = union_specification_1_0(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!union_specification_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "union_specification_1", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  // identifier_stmt | type_stmt
  private static boolean union_specification_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "union_specification_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = type_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // UNIQUE_KEYWORD string end_statement
  public static boolean unique_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unique_stmt")) return false;
    if (!nextTokenIs(builder, YANG_UNIQUE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_UNIQUE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_UNIQUE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // UNITS_KEYWORD string end_statement
  public static boolean units_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "units_stmt")) return false;
    if (!nextTokenIs(builder, YANG_UNITS_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_UNITS_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_UNITS_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // (YIN_ELEMENT_KEYWORD | YANG_VERSION_KEYWORD | DESCRIPTION_KEYWORD | WHEN_KEYWORD
  //   | VALUE_KEYWORD | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD | TYPEDEF_KEYWORD | TYPE_KEYWORD
  //   | SUBMODULE_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD | REQUIRE_INSTANCE_KEYWORD
  //   | REFINE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD | POSITION_KEYWORD
  //   | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD
  //   | NOTIFICATION_KEYWORD| NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD
  //   | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD | LENGTH_KEYWORD | LEAF_LIST_KEYWORD
  //   | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD
  //   | IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD
  //   | DEVIATION_KEYWORD | EXTENSION_KEYWORD | ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD
  //   | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD | CONFIG_KEYWORD | CHOICE_KEYWORD
  //   | CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD | ANYXML_KEYWORD | IDENTIFIER)
  //   string? (SEMICOLON | (LEFT_BRACE unknown_statement2* RIGHT_BRACE))
  public static boolean unknown_statement(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_UNKNOWN_STATEMENT, "<unknown statement>");
    result = unknown_statement_0(builder, level + 1);
    result = result && unknown_statement_1(builder, level + 1);
    result = result && unknown_statement_2(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // YIN_ELEMENT_KEYWORD | YANG_VERSION_KEYWORD | DESCRIPTION_KEYWORD | WHEN_KEYWORD
  //   | VALUE_KEYWORD | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD | TYPEDEF_KEYWORD | TYPE_KEYWORD
  //   | SUBMODULE_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD | REQUIRE_INSTANCE_KEYWORD
  //   | REFINE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD | POSITION_KEYWORD
  //   | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD
  //   | NOTIFICATION_KEYWORD| NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD
  //   | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD | LENGTH_KEYWORD | LEAF_LIST_KEYWORD
  //   | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD
  //   | IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD
  //   | DEVIATION_KEYWORD | EXTENSION_KEYWORD | ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD
  //   | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD | CONFIG_KEYWORD | CHOICE_KEYWORD
  //   | CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD | ANYXML_KEYWORD | IDENTIFIER
  private static boolean unknown_statement_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement_0")) return false;
    boolean result;
    result = consumeToken(builder, YANG_YIN_ELEMENT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_YANG_VERSION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DESCRIPTION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_WHEN_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_VALUE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_USES_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_UNITS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_UNIQUE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_TYPEDEF_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_TYPE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_SUBMODULE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_RPC_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REVISION_DATE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REVISION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REQUIRE_INSTANCE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REFINE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_RANGE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PRESENCE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PREFIX_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_POSITION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PATTERN_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PATH_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_OUTPUT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ORGANIZATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ORDERED_BY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_NOTIFICATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_NAMESPACE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MUST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MODULE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MIN_ELEMENTS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MAX_ELEMENTS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MANDATORY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LIST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LENGTH_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LEAF_LIST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LEAF_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_KEY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_INPUT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_INCLUDE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IMPORT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IF_FEATURE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IDENTITY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_GROUPING_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_FRACTION_DIGITS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_FEATURE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEVIATE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEVIATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_EXTENSION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ERROR_MESSAGE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ERROR_APP_TAG_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ENUM_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEFAULT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONTAINER_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONTACT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONFIG_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CHOICE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CASE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BIT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BELONGS_TO_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BASE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_AUGMENT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ANYXML_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IDENTIFIER);
    return result;
  }

  // string?
  private static boolean unknown_statement_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement_1")) return false;
    string(builder, level + 1);
    return true;
  }

  // SEMICOLON | (LEFT_BRACE unknown_statement2* RIGHT_BRACE)
  private static boolean unknown_statement_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = unknown_statement_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE unknown_statement2* RIGHT_BRACE
  private static boolean unknown_statement_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && unknown_statement_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // unknown_statement2*
  private static boolean unknown_statement_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!unknown_statement2(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "unknown_statement_2_1_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD | USES_KEYWORD
  //   | UNITS_KEYWORD | UNIQUE_KEYWORD | TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD | STATUS_KEYWORD
  //   | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD | REQUIRE_INSTANCE_KEYWORD | REFINE_KEYWORD
  //   | REFERENCE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD | POSITION_KEYWORD
  //   | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD
  //   | NOTIFICATION_KEYWORD| NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD
  //   | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD | LENGTH_KEYWORD | LEAF_LIST_KEYWORD
  //   | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD
  //   | IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD
  //   | DEVIATION_KEYWORD | EXTENSION_KEYWORD | ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD
  //   | DESCRIPTION_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD | CONFIG_KEYWORD
  //   | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD
  //   | ARGUMENT_KEYWORD | ANYXML_KEYWORD | IDENTIFIER)
  //   string? (SEMICOLON | (LEFT_BRACE unknown_statement3* RIGHT_BRACE))
  public static boolean unknown_statement2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement2")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_UNKNOWN_STATEMENT_2, "<unknown statement 2>");
    result = unknown_statement2_0(builder, level + 1);
    result = result && unknown_statement2_1(builder, level + 1);
    result = result && unknown_statement2_2(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD | USES_KEYWORD
  //   | UNITS_KEYWORD | UNIQUE_KEYWORD | TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD | STATUS_KEYWORD
  //   | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD | REQUIRE_INSTANCE_KEYWORD | REFINE_KEYWORD
  //   | REFERENCE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD | POSITION_KEYWORD
  //   | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD|  ORDERED_BY_KEYWORD
  //   | NOTIFICATION_KEYWORD| NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD | MIN_ELEMENTS_KEYWORD
  //   | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD | LENGTH_KEYWORD | LEAF_LIST_KEYWORD
  //   | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD | IF_FEATURE_KEYWORD
  //   | IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD | DEVIATE_KEYWORD
  //   | DEVIATION_KEYWORD | EXTENSION_KEYWORD | ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD | ENUM_KEYWORD
  //   | DESCRIPTION_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD | CONFIG_KEYWORD
  //   | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD | AUGMENT_KEYWORD
  //   | ARGUMENT_KEYWORD | ANYXML_KEYWORD | IDENTIFIER
  private static boolean unknown_statement2_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement2_0")) return false;
    boolean result;
    result = consumeToken(builder, YANG_YANG_VERSION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_WHEN_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_VALUE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_USES_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_UNITS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_UNIQUE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_TYPEDEF_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_TYPE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_SUBMODULE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_STATUS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_RPC_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REVISION_DATE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REVISION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REQUIRE_INSTANCE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REFINE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REFERENCE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_RANGE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PRESENCE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PREFIX_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_POSITION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PATTERN_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PATH_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_OUTPUT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ORGANIZATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ORDERED_BY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_NOTIFICATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_NAMESPACE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MUST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MODULE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MIN_ELEMENTS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MAX_ELEMENTS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MANDATORY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LIST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LENGTH_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LEAF_LIST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LEAF_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_KEY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_INPUT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_INCLUDE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IMPORT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IF_FEATURE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IDENTITY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_GROUPING_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_FRACTION_DIGITS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_FEATURE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEVIATE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEVIATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_EXTENSION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ERROR_MESSAGE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ERROR_APP_TAG_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ENUM_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DESCRIPTION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEFAULT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONTAINER_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONTACT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONFIG_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CHOICE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CASE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BIT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BELONGS_TO_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BASE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_AUGMENT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ARGUMENT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ANYXML_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IDENTIFIER);
    return result;
  }

  // string?
  private static boolean unknown_statement2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement2_1")) return false;
    string(builder, level + 1);
    return true;
  }

  // SEMICOLON | (LEFT_BRACE unknown_statement3* RIGHT_BRACE)
  private static boolean unknown_statement2_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement2_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = unknown_statement2_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE unknown_statement3* RIGHT_BRACE
  private static boolean unknown_statement2_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement2_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && unknown_statement2_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // unknown_statement3*
  private static boolean unknown_statement2_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement2_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!unknown_statement3(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "unknown_statement2_2_1_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (YIN_ELEMENT_KEYWORD | YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD
  //   | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD | TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD
  //   | STATUS_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD | REQUIRE_INSTANCE_KEYWORD
  //   | REFINE_KEYWORD | REFERENCE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD
  //   | POSITION_KEYWORD | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD
  //   | ORDERED_BY_KEYWORD | NOTIFICATION_KEYWORD| NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD
  //   | MIN_ELEMENTS_KEYWORD | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD | LENGTH_KEYWORD
  //   | LEAF_LIST_KEYWORD | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD
  //   | IF_FEATURE_KEYWORD | IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD
  //   | DEVIATE_KEYWORD | DEVIATION_KEYWORD | EXTENSION_KEYWORD | ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD
  //   | ENUM_KEYWORD | DESCRIPTION_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD
  //   | CONFIG_KEYWORD | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD
  //   | AUGMENT_KEYWORD | ARGUMENT_KEYWORD | ANYXML_KEYWORD | IDENTIFIER)
  //   string? (SEMICOLON | (LEFT_BRACE unknown_statement3* RIGHT_BRACE))
  public static boolean unknown_statement3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement3")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _COLLAPSE_, YANG_UNKNOWN_STATEMENT_3, "<unknown statement 3>");
    result = unknown_statement3_0(builder, level + 1);
    result = result && unknown_statement3_1(builder, level + 1);
    result = result && unknown_statement3_2(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  // YIN_ELEMENT_KEYWORD | YANG_VERSION_KEYWORD | WHEN_KEYWORD | VALUE_KEYWORD
  //   | USES_KEYWORD | UNITS_KEYWORD | UNIQUE_KEYWORD | TYPEDEF_KEYWORD | TYPE_KEYWORD | SUBMODULE_KEYWORD
  //   | STATUS_KEYWORD | RPC_KEYWORD | REVISION_DATE_KEYWORD | REVISION_KEYWORD | REQUIRE_INSTANCE_KEYWORD
  //   | REFINE_KEYWORD | REFERENCE_KEYWORD | RANGE_KEYWORD | PRESENCE_KEYWORD | PREFIX_KEYWORD
  //   | POSITION_KEYWORD | PATTERN_KEYWORD | PATH_KEYWORD | OUTPUT_KEYWORD | ORGANIZATION_KEYWORD
  //   | ORDERED_BY_KEYWORD | NOTIFICATION_KEYWORD| NAMESPACE_KEYWORD | MUST_KEYWORD | MODULE_KEYWORD
  //   | MIN_ELEMENTS_KEYWORD | MAX_ELEMENTS_KEYWORD | MANDATORY_KEYWORD | LIST_KEYWORD | LENGTH_KEYWORD
  //   | LEAF_LIST_KEYWORD | LEAF_KEYWORD | KEY_KEYWORD | INPUT_KEYWORD | INCLUDE_KEYWORD | IMPORT_KEYWORD
  //   | IF_FEATURE_KEYWORD | IDENTITY_KEYWORD | GROUPING_KEYWORD | FRACTION_DIGITS_KEYWORD | FEATURE_KEYWORD
  //   | DEVIATE_KEYWORD | DEVIATION_KEYWORD | EXTENSION_KEYWORD | ERROR_MESSAGE_KEYWORD | ERROR_APP_TAG_KEYWORD
  //   | ENUM_KEYWORD | DESCRIPTION_KEYWORD | DEFAULT_KEYWORD | CONTAINER_KEYWORD | CONTACT_KEYWORD
  //   | CONFIG_KEYWORD | CHOICE_KEYWORD |  CASE_KEYWORD | BIT_KEYWORD | BELONGS_TO_KEYWORD | BASE_KEYWORD
  //   | AUGMENT_KEYWORD | ARGUMENT_KEYWORD | ANYXML_KEYWORD | IDENTIFIER
  private static boolean unknown_statement3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement3_0")) return false;
    boolean result;
    result = consumeToken(builder, YANG_YIN_ELEMENT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_YANG_VERSION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_WHEN_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_VALUE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_USES_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_UNITS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_UNIQUE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_TYPEDEF_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_TYPE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_SUBMODULE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_STATUS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_RPC_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REVISION_DATE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REVISION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REQUIRE_INSTANCE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REFINE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_REFERENCE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_RANGE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PRESENCE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PREFIX_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_POSITION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PATTERN_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_PATH_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_OUTPUT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ORGANIZATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ORDERED_BY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_NOTIFICATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_NAMESPACE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MUST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MODULE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MIN_ELEMENTS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MAX_ELEMENTS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_MANDATORY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LIST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LENGTH_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LEAF_LIST_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_LEAF_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_KEY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_INPUT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_INCLUDE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IMPORT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IF_FEATURE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IDENTITY_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_GROUPING_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_FRACTION_DIGITS_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_FEATURE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEVIATE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEVIATION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_EXTENSION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ERROR_MESSAGE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ERROR_APP_TAG_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ENUM_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DESCRIPTION_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_DEFAULT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONTAINER_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONTACT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CONFIG_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CHOICE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_CASE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BIT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BELONGS_TO_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_BASE_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_AUGMENT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ARGUMENT_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_ANYXML_KEYWORD);
    if (!result) result = consumeToken(builder, YANG_IDENTIFIER);
    return result;
  }

  // string?
  private static boolean unknown_statement3_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement3_1")) return false;
    string(builder, level + 1);
    return true;
  }

  // SEMICOLON | (LEFT_BRACE unknown_statement3* RIGHT_BRACE)
  private static boolean unknown_statement3_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement3_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = unknown_statement3_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE unknown_statement3* RIGHT_BRACE
  private static boolean unknown_statement3_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement3_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && unknown_statement3_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // unknown_statement3*
  private static boolean unknown_statement3_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "unknown_statement3_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!unknown_statement3(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "unknown_statement3_2_1_1", pos)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // AUGMENT_KEYWORD string LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt | case_stmt)+
  //   RIGHT_BRACE
  public static boolean uses_augment_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "uses_augment_stmt")) return false;
    if (!nextTokenIs(builder, YANG_AUGMENT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_AUGMENT_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && consumeToken(builder, YANG_LEFT_BRACE);
    result = result && uses_augment_stmt_3(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, YANG_USES_AUGMENT_STMT, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt | case_stmt)+
  private static boolean uses_augment_stmt_3(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "uses_augment_stmt_3")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = uses_augment_stmt_3_0(builder, level + 1);
    while (result) {
      int pos = current_position_(builder);
      if (!uses_augment_stmt_3_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "uses_augment_stmt_3", pos)) break;
    }
    exit_section_(builder, marker, null, result);
    return result;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | data_def_stmt | case_stmt
  private static boolean uses_augment_stmt_3_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "uses_augment_stmt_3_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = data_def_stmt(builder, level + 1);
    if (!result) result = case_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // USES_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | refine_stmt | uses_augment_stmt )*
  //   RIGHT_BRACE))
  public static boolean uses_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "uses_stmt")) return false;
    if (!nextTokenIs(builder, YANG_USES_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_USES_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && uses_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_USES_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | refine_stmt | uses_augment_stmt )*
  //   RIGHT_BRACE)
  private static boolean uses_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "uses_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = uses_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | refine_stmt | uses_augment_stmt )*
  //   RIGHT_BRACE
  private static boolean uses_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "uses_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && uses_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | refine_stmt | uses_augment_stmt )*
  private static boolean uses_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "uses_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!uses_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "uses_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt | when_stmt | if_feature_stmt | status_stmt | description_stmt
  //     | reference_stmt | refine_stmt | uses_augment_stmt
  private static boolean uses_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "uses_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = when_stmt(builder, level + 1);
    if (!result) result = if_feature_stmt(builder, level + 1);
    if (!result) result = status_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    if (!result) result = refine_stmt(builder, level + 1);
    if (!result) result = uses_augment_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // VALUE_KEYWORD string end_statement
  public static boolean value_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "value_stmt")) return false;
    if (!nextTokenIs(builder, YANG_VALUE_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_VALUE_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_VALUE_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // WHEN_KEYWORD string (SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |description_stmt | reference_stmt )*
  //   RIGHT_BRACE))
  public static boolean when_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "when_stmt")) return false;
    if (!nextTokenIs(builder, YANG_WHEN_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_WHEN_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && when_stmt_2(builder, level + 1);
    exit_section_(builder, marker, YANG_WHEN_STMT, result);
    return result;
  }

  // SEMICOLON | (LEFT_BRACE
  //   (identifier_stmt |description_stmt | reference_stmt )*
  //   RIGHT_BRACE)
  private static boolean when_stmt_2(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "when_stmt_2")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_SEMICOLON);
    if (!result) result = when_stmt_2_1(builder, level + 1);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // LEFT_BRACE
  //   (identifier_stmt |description_stmt | reference_stmt )*
  //   RIGHT_BRACE
  private static boolean when_stmt_2_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "when_stmt_2_1")) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_LEFT_BRACE);
    result = result && when_stmt_2_1_1(builder, level + 1);
    result = result && consumeToken(builder, YANG_RIGHT_BRACE);
    exit_section_(builder, marker, null, result);
    return result;
  }

  // (identifier_stmt |description_stmt | reference_stmt )*
  private static boolean when_stmt_2_1_1(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "when_stmt_2_1_1")) return false;
    while (true) {
      int pos = current_position_(builder);
      if (!when_stmt_2_1_1_0(builder, level + 1)) break;
      if (!empty_element_parsed_guard_(builder, "when_stmt_2_1_1", pos)) break;
    }
    return true;
  }

  // identifier_stmt |description_stmt | reference_stmt
  private static boolean when_stmt_2_1_1_0(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "when_stmt_2_1_1_0")) return false;
    boolean result;
    result = identifier_stmt(builder, level + 1);
    if (!result) result = description_stmt(builder, level + 1);
    if (!result) result = reference_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // module_stmt | submodule_stmt
  static boolean yang(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "yang")) return false;
    if (!nextTokenIs(builder, "", YANG_MODULE_KEYWORD, YANG_SUBMODULE_KEYWORD)) return false;
    boolean result;
    result = module_stmt(builder, level + 1);
    if (!result) result = submodule_stmt(builder, level + 1);
    return result;
  }

  /* ********************************************************** */
  // YANG_VERSION_KEYWORD string end_statement
  public static boolean yang_version_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "yang_version_stmt")) return false;
    if (!nextTokenIs(builder, YANG_YANG_VERSION_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_YANG_VERSION_KEYWORD);
    result = result && string(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_YANG_VERSION_STMT, result);
    return result;
  }

  /* ********************************************************** */
  // string
  public static boolean yin_element_arg(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "yin_element_arg")) return false;
    boolean result;
    Marker marker = enter_section_(builder, level, _NONE_, YANG_YIN_ELEMENT_ARG, "<yin element arg>");
    result = string(builder, level + 1);
    exit_section_(builder, level, marker, result, false, null);
    return result;
  }

  /* ********************************************************** */
  // YIN_ELEMENT_KEYWORD yin_element_arg end_statement
  public static boolean yin_element_stmt(PsiBuilder builder, int level) {
    if (!recursion_guard_(builder, level, "yin_element_stmt")) return false;
    if (!nextTokenIs(builder, YANG_YIN_ELEMENT_KEYWORD)) return false;
    boolean result;
    Marker marker = enter_section_(builder);
    result = consumeToken(builder, YANG_YIN_ELEMENT_KEYWORD);
    result = result && yin_element_arg(builder, level + 1);
    result = result && end_statement(builder, level + 1);
    exit_section_(builder, marker, YANG_YIN_ELEMENT_STMT, result);
    return result;
  }

}
