package cal;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.*;
 
 
 
 
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
=======
 
	public Calulator() {
		display = new JTextField(35);
		panel = new JPanel();
		display.setText("0");
		panel.setLayout(new GridLayout(0, 5, 3, 3));
		buttons = new JButton[25];
		int index = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				buttons[index] = new JButton(labels[index]);
				panel.add(buttons[index]);
				buttons[index].addActionListener(this);
				index++;
			}
		}
		add(display, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
 
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.charAt(0) == 'C') {
>>>>>>> refs/remotes/origin/Hotfix
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
	}
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/Hotfix
}
=======
 
	private void calculate(double n) {
		if (operator.equals("+"))
			result += n;
		else if (operator.equals("-"))
			result -= n;
		else if (operator.equals("x"))
			result *= n;
		else if (operator.equals("/"))
			result /= n;
		else if (operator.equals("="))
			result = n;
		display.setText("" + result);
	}
 
	public static void main(String args[]) {
		Calulator calculator = new Calulator();
	}
}
>>>>>>> refs/remotes/origin/Hotfix
