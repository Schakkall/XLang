package AbstractSyntaxTree.Declaration;

import AbstractSyntaxTree.Terminal.Identifier;

public class NInitVariableDeclaration extends VariableDeclaration {
	public NInitVariableDeclaration(TypeDenoter type, Identifier id) {
		super(type, id);
	}
}
