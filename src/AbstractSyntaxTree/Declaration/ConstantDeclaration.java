package AbstractSyntaxTree.Declaration;

import AbstractSyntaxTree.Terminal.Identifier;

public abstract class ConstantDeclaration extends Declaration {
	public TypeDenoter type;
	public Identifier id;
	
	public ConstantDeclaration(TypeDenoter type, Identifier id) {
		this.type = type;
		this.id   = id;
	}
}
