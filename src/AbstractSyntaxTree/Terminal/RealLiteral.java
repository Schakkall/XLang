package AbstractSyntaxTree.Terminal;

public class RealLiteral extends NumeralLiteral {
	public Double num;
	
	public RealLiteral(String sInt){
		this.num = Double.parseDouble(sInt);
	}

	public RealLiteral(Double i){
		this.num = i;
	}

}
