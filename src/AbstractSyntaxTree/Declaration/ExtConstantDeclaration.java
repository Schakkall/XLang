package AbstractSyntaxTree.Declaration;

import java.util.List;

import AbstractSyntaxTree.Expression.Expression;
import AbstractSyntaxTree.Terminal.Identifier;


public class ExtConstantDeclaration extends ConstantDeclaration {
	List<Expression> expList;
	
	public ExtConstantDeclaration(TypeDenoter type, Identifier id, List<Expression> expList) {
		super(type, id);
		this.expList = expList;
	}

}
