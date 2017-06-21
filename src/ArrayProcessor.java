// package src;

public class ArrayProcessor implements ArrayProcessingInterface {

	// public ArrayProcessor(ArrayList<Integer> intArray){
	// 	array = intArray;
	// }

    public Integer getLowestValueFromIntArray(int[] array) {
        if(array.length == 0 || array == null){
        	return null;
        }
        else{
        	int[] orderedArray = orderArrayFromBiggestToLowest(array);
        	return orderedArray[orderedArray.length];
        }
    }

    public Integer getSecondLowestValueFromIntArray(int[] array) {
        if(array.length == 0 || array == null){
        	return null;
        }
        else{
        	int[] orderedArray = orderArrayFromBiggestToLowest(array);
        	return orderedArray[orderedArray.length-1];
        }
    }

    public int[] orderArrayFromBiggestToLowest(int[] array){
    	int[] sortedArray = new int[array.length]; 
		boolean finishedSorting = false;
		int pivot = array[(array.length/2)];
		System.out.println("The pivot is " + pivot);
		int leftEnd = array[0]; 
		int rightEnd = array[array.length-1];
		
		for (int i = 0; finishedSorting != true; i++){
			if (leftEnd > pivot){
				sortedArray[sortedArray.length-1] = leftEnd; 
			}
			else{
				finishedSorting = true;
			}
		}
		
		return sortedArray;
    }
}