package AbstractSyntaxTree.Expression;

import AbstractSyntaxTree.Terminal.BinaryOperator;

public class BinaryExpression extends Expression {
	Expression leftExp, rightExp;
	BinaryOperator op;
	
	public BinaryExpression(BinaryOperator op, Expression left, Expression right) {
		this.leftExp  = left;
		this.rightExp = right;
		this.op       = op;
	}
}
