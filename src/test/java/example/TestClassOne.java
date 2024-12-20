package example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestClassOne {

  @BeforeGroups("group1")
  public void group1Setup() {
    System.out.println("Setup for Group 1");
  }

  @AfterGroups("group1")
  public void group1Teardown() {
    System.out.println("Teardown for Group 1");
  }

  @Test(groups = "group1")
  public void testGroup1A() {
    System.out.println("Executing test in Group 1 - A");
  }

  @Test(groups = "group1")
  public void testGroup1B() {
    System.out.println("Executing test in Group 1 - B");
  }

  @Test(groups = "group2")
  public void testGroup2A() {
    System.out.println("Executing test in Group 2 - A");
  }

  @Test(groups = "group2")
  public void testGroup2B() {
    System.out.println("Executing test in Group 2 - B");
  }

  @BeforeGroups("group2")
  public void group2Setup() {
    System.out.println("Setup for Group 2");
  }

  @AfterGroups(value = "group2", alwaysRun = true)
  public void group2Teardown() {
    System.out.println("Teardown for Group 2");
  }
}