package junit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CalculatorTest {
  @Test
    public void arithmeticSeries1(){
      assertThat(Calculator.arithmeticSeries(1), is(1));
  }
  @Test
  public void arithmeticSeries0(){
    assertThat(Calculator.arithmeticSeries(0), is(0));
  }
  @Test
  public void arithmeticSeries10(){
    assertThat(Calculator.arithmeticSeries(10), is(55));
  }
  @Test
  public void arithmeticSeriesMinus5(){
    assertThat(Calculator.arithmeticSeries(-5), is(0));
  }
}
