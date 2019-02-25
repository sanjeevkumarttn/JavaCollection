// Design a Data Structure SpecialStack that supports all the stack operations
// like push(), pop(), isEmpty(), isFull() and an additional operation getMin()
// which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))

import java.util.Stack;

public class Question7 {

    public static void main(String[] args) {

        StackDemo stackObj = new StackDemo();
        stackObj.push(97);
        stackObj.push(22);
        stackObj.push(31);
        stackObj.push(99);
        stackObj.push(12);
        System.out.println("\n\nFETCHING MINIMUM ELEMENT\n");
        stackObj.getMin();
        stackObj.pop();
        stackObj.pop();
        System.out.println("\n\nFETCHING MINIMUM ELEMENT\n");
        stackObj.getMin();

    }
}

class StackDemo{
    Stack<Integer> stack;
    int minimumElement;
    StackDemo(){
        stack = new Stack<Integer>();
    }
    void push(int value){
        if(stack.isEmpty()){
            minimumElement = value;
            stack.push(value);
            System.out.println("\nValue inserted: "+value);
            return;
        }
        if(value < minimumElement){
            stack.push(2*value - minimumElement);
            minimumElement = value;
        }
        else{
            stack.push(value);
        }
        System.out.println("\nValue inserted: "+value);
    }
    void pop(){
        if (stack.isEmpty()) {
            System.out.println("\nStack is empty!");
            return;
        }
        System.out.print("\nTop element popped: ");
        int removedValue = stack.pop();
        //Updating the minimum element
        if (removedValue < minimumElement) {
            System.out.println(minimumElement);
            minimumElement = 2*minimumElement - removedValue;
        }
        else {System.out.println(removedValue);}
    }
    void peek() {
        if (stack.isEmpty()) {
            System.out.println("\nStack is empty!");
            return;
        }
        int topElement = stack.peek();
        System.out.print("\nTop-most element is: ");
        if (topElement < minimumElement) {System.out.println(minimumElement);}
        else {System.out.println(topElement);}
    }
    void getMin(){
        if (stack.isEmpty()) {System.out.println("\nStack is empty!");}
        else {System.out.println("\nMinimum element is : "+ minimumElement);}
    }
}

