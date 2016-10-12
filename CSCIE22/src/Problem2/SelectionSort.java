package Problem2;
	
	class ArraySel

	   {

	   private long[] a;                 // ref to array a

	   private int nElems;               // number of data items

	//--------------------------------------------------------------

	   public ArraySel(int max)          // constructor

	      {

	      a = new long[max];                 // create the array

	      nElems = 0;                        // no items yet

	      }

	//--------------------------------------------------------------

	   public void insert(long value)    // put element into array

	      {

	      a[nElems] = value;             // insert it

	      nElems++;                      // increment size

	      }

	//--------------------------------------------------------------

	   public void display()             // displays array contents

	      {

	      for(int j=0; j<nElems; j++)       // for each element,

	         System.out.print(a[j] + " ");  // display it

	      System.out.println("");

	      }

	//--------------------------------------------------------------

	   public void selectionSort()

	      {

	      int out, in, min;



	      for(out=0; out<nElems-1; out++)   // outer loop

	         {

	         min = out;                     // minimum

	         for(in=out+1; in<nElems; in++) // inner loop

	            if(a[in] < a[min] )         // if min greater,
	                min = in;               // we have a new min
	         System.out.println("Index: " + out);  // display it
	         swap(out, min);                // swap them

	         }  // end for(out)

	      }  // end selectionSort()

	//--------------------------------------------------------------

	   private void swap(int one, int two)

	      {

	      long temp = a[one];
	      a[one] = a[two];

	      a[two] = temp;
	      
	      for(int k=0; k<nElems; k++)   // outer loop

	         {

	    	  System.out.print(a[k]+ " ");  // display it		
	    	  
	      }
	      System.out.println("");  // display it
	      }
	//--------------------------------------------------------------

	   }  // end class ArraySel

	////////////////////////////////////////////////////////////////

	class SelectSortApp

	   {

	   public static void main(String[] args)

	      {

	      int maxSize = 100;            // array size

	      ArraySel arr;                 // reference to array

	      arr = new ArraySel(maxSize);  // create the array



	      arr.insert(14);               // insert 10 items

	      arr.insert(7);

	      arr.insert(27);

	      arr.insert(13);

	      arr.insert(24);

	      arr.insert(20);

	      arr.insert(11);

	      arr.insert(10);

	      arr.insert(33);

	      arr.display();                // display items



	      arr.selectionSort();          // selection-sort them



	      arr.display();                // display them again

	      }  // end main()

}  // end class SelectSortApp
	