import java.util.Scanner;

public class Lab402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence= sc.nextLine();
		while (!sentence.endsWith("."))
		{
			System.out.print("The sentence must end ewith full stop point : ");
			sentence= sc.nextLine();
		}
		System.out.println();
		int countofSpace=0;
			
			
			for(int i=0 ;i < sentence.length();i++)
			{
				if (sentence.charAt(i) == ' ') {
					System.out.println(sentence.substring(countofSpace,i));
					 countofSpace=i+1;
					
				
				}
				
			}System.out.println(sentence.substring( countofSpace));
			
			
			
			
			
			
			
		

	}

}
