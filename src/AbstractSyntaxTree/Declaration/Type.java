package AbstractSyntaxTree.Declaration;

public enum Type {
	INTEGER(0),
	BOOLEAN(1),
	REAL(2);
	
	private final int operator;
	
	private Type(int operator) {
		this.operator = operator;
	}
	
	public int getType() {
		return this.operator;
	}
}
