class StackOverFlowException extends Exception {
    public String toString() {
        return "Stack size is full";
    }
}

class StackUnderFlowException extends Exception {
    public String toString() {
        return "Stack is underflow can't remove elelment";
    }
}

class Stack {
    public int []A;
    public int top = -1;
    public int size ;
    public Stack(int sz)
    {
        size = sz;
        A = new int[sz];

    }


    public void push(int ele) throws StackOverFlowException {
        if (top == size - 1) {
            /* Exception should be thrown*/
            throw new StackOverFlowException();
        } else {
            top++;
            A[top] = ele;
        }
    }

    public int pop() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException();
        }
        int x = -1;
        x = A[top];
        return x;
    }
}

public class StackOperation {
    public static void main(String[] args) {
    Stack st = new  Stack(5);
    try{
       st.push(1);
       st.push(10);
       st.push(30);
       st.push(40);
       st.push(50);
       st.push(60);
    }
    catch (StackOverFlowException e)
    {
        System.out.println("Error "+e);
    }

    }
}
