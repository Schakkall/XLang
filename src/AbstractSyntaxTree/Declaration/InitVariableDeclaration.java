package AbstractSyntaxTree.Declaration;

import AbstractSyntaxTree.Expression.Expression;
import AbstractSyntaxTree.Terminal.Identifier;

public class InitVariableDeclaration extends VariableDeclaration {
	Expression initialValue;
	
	public InitVariableDeclaration(TypeDenoter type, Identifier id, Expression initialValue) {
		super(type, id);
		this.initialValue = initialValue;
	}
}
