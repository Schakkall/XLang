package AbstractSyntaxTree.Expression;

import AbstractSyntaxTree.Terminal.Variable;

public class VariableExpression extends Expression {
	public Variable var;
	
	public VariableExpression(Variable var) {
		this.var = var;
	}
}
