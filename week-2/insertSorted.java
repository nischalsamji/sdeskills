public Node insertSorted(Node head, int n){
     Node newNode = new Node(n);
     if(head == null || head.data >= n){
        newNode.next = head;
        head = newNode;
        return head;
     }
     else{
     Node current  = head;
     while(head.next != null && head.next.data < n){
          current = current.next;
     }
     newNode.next = current.next;
     current.next = newNode;
     }
     return head;
}

// Node Class Signature
class Node{

public int data;
public Node next;

Node(int n){
    this.data = n;
}

}
