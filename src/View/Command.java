package View;

import Controller.CommandController;

public class Command {

	private CommandController cmdCtrl;
	
	public Command()
	{
//		Default
	}
	
	public Command(CommandController ctrl)
	{
		this.cmdCtrl = ctrl;
	}
	
	public void displayFirstPage()
	{
//		TODO: Store the displayed messages to rc files
		System.out.println("Your favourite \"Meal Planner\"\n" +
				"*---------------------------*\n" +
				"1. Create your dining plan\n" +
				"2. Add recipe\n" +
				"3. Search recipe\n" +
				"0. Exit");
		System.out.print("Enter option: ");
		cmdCtrl.processFirstPage();
	}
	
	public void displayPlan()
	{
//		TODO: Store the displayed messages to rc files
		System.out.println("Your weekly plan\n" +
				"*---------------------------*\n" +
				"1. Monday\n" +
				"2. Tuesday\n" +
				"3. Wednesday\n" +
				"4. Thursday\n" +
				"5. Friday\n" +
				"6. Saturday\n" +
				"7. Sunday\n" +
				"0. Exit");
		System.out.print("Choose a day: ");
	}
	
	public void displayAddPage()
	{
//		TODO: Store the displayed messages to rc files
		System.out.println("Add a recipe\n" +
				"*---------------------------*\n" +
				"1. Name\n" +
				"2. Time taken\n" +
				"3. Ingredients\n" +
				"4. Steps\n" +
				"0. Exit");
		System.out.print("Choose edit section: ");
	}
	
	public void displaySearchPage()
	{
//		TODO: Store the displayed messages to rc files
		System.out.println("Search a recipe\n" +
				"*---------------------------*");
		System.out.print("Enter name: ");
	}
	
	public void clearScreen()
	{
		ProcessBuilder bld = new ProcessBuilder("/bin/bash", "-c", "clear");
		try
		{
			bld.inheritIO().start().waitFor();
		}
		catch(Exception e)
		{
//			Default
		}
	}
	
	public void displayExit()
	{
		System.out.println("Enjoy your meals :)");
	}
	
	public void addController(CommandController ctrl)
	{
		this.cmdCtrl = ctrl;
	}

}
