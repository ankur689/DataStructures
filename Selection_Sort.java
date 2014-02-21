package DataStructures;
/*
public class Selection_Sort {


	public static void main(String[] args) {
	int arr[]={234,151,123,4,5342,76,48};
	int min=0; int temp;
	for(int i=0;i<=arr.length-1;i++){
	    min=i;
	    for (int k=i+1;k<arr.length;k++){
	        if(arr[k]<arr[i]){
	            temp=arr[i];
	            arr[i]=arr[k];
	            arr[k]=temp;
	        }
	    }
	}
	for (int j=0;j<=arr.length-1;j++)
	    System.out.println(arr[j]+" ");

	}

	}*/


public class Selection_Sort{
	  public static void main(String a[]){
	  int i;
	  int array[] = {12,9,4,99,120,1,3,10};
	  System.out.println("\n\n RoseIndia\n\n");
	  System.out.println(" Selection Sort\n\n"); 
	  System.out.println("Values Before the sort:\n");  
	  for(i = 0; i < array.length; i++)
	  System.out.print( array[i]+"  ");
	  System.out.println();
	  selection_srt(array, array.length);  
	  System.out.print("Values after the sort:\n");  
	  for(i = 0; i <array.length; i++)
	  System.out.print(array[i]+"  ");
	  System.out.println();
	  System.out.println("PAUSE");
	  }

	  public static void selection_srt(int array[], int n){
	  for(int x=0; x<n; x++){
	  int index_of_min = x;
	  for(int y=x; y<n; y++){
	  if(array[index_of_min]<array[y]){
	  index_of_min = y;
	  }
	  }
	  int temp = array[x];
	  array[x] = array[index_of_min];
	  array[index_of_min] = temp;
	  }
	  }
	}