package structure.stack;

import structure.array.*;

public class ArrayStack {
    MyArray arrayStack;
    int top;

    public ArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public ArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arrayStack.addElement(data);
            top++;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack id empty");
            return MyArray.ERROR_NUM;
        } else {
            return arrayStack.removeElement(--top);
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack id empty");
            return MyArray.ERROR_NUM;
        } else {
            return arrayStack.getElement(--top);
        }
    }

    public boolean isFull() {
        return top == arrayStack.ARRAY_SIZE;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printAll() {
        arrayStack.printAll();
    }
}
