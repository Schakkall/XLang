package AbstractSyntaxTree.Declaration;

public class PrimitiveTypeDenoter extends TypeDenoter {
	public Type type;
	
	public PrimitiveTypeDenoter(Type type){
		this.type = type;
	}
}
