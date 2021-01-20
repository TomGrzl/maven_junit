import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class checkForStringTest {

    @Test
    void checkForStringTrueTest() {
        //given
        String stc = "Ichbinfancy";
        String stcf = "fancy";

        //when
        boolean result = checkForString.checkForString(stc, stcf);

        //then
        assertEquals(true, result);

    }

    @Test
    void checkForStringFalseTest() {
        //given
        String stc = "Ichbinfancy";
        String stcf = "cool";

        //when
        boolean result = checkForString.checkForString(stc, stcf);

        //then
        assertEquals(false, result);

    }
}