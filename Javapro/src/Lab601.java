import java.util.*;
		
public class Lab601 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] number = new int[7];
		int oddNumber = 0;
		
		for (int i= 0 ; i<number.length;i++)
		{
			System.out.print("Input number "+(i+1)+" : ");
			number[i] = scan.nextInt();
			if(number[i]%2!=0)
			{
				oddNumber++;
			}
		}
		System.out.println();
		System.out.println("There are "+oddNumber+ " of odd number.");
		for(int _num :number) {
			if (_num%2 != 0)
			{
				System.out.print(" "+_num);
			}
		}

	
		
		
	}

}
