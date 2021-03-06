package com.sun.org.apache.xpath.internal.functions;

import com.sun.org.apache.xalan.internal.res.XSLMessages;
import com.sun.org.apache.xpath.internal.Expression;
import com.sun.org.apache.xpath.internal.ExpressionOwner;
import com.sun.org.apache.xpath.internal.XPathVisitor;
import java.util.Vector;

public class Function3Args extends Function2Args {
  static final long serialVersionUID = 7915240747161506646L;
  
  Expression m_arg2;
  
  public Expression getArg2() { return this.m_arg2; }
  
  public void fixupVariables(Vector paramVector, int paramInt) {
    super.fixupVariables(paramVector, paramInt);
    if (null != this.m_arg2)
      this.m_arg2.fixupVariables(paramVector, paramInt); 
  }
  
  public void setArg(Expression paramExpression, int paramInt) throws WrongNumberArgsException {
    if (paramInt < 2) {
      super.setArg(paramExpression, paramInt);
    } else if (2 == paramInt) {
      this.m_arg2 = paramExpression;
      paramExpression.exprSetParent(this);
    } else {
      reportWrongNumberArgs();
    } 
  }
  
  public void checkNumberArgs(int paramInt) throws WrongNumberArgsException {
    if (paramInt != 3)
      reportWrongNumberArgs(); 
  }
  
  protected void reportWrongNumberArgs() { throw new WrongNumberArgsException(XSLMessages.createXPATHMessage("three", null)); }
  
  public boolean canTraverseOutsideSubtree() { return super.canTraverseOutsideSubtree() ? true : this.m_arg2.canTraverseOutsideSubtree(); }
  
  public void callArgVisitors(XPathVisitor paramXPathVisitor) {
    super.callArgVisitors(paramXPathVisitor);
    if (null != this.m_arg2)
      this.m_arg2.callVisitors(new Arg2Owner(), paramXPathVisitor); 
  }
  
  public boolean deepEquals(Expression paramExpression) {
    if (!super.deepEquals(paramExpression))
      return false; 
    if (null != this.m_arg2) {
      if (null == ((Function3Args)paramExpression).m_arg2)
        return false; 
      if (!this.m_arg2.deepEquals(((Function3Args)paramExpression).m_arg2))
        return false; 
    } else if (null != ((Function3Args)paramExpression).m_arg2) {
      return false;
    } 
    return true;
  }
  
  class Arg2Owner implements ExpressionOwner {
    public Expression getExpression() { return Function3Args.this.m_arg2; }
    
    public void setExpression(Expression param1Expression) {
      param1Expression.exprSetParent(Function3Args.this);
      Function3Args.this.m_arg2 = param1Expression;
    }
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\com\sun\org\apache\xpath\internal\functions\Function3Args.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */