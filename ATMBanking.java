package file;

import java.io.*;
import java.util.*;



public class ATMBanking {

	public static void main(String[] args)throws IOException {
		Scanner console = new Scanner(System.in);
		PrintStream prs = new PrintStream(new File("ATMBookBank.txt"));
		System.out.print("Enter account number : ");
		String id =console.next();
		boolean check = false;
		if((id.length() !=14 &&id.charAt(1) == '-' && id.charAt(5) == '-' 
				&& id.charAt(9) == '-'&& id.charAt(12) == '-'))
		{
			check = true;
		}
		else {
			System.out.print("Input wrong type, Enter account number :");
			id =console.next();
		}
		System.out.print("Enter password :");
		String pass = console.next();
		while(pass.length() != 4) {
			System.out.print("Enter password :");
			pass = console.nextLine();
		
		}	
		System.out.print("Enter money :");
		int money = console.nextInt();
		while(!(money>=100)) {
			System.out.print("Enter money :");
			money = console.nextInt();
		}
		//ATMChecking(id,pass,money);
	}

}
