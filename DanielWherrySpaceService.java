//Daniel Wherry
//CSCI 2070W
//Assignment 4, Q3
//4/16/14

import javax.swing.*;
import java.awt.event.*;  // Need all of these so i can use the window features
import java.awt.*;

public class DanielWherrySpaceService extends JFrame{
	
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;		// These are where i put all my labels, buttons, or input fields
	private JPanel panel5;
	private JPanel panel6;
	
	
	private JLabel messageLabel1;
	private JLabel messageLabel2;
	private JLabel messageLabel3;
	private JLabel messageLabel4;
	private JLabel messageLabel5; // These are the different  messages that i will tell the user about the stuff, such as price, prompt for amount. no input
	private JLabel messageLabel6;
	private JLabel messageLabel7;
	private JLabel messageLabel8;
	private JLabel messageLabel9;
	private JLabel messageLabel10;
	
	private JTextField fuelTextField;
	private JTextField protonTextField;
	private JTextField oxygenTextField;  // These allow me to accept text input from the user, will be used to get how many of each object user wants
	private JTextField wasteTextField;
	private JTextField shipTextField;
	
	
	private JButton calcButton;  // Makes a button that will calculate the total cost
	
	private final int WINDOW_WIDTH = 600;   // default size of window opened
	private final int WINDOW_HEIGHT = 300;
	
	// Constructor, gives me a basic window with 6 panels in a grid layout, 1 column and 6 rows
	public DanielWherrySpaceService(){
		setTitle("Daniel Wherry's Space Travel Company");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
		setLayout(new GridLayout(6,1));
		buildPanel();
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		
		setVisible(true);
	}
	    //Method that places what i want in each panel, so 2 messages(could be just one, but this works) and an input field. this is repeated 5 times( for each row). then in 6th row is the button only
		private void buildPanel(){
		messageLabel6 = new JLabel("Fuel Pod Refill- $25.00 for 1 pod.");
		messageLabel1 = new JLabel("# of fuel pods");
		fuelTextField = new JTextField(10);
		messageLabel7 = new JLabel("Proton cannon check- $18.00 for 1 cannon.");
		messageLabel2 = new JLabel("# of proton cannons");
		protonTextField = new JTextField(10);
		messageLabel8 = new JLabel("Oxygen refill- $20.00 for 1 tank.");
		messageLabel3 = new JLabel("# of oxygen tanks");
		oxygenTextField = new JTextField(10);
		messageLabel9 = new JLabel("Waste disposal- $42.00 for 1 ship.");
		messageLabel4 = new JLabel("# of ships for waste disposal");
		wasteTextField = new JTextField(10);
		messageLabel10 = new JLabel("Space ship inspection- $21.00 for 1 ship.");
		messageLabel5 = new JLabel("# of ships for inspection");
		shipTextField = new JTextField(10);
		
		
		
		calcButton = new JButton("Calculate");
		// makes the button that I created actually do something, defined in separate class
		calcButton.addActionListener(new CalcButtonListener());
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		
		panel1.add(messageLabel6);
		panel1.add(messageLabel1);
		panel1.add(fuelTextField);
		panel2.add(messageLabel7);
		panel2.add(messageLabel2);
		panel2.add(protonTextField);
		panel3.add(messageLabel8);
		panel3.add(messageLabel3);
		panel3.add(oxygenTextField);
		panel4.add(messageLabel9);
		panel4.add(messageLabel4);
		panel4.add(wasteTextField);
		panel5.add(messageLabel10);
		panel5.add(messageLabel5);
		panel5.add(shipTextField);
		panel6.add(calcButton);
	}
	
	// Where I define what clicking the button does. Calculates total cost, and displays in separate window
	private class CalcButtonListener implements ActionListener{
	
		public void actionPerformed(ActionEvent e){
			String f,p,o,w,s;
			double total;
			f = fuelTextField.getText();
			p = protonTextField.getText();
			o = oxygenTextField.getText();
			w = wasteTextField.getText();
			s = shipTextField.getText();
			
			total = 25 * Double.parseDouble(f) + 18 * Double.parseDouble(p) + 20 * Double.parseDouble(o) + 42 * Double.parseDouble(w) + 21 * Double.parseDouble(s);
			
			JOptionPane.showMessageDialog(null, "The total cost of your visit was " + total + " dollars.");
	
		}
	}
	
	//gives the program a main, and creates and opens the GUI object that i defined above
	public static void main(String[] args){
		DanielWherrySpaceService g = new DanielWherrySpaceService();
	}

}


	
	
	
	
	
