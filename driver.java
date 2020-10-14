
public class driver {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    DoubleLinkedListNode head = new DoubleLinkedListNode(
        new Course("Elem. Data Struct./Algorithms","DeBlasio","CS",2401));
    
    head.append(new Course("CS 1","Akbar","CS",1301));
    head.next.next = new DoubleLinkedListNode(new Course("CS 3","Fuentez","CS",2302), head.next);
    head.append("Special Topics"); // this should not work.... but it does..... 
    head.next.next.next.next = new DoubleLinkedListNode(new SomethingElse("Hello"),head.next.next.next);
    
    System.out.println(((SomethingElse)head.next.next.next.next.value).counter);
    
    SomethingElse myVar = new SomethingElse("Hello World");
    System.out.println(myVar.counter++);
    System.out.println(((SomethingElse)head.next.next.next.next.value).counter);
    System.out.println(SomethingElse.counter);
    System.out.println(myVar.toString());
    System.out.println(SomethingElse.toString(myVar));
    System.out.println(myVar.toString(myVar));
    
    DoubleLinkedListNode tail = head;
    while(tail.next!=null) tail = tail.next;
    
    head.print();
    tail.printReverse();
  }

}
