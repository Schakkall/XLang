package AbstractSyntaxTree.Command;

import java.util.List;

import AbstractSyntaxTree.Terminal.Identifier;
import AbstractSyntaxTree.Expression.Expression;

public class CallCommand extends Command {
	public Identifier id;
	public List<Expression> expLst;
	
	public CallCommand(Identifier id, List<Expression> expLst){
		this.id = id;
		this.expLst = expLst;
	}
	
}
