package AbstractSyntaxTree.Command;

import AbstractSyntaxTree.Expression.BooleanExpression;

public class WhileCommand extends Command {
	public BooleanExpression conditionExp;
	public Command whileTrueCommand;
	
	public WhileCommand(BooleanExpression conditionExp, Command whileTrueCommand) {
		this.conditionExp = conditionExp;
		this.whileTrueCommand = whileTrueCommand;
	}
}
