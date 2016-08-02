package AbstractSyntaxTree.Terminal;

public class BooleanLiteral extends Terminal {
	public Boolean bool;
	
	public BooleanLiteral(String sBool) {
		this.bool = Boolean.parseBoolean(sBool); 
	}
	
	public BooleanLiteral(Boolean b) {
		this.bool = b; 
	}	
}
