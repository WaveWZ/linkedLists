// import java.awt.*;

// Bir inputu daha sonra alıp kullanacaksan o fonksiyonda void yerine int kullan!
public class LinkedList {
    Node head; // We're creating it to create the first object of our linkedList, bcz without it, its equal to null.

    LinkedList() {
    }
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // To send the head to the next line to make the area empty for the new king!
        head = newNode;  // To make the newNode the new head.
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void print() {
        Node dispElement = head;
        while (dispElement != null) {
            System.out.println(dispElement.data);
            dispElement = dispElement.next;
        }
    }

    public int findSize() {
        Node dispElement = head;
        int size = 0;
        while (dispElement.next != null) {
            size = size + 1;
            dispElement = dispElement.next;
        }
        return size + 1;
    }

    public void removeElementFromLast(){
        if(head==null){
            System.out.println("Its empty, please put sth. and try again.");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
} /*
    public void removeElementByIndex(int n){
        if(head==null){
            System.out.println("Its empty, please put sth. and try again.");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        for(int i=0;i<n;i++){
            head = head.next;
        }
        // Now head.data is the one we're looking for.

    }
}

*/