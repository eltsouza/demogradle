package demogradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest{

   @Test
   public void testAppHasGretting(){

        App ClassUnderTest = new App();
        assertNotNull("app should have a gretting",ClassUnderTest.getGretting());


   }



}
