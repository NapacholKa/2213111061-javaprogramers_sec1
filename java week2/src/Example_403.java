import java.util.Scanner;
import javax.swing.*;

public class Example_403 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Input a sentence :");
		String sentence= sc.nextLine();
		while (!sentence.endsWith(".")) {
			System.out.print("Input a sentence :");
			String sentence= sc.nextLine();
		}
		System.out.println();
		int countofSpace=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i) == ' ') {
				countofSpace++;
			}
		}
		System.out.println("This sentence has "+countofSpace+" spacedar.");
		System.out.println("This sentence has "+(countofSpace+1)+" word.");
		*/
		String sentence = JOptionPane.showInputDialog("Input a sentence:");
		while (!sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence ,agein:");
			sentence= sc.nextLine();
		}
		int countofSpace=0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i) == ' ') {
				countofSpace++;
		JOptionPane.showMessageDialog(null,"This sentence has "+countofSpace+" spacedar."+
				"\nThis sentence has "+(countofSpace+1)+" spacedar." );
		
	}

}
