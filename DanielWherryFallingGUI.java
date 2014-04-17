//Daniel Wherry
//CSCI 2070W
//Assignment 4, Q2
//4/15/14

import javax.swing.*;
import java.awt.event.*;  // Need all of these so i can use the window features
import java.awt.*;

public class DanielWherryFallingGUI extends JFrame{
	
	private JPanel panel;
	private JPanel panel1; // These are where i put all my labels, buttons, or input fields
	private JPanel panel2;
	
	private JLabel messageLabel1;
	private JLabel messageLabel2;    // These are the different messages that will prompt the user for whatever i want.no input
	
	private JTextField timeTextField;  // These allow me to accept text input from the user, which can used to do calculations
	private JTextField gTextField;
	
	private JButton calcButton; // makes a button user can click on to calculate 
	
	private final int WINDOW_WIDTH = 350;  // sets default window size
	private final int WINDOW_HEIGHT = 200;
	
	// Constructor, gives me a basic window with 3 panels in a grid layout, 1 column and 3 rows
	public DanielWherryFallingGUI(){
		setTitle("Falling GUI");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,1));
		buildPanel();
		add(panel2);
		add(panel1);
		add(panel);
		setVisible(true);
	}
	//Method that places what i want in each panel, so a message and an input field. this is repeated 2 times( for each row). then button is placed in 3rd row
	private void buildPanel(){
		messageLabel1 = new JLabel("Enter a time");
		timeTextField = new JTextField(10);
		messageLabel2 = new JLabel("Enter a g");
		gTextField = new JTextField(10);
		
		calcButton = new JButton("Calculate");
		// makes the button that I created actually do something, defined in separate class
		calcButton.addActionListener(new CalcButtonListener());
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel = new JPanel();
		
		panel1.add(messageLabel1);
		panel1.add(timeTextField);
		panel2.add(messageLabel2);
		panel2.add(gTextField);
		panel.add(calcButton);
	}
	//Where I define what clicking the button does. Calculates total cost, and displays in separate window
	private class CalcButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e){
			String time, g;
			double distance;
			time = timeTextField.getText();
			g = gTextField.getText();
			
			distance = .5 * Double.parseDouble(g) * (Double.parseDouble(time) * Double.parseDouble(time));
			
			JOptionPane.showMessageDialog(null, "Time: " +time+ " seconds\n g: " + g + " m/sec^2\n distance: " + distance + " meters");
	
		}
	}
	//gives the program a main, and creates and opens the GUI object that i defined above
	public static void main(String[] args){
		DanielWherryFallingGUI g = new DanielWherryFallingGUI();
	}

}