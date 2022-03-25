package s301N1;

public class Action1 implements Action {
	 private String name;

	 public Action1(String name) {
		 this.name = name;
	 }

	 @Override
	 public void execute() {
		System.out.println("Executing Action 1");
	 }

	 @Override
	 public void undo() {
		System.out.println("Undo Action 1");
	 }

	 @Override
	 public String getName() {
		return this.name;
	 }
}
