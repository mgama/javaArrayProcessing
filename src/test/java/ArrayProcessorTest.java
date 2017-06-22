/**
 * @author      Manuel Gama <mgamamsc@gmail.com>
 */

import static org.junit.Assert.*;
import org.junit.Test;

import javaArrayProcessing.ArrayProcessor;

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
   public void testLowestValueMethodWithValidArray4(){
      int[] testArray = {13,25,78,92,11,12,10,100,200,355,1000,1,5000,9999,0,770,123,456,879,234};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, 0);
   }
   
   @Test
   public void testLowestValueMethodWithValidArrayOnly2Ints(){
      int[] testArray = {13,25};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, 13);
   }
   
   @Test
   public void testLowestValueMethodWithValidArrayOnly1Int(){
      int[] testArray = {13};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, 13);
   }
   
   @Test
   public void testLowestValueMethodWithValidArrayWithNegativeAndPositiveInts(){
      int[] testArray = {13,-1,-5,0};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, -5);
   }
   
   @Test
   public void testLowestValueMethodWithValidArrayWithNegativeAndPositiveIntsBoundaryLimits(){
      int[] testArray = {13,-1,-5,0,1000,5000,-999999999};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, -999999999);
   }
   
   @Test
   public void testLowestValueMethodWithValidArrayWithOnlyNegativeInts(){
      int[] testArray = {-13,-1,-5,-255};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, -255);
   }
   
   @Test
   public void testLowestValueMethodWithValidArrayWithOnlyNegativeInts2BoundaryLimits(){
      int[] testArray = {-13,-1,-5,-255,-9999,-999999999};
      int lowestValue = arrayProcessor.getLowestValueFromIntArray(testArray);
      assertEquals(lowestValue,-999999999);
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
   public void testSecondLowestValueMethodWithValidArray4(){
      int[] testArray = {13,25,78,92,11,9,99,100,5000,0,2,10000,101,999,1,7543,918764};
      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(secondLowestValue, 1);
   }
   
   @Test
   public void testSecondLowestValueMethodWithValidArrayOnly2Ints(){
      int[] testArray = {255,111};
      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(secondLowestValue, 255);
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void testSecondLowestValueMethodWithValidArrayOnly1Int(){
      int[] testArray = {255}; 
      arrayProcessor.getSecondLowestValueFromIntArray(testArray);
   }
   
   @Test
   public void testSecondLowestValueMethodWithValidArrayWithNegativeAndPositiveInts(){
      int[] testArray = {13,-1,-5,0};
      int lowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, -1);
   }
   
   @Test
   public void testSecondLowestValueMethodWithValidArrayWithNegativeAndPositiveIntsBoundaryLimits(){
      int[] testArray = {13,-1,-5,0,1000,5000,-999999998,-999999999};
      int lowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, -999999998);
   }
   
   @Test
   public void testSecondLowestValueMethodWithValidArrayWithOnlyNegativeInts(){
      int[] testArray = {-13,-1,-5,-255};
      int lowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(lowestValue, -13);
   }
   
   @Test
   public void testSecondLowestValueMethodWithValidArrayWithOnlyNegativeInts2BoundaryLimits(){
      int[] testArray = {-13,-1,-5,-255,-999999998,-999999999};
      int lowestValue = arrayProcessor.getSecondLowestValueFromIntArray(testArray);
      assertEquals(lowestValue,-999999998);
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