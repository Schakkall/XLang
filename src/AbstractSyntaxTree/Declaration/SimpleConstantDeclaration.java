package AbstractSyntaxTree.Declaration;

import AbstractSyntaxTree.Expression.Expression;
import AbstractSyntaxTree.Terminal.Identifier;

public class SimpleConstantDeclaration extends ConstantDeclaration {
	Expression constantValue;
	
	public SimpleConstantDeclaration(TypeDenoter type, Identifier id, Expression constantValue) {
		super(type, id);
		this.constantValue = constantValue;
	}
}
