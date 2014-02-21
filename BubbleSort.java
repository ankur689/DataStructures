
package DataStructures;
import java.util.Scanner;


public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int n;
	
	Scanner a = new Scanner(System.in);
	
	System.out.println("Enter the number of integers");
	n=a.nextInt();
	
	int array[] = new int[n];
	for(int i=0;i<n; i++){
		array[i]=a.nextInt();
	}
	for(int j=0;j<array.length-1; j++){
		for(int k =0; k<(array.length)-j; k++){
			if(array[j]>=array[j+1]){
				int temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				
			}
		}
	}
	
	System.out.println("\n values after sorting");
	for(int l =0; l<array.length; l++){
		System.out.println("value at "+array[l]);
	}
	}
}
