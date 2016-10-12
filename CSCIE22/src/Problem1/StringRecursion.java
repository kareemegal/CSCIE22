package Problem1;

/**
 * Reverse Method prints the individual characters in the string str in reverse order. 
 */
public class StringRecursion {
	/**
	 * printReverse Method prints the individual characters in the string str in reverse order. 
	 */
	
	 public static void printReverse(String str){
	 
	  // Check for a null and blank strings
	  //Return to the main method if found
	  if (str == null || str.length() == 0) return;
	  
	  //Base case
	  //Set stringLenght to the length of the string passed.
	  int stringLenght = str.length();
	  
	  //Return to the main method if String Length is 1
	  if (stringLenght ==1) {System.out.print(str); return; }
	  
	  //Recursive calls
	  else  printReverse(str.substring(1));
	  
	  System.out.print(str.substring(0,1));
	  
	 } // End of printReverse Method
	 
	 /**
	  * Reverse Method prints the individual characters in the string str in reverse order. 
	  */
	 
	 public static String trim(String str){
		 
	  // Check for a null and blank strings
	  //Return to the main method if found
	  if (str == null || str.length() == 0) return str;
	 
	  //Base case
	  //Set stringLenght to the length of the string passed.
	  if (!str.substring(0,1).equals(" ") && !str.substring(str.length()-1,str.length()).equals(" ")) return str;  
	  
	  
	  //Recursive calls
	  if (str.substring(0,1).equals(" ") && str.substring(str.length()-1,str.length()).equals(" ") 
			  && str.length()>1) return trim(str.substring(1,str.length()-1));
	  if (str.substring(0,1).equals(" ")) return trim(str.substring(1,str.length()));
	  else return trim(str.substring(0,str.length()-1));
	  
	 }
	 
	 
	 public static void main(String args[]){
	  
	  String str = "Harvard";
	  String nullParameter = null;
	  String emptyString = "";
	  String trimParamater1 = " Hello world ";
	  String trimParamater2 = "recursion ";
	  
	  System.out.print("Testing printReverse Method\n");
	  System.out.print("Reverse of string '" + str+ "' is: ");printReverse(str);
	  System.out.println();
	  System.out.print("Testing Reverse of empty String is: ");printReverse(emptyString );
	  System.out.println();
	  System.out.print("Testing Reverse Method with null Parameter: ");printReverse(nullParameter);
	  System.out.println();
	  System.out.println();
	  
	 
	  System.out.print("Testing trim Method\n");
	  System.out.println(trim(trimParamater1));
	  System.out.println(trim(trimParamater2));
	
	  
	 }
	}
