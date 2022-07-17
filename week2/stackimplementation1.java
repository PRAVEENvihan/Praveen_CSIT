class Stack
{
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }
 
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
 
        System.out.println("Removing " + peek());
        return arr[top--];
    }
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
 
        return -1;
    }
    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;              
    }
 

    public boolean isFull() {
        return top == capacity - 1; 
    }
}
 
class Main
{
    public static void main (String[] args)
    {
        Stack stack = new Stack(3);
 
        stack.push(1);     
        stack.push(2);     
 
        stack.pop();       
        stack.pop();       
 
        stack.push(3);     
 
        System.out.println(stack.peek());
        System.out.println(stack.size());
 
        stack.pop();      
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}
