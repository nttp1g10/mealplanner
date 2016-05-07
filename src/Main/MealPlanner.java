package Main;

import Controller.CommandController;
import Model.CommandModel;
import View.Command;

public class MealPlanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Command cmd = new Command();
		CommandController cmdCtrl = new CommandController();
		CommandModel cmdModl = new CommandModel();
		
		cmd.addController(cmdCtrl);
		cmdCtrl.addView(cmd);
		cmdCtrl.addModel(cmdModl);
		cmdModl.addView(cmd);
		
		cmd.displayFirstPage();
	}

}
