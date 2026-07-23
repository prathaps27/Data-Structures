                                //single linked list
public class SLL {

    public static void main() {
        SLLImplementation ll = new SLLImplementation();
        for (int i = 10; i <= 50; i += 10) {
            ll.insert(i);
        }
        ll.display();
    }
}

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SLLImplementation {

    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        //case-1 List is Empty
        if (head == null) {
            head = newNode;
            return;
        }

        //list contains some elements  
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}