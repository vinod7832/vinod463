class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    boolean isEmpty() {
        if (this.size == 0)
            return true;
        else
            return false;
    }

    Node getHead() {
        return this.head;
    }

    int getSize() {
        return this.size;
    }

    void appendNode(int data) {
        Node currentNode = new Node(data);

        if(isEmpty() == true){
            this.head = currentNode;
        }else{
            Node prev = this.head;
            while( prev.next != null){
                prev = prev.next;    
            }
            prev.next = currentNode;
        }
        this.size++;
    }

    void printData() {
        if (this.isEmpty()) {
            System.out.println("list is empty");
        } else {
            Node currentNode = this.head;
            String listValues = "";
            while (currentNode != null) {
                listValues += String.valueOf(currentNode.data);
                listValues += " ";
                currentNode = currentNode.next;
            }
            System.out.println(listValues);
        }
    }
}

public class simpleLinkedList {
    public static void main(String[] args) {
        LinkedList studentIDLinkedList = new LinkedList();

        studentIDLinkedList.appendNode(1);
        studentIDLinkedList.appendNode(2);
        studentIDLinkedList.appendNode(3);
        studentIDLinkedList.appendNode(4);
        studentIDLinkedList.appendNode(5);

        studentIDLinkedList.printData();
    }
}