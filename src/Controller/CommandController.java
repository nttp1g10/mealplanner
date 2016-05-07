package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Model.CommandModel;
import View.Command;

public class CommandController {
	private Command cmd;
	private CommandModel cmdMdl;
	
	public CommandController()
	{
//		Default
	}
	
	public CommandController(Command cmd, CommandModel mdl)
	{
		this.cmd = cmd;
		this.cmdMdl = mdl;
	}
	
	public String getInput()
	{
		return System.console().readLine();
	}
	
	public void processFirstPage()
	{
		int option = Integer.parseInt(getInput());
		cmd.clearScreen();
		
		switch(option)
		{
			case 1:
				cmd.displayPlan();
				break;
			case 2:
				cmd.displayAddPage();
				break;
			case 3:
				cmd.displaySearchPage();
				break;
			default:
				cmd.displayExit();
				break;
		}
	}
	
	public void addView(Command cmd)
	{
		this.cmd = cmd;
	}
	
	public void addModel(CommandModel mdl)
	{
		this.cmdMdl = mdl;
	}
	
}
