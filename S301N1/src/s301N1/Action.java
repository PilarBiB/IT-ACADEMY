package s301N1;

public interface Action {
	
	void execute() ;
	
    void undo() ;

    String getName() ;
    
}
