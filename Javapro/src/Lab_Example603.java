import java.*;
import javax.swing.*;
import java.util.*;

public class Lab_Example603 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		for(int i =0;i<num.length;i++)
		{
			System.out.println("Input number "+i+" : ");
			num[i] = scan.nextInt();
			
		}
		int totalNumber = sumOfPos(num);
	}
		
		
	public static int sumOfPos(int[] number) 
	{
		int sum=0;
		for(int _num:number) {
			sum+=number;
		}
		return sum;
		
	}
	
	

}
