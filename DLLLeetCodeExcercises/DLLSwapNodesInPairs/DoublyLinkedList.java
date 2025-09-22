
package DLLLeetCodeExcercises.DLLSwapNodesInPairs;

public class DoublyLinkedList {

    private Node head;

    class Node {
        int value;
        Node next;
        Node prev;

        Node (int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }

    public void makeEmpty() {
        head = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

public void swapPairs() {
        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;
    
        while (head != null && head.next != null) {
            Node firstNode = head;
            Node secondNode = head.next;
    
            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
    
            secondNode.prev = previousNode;
            firstNode.prev = secondNode;
            
            if (firstNode.next != null) {
                firstNode.next.prev = firstNode;
            }
    
            head = firstNode.next;
            previousNode = firstNode;
        }
    
        head = dummyNode.next;
        if (head != null) head.prev = null;
    }
    
}