package Model;

import View.Command;

public class CommandModel {

	private Command cmd;
	
	public CommandModel()
	{
//		Default
	}
	
	public CommandModel(Command cmd)
	{
		this.cmd = cmd;
	}
	
	public void addView(Command cmd)
	{
		this.cmd = cmd;
	}

}
