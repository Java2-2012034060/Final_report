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

}