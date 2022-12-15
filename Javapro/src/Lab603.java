import java.util.*;

public class Lab603 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] number = {78, 36, 58, 41, 25, 92,75};
		
		System.out.print("Input index of array : ");
		int num = scan.nextInt();
		while(num < 0 || num>(number.length-1))
		{
			System.out.print("Input index of arrey, again");
			num = scan.nextInt();
			
		}
		System.out.println();
		System.out.println("Value in current index is "+(number[num]));
		if(num==5)
		{
			System.out.println("Sorry, "+num+" is the lact index array");
		}
		else
		{
			System.out.println("Value in next index is "+(number[num+1]));
		}
		
		
		
		
		
	}

}
