import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void passwordLengthGreaterThan8(){
        //given
        String password = "12345678";

        //when
       String actual = Main.validatePassword(password);

        //then
        String expected = "Passwort korrekt";
        assertEquals(expected, actual);
    }

    @Test
    public void passwordLengthSmallerThan8(){
        //given
        String password = "1234567";

        //when
        boolean actual = Main.validatePasswordBool(password);

        //then
        assertFalse(actual);
    }
    @Test
    public void passwordLengthBiggerThan20(){
        //given
        String password = "123456790123456789011";

        //when
        boolean actual = Main.validatePasswordBool(password);

        //then
        assertFalse(actual);
    }
    @Test
    public void passwordIsNull() {
        //given
        String password = null;

        //when
        boolean actual = Main.validatePasswordBool(password);

        //then
        assertFalse(actual);
    }

    @Test
    public void passwordContainsSpace() {
        //given
        String password = "huha hahu";

        //when
        boolean actual = Main.validatePasswordBool(password);

        //then
        assertFalse(actual);
    }
    @Test
    public void passwordIsEmpty() {
        //given
        String password = "";

        //when
        boolean actual = Main.validatePasswordBool(password);

        //then
        assertFalse(actual);
    }

}