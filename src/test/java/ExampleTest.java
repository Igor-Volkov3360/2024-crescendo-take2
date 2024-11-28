import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// * */
public class ExampleTest {

  @Test
  /**
   * this is an example test method. The goal of a test method is to test if the output of a piece
   * of code matches expectanctions - Some useful guidelines for testing
   *
   * <p>Do test if the expected output of a method matches the actual one.
   *
   * <p>Do test whether the function calls made inside the method are occurring the desired number
   * of times.
   *
   * <p>Do not try to test code that is not a part of the method under test.
   *
   * <p>Do not make API calls, database connections, or network requests while writing your tests.
   */
  public void dummyTest() {
    // this is one the many methods you can use for testing the output of classes or methods
    assertEquals(1, 1);
  }
}
