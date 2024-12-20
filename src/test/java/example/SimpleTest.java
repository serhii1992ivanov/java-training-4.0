package example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {

  @BeforeMethod
  public void setup() {
    System.out.println("Setup method executed");
  }

  @AfterMethod
  public void teardown() {
    System.out.println("Teardown method executed");
  }

  @Test
  public void testExample() {
    System.out.println("Test method executed");
  }
}