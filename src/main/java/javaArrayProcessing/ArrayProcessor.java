package javaArrayProcessing;

import java.util.Arrays;

public class ArrayProcessor {

    public Integer getLowestValueFromIntArray(int[] array) {
    	System.out.println("From the getLowestValueFromIntArray");
    	System.out.println(Arrays.toString(array));
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
        else{
        	if(array.length > 1){
	        	System.out.println("The array length is" + array.length);
	//        	int[] orderedArray = orderArrayFromLowestToBiggest(array);
	        	int[] orderedArray = bubbleSort(array);
	        	System.out.println("the lowest value is " + orderedArray[0]);
	        	return orderedArray[0];
        	}
        	return null;
        }
    }

    public Integer getSecondLowestValueFromIntArray(int[] array) {
    	System.out.println("From the getSecondLowestValueFromIntArray");
    	System.out.println(Arrays.toString(array));
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
        else{
        	if(array.length > 1){
	        	System.out.println("The array length is" + array.length);
	//        	int[] orderedArray = orderArrayFromLowestToBiggest(array);
	        	int[] orderedArray = bubbleSort(array);
	        	System.out.println("the second lowest value is " + orderedArray[1]);
	        	return orderedArray[1];
        	}
        	return null;
        }
    }

/*    public int[] orderArrayFromLowestToBiggest(int[] array){
    	System.out.println("From the orderArrayFromBiggestToLowest");
    	int[] sortedArray = new int[array.length]; 
		boolean finishedSorting = false;
		int pivot = array[(array.length/2)];
		System.out.println("The pivot is " + pivot);
		int leftEnd = array[0];
		System.out.println("The leftEnd is " + leftEnd);
		int rightEnd = array[array.length-1];
		System.out.println("The rightEnd is " + rightEnd);
		
		//For the first half of the numbers
		for (int i = 0; i < (array.length/2); i++){
			System.out.println("Inside for loop sorting");
			System.out.println(Arrays.toString(sortedArray));
			leftEnd = array[i];
			System.out.println("The leftEnd is " + leftEnd);
			System.out.println("The rightEnd is " + rightEnd);
			if (leftEnd > pivot){
				System.out.println("Moving leftEnd to the right of the pivot");
				sortedArray[sortedArray.length-1] = leftEnd;
			}
			else{
				sortedArray[i]=leftEnd;
			}
		}
		
		System.out.println("After the first loop the sortedArray" + Arrays.toString(sortedArray));
		
		//For the first half of the numbers
		for (int i = (array.length); i > (array.length/2); i--){
			System.out.println("Inside second loop sorting");
			System.out.println(Arrays.toString(sortedArray));
			rightEnd = array[i];
			System.out.println("The leftEnd is " + leftEnd);
			System.out.println("The rightEnd is " + rightEnd);
			if (rightEnd < pivot){
				System.out.println("Moving leftEnd to the right of the pivot");
				sortedArray[sortedArray.length-1] = rightEnd;
			}
			else{
				sortedArray[i]=rightEnd;
			}
		}
		System.out.println("After the second loop the sortedArray" + Arrays.toString(sortedArray));
		
		return sortedArray;
    }*/
    
    public int[] bubbleSort(int[] array){
    	for (int i = (array.length - 1); i >= 0; i--){
	      for (int j = 1; j <= i; j++)
	      {
	    	 System.out.println("Comparing " + array[j-1] + " with " + array[j]);
	         if (array[j-1] > array[j])
	         {
	              int temp = array[j-1];
	              array[j-1] = array[j];
	              array[j] = temp;
	         } 
	      } 
    	}
    	System.out.println("The new sorted array thru bubbleSort is " + Arrays.toString(array));
    	return array;
    }

}