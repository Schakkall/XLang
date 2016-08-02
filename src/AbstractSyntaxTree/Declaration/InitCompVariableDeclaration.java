package AbstractSyntaxTree.Declaration;

import java.util.List;

import AbstractSyntaxTree.Expression.Expression;
import AbstractSyntaxTree.Terminal.Identifier;

public class InitCompVariableDeclaration extends VariableDeclaration {
	List<Identifier> idList;
	Expression exp;
	
	public InitCompVariableDeclaration(TypeDenoter type, Identifier id, List<Identifier> idList, Expression exp) {
		super(type, id);
		this.exp = exp;
		this.idList = idList;
	}
}
