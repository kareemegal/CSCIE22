package Problem1;

public class RecursiveSearch {
	
	public static boolean recursiveSearch(Object item, Object[] arr, int i) {
		if (i == arr.length) return false;
		
		if (arr[i] == item) return true;
		
		else return recursiveSearch(item, arr, i+1);
	} //End of recursiveSearch Method
	
	public static void main(String args[]){
		
		String item = "kareem";
		String array[] = {"Hello","there","i","am","kareem"}; 
		 
		if(recursiveSearch(item,array,4))
			 System.out.println(item + " is at that position");
		 else
			 System.out.println(item + " is not at that position");
	} //End of Main
	

} //End of RecursiveSearch Class
