
import javaArrayProcessing.FibonacciProcessor;

import static org.junit.Assert.*;
import org.junit.Test;

public class FibonacciProcessorTest {

	FibonacciProcessor fibonacciProcessor = new FibonacciProcessor();

   @Test
   public void testFirstFibonacciNumber(){
	  int fibonacciNumber = fibonacciProcessor.getFibonacciNumber(0);
	  assertEquals(fibonacciNumber, 1);
   }
   
   @Test
   public void testSecondFibonacciNumber(){
	  int fibonacciNumber = fibonacciProcessor.getFibonacciNumber(1);
	  assertEquals(fibonacciNumber, 1);
   }
   
   @Test
   public void testThirdFibonacciNumber(){
	  int fibonacciNumber = fibonacciProcessor.getFibonacciNumber(2);
	  assertEquals(fibonacciNumber, 2);
   }

}
