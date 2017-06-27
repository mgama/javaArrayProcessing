/**
 * @author      Manuel Gama <mgamamsc@gmail.com>
 */

package javaArrayProcessing;

import java.util.Arrays;

public class ArrayProcessor {

	/**
	 * Returns the lowest value from an array of integers
	 *
	 * @param  array  an array of integers
	 * @return returns the lowest value from the array of integers passed to the function
	 * @return null returns null if the passed array of integers is either empty or null
	 * @throws IllegalArgumentException Only if an invalid argument is passed to the function
	 */
    public Integer getLowestValueFromIntArray(int[] array) {
    	System.out.println("From the getLowestValueFromIntArray");
//    	System.out.println(Arrays.toString(array));//For Debug Only
    	if(array == null){
    		System.out.println("The array is null");
    		return null;
    	}
        if(array.length == 0){
        	System.out.println("Detected empty or null array, returning null");
        	return null;
        }
        if(array.length == 1){
        	return array[0];
        }
    	if(array.length > 1){
        	System.out.println("The array length is " + array.length);
        	System.out.println(Arrays.toString(array));//For Debug Only
//        	int[] orderedArray = orderArrayFromLowestToBiggest(array);
        	int[] orderedArray = bubbleSort(array);
        	System.out.println("the lowest value is " + orderedArray[0]);
        	return orderedArray[0];
    	}
    	throw new IllegalArgumentException("Error: The argument passed is not an array of Integers");
    }

    /**
	 * Returns the lowest value from an array of integers
	 *
	 * @param  array  an array of integers
	 * @return returns the second lowest value from the array of integers passed to the function
	 * @return null returns null if the passed array of integers is either empty or null
	 * @throws IllegalArgumentException If only 1 integer is passed to the function
	 * @throws IllegalArgumentException Only if an invalid argument is passed to the function
	 */
    public Integer getSecondLowestValueFromIntArray(int[] array) {
    	System.out.println("From the getSecondLowestValueFromIntArray");
//    	System.out.println(Arrays.toString(array));//For Debug Only
    	if(array == null){
    		System.out.println("The array is null");
    		return null;
    	}
        if(array.length == 0){
        	System.out.println("Detected empty or null array, returning null");
        	return null;
        }
        if(array.length == 1){
        	System.out.println("Warning: Only 1 int value was passed, at least 2 ints are required. Throwing IllegalArtumentException");
        	throw new IllegalArgumentException("Only 1 int value was passed, at least 2 ints are required");
        }
    	if(array.length > 1){
        	System.out.println("The array length is " + array.length);
        	System.out.println(Arrays.toString(array));//For Debug Only
//        	int[] orderedArray = orderArrayFromLowestToBiggest(array);
        	int[] orderedArray = bubbleSort(array);
        	System.out.println("the second lowest value is " + orderedArray[1]);
        	return orderedArray[1];
    	}
    	throw new IllegalArgumentException("Error: The argument passed is not an array of Integers");
    }

    //This is an attempt to create a quicksort method, which is more efficient than bubbleSort
    //This is also called the divide and conquer method since it is dividing in blocks 
    //the whole array and using a pivot element (which is the middle of the array) to start 
    //the comparisons
    /*public int[] orderArrayFromLowestToBiggest(int[] array){
		int pivot = array[(array.length/2)];
		System.out.println("The pivot is " + pivot);
		int []leftEndArray = new int[array.length/2];
		int []rightEndArray = new int[array.length/2];
		
		System.out.println("Analyzing the leftEnd subarray");
		//For the first subarray from the left
		for (int i = 0; i < (array.length/2); i++){
			int element = array[i];
			System.out.println("Comparing " + element + " with pivot " + pivot);
			if (element > pivot){
				System.out.println("Moving element to the right of the pivot");
				rightEndArray[i] = element;
				System.out.println("The rightEndArray is " + Arrays.toString(rightEndArray));
			}
			else{
				leftEndArray[i] = element;
				System.out.println("The leftEndArray is " + Arrays.toString(leftEndArray));
			}
		}
		
		//For the second subarray from the right
		System.out.println("Moving on to analyze the rightEnd subarray");
		for (int i = rightEndArray.length + 1; i > (array.length/2); i++){
			int element = array[i];
			System.out.println("Comparing " + element + " with pivot " + pivot);
			if (element > pivot){
				System.out.println("Moving element to the right of the pivot");
				rightEndArray[i] = element;
				System.out.println("The rightEndArray is " + Arrays.toString(rightEndArray));
			}
			else{
				System.out.println("Moving element to the leftEnd array");
				leftEndArray[(leftEndArray.length + 1)] = element;
				System.out.println("The leftEndArray is " + Arrays.toString(leftEndArray));
			}
		}
		
		int[] sortedArray = new int[array.length];
		return sortedArray;
    }*/
    
    /**
	 * Returns an array of integers that has been sorted via a bubble sort methodology.
	 * This method of sorting involves comparing each element of the array to the next element;
	 * if the element is bigger than the next one, then it is swapped. This goes in a cycle and 
	 * the next element in the array is used as a base to be compared.
	 *
	 * @param  array  an array of integers
	 * @return array returns the same array passed but in order from lowest to highest
	 */
    public int[] bubbleSort(int[] array){
    	int temp = 0;//Creating temporary int element, which will be used for swapping on the new array
    	for (int i = (array.length - 1); i >= 0; i--){
	      for (int j = 1; j <= i; j++){
	    	 System.out.println("Comparing element " + (j-1) + " : " + array[j-1] + " with element " + j + " : " + array[j]);
	         if (array[j-1] > array[j]){
	        	  System.out.println("Swapping elements. Moving element " + array[j-1] + " to the right of the array.");
	              temp = array[j-1];
	              array[j-1] = array[j];
	              array[j] = temp;
	              System.out.println("After swapping, the array is" + Arrays.toString(array));
	         }
	      }
	      System.out.println("Cycle number " + i);
    	}
    	System.out.println("The new sorted array thru bubbleSort is " + Arrays.toString(array));
    	return array;
    }
    
    /**
	 * Returns a boolean value whether there is a duplicate value or not 
	 * from the array of integers passed to the function
	 *
	 * @param  array  an array of integers
	 * @return boolean returns true if a duplicate value was found inside the array, otherwise it returns false
	 */
    public boolean hasDuplicateValues(int[] array){
    	boolean foundDuplicateValue = false;
    	for(int i = 0; i < array.length -1;i++){
    		for(int j = i + 1; j < array.length; j++){
    			System.out.println("Comparing " + array[i] + " with " + array[j]);
    			if(array[i] == array[j]){
    				foundDuplicateValue = true;
    				System.out.println("Found a duplicate value in the array");
    			}
    		}
    	}
    	return foundDuplicateValue;
    }

}