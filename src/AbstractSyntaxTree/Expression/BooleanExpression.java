package AbstractSyntaxTree.Expression;

import AbstractSyntaxTree.Terminal.BooleanLiteral;

public class BooleanExpression extends Expression {
	public BooleanLiteral boolLit;
	
	public BooleanExpression(BooleanLiteral boolLit) {
		this.boolLit = boolLit;
	}
}
