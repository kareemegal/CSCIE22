package Problem1;

/* 
 * Problem 8: Lagrange’s theorem 
 * Class:           CSCI E-22 (14309)
 * Author:          Abdulkarim Egal
 * Email:           kegal@g.harvard.edu
 * Date modified:   9/21/2016
 */

import java.util.*;


public class Lagrange {
	
	private int number;      // the number we are trying to break up
    
	/* Put any additional fields below. */
	private int array[] = new int[4];

	/*
     * largestSquare - a private helper method that returns the 
     * largest perfect square less than or equal to the specified 
     * positive integer n.
     */
    private static int largestSquare(int n) {
    	
        int sqrt = (int)Math.sqrt(n);
        System.out.println("Square Root of " + n + " : " + sqrt);
        return sqrt * sqrt;
        
    }

    /**
     * constructor
     */
    
    public Lagrange(int num) {
        number = num;
        
        // create the array to hold value
        array = new int[4];
    }

    /**
     * printSolution - print the solution to the problem
     */
    public void printSolution() {
    	
        System.out.print(number + " = ");
        
        for(int i = 3; i >= 0; i--){				
        	//Printing array from right
        	System.out.print(array[i]);
        	
        	if (i ==0 || array[i-1] == 0)break;
        	
        	System.out.print(" + ");
        }    
    }
    
    /**
     * findSum method - a "wrapper" method that makes the initial
     * call to the key recursive-backtracking method (the findSumRB 
     * method found below), and that returns the same value that it returns.
     * 
     * NOTE: If you choose to modify the signature of the findSumRB method
     * or the meaning of its parameters, you should also change the call 
     * made by this method. Otherwise, no changes are needed.
     */
    
    public boolean findSum(int num, int maxTerms) {
    	
    
    	int tempNumber;
    	int index;
    	
    	//Problem 9: Enhancement to Back track early
    	if ((num > 0 && maxTerms == 0) || (num < 4 && maxTerms < num))return false;	
        	
    	//Base case 1 
        if (num == 0 && maxTerms >= 0) return true;		
        
        //Get the largest square less than or equal to given number
        
        array[maxTerms-1] = largestSquare(num);
        
        //Decrement maxTerms and set it index
        index = maxTerms - 1;				
        System.out.println("Index: " + index);
        
        //Filling array from right
        tempNumber = (num - array[maxTerms-1]);		
        System.out.println("Difference Between Number and Square of the Square Root of the Number: " + tempNumber);
        
        
        while (!findSum(tempNumber, index)){
        	
        	//Base case 2 
        	if (array[maxTerms-1] == 1) 
        		return false;
        	
             
             //Find next largest square of the passed number
        	// Keep getting the largest square number till we hit negative 1 
             array[maxTerms-1] = largestSquare(array[maxTerms-1]-1);	
        	tempNumber = (num - array[maxTerms-1]);
        	
        }
        
        return true;

    }

    
    /** YOU SHOULD NOT CHANGE THIS METHOD. **/
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a positive integer (-1 to quit): ");
            int n = console.nextInt();
            console.nextLine();
            
            if (n == -1) {
                System.out.println("Goodbye!");
                return;
            } else if (n <= 0)
                continue;
            
            Lagrange problem = new Lagrange(n);
            
            if (problem.findSum(n, 4)) {
                problem.printSolution();
            } else {
                System.out.println("could not find a sum for " + n);
                System.out.println();
             }
            System.out.println();
        }
    }
}
