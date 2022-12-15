import java.*;
import javax.swing.JOptionPane;

public class Lab_Example602 {

	public static void main(String[] args) {
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };		
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		
		double ItemPrice = 0;
		boolean validItem = false;
		
		int num = Integer.parseInt( JOptionPane.showInputDialog("Enter item number to order"));
		for(int i =0; i < validValues.length;i++)
		{
			if(num==validValues[i])
			{
				validItem = true;
				ItemPrice = price[i];
			}
			
		}
		if(validItem)
		{
			System.out.print("Item "+ num + " is " + ItemPrice);
		}
		else
		{
			System.out.print("Invalid Item ");
		}

	}

}
