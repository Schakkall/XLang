package AbstractSyntaxTree.Declaration;

import AbstractSyntaxTree.AST;
import AbstractSyntaxTree.Terminal.Identifier;

public abstract class Parameter extends AST {
	Type type;
	Identifier id;
	
	public Parameter(Type type, Identifier id) {
		this.type = type;
		this.id   = id;
	}
}
