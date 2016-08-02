package AbstractSyntaxTree.Command;

import java.util.ArrayList;
import java.util.List;

import AbstractSyntaxTree.Statement;

public class CompoundCommand {
	public List<Statement> commandList; 

	public CompoundCommand(){
		this.commandList = new ArrayList<Statement>();
	} 	
	
	public CompoundCommand(List<Statement> commandList){
		this.commandList = commandList;
	} 
	
	public void AddCommand(Statement stm) {
		this.commandList.add(stm);
	}
}
