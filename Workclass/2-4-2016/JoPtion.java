import javax.swing.JOptionPane; //javax means upload java methods automated - JOptionPane is to show pop up message
import java.text.*; //Import a method to around a number
import java.util.Scanner;
public class JoPtion 
{
	public static void main(String[] args) 
	{
		DecimalFormat TwoDec = new DecimalFormat("#.##");
		String fName;
		String lName;
		String in;
		int age;
		double a = 12.333; // Be careful: always lower case for data type, for example: double
		double b = .666;
		double c;
		c=a*b;
		JOptionPane.showMessageDialog(null,"JAVA THURSDAY MORNING SPRING 2016"); //Pop up message 
		fName = JOptionPane.showInputDialog("ENTER FIRST NAME"); //Pop up dialog
		lName = JOptionPane.showInputDialog("ENTER LAST NAME HERE");
		in=JOptionPane.showInputDialog("ENTER "+fName+"'s AGE HERE");
		age = Integer.parseInt(in); // To convert string variable to number variable int, double, or float
		JOptionPane.showMessageDialog(null, "WELCOME "+fName+" "+lName+"\nYou Are "+age); // The back slash "\"  skips the line in the pop up box
		JOptionPane.showMessageDialog(null, "Resut = $"+TwoDec.format(c));
		
		
	}

}
