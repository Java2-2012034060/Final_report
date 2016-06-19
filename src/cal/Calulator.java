package cal;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
 
 
 
public class Calulator extends JFrame implements ActionListener {
 
	private JPanel panel;
	private JTextField display;
	private JButton[] buttons;
	private String[] labels = { " ", " ", " ", " ", "C", "7", "8", "9",
			"/", " ", "4", "5", "6", "x", " ", "1", "2", "3", "-", " ",
			"0", " ", " ", "+", "=", };
 
	private double result = 0;
	private String operator = "=";
	private boolean startOfNumber = true;

<<<<<<< HEAD
=======
}
public void actionPerformed(ActionEvent e) {
	String command = e.getActionCommand();
	if (command.charAt(0) == 'C') {
		startOfNumber = true;
		result = 0;
		operator = "=";
		display.setText("0.0");
	} else if (command.charAt(0) >= '0' && command.charAt(0) <= '9'){
		if (startOfNumber == true)
			display.setText(command);
		else
			display.setText(display.getText() + command);
		startOfNumber = false;
	} else {
		if (startOfNumber) {
			if (command.equals("-")) {
				display.setText(command);
				startOfNumber = false;
			} else
				operator = command;
		} else {
			double x = Double.parseDouble(display.getText());
			calculate(x);
			operator = command;
			startOfNumber = true;
		}
	}
>>>>>>> refs/remotes/origin/Hotfix
}