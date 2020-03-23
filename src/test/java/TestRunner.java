import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//run all tests
public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(GameTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println("All the tests were successful?:"+result.wasSuccessful());
   }
} 