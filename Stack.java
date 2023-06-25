public class Stack {
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        stackArray = new int[size];
        top = -1;
    }

    
    public boolean isEmpty() {
        return (top == -1);
    }

    
    public void push(int value) {
        if (top == stackArray.length - 1) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }

        stackArray[++top] = value;
        System.out.println(value + " pushed to the stack.");
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; 
        }

        int value = stackArray[top--];
        System.out.println(value + " popped from the stack.");
        return value;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); 

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop()); 

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}