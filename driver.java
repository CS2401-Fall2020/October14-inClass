
public class driver {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    DoubleLinkedListNode head = new DoubleLinkedListNode("Elem. Data Struct./Algorithms","DeBlasio","CS",2401);
    head.next = new DoubleLinkedListNode("CS 1","Akbar","CS",1301, head);
    head.next.next = new DoubleLinkedListNode("CS 3","Fuentez","CS",2302, head.next);
    
    DoubleLinkedListNode tail = head;
    while(tail.next!=null) tail = tail.next;
    
    head.print();
    tail.printReverse();
  }

}
