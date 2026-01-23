public class Task1 {
    public static void main(String[] args) {
	    	Stack<Character> stack = new Stack<>();
	    	stack.push('A');
	    	stack.push('B');
	    	stack.push('C');
	    	stack.push('D');
	    	stack.push('A');
	    	
	    	System.out.println(stack);
	    	stack.pop();
	    	System.out.println(stack);
	    	System.out.println(stack.peek());
	    	
	    	
	    	
	    }
}
