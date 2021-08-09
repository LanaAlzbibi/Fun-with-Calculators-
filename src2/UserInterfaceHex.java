import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class UserInterfaceHex extends UserInterface {

    CheckboxGroup ch;
    Checkbox dec;
    Checkbox hex;
    JButton a, b , c, d ,e ,f, nine,eight,seven,six,five,four,three,two,one,zero,plus,div,min,mult;
    String command;
    String digit;
    protected boolean mode;
    private Object JButton;

    public UserInterfaceHex(CalcEngine engine) {
        super(engine);
        calc = engine;
        makeFrame();
        frame.setVisible(true);

        mode = false;

    }

    public UserInterfaceHex() {
        super();
    }
    public String getButtons(String a){

        return command;
    }

    protected void makeFrame()
    {
        frame = new JFrame(calc.getTitle());

        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout(8, 8));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        display = new JTextField();
        contentPane.add(display, BorderLayout.NORTH);


        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));




        a = addButton(buttonPanel, "A");
        b = addButton(buttonPanel, "B");
        c =  addButton(buttonPanel, "C");
        d = addButton(buttonPanel, "D");
        e = addButton(buttonPanel, "E");
        f = addButton(buttonPanel, "F");


       nine =addButton(buttonPanel, "9");
       eight= addButton(buttonPanel, "8");
       seven=addButton(buttonPanel, "7");


       six= addButton(buttonPanel, "6");
       five=addButton(buttonPanel, "5");
       four=addButton(buttonPanel, "4");


       three= addButton(buttonPanel, "3");
       two= addButton(buttonPanel, "2");
       one= addButton(buttonPanel, "1");
       zero=addButton(buttonPanel, "0");


        plus= addButton(buttonPanel, "+");
        mult= addButton(buttonPanel, "*");
        div= addButton(buttonPanel, "/");
        min= addButton(buttonPanel, "-");
        addButton(buttonPanel, "=");

        addButton(buttonPanel, "?");
        buttonPanel.add(new JLabel(" "));
        addButton(buttonPanel, "clear");





        ch = new CheckboxGroup();

        dec = new Checkbox("dec",ch,false);
        hex = new Checkbox("hex",ch,true);
        addButton(buttonPanel, "Update");
        buttonPanel.add(dec);
        buttonPanel.add(hex);



        // A, B, C, D, E, F.
        //10, 11, 12, 13, 14 , 15

        contentPane.add(buttonPanel, BorderLayout.CENTER);

        status = new JLabel(calc.getAuthor());
        contentPane.add(status, BorderLayout.SOUTH);

        frame.pack();
    }

    public void actionPerformed(ActionEvent event) {
        command = event.getActionCommand();

        if (command.equals("0") ||
                command.equals("1") ||
                command.equals("2") ||
                command.equals("3") ||
                command.equals("4") ||
                command.equals("5") ||
                command.equals("6") ||
                command.equals("7") ||
                command.equals("8") ||
                command.equals("9")) {
            int number = Integer.parseInt(command);
            calc.numberPressed(number);
        } else if (command.equals("A") ||
                command.equals("B") ||
                command.equals("C") ||
                command.equals("D") ||
                command.equals("E") ||
                command.equals("F")) {

            int decimal = Integer.parseInt(command, 16);
            calc.numberPressed(decimal);
            //Integer.toHexString(decimal)

            digit = command;

        } else if (command.equals("+")) {
            calc.plus();
        } else if (command.equals("-")) {
            calc.minus();
        } else if (command.equals("*")) {
            calc.multiply();
        } else if (command.equals("/")) {
            calc.divide();
        } else if (command.equals("=")) {
            calc.equals();
        } else if (command.equals("clear")) {
            calc.clear();
        } else if (command.equals("?")) {
            showInfo();
        }
//        System.out.println(dec.getState());

        if (dec.getState() == true && command.equals("Update")) {

            super.redisplay();
            setDec();
            mode = true;


//        	System.out.println("Flag1");

        } else if (dec.getState() == false && command.equals("Update")) {

            this.redisplay();
            setHex();
            mode = false;


        } else if (mode == true) {

            super.redisplay();
        } else {
            this.redisplay();
        }
    }
    /*protected void redisplay()
    {

        int x = calc.getDisplayValue();
        String hexResult = Integer.toHexString(x);
        display.setText("" + calc.getDisplayValue());
    }*/
    protected void redisplay()
    {
        int x = calc.getDisplayValue();
        String hexResult = Integer.toHexString(x);

        //display.setText("" + calc.getDisplayValue());
        display.setText("" + hexResult);




    }
    protected void setHex() {

        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);

    }

    protected void setDec() {

        a.setEnabled(false);
        b.setEnabled(false);
        c.setEnabled(false);
        d.setEnabled(false);
        e.setEnabled(false);
        f.setEnabled(false);

    }



   /* public void checkboxActionPerformed(ActionEvent event)
    {
        dec.addActionListener(this);
        hex.addActionListener(this);

    }

    public void checkActionPerformed(ActionEvent e) {

        dec.setActionCommand("disable");
        if ("disable".equals(e.getActionCommand())) {
            b2.setEnabled(false);
            b1.setEnabled(false);
            b3.setEnabled(true);
        } else {
            b2.setEnabled(true);
            b1.setEnabled(true);
            b3.setEnabled(false);
        }
    }*/
}
