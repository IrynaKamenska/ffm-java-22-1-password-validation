import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void checkLengthEqual8(){
        //given
        String password = "12345678";

        //when
        boolean actual = Main.validatePassword(password);

        //then
        assertTrue(actual);
    }


}