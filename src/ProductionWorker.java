/**
	The ProductionWorker clas extends the Employee class. 
	It also has the fields to hold the following information:
	
		- Shift (an integer)
		- Hourly pay rate (a double)
		
	The workday is divided into two shifts: day and night. The
	shift field will be an enteger value representing the shift
	that the employee works. The day shift is shift 1 and the 
	night shift is shift 2. 
*/
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class ProductionWorker extends Employee
{
	private int shift;
	private double payRate;
	final int DAY_SHIFT = 1;
	final int NIGHT_SHIFT = 2;
	DecimalFormat formatter = new DecimalFormat("##0.00");
	/**
		Constructor
		@param name The employee name
		@param num The employee ID number
		@param date The employee hire date
		@param sft The employee work shift
		@param rate The employee pay rate
	*/	
	public ProductionWorker(String name, String num, String date, int sft, double rate)
	{
		// Call the superclass constructor
		super(name, num, date);	
		isValidEmpNum(num, null);
		// Set the shift and pay rate
		shift = sft;
		payRate = rate;		
	}	
	/**
		Constructor
	*/	
	public ProductionWorker()
	{	
		payRate = 0.0;	
	}	
	/**
		The setShift method stores a value
		in the shift field.
		@param s The employee's work shift
	*/	
	public void setShift(int s)
	{	
		shift = s;		
	}	
	/**
		The setPayRate method stores a value
		in the payRate field
		@param p The employee's pay rate
	*/	
	public void setPayRate(double p)
	{	
		payRate = p;		
	}	
	/**
		The getShift returns the value in the
		shift field
	 * @param InvalidShift 
		@return The employee's work shift
	*/	
	public int getShift(Exception InvalidShift)
	{		
		if (shift < 1 || shift > 2)
		{
			try {
				throw InvalidShift;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Invalid work shift");
			}
		}
		return shift;		
	}	
	/**
		The getPayRate returns the value in 
		the payRate field
		@return The employee's pay rate
	*/	
	public double getPayRate()
	{	
		return payRate;	
	}	
	/**
		The toString method returns a string
		to be displayed
		@return
	*/	
	public String toString()
	{	
		return "Employee Name: " + getName() + "\nEmployee ID Number: " +
				getEmployeeNumber() + "\nHire Date: " + getHireDate() +
				"\nShift: " + shift + "\nPay Rate: " + formatter.format(payRate);		
	}
	
}