import javax.swing.*;
import java.awt.event.*;

/**
 * Created by seandep on 4/4/16.
 */
public class TempConverterWindow extends JFrame {

    private final int WINDOW_WIDTH = 300;
    private final int WINDOW_HEIGHT = 100;

    private JLabel messageLabel;
    private JTextField kiloTextField;
    private JButton button;
    private JPanel panel;


    public TempConverterWindow(){

        setTitle("Temperature Converter");
        setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createPanel();
        add(panel);
        setVisible(true);
    }



    public void createPanel(){
        //display question in the window
        messageLabel = new JLabel("Enter a temperature in degrees Fahrenheit");

        //input field
        kiloTextField = new JTextField(3);

        //button
        button = new JButton("Convert");

        //button action listener
        button.addActionListener(new ButtonListener());

        //panel creation
        panel = new JPanel();

        //add buttons,fields,etc to panel
        panel.add(messageLabel);
        panel.add(button);
        panel.add(kiloTextField);

    }

    private class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            String userInput;
            Double temperatureConverted;

            //grab user input
            userInput = kiloTextField.getText();

            if (e.getSource() == button){
                //print the converted statement in a messagebox
                temperatureConverted = ((Double.parseDouble(userInput)-32) * 5/9);
                JOptionPane.showMessageDialog(null, userInput + " degrees Fahrenheit is " + temperatureConverted + " degrees Celsius");
            }
        }
    }


}
