package stack;

import java.util.Stack;

public class _232Implement_Queue_using_Stack_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solutino232 solutino232=new solutino232();
solutino232.push(1);
solutino232.push(2);
solutino232.push(3);
System.out.println(solutino232.front);
System.out.println(solutino232.peek());

	}

}
class solutino232{
	int front=0;
	Stack s1=new Stack();
	Stack s2=new Stack();
	
	public void push(int x) {
		// TODO Auto-generated method stub
		if (s1.empty()) {
			front=x;
		
			while (!s1.isEmpty()) {
				s2.push(s1.pop());	
			}
			s2.push(x);
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		
	}
	public void pop() {
		s1.pop();
		if (!s1.isEmpty()) {
			 front=(int) s1.peek();
		}
	}
	
	public int peek() {
		// TODO Auto-generated method stub
//  s1.peek();
  return front;
	}
	
	
	public boolean empty() {
		return s1.isEmpty();
	}
	
	
	
	
	
	
	
}