package javaArrayProcessingSampleProject;

import static org.junit.Assert.*;
import org.junit.Test;

import javaArrayProcessingSampleProject.ArrayProcessor;

public class ArrayProcessorTest {

	ArrayProcessor arrayProcessor = new ArrayProcessor();

	@Test
   public void testLowestValueMethodWithValidArray(){
      int[] testArray = {5,4,7,8,9};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, 4);
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
   public void testSecondLowestValueMethodWithEmptyArray(){
      int[] testArray = new int[0];
      assertEquals(arrayProcessor.getSecondLowestValueFromIntArray(testArray), null);
   }

   @Test
   public void testSecondLowestValueMethodWithNullArray(){
      assertEquals(arrayProcessor.getSecondLowestValueFromIntArray(null), null);
   }

}