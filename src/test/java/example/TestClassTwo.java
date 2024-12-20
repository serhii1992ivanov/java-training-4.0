package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {

  @Test
  @Parameters({"param1", "param2"})
  public void testWithXMLParams(String param1, String param2) {
    System.out.println("Test with parameters from XML: " + param1 + ", " + param2);
  }

  @Test(dataProvider = "dataProviderMethod")
  public void testWithDataProvider(String param1, int param2) {
    System.out.println("Test with DataProvider: " + param1 + ", " + param2);
  }

  @DataProvider
  public Object[][] dataProviderMethod() {
    return new Object[][] {
        {"Value1", 100},
        {"Value2", 200}
    };
  }
}