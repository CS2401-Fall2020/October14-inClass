
public class SomethingElse {
  public String name;
  public static int counter = 0;
  
  SomethingElse(String inName){
    name = inName; 
    counter++;
  }
  
  public static String toString(SomethingElse s) {
    return "Static version: " + s.name + "," + counter;
  }
  
  public String toString() {
    return "Non-Static version: " + name + "," + counter;
  }
  
  public int compareTo(SomethingElse anotherElse) {
    return name.compareTo(anotherElse.name);
  }
}
