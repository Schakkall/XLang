package AbstractSyntaxTree.Expression;

import AbstractSyntaxTree.Terminal.IntegerLiteral;

public class IntExpression extends NumeralExpression {
	IntegerLiteral intLit;
	
	public IntExpression(IntegerLiteral intLit) {
		this.intLit = intLit;
	}
}
