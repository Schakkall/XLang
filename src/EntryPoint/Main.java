package EntryPoint;

import AbstractSyntaxTree.Command.*;
import AbstractSyntaxTree.Declaration.*;
import AbstractSyntaxTree.Expression.*;
import AbstractSyntaxTree.Terminal.*;

public class Main {

	public static void main(String[] args) {
		CompoundCommand prog = new CompoundCommand();
		
		prog.AddCommand(
				new InitVariableDeclaration(
						new PrimitiveTypeDenoter(Type.INTEGER), 
						new Identifier("x"), 
						new IntExpression(
								new IntegerLiteral(0)
						)
				)
		);
		
		prog.AddCommand(
				new InitVariableDeclaration(
						new PrimitiveTypeDenoter(Type.BOOLEAN), 
						new Identifier("y"), 
						new BooleanExpression(
								new BooleanLiteral(false)
						)
				)
		);

		
		prog.AddCommand(
				new AssignCommand(
						new SimpleVariable(new Identifier("x")), 
						new BinaryExpression(
								BinaryOperator.ADDITION, 
								new IntExpression(new IntegerLiteral(5)), 
								new IntExpression(new IntegerLiteral(10))
						)
				)
		);

		prog.AddCommand(
				new AssignCommand(
						new SimpleVariable(new Identifier("y")), 
						new BinaryExpression(
								BinaryOperator.AND, 
								new BooleanExpression(new BooleanLiteral(true)), 
								new BooleanExpression(new BooleanLiteral(false))
						)
				)
		);
		
		prog.AddCommand(
				new AssignCommand(
						new SimpleVariable(new Identifier("y")),
						new NotExpression(
								new VariableExpression(new SimpleVariable( new Identifier("y")))
						)
				)
		);
		
	}

}
