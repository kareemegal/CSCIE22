package bag;

public class sort 
{
	/*********** 
	 * isSorted Method- Returns true if array of integers sorted 
	 * Returns false if array of integers is not sorted
	 ***********/
	
	public static boolean isSorted (int[] arr) 
	{
		//Check if a value of null is passed	
		if (arr == null)
           throw new IllegalArgumentException("item must be non-null");
 
		//Check if an array length of 0 or an array with one element is passed	
		else if (arr.length <= 1){
			System.out.println("No Elements or Only 1 Element in the Array");
			return true;       								   // no more room!
		}
		
		//If we find any element which is greater then its next element we return false.
		for (int i = 0; i < arr.length-1; i++){
			if(arr[i] > arr[i+1])
				return false;
			
		}
		
		//If array is finished processing then return true as all elements passed the test.
		return true;
	}
	
	public static int mostFrequentValue(int[] arr)
	 {
	   int count = 1; // Hold number times Element is found in the Array
	   int tempCount; //Place holders for number of times Element is found in the Array
	   int mostFrequentElement = arr[0];  //Start with the first element in the Array
	   int element = 0;	//holds the second element in the row
	   
	   //Loop to get Elements 
	   for (int i = 0; i < (arr.length - 1); i++){
	    element = arr[i]; //
	    tempCount = 0;
	    
	    //Loop to check if there is a match and keep accounting of number of elements found
	    for (int j = 1; j < arr.length; j++)
	    {
	     if (element == arr[j])
	      tempCount++; // Increment the temporary 
	    } //End 2nd loop (for)
	    
	    //Check if there is a new mostFrequentValue
	    if (tempCount > count)
	    {
	      mostFrequentElement = element;
	      count = tempCount;
	    }
	    
	   }//End 1st Loop (for)
	   
	   return mostFrequentElement;
	   
	 }// end class ArrayIns
	 
	
	 /* Test the isSorted implementation. */
	public static void main(String[] args) 
	{
	  int[] a = {1, 2, 3, 3, 8, 8, 8, 11, 11, 11, 11, 14, 19, 19};
	  
	  if (isSorted(a))
	  {
		  System.out.println("Array is sorted");
	  }
	  
	  else 
	  {
		  System.out.println("Array is not sorted");
	  }
	  
	  int mostFrequent = mostFrequentValue(a);
	  
	  System.out.println(mostFrequent);
	}
}
