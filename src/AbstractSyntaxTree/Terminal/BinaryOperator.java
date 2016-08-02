package AbstractSyntaxTree.Terminal;

public enum BinaryOperator {	
	ADDITION(0),
	SUBTRACTION(1),
	MULTIPLICATION(2),
	DIVISION(3),
	REMAINDER(4),
	EQUALS(5),
	LESSTHAN(6),
	AND(7),
	OR(8);
	
	private final int operator;
	
	private BinaryOperator(int operator) {
		this.operator = operator;
	}	
	
	public int getOperator() {
		return this.operator;
	}
}
