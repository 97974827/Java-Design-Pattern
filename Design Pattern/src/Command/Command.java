package Command;

public interface Command extends Comparable<Command>{
	void execute();
	void action();
	void undo();
}
