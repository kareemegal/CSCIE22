package bag;

public class test {
	
	
    public static void main(String[] args) 
    {
    	int[] a = {2, 4, 6, 8, 10, 12}; 
    	int[] b = new int[6]; //Reference Variable 
    	int[] c = new int[6]; //Reference Variable (memory Address of the 
    	
    	b = a;
    	
    	b[0]=1;
    	
    	for (int i = 0; i < a.length; i++) 
    	{
    	    System.out.println(b[i]);
    	}
    	
    	for (int i = 0; i < a.length; i++) {
    	    c[i] = a[i];
    	}
    	
   
    	
    	
    	a[2] = c[5];
    	c[2]++;
    	System.out.println(c[2]);
    	
    	System.out.println(a[3] + " " + b[3] + " " + c[3]);

    }

}
