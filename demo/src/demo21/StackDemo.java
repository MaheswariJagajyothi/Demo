package demo21;

import java.util.Arrays;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.push("Java");
		stack.push("Python");
		stack.push("C#");
		System.out.println("Stack1 Elements :: "+stack);
		System.out.println("Is Stack1 is Empty :: "+stack.isEmpty());
		stack.pop();
		System.out.println("Stack Elements after Pop :: "+stack);
		System.out.println("---------------------------------------");
		Stack<Integer> stack2 = new Stack<Integer>();
		stack2.push(100);
		stack2.push(200);
		stack2.push(300);
		Stack<String> stack3 = new Stack<String>();
		System.out.println("Stack2 Elements :: "+stack2);
		System.out.println("Is Stack2 is Empty :: "+stack2.isEmpty());
		System.out.println("---------------------------------------");
		System.out.println("Stack3 Elements :: "+stack3);
		System.out.println("Is Stack3 is Empty :: "+stack3.isEmpty());
		System.out.println("---------------------------------------");
		Stack<String> stack4 = new Stack<String>();
		stack4.push("Pune");
		stack4.push("Bengaluru");
		stack4.push("Mumbai");
		stack4.toArray();
		System.out.println("---------------------------------------");
		
		Stack<Character> stack5 = new Stack<Character>();
		String str = "Automation Testing";
		for(char i:str.toCharArray())
		{
			stack5.push(i);
		}
		StringBuffer sb = new StringBuffer();
		while(!stack5.isEmpty())
		{
			sb.append(stack5.pop());
		} 
		System.out.println(sb);
	}

}
