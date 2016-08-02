package AbstractSyntaxTree.Expression;

public class IfThenElseExpression extends Expression {
	Expression conditionExp, thenExp, elseExp;
	
	public IfThenElseExpression(Expression conditionExp, Expression thenExp, Expression elseExp) {
		this.conditionExp = conditionExp;
		this.thenExp      = thenExp;
		this.elseExp      = elseExp;
	}
}
