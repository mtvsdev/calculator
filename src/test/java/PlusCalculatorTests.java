import com.trues.calculator.model.PlusCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlusCalculatorTests {


    private PlusCalculator plusCalc;

    @BeforeEach
    public void setUp(){
        System.out.println("set동작 확인");
        this.plusCalc = new PlusCalculator();
    }
    @DisplayName("20에 30을 더할시 결과값이 50이 나오는지 확인")
    @Test
    public void testSumTwoNumbers() {


        //given
        int num1 = 20;
        int num2 = 30;


        //when
        int result = plusCalc.sumTwonumbers(num1, num2);

        //then
        Assertions.assertEquals(50, result);

    }
    @DisplayName("40에 20을 더할시 결과값이 60이 나오는지 확인")
    @Test
    public void testSumTwoNumbers2() {


        //given
        int num1 = 40;
        int num2 = 20;


        //when
        int result = plusCalc.sumTwonumbers(num1, num2);

        //then
        Assertions.assertEquals(60, result);

    }
    @DisplayName("40에 0을 더할시 결과값이 40이 나오는지 확인")
    @Test
    public void testSumTwoNumbers3() {


        //given
        int num1 = 40;
        int num2 = 0;


        //when
        int result = plusCalc.sumTwonumbers(num1, num2);

        //then
        Assertions.assertEquals(40, result);

    }
}
