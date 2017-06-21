package javaArrayProcessingSampleProject;

import static org.junit.Assert.*;
import org.junit.Test;

import javaArrayProcessingSampleProject.ArrayProcessor;

public class ArrayProcessorTest {

	ArrayProcessor arrayProcessor = new ArrayProcessor();

	@Test
	   public void testLowestValueMethodWithValidArray(){
	      // ArrayProcessor arrayProcessor = new ArrayProcessor();
	      int[] testArray = {5,4,7,8,9};
	      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
	      assertEquals(lowestValue, 4);
	   }

//	   @Test
//	   public void testLowestValueMethodWithEmptyArray(){
//	      // ArrayProcessor arrayProcessor = new ArrayProcessor();
//	      int[] testArray = new int[0];
//	      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
//	      assertEquals(lowestValue, null);
//	   }

//	   @Test
//	   public void testLowestValueMethodWithNullArray(){
//	      // ArrayProcessor arrayProcessor = new ArrayProcessor();
//	      int lowestValue = arrayProcessor.getLowestValueFromIntArray(null);
//	      assertEquals(lowestValue, null);
//	   }
//
//	   @Test
//	   public void testSecondLowestValueMethodWithValidArray(){
//	      // ArrayProcessor arrayProcessor = new ArrayProcessor();
//	      int[] testArray = {5,4,7,8,9};
//	      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
//	      assertEquals(secondLowestValue, 5);
//	   }
//
//	   @Test
//	   public void testSecondLowestValueMethodWithEmptyArray(){
//	      // ArrayProcessor arrayProcessor = new ArrayProcessor();
//	      int[] testArray = new int[0];
//	      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
//	      assertEquals(secondLowestValue, null);
//	   }
//
//	   @Test
//	   public void testSecondLowestValueMethodWithNullArray(){
//	      // ArrayProcessor arrayProcessor = new ArrayProcessor();
//	      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray(null);
//	      assertEquals(secondLowestValue, null);
//	   }

}
