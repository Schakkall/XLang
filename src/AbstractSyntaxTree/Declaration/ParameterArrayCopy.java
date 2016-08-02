package AbstractSyntaxTree.Declaration;

import AbstractSyntaxTree.Terminal.Identifier;

public class ParameterArrayCopy extends ParameterPrimitiveCopy {
	Integer size; 
	
	public ParameterArrayCopy(Type type, Identifier id, Integer size) {
		super(type, id);
		this.size = size;
	}
}
