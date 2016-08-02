package AbstractSyntaxTree.Expression;

public class NotExpression extends UnaryExpression {
	public Expression exp;
	
	public NotExpression(Expression exp){
		this.exp = exp;
	} 
}
