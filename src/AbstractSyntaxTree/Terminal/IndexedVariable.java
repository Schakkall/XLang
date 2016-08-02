package AbstractSyntaxTree.Terminal;

import AbstractSyntaxTree.Expression.Expression;

public class IndexedVariable extends Variable {
	public Variable var;
	public Expression index;
	
	public IndexedVariable(Variable var, Expression index) {
		this.var = var;
		this.index = index;
	}
}
