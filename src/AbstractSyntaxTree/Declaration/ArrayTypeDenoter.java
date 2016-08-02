package AbstractSyntaxTree.Declaration;

import java.util.List;

import AbstractSyntaxTree.Expression.Expression;

public class ArrayTypeDenoter extends PrimitiveTypeDenoter {
	List<Expression> expList;
	
	public ArrayTypeDenoter(Type type, List<Expression> expList) {
		super(type);
		this.expList = expList;
	}
}
