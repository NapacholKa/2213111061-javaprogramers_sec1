import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullName= sc.nextLine();
		int countofSpace=0;
		int check= 0; 
		for(int i=0;i<fullName.length();i++)
		       {
			if(fullName.charAt(i) == ' ') {
				countofSpace++;
				}	
		       }
		if(countofSpace==0)
		{
			System.out.print("Incorrect Name");
		}
		else
		{
			check = fullName.indexOf(' ');
			
			String firstName= fullName.substring(0,check);
			String lastName= fullName.substring(check, fullName.length());
			
			
			System.out.print("First Name: " +firstName.toUpperCase());
			System.out.print("\nlast Name: " +lastName);
			
		}
		
		

	}

}

