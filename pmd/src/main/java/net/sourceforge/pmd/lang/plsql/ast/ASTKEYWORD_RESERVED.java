/* Generated By:JJTree: Do not edit this line. ASTKEYWORD_RESERVED.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=net.sourceforge.pmd.lang.ast.AbstractNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.sourceforge.pmd.lang.plsql.ast;

public
class ASTKEYWORD_RESERVED extends SimpleNode {
  public ASTKEYWORD_RESERVED(int id) {
    super(id);
  }

  public ASTKEYWORD_RESERVED(PLSQLParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PLSQLParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=4f8620807ed459e56bb720200a399156 (do not edit this line) */