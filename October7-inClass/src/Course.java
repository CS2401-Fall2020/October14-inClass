
public class Course {
  public String name;
  public String instructor; 
  public String prefix;
  public int number;
  
  Course(String inName, String inInst, String inPrefix, int inNum){
    number = inNum;
    prefix = inPrefix;
    instructor = inInst; 
    name = inName;
  }
  
  public String toString() {
    return name + "(" +prefix + " " + number + ")";
  }
}
