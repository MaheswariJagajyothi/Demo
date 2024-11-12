package demo21;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Selenium Java");
		queue.offer("Selenium Python");
		queue.offer("Selenium C#");
		System.out.println(queue);
		System.out.println("------------------------------");
		Queue<String> queue1 = new LinkedList<String>();
		queue1.offer("Automation Testing");
		queue1.offer("Manual Testing");
		queue1.offer("Sanity Testing");
		System.out.println(queue);
		queue1.poll();
		System.out.println("Queue After Poppong :: "+queue1);
		System.out.println("------------------------------");
		Queue<String> queue2 = new LinkedList<String>();
		queue2.offer("User Defined Functions");
		queue2.offer("IO Functions");
		queue2.offer("Utility Functions");
		System.out.println(queue2);
		queue2.removeAll(queue2);
		System.out.println("Queue after popping all "+queue2);
		System.out.println("------------------------------");
		Queue<String> queue3 = new LinkedList<String>();
		queue3.offer("Java");
		queue3.offer("Python");
		queue3.offer("C#");
		System.out.println("Element present at the Head of Queue3 ::"+queue3.peek());
		System.out.println("------------------------------");
		Queue<String> queue4 = new ArrayDeque<String>();
		queue4.offer("Python");
		queue4.offer("Ruby");
		queue4.offer("C#");
		System.out.println("Element present in Queue4 ::"+queue4);
		Queue<String> queue5 = new ArrayDeque<String>();
		queue5.offer("Python");
		queue5.offer("Ruby");
		queue5.offer("C#");
		queue5.offer("Java");
		System.out.println("Element present in Queue5 ::"+queue5);
		System.out.println("Is Queue4 equals to Queue5 ::"+queue5.equals(queue4));
		System.out.println("------------------------------");
		Queue<Integer> queue6 = new ArrayDeque<Integer>();
		queue6.offer(10);
		queue6.offer(20);
		queue6.offer(30);
		queue6.offer(40);
		queue6.offer(50);
		System.out.println("Elements present in Queue6 ::"+queue6);
		System.out.println("Max Element present in Queue6 ::"+Collections.max(queue6));
	}

}
