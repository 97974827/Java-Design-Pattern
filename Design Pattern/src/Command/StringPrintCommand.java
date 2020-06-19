package Command;

public class StringPrintCommand implements Command{

	protected String string;
	
	public StringPrintCommand(String string) {
		this.string = string;
	}
	
	@Override
	public int compareTo(Command c) {
		StringPrintCommand other = (StringPrintCommand) c;
		return this.string.length() - other.string.length();
	}

	@Override
	public void execute() {
		System.out.println(this.string);
	}

	@Override
	public void action() {
		
	}

	@Override
	public void undo() {
		
	}
	
}		
