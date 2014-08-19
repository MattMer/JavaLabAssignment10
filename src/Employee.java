/**
Matthew G. Mershon     
4/15/2014
CSIS-293-9240
Lab Asssignment 10
	         
	*/
import java.util.*;
	public class Employee
	{ // Begin public class Employee	     
	    private String employeeName;
	    private String employeeNumber;
	    private String hireDate;	     
	    /**
	        Constructor
	        @param name The Employee name
	        @param num The Employee ID number
	        @param date The Employee hire date
	    */	     
	    public Employee(String name, String num, String date)
	    { // Begin public Employee(String name, String num, String date)	     
	            // Set the employeeName, employeeNumber, and hireDate fields
	            employeeName = name;
	            employeeNumber = num;
	            hireDate = date;	             
	    } // End public Employee(String name, String num, String date)	     
	    /**
	        Constructor
	    */	     
	    public Employee()
	    { // Begin public Employee()	     
	        employeeName = "";
	        employeeNumber = "";
	        hireDate = "";	         	         
	    } // End public Employee()	     
	    /**
	        The setName method stores a value in the 
	        employeeName field.
	        @param name The employee name
	    */	     
	    public void setName(String name)
	    { // public void setName(String name)	     
	        employeeName = name;	         
	    } // public void setName(String name)	     
	    /**
	        The setEmployeeNumber method stores a value
	        in the employeeNumber field.
	        @param num The employee's ID number
	    */	     
	    public void setEmployeeNumber(String num)
	    { // Begin public void setEmployeeNumber(String num)	     	     
	        employeeNumber = num;	         
	    } // End public void setEmployeeNumber(String num)	     
	    /**
	        The setHireDate method stores a value
	        in the hireDate field.
	        @param date The employee hire date
	    */	     
	    public void setHireDate(String date)
	    { // Begin public void setHireDate(String date)	 
	        hireDate = date;	         
	    } // End public void setHireDate(String date)	     
	    /**
	        The getName method returns the value
	        of employeeName
	        @return The employee name
	    */	     
	    public String getName()
	    { // Begin public String getName()	     
	        return employeeName;	         
	    } // End public String getName()	     
	    /**
	        The getEmployeeNumber method returns
	        the value of employeeNumber
	        @return The employee ID number
	    */	     
	    public String getEmployeeNumber()
	    { // Begin public String getEmployeeNumber()	     
	        return employeeNumber;	         
	    } // End public String getEmployeeNumber()	     
	    /**
	        The getHireDate method returns the value
	        of hireDate
	        @return The employee hire date
	    */	     
	    public String getHireDate()
	    {	         
	        return hireDate;	     
	    }	     
	    /**
	        The isValidEmpNum checks whether the employee
	        number is in the proper format
	        @param e The value entered for the employee ID number
	     * @param InvalidEmployeeNumber 
	    */	     
	    public boolean isValidEmpNum(String e, Exception InvalidEmployeeNumber)
	    {	     
	        boolean isValid = true; 
	        int i = 0;	         
	        // Test the length of the string
	        if (e.length() != 5 || e.length() != 4)
	            isValid = false;         
	        // Test the first 3 characters for digits
	        while (isValid && i < 3)
	        {
	            if (!Character.isDigit(e.charAt(i)))
	                isValid = false;
	            i++;
	        }	         
	        // Test 4th character for hyphen
	        while (isValid && i < 4)
	        {
	            if (e.charAt(i) != '-' || e.length() != 4)
	                isValid = false;
	            i++;
	        }	         
	        // Test last character for letter
	        while (isValid && i < 5)
	        {
	            if (!Character.isLetter(e.charAt(i)))
	                isValid = false;
	            i++;
	        }	         
	        // Test if last character is an A through M
	        while (isValid && i < 6)
	        {
	            if (e.charAt(4) <= 'A' || e.charAt(4) >= 'M')
	                isValid = false;
	            i++;
	        }	         
	        if( isValid = false){
	        	try {
					throw InvalidEmployeeNumber;
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        }
	        return isValid;	         
	    }	     
	    /**
	        The toString method returns a string to 
	        be displayed
	        @return
	    */	     
	    public String toString()
	    {	     
	        return "Employee Name: " + employeeName + "\nEmployee ID Number: " +
	                employeeNumber + "\nHire Date: " + hireDate;	                 
	    }	 
}