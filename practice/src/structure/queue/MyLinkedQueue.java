package structure.queue;

import structure.linkedList.MyLinkedList;
import structure.linkedList.MyListNode;

public class MyLinkedQueue extends MyLinkedList implements Queue {

    MyListNode front;  // 앞
    MyListNode rear;  //뒤

    @Override
    public void enQueue(String data) {
        MyListNode newNode;

        if (isEmpty()) {
            newNode = addElement(data);
            front = newNode;
            rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode;
        }

        System.out.println(newNode.getData()+" added");
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            return null;
        } else {
            String data = front.getData();
            front = front.next;
            removeElement(0);

            if (front == null) {
                rear = null;
            }

            return data;
        }
    }

    @Override
    public void printQueue() {
        printAll();
    }
}
