package Problem1;

/* 
 * ArrayBag.java
 * 
 * Author:          Computer Science E-22 staff
 * Modified by:     Abdulkarim Egal, kegal@g.harvard.edu
 * Date modified:   9/21/2016
 */

/**
 * An interface for a Bag ADT.
 */
public interface Bag {
    /** 
     * adds the specified item to the Bag.  Returns true on success
     * and false if there is no more room in the Bag.
     */
    boolean add(Object item);

    /** 
     * removes one occurrence of the specified item (if any) from the
     * Bag.  Returns true on success and false if the specified item
     * (i.e., an object equal to item) is not in the Bag.
     */
    boolean remove(Object item);

    /**
     * returns true if the specified item is in the Bag, and false
     * otherwise.
     */
    boolean contains(Object item);

    /**
     * returns true if the called object contains all of the items in
     * otherBag, and false otherwise.  Also returns false if otherBag 
     * is null or empty. 
     */
    boolean containsAll(Bag otherBag);

    /**
     * returns the number of items in the Bag.
     */
    int numItems();

    /**
     * grab - returns a reference to a randomly chosen in the Bag.
     */
    Object grab();

    /**
     * toArray - return an array containing the current contents of the bag
     */
    Object[] toArray();
   
    /**
     * roomLeft - returns how many more items can be filled in the bag
     * @param args
     */
	int roomLeft();
	
	/**
     * isEmpty - Checks if the bag has any items or not.
     * @param args
     */
    boolean isEmpty();
    
    /**
     * increaseCapacity - Increase capacity of the bag by given no.
     * @param increment
     */
    void increaseCapacity(int increment);
    
    /**
     * addItmes - Adds all the items from given bag to the calling ArrayBag.
     * @param other
     */
    boolean addItems(Bag other);
    
    /**
     * intersectionWith - Returns bag with all common items of both the bags
     * @param other
     */
    Bag intersectionWith(Bag other);
}