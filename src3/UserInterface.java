import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * A graphical user interface for the calculator. No calculation is being
 * done here. This class is responsible just for putting up the display on 
 * screen. It then refers to the "CalcEngine" to do all the real work.
 * 
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class UserInterface
    implements ActionListener
{	
	private String displayString ="";
	private JDateFunctions jd;

    private JFrame frame;
    private JTextField display;
    private JLabel status;

    JButton aButton;
    JButton bButton;
    JButton cButton;
    JButton dButton;
    JButton eButton;
    JButton fButton;


    /**
     * Create a user interface.
     * @param engine The calculator engine.
     */
    public UserInterface()
    {
        jd=new JDateFunctions();
        makeFrame();
        frame.setVisible(true);
    }
    /**
     * Set the visibility of the interface.
     * @param visible true if the interface is to be made visible, false otherwise.
     */
    public void setVisible(boolean visible)
    {
        frame.setVisible(visible);
    }

    /**
     * Make the frame for the user interface.
     */
    private void makeFrame()
    {
        frame = new JFrame("DateCalc");


        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout(8, 8));
        contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

        display = new JTextField();
        contentPane.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));
        	addButton(buttonPanel, "weekday");
        	addButton(buttonPanel, "add");
        	addButton(buttonPanel, "subtract");
        	addButton(buttonPanel, "difference");
//            addButton(buttonPanel, "7");
//            addButton(buttonPanel, "8");
//            addButton(buttonPanel, "9");
//            buttonPanel.add(new JLabel(""));
//            addButton(buttonPanel, "Clear");
//            
//        //----------------------------------
//            addButton(buttonPanel, "4");
//            addButton(buttonPanel, "5");
//            addButton(buttonPanel, "6");
//            buttonPanel.add(new JLabel(""));
//            addButton(buttonPanel, "?");
//            
//            
//        //----------------------------------    
//            addButton(buttonPanel, "1");
//            addButton(buttonPanel, "2");
//            addButton(buttonPanel, "3");
//            buttonPanel.add(new JLabel(""));
//            addButton(buttonPanel, "*"); //missing operator
//            
//                        
//        //----------------------------------
//            buttonPanel.add(checkbox);
//            checkbox.addActionListener(this);
//            
//            addButton(buttonPanel, "0");
//
//            buttonPanel.add(checkBoxString);
//            checkBoxString.addActionListener(this);
//
//            buttonPanel.add(new JLabel(""));
//            addButton(buttonPanel, "-");
//            
//            
//        //----------------------------------
//            aButton = new JButton("A");
//            buttonPanel.add(aButton);
//            aButton.addActionListener(this);
//            aButton.setEnabled(false);
//            
//            bButton = new JButton("B");
//            buttonPanel.add(bButton);
//            bButton.addActionListener(this);
//            bButton.setEnabled(false);
//            
//            cButton = new JButton("C");
//            buttonPanel.add(cButton);
//            cButton.addActionListener(this);
//            cButton.setEnabled(false);
//            
//            buttonPanel.add(new JLabel(""));
//            addButton(buttonPanel, "+");  
//            
//        //----------------------------------
//            dButton = new JButton("D");
//            buttonPanel.add(dButton);
//            dButton.addActionListener(this);
//            dButton.setEnabled(false);
//
//            eButton = new JButton("E");
//            buttonPanel.add(eButton);
//            eButton.addActionListener(this);
//            eButton.setEnabled(false);
//
//            fButton = new JButton("F");
//            buttonPanel.add(fButton);
//            fButton.addActionListener(this);
//            fButton.setEnabled(false);
//            
//            
//            buttonPanel.add(new JLabel(""));
//            addButton(buttonPanel, "=");

        contentPane.add(buttonPanel, BorderLayout.CENTER);

        status = new JLabel("@Minh, Lana & Martin");
        contentPane.add(status, BorderLayout.SOUTH);

        frame.pack();
    }

    /**
     * Add a button to the button panel.
     * @param panel The panel to receive the button.
     * @param buttonText The text for the button.
     */
    private void addButton(Container panel, String buttonText)
    {
        JButton button = new JButton(buttonText);
        button.addActionListener(this);
        panel.add(button);
    }

    /**
     * An interface action has been performed.
     * Find out what it was and handle it.
     * @param event The event that has occured.
     */
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();

//        if(command.equals("0") ||
//           command.equals("1") ||
//           command.equals("2") ||
//           command.equals("3") ||
//           command.equals("4") ||
//           command.equals("5") ||
//           command.equals("6") ||
//           command.equals("7") ||
//           command.equals("8") ||
//           command.equals("9") ||
//                command.equals("A") ||
//                command.equals("B") ||
//                command.equals("C") ||
//                command.equals("D") ||
//                command.equals("E") ||
//                command.equals("F")) {
//            int number;
//            if(checkbox.isSelected()) {
//                number = Integer.parseInt(command, 16);
//            } else {
//                number = Integer.parseInt(command);
//            }
//            calc.numberPressed(number);
//        }
//        else if(command.equals("+")) {
//            calc.plus();
//        }
//        else if(command.equals("-")) {
//            calc.minus();
//        }
//        if(command.equals("=")) {
//        	if(checkBoxString.isSelected()) {
//        		calc.evaluateInfix(display.getText(), checkbox.isSelected());
//        	}else {
//        		calc.equals();
//        	}
//            
//        }
//        else if(command.equals("Clear")) {
//            calc.clearString();
//        }
//        else if(command.equals("?")) {
//            showInfo();
//        }
//        else if(command.equals("*")) {
//            calc.multiplicate();
//        }
//        else if(command.equals("Hex")) {
//            if(checkbox.isSelected()) {
//                aButton.setEnabled(true);
//                bButton.setEnabled(true);
//                cButton.setEnabled(true);
//                dButton.setEnabled(true);
//                eButton.setEnabled(true);
//                fButton.setEnabled(true);
//            } else {
//                aButton.setEnabled(false);
//                bButton.setEnabled(false);
//                cButton.setEnabled(false);
//                dButton.setEnabled(false);
//                eButton.setEnabled(false);
//                fButton.setEnabled(false);
//            }
//        }
        if (command.equals("weekday")) {
			displayString = jd.weekday(display.getText());
		} else if (command.equals("add")) {
			displayString = jd.add(display.getText());
		} else if (command.equals("subtract")) {
			displayString = jd.subtract(display.getText());
		} else if (command.equals("difference")) {
			displayString = jd.difference(display.getText());
		}

        redisplay();
    }

    /**
     * Update the interface display to show the current value of the 
     * calculator.
     */
    private void redisplay()
    {
//        if(checkbox.isSelected()) {
//            display.setText(Integer.toHexString(calc.getDisplayValue()));
//        } else {
//            display.setText("" + calc.getDisplayValue());
//        }
    	display.setText(displayString);
    }

    /**
     * Toggle the info display in the calculator's status area between the
     * author and version information.
     */
//    private void showInfo()
//    {
//        if(showingAuthor)
//            status.setText(calc.getVersion());
//        else
//            status.setText(calc.getAuthor());
//
//        showingAuthor = !showingAuthor;
//    }
}
