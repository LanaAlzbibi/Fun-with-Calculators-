import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserInterfaceHexTest {

    @Test
    void testRedisplay() {
        UserInterfaceHex h = new UserInterfaceHex();
        String b = "a";
        int decimal = Integer.parseInt(b, 16);
        assertEquals(10,decimal);

    }
    @Test
    void testRedisplay2() {
        UserInterfaceHex h = new UserInterfaceHex();
        String b = "b";
        int decimal = Integer.parseInt(b, 16);
        assertEquals(11,decimal);

    }

    @Test
    void testShowInfo() {
    }

    @Test
    void testSetHex() {
    }

    @Test
    void testSetDec() {
    }
}