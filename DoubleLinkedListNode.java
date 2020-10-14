
public class DoubleLinkedListNode<G> {
  public DoubleLinkedListNode<G> next;
  public DoubleLinkedListNode<G> previous;
  
  public G value;
  
  DoubleLinkedListNode(G inValue){
    System.out.println("Making a new DoubleLinkedListNode where G is " + inValue.getClass().getSimpleName());
    value = inValue;
  }
  
  
  
  DoubleLinkedListNode(G inValue, DoubleLinkedListNode<G> inPrev){
    //this(inName, inInst, inPrefix, inNum);
    this(inValue);
    previous = inPrev;
  }
  
  public void append(G inValue) {
    //assert(inValue.getClass().equals(value.getClass()));
    if(next == null) {
      next = new DoubleLinkedListNode<G>(inValue,this);
    }else {
      next.append(inValue);
    }
  }
  
  // recursive print
  public void print() {
    System.out.print(value.getClass().getSimpleName() + " <--> " );
    //System.out.print(value.toString() + " <--> " );
    if(next != null) next.print();
    else System.out.println("␀");
  }
  
  public void printReverse() {
    System.out.print(value.toString() + " <--> " );
    if(previous != null) previous.printReverse();
    else System.out.println("␀");
  }
}
