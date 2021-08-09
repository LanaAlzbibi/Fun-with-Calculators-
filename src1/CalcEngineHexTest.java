import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UnitCalc {

    //Test Calc
    @Test
    public void test1_Plus() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(5);
        c.plus();
        c.numberPressed(7);
        c.equals();

        int output = c.getDisplayValue();
        assertEquals(12, output);
    }

    @Test
    public void test2_Minus() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(5);
        c.minus();
        c.numberPressed(3);
        c.equals();

        int output = c.getDisplayValue();
        assertEquals(2, output);

    }
    @Test
    public void test1_Multiply() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(5);
        c.multiply();
        c.numberPressed(5);
        c.equals();

        int output = c.getDisplayValue();
        assertEquals(25, output);
    }

    @Test
    public void test2_divide() {
        CalcEngine c = new CalcEngine();
        c.numberPressed(25);
        c.divide();
        c.numberPressed(5);
        c.equals();

        int output = c.getDisplayValue();
        assertEquals(5, output);

    }

}
