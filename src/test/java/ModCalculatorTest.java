import com.trues.calculator.model.ModCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModCalculatorTest {
    private ModCalculator modCal;
    @BeforeEach
    public void setUp(){
        System.out.println("setUp 동작 확인 . . . .");
        this.modCal = new ModCalculator();
    }

    @DisplayName("20을 3으로 나눌 때, 나머지 2가 출력 되는가?")
    @Test
    public void testModTwoNumbers(){
        //given
        int num1 = 20;
        int num2 = 3;

        //when
        int res = modCal.modTwoNumbers(num1, num2);

        //then
        Assertions.assertEquals(2, res);
    }

    @DisplayName("30을 3으로 나눌 때, 나머지 0이 출력 되는가?")
    @Test
    public void testModTwoNumbers2(){
        //given
        int num1 = 30;
        int num2 = 3;

        //when
        int res = modCal.modTwoNumbers(num1, num2);

        //then
        Assertions.assertEquals(0, res);
    }
    @DisplayName("0을 3으로 나눌 때, 나머지 0이 출력 되는가?")
    @Test
    public void testModTwoNumbers3(){
        //given
        int num1 = 0;
        int num2 = 3;

        //when
        int res = modCal.modTwoNumbers(num1, num2);

        //then
        Assertions.assertEquals(0, res);
    }
    @DisplayName("20을 0으로 나눌 때, 예외가 발생하는가?")
    @Test
    public void testModTwoNumbers4(){
        //given
        int num1 = 20;
        int num2 = 0;

        //when & then
        Assertions.assertThrows(IllegalArgumentException.class, () -> modCal.modTwoNumbers(num1, num2));
    }
    @DisplayName("0을 0으로 나눌 때, 예외가 발생하는가?")
    @Test
    public void testModTwoNumbers5(){
        //given
        int num1 = 0;
        int num2 = 0;

        //when & then
        Assertions.assertThrows(IllegalArgumentException.class, () -> modCal.modTwoNumbers(num1, num2));
    }
}
