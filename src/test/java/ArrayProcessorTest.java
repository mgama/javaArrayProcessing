import static org.junit.Assert.*;
import org.junit.Test;

import ArrayProcessor;

public class ArrayProcessorTest {

	ArrayProcessor arrayProcessor = new ArrayProcessor();

   @Test
   public void testLowestValueMethodWithValidArray(){
      int[] testArray = {5,4,7,8,9};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, 4);
   }
	
   @Test
   public void testLowestValueMethodWithValidArray2(){
      int[] testArray = {13,25,78,92,11,12,10};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, 10);
   }
   
   @Test
   public void testLowestValueMethodWithValidArray3(){
      int[] testArray = {13,25,78,92,11,12,10,100,200,355,1000,1};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, 1);
   }

   @Test
   public void testLowestValueMethodWithEmptyArray(){
      int[] testArray = new int[0];
      assertEquals(arrayProcessor.getLowestValueFromIntArray(testArray), null);
   }

   @Test
   public void testLowestValueMethodWithNullArray(){
      assertEquals(arrayProcessor.getLowestValueFromIntArray(null), null);
   }

   @Test
   public void testSecondLowestValueMethodWithValidArray(){
      int[] testArray = {5,4,7,8,9};
      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(secondLowestValue, 5);
   }
   
   @Test
   public void testSecondLowestValueMethodWithValidArray2(){
      int[] testArray = {13,25,78,92,11,9,99,100};
      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(secondLowestValue, 11);
   }
   
   @Test
   public void testSecondLowestValueMethodWithValidArray3(){
      int[] testArray = {13,25,78,92,11,9,99,100,5000,0,2,10000};
      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(secondLowestValue, 2);
   }

   @Test
   public void testSecondLowestValueMethodWithEmptyArray(){
      int[] testArray = new int[0];
      assertEquals(arrayProcessor.getSecondLowestValueFromIntArray(testArray), null);
   }

   @Test
   public void testSecondLowestValueMethodWithNullArray(){
      assertEquals(arrayProcessor.getSecondLowestValueFromIntArray(null), null);
   }

}