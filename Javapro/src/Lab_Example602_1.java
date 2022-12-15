import java.*;
import javax.swing.JOptionPane;

public class Lab_Example602_1 {

		public static void main(String[] args) {
			String[] deptName = {"Accounting","HR","Sales","Innovation"};
			boolean deptFound = false;
			
			String dept = JOptionPane.showInputDialog("Enter a departmend name");
			for(int i =0 ;i<deptName.length ;i++)
			{
				deptFound = true;
			}
			JOptionPane.m((deptFound) ? dept + " was found in the list":dept +" was not found in the list");

	}
			
		}
		
