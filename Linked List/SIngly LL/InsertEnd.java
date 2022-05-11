class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertEnd {

    public static Node insertEnd(Node head, int x){
        Node newNode = new Node(x);
        if(head==null){
            return newNode;
        }
        Node curr = head; 
        while( curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode; 

        return head;
    }

    static public void display(Node head) {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  

        while(current != null) {  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  

    public static void main(String[] args) {
        Node head = null;
        head = insertEnd(head, 10);
        head = insertEnd(head, 20);
        head = insertEnd(head, 30);

        display(head);
    
    }
}