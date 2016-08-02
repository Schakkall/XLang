package AbstractSyntaxTree.Command;

import AbstractSyntaxTree.Expression.Expression;
import AbstractSyntaxTree.Terminal.Variable;

public class AssignCommand extends Command {
	public Variable id;
	public Expression exp;
	
	public AssignCommand(Variable id, Expression exp) {
		this.id = id;
		this.exp = exp;
	}
}
