package Command;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class MainCommand {
	
	public static void main(String[] args) {
		
		// �켱���� ť�� �������ؼ� Comparable ��� 
		PriorityQueue<Command> queue = new PriorityQueue<>(); 
		
		queue.add(new StringPrintCommand("ABCD"));
		queue.add(new StringPrintCommand("ABC"));
		queue.add(new StringPrintCommand("AB"));
		queue.add(new StringPrintCommand("A"));
		
		
		for (Command command : queue) {
			command.execute();
		}
	}
}
