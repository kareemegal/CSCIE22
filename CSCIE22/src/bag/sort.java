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
	  int count = 1;
	  int tempCount;
	  int mostFrequentValue = arr[0];		//
	  int temp = 0;
	  
	  //
	  for (int i = 0; i < (arr.length - 1); i++){
		  temp = arr[i];
		  tempCount = 0;
		  
		  //
		  for (int j = 1; j < arr.length; j++)
		  {
			  if (temp == arr[j]){
				  tempCount++;
			  }
			  if (tempCount > count){
				  mostFrequentValue = temp;
			  }
			  
			  count = tempCount;
			  
		  }
		  
	  }
	  
	  return mostFrequentValue;
	  
	}
	
	 /* Test the isSorted implementation. */
	public static void main(String[] args) 
	{
	  int[] a = {1, 2, 3, 3, 8, 8, 8, 8, 11, 11, 11, 14, 19, 19};
	  
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
