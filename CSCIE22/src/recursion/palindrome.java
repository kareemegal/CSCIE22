package recursion;

public class palindrome
{
	public static boolean palindromes (String str) 
  {	
    if (str == null || str.length()==1)
    {
    	System.out.println("Base");	
    	System.out.println(str);	
        return true;
    }
    
    else if (str.charAt(0) == str.charAt(str.length()-1))
    {	
    	System.out.println(str);	
    	System.out.println(str.substring(1, str.length()-1));
        return palindromes(str.substring(1, str.length()-1));
    }
    else
    {
    	System.out.println("False Return");	
        return false;
    }          
 }
 public static void main(String[] args) {
 
        String word = "racecar";
        
        if(palindromes(word))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
 }
}

