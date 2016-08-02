package AbstractSyntaxTree.Terminal;

public class IntegerLiteral extends NumeralLiteral {
	public Integer num;
	
	public IntegerLiteral(String sInt){
		this.num = Integer.parseInt(sInt);
	}

	public IntegerLiteral(Integer i){
		this.num = i;
	}
}
