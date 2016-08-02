package AbstractSyntaxTree.Declaration;

import java.util.List;

import AbstractSyntaxTree.Expression.Expression;
import AbstractSyntaxTree.Terminal.Identifier;

public class ConsConstantDeclaration extends ConstantDeclaration {
	List<Identifier> idList;
	Expression exp;
		
	public ConsConstantDeclaration(TypeDenoter type, Identifier id, List<Identifier> idList, Expression exp) {
		super(type, id);
		this.idList = idList;
		this.exp = exp;
	}
}
