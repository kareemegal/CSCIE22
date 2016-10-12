package Problem1;

public class Search {
	public static boolean search(int item, Object[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == (Object)item) 
				return true;
			}
		return false;
		}//End of search Method
		  
		  
	 public static void main(String args[]){
		 
		 /**
		  * Declare array as Primitive type Integer.
		  * What gets passed to the method is the reference to the object. 
		  */
		 int item = 10;
		 Integer array[] = {1,2,3,4,5}; 
		 if(search(item,array))
			 System.out.println(item + " was found in the array");
		 else
			 System.out.println(item + " was not found in the array");
	 }// End of Main
}// End of Search Class
