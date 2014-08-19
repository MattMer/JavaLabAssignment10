/**
	The Demonstrate class demonstrates the
	Employee superclass and ProductionWorker subclass
*/

import javax.swing.JOptionPane;	// For dialog boxes

public class Demonstrate
{
	public static void main(String[] args)
	{ 	
		String empName;
		String empNum;
		String hireDate;
		String input;		// For input
		int shift;			// the employee work shift
		double payRate;		// the employee payRate		
		// Get the name of the employee
		empName = JOptionPane.showInputDialog("Enter the name of the employee:");		
		// Get the employee ID number
		empNum = JOptionPane.showInputDialog("Enter the employee's ID number\nin the following format - \n\t123-A");		
		// Get the employee hire date
		hireDate = JOptionPane.showInputDialog("Enter the employee's hire date:");		
		// Get the employee work shift
		input = JOptionPane.showInputDialog("Please enter the work shift for the employee:\n" +
												"\tEnter 1 for the day shift\n\tEnter 2 for the night shift");		
		// Convert the input to an int
		shift = Integer.parseInt(input);		
		if (shift < 1 || shift > 2)
		{
			JOptionPane.showMessageDialog(null, "Invalid work shift");
		}		
		// Get the employee's pay rate
		input = JOptionPane.showInputDialog("Please enter the pay rate for the employee:");		
		// Convert the input to a double
		payRate = Double.parseDouble(input);		
		// Create an a Production worker object
		ProductionWorker worker = new ProductionWorker(empName, empNum, hireDate, shift, payRate);		
		// Display the data 
		JOptionPane.showMessageDialog(null, worker);	
		System.exit(0);
	
	}
	
}