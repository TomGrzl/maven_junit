import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class checkStringLengthTest {

    @Test
    void checkStringLengthTestOverTenChars() {
        //given
        String S = "Über10Zeichen";

        //when
        boolean result = checkStringLength.checkTextLength(S);

        //then
        assertEquals(true, result);

    }

    @Test
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

    }
}