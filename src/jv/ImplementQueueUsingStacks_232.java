import java.util.Stack;

public class ImplementQueueUsingStacks_232 {
    public static void main(String[] args) {
    
    }

}
class MyQueue {
    private Stack<Integer> stackOne = new Stack<>();
    private Stack<Integer> stackTwo = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        stackOne.push(x);
    }
    
    public int pop() {
        while (!stackOne.isEmpty()) {
            stackTwo.push(stackOne.pop());
        }

        int popped = stackTwo.pop();

        while(!stackTwo.isEmpty()){
            stackOne.push(stackTwo.pop());
        }

        return popped;
    }
    
    public int peek() {
        while(!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
       int peeking  =stackTwo.peek();
                while(!stackTwo.isEmpty()){
            stackOne.push(stackTwo.pop());
        }
        return peeking;
    }
    
    public boolean empty() {
        return stackOne.isEmpty();
    }
}