package DataStructures;

public class Stack {
	int top =0;
	int maxsize;
	long array[];
	
	public Stack(int s){
		maxsize =s;
		array = new long[maxsize];
		top =-1;
	}
	
	public void push(int j){
		array[++top]=j;
		
	}
	
	public long pop(){
		return array[top--];
	}
	
	public long seek(){
		return array[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top ==maxsize-1);
	}
	
}
