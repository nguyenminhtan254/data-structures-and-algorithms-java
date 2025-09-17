
package LLLeetCodeExcercises.LLSwapNodesInPairs;

public class LinkedList {

    private Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("empty");
        } else {
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void makeEmpty() {
        head = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }


    public void swapPairs() {
        Node dummy = new Node(0);
        dummy.next = head;
        Node previous = dummy;
        Node first = head;
    
        while (first != null && first.next != null) {
            Node second = first.next;
    
            // Perform the swap
            previous.next = second;
            first.next = second.next;
            second.next = first;
    
            // Move pointers
            previous = first;
            first = first.next;
        }
    
        head = dummy.next;
    }
    
}