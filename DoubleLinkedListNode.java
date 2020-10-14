
public class DoubleLinkedListNode {
  public DoubleLinkedListNode next;
  public DoubleLinkedListNode previous;
  
  public Course value;
  
  DoubleLinkedListNode(Course inCourse){
    value = inCourse;
  }
  
  DoubleLinkedListNode(String inName, String inInst, String inPrefix, int inNum){
    this(new Course(inName, inInst, inPrefix, inNum));
  }
  
  DoubleLinkedListNode(String inName, String inInst, String inPrefix, int inNum, DoubleLinkedListNode inPrev){
    this(inName, inInst, inPrefix, inNum);
    previous = inPrev;
  }
  
  // recursive print
  public void print() {
    System.out.print(value.toString() + " <--> " );
    if(next != null) next.print();
    else System.out.println("␀");
  }
  
  public void printReverse() {
    System.out.print(value.toString() + " <--> " );
    if(previous != null) previous.printReverse();
    else System.out.println("␀");
  }
}
