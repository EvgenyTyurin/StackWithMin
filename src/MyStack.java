/**
 * Stack with min() function
 * Use of two stacks: main and for minimums
 * When pushing and popping main, minimums stack updated
 */

import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack{

    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(Integer element) {
        mainStack.push(element);
        if (minStack.empty() || element < minStack.peek()) {
            minStack.push(element);
        }
    }

    public Integer pop() {
        if (!minStack.empty() && mainStack.peek() == minStack.peek()) {
            minStack.pop();
        }
        return mainStack.pop();
    }

    public Integer min() {
            return minStack.peek();
    }

    @Override
    public String toString() {
        return mainStack.toString();
    }
}
