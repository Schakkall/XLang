package AbstractSyntaxTree.Declaration;

import AbstractSyntaxTree.Terminal.Identifier;

public abstract class VariableDeclaration extends Declaration {
	public TypeDenoter type;
	public Identifier id;
	
	public VariableDeclaration(TypeDenoter type, Identifier id) {
		this.type = type;
		this.id   = id;
	}
}
