package DataStructures;

public class Stack_StachApp {

	public static void main(String[] args) {
      Stack s = new Stack(10);
      s.push(10);
      s.push(20);
      s.push(30);
      s.push(40);
      s.push(80);
      
      System.out.println("Displaying stack >>"+s.seek());
      while(!s.isEmpty()){
    	long value =  s.pop();
    	System.out.println("value"+value);
    	//s.seek();
      }
     
     // s.seek();

	}

}
