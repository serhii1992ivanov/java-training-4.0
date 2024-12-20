package example;

import org.testng.annotations.Test;

public class TestClassThree {

  @Test(priority = 3)
  public void testA() {
    System.out.println("Test A executed");
  }

  @Test(priority = 2)
  public void testB() {
    System.out.println("Test B executed");
  }

  @Test(priority = 1)
  public void testC() {
    System.out.println("Test C executed");
  }
}
