import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class checkStringLengthTest {

    @ParameterizedTest
    @CsvSource({"Drei, false", "hallodudaa, false", "wiegehtsdirdennso, true"} )
    void checkStringLengthTest(String S, boolean expectedResult) {
        //when
        boolean result = checkStringLength.checkTextLength(S);

        //then
        assertEquals(expectedResult, result);

    }

    /* @Test
    void checkStringLengthTestUnderTenChars() {
        //given
        String S = "unter10";

        //when
        boolean result = checkStringLength.checkTextLength(S);

        //then
        assertEquals(false, result);

    }

    @Test
    void checkStringLengthTestTenChars() {
        //given
        String S = "genau10...";

        //when
        boolean result = checkStringLength.checkTextLength(S);

        //then
        assertEquals(false, result);

    } */
}