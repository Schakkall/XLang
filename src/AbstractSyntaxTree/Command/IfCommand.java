package AbstractSyntaxTree.Command;

import AbstractSyntaxTree.Expression.BooleanExpression;

public class IfCommand extends Command {
	public BooleanExpression conditionExp;
	public Command thenCommand, elseCommand;
	
	public IfCommand(BooleanExpression conditionExp, Command thenCommand) {
		this.conditionExp = conditionExp;
		this.thenCommand  = thenCommand;
		this.elseCommand  = null;
	}
	
	public IfCommand(BooleanExpression conditionExp, Command thenCommand, Command elseCommand) {
		this.conditionExp = conditionExp;
		this.thenCommand  = thenCommand;
		this.elseCommand  = elseCommand;
	}
	
}
