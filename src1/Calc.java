/**
 * The main class of a simple calculator. Create one of these and you'll
 * get the calculator on screen.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class Calc
{
    private CalcEngine engine;
    private UserInterface gui;
    private CalcEngineHex engineHex;
    private  UserInterfaceHex guiHex;

    /**
     * Create a new calculator and show it.
     */
    public Calc()
    {

    }

    public static void main (String args[]){
        CalcEngineHex engine = new CalcEngineHex();
        UserInterfaceHex gui = new UserInterfaceHex(engine);
        gui.setVisible(true);





    }


    }



