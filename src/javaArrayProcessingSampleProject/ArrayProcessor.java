package javaArrayProcessingSampleProject;
import java.util.Arrays;

public class ArrayProcessor {
	
	// public ArrayProcessor(ArrayList<Integer> intArray){
		// 	array = intArray;
		// }

    public Integer getLowestValueFromIntArray(int[] array) {
    	System.out.println("From the getLowestValueFromIntArray");
    	System.out.println(Arrays.toString(array));
        if(array.length == 0 || array == null){
        	return null;
        }
        else{
        	int[] orderedArray = orderArrayFromBiggestToLowest(array);
        	return orderedArray[orderedArray.length-1];
        }
    }

    public Integer getSecondLowestValueFromIntArray(int[] array) {
    	System.out.println("From the getSecondLowestValueFromIntArray");
    	System.out.println(Arrays.toString(array));
        if(array.length == 0 || array == null){
        	return null;
        }
        else{
        	int[] orderedArray = orderArrayFromBiggestToLowest(array);
        	return orderedArray[orderedArray.length-2];
        }
    }

    public int[] orderArrayFromBiggestToLowest(int[] array){
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
    }

}