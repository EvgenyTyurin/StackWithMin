/**
 * Stack with min function demo
 */

public class StackWithMin {

    public static void main(String[] args) {
        // Prepare stack
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(1);
        myStack.push(3);
        myStack.push(0);
        // Stack: [2, 1, 3, 0] Min = 0
        System.out.println("Stack: " + myStack + " Min = " + myStack.min());
        myStack.pop();
        // [2, 1, 3] Min = 1
        System.out.println("Stack: " + myStack + " Min = " + myStack.min());
        myStack.pop();
        // Stack: [2, 1] Min = 1
        System.out.println("Stack: " + myStack + " Min = " + myStack.min());
    }

}
