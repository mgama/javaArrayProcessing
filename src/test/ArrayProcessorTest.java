import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit{

   @Test
   public void testLowestValueMethodWithValidArray(){
      ArrayProcessor arrayProcessor = new ArrayProcessor();
      int lowestValue = arrayProcessor.getLowestValueFromIntArray([5,4,7,8,9]);
      assertEquals(lowestValue, 4);
   }

   @Test
   public void testLowestValueMethodWithEmptyArray(){
      ArrayProcessor arrayProcessor = new ArrayProcessor();
      int lowestValue = arrayProcessor.getLowestValueFromIntArray([]);
      assertEquals(lowestValue, null);
   }

   @Test
   public void testLowestValueMethodWithNullArray(){
      ArrayProcessor arrayProcessor = new ArrayProcessor();
      int lowestValue = arrayProcessor.getLowestValueFromIntArray();
      assertEquals(lowestValue, null);
   }

   @Test
   public void testSecondLowestValueMethodWithValidArray(){
      ArrayProcessor arrayProcessor = new ArrayProcessor();
      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray([5,4,7,8,9]);
      assertEquals(lowestValue, 5);
   }

   @Test
   public void testSecondLowestValueMethodWithEmptyArray(){
      ArrayProcessor arrayProcessor = new ArrayProcessor();
      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray([]);
      assertEquals(lowestValue, null);
   }

   @Test
   public void testSecondLowestValueMethodWithNullArray(){
      ArrayProcessor arrayProcessor = new ArrayProcessor();
      int secondLowestValue = arrayProcessor.getSecondLowestValueFromIntArray();
      assertEquals(lowestValue, null);
   }
}