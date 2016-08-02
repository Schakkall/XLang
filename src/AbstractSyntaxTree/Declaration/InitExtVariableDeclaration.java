package AbstractSyntaxTree.Declaration;

import java.util.List;

import AbstractSyntaxTree.Expression.Expression;
import AbstractSyntaxTree.Terminal.Identifier;

public class InitExtVariableDeclaration extends VariableDeclaration {
	List<Expression> expList;
	
	public InitExtVariableDeclaration(TypeDenoter type, Identifier id, List<Expression> expList) {
		super(type, id);
		this.expList = expList;
	}
}
