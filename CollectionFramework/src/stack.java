import java.util.Stack;

public class stack {
    Stack<String> stack=new Stack<String>();

    public void addToStack(String value){
        stack.push(value);
    }

    public void removeFromStack(){
        stack.pop();
    }

    public void getStack(){
        System.out.println(stack);
    }
}
