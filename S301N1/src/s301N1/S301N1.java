package s301N1;

import java.util.ArrayList;
import java.util.List;

public class S301N1 {

	public static void main(String[] args) {
		CommandManager manager = CommandManager.getInstance();
		List<Action> actionList = new ArrayList<>();
		actionList.add(new Action1("Action 1"));
		actionList.add(new Action2("Action 2"));
		
		System.out.println("===ACTIONS===");
		manager.execute(actionList);
		manager.execute(actionList);
		
		manager.undo();
		manager.redo();

		manager.clearNormal();
		
		manager.undo();
		manager.redo();
     
		System.out.println("===HISTORY===");
		System.out.println(manager.getActionHistory().toString());
    }
}
