package AbstractSyntaxTree.Expression;

import java.util.List;

import AbstractSyntaxTree.Terminal.Identifier;

public class CallExpression extends Expression {
	public Identifier id;
	public List<Expression> expList;
	
	public CallExpression(Identifier id, List<Expression> expList){
		this.id = id;
		this.expList = expList;
	}	
}
