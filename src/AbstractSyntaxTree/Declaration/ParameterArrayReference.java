package AbstractSyntaxTree.Declaration;

import AbstractSyntaxTree.Terminal.Identifier;

public class ParameterArrayReference extends ParameterPrimitiveReference {
	Integer size; 

	public ParameterArrayReference(Type type, Identifier id, Integer size) {
		super(type, id);
		this.size = size;
	}
}
