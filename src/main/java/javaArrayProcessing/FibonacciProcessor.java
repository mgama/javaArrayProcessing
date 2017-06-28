package javaArrayProcessing;

public class FibonacciProcessor {

	public Integer getFibonacciNumber(int fibonacciNumber){
		System.out.println("On this method getFibonacciNumber");
		int[] fibonacciSequence = generateFibonacciSequence(fibonacciNumber);
		return fibonacciSequence[fibonacciNumber];
	}
	
	public void printFibonacciSequence(int maximumFibonacciNumber){
		int[] fibonacciSequence = generateFibonacciSequence(maximumFibonacciNumber);
		for(int i = 0; i < fibonacciSequence.length; i++){
			System.out.println(fibonacciSequence[i]);
		}
	}
	
	public int[] generateFibonacciSequence(int fibonacciNumber){
		System.out.println("On this method generateFibonacciSequence");
		int firstFibonacciNumber = 1;
		int secondFibonacciNumber = 1;
		System.out.println("Creating original fibonacciSequence");
		int[] fibonacciSequence = new int[fibonacciNumber + 1];
		fibonacciSequence[0] = firstFibonacciNumber;
		fibonacciSequence[1] = secondFibonacciNumber;
		if (fibonacciNumber == 0 || fibonacciNumber == 1){
			System.out.println("The asked fibonaccinumber was either 0 or 1");
			return fibonacciSequence;
		}
		else{
			int tempValue = firstFibonacciNumber + secondFibonacciNumber;
			System.out.println("The tempValue is " + tempValue);
			for(int i = 2; i < fibonacciNumber; i++){
				System.out.println("Adding new number: " + tempValue + " to FibonacciSequence");
				fibonacciSequence[i] = tempValue;
				firstFibonacciNumber = secondFibonacciNumber;
				secondFibonacciNumber = tempValue;
			}
			return fibonacciSequence;
		}
	}
}
