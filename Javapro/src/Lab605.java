import java.*;
import javax.swing.JOptionPane;

public class Lab605 {

	public static void main(String[] args) {
		int[]numArrye = new int[5];
		for(int i = 0; i <numArrye.length ;i++)
		{
		numArrye[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" :"));		
		
		}
		showEven(numArrye);
		showOdd(numArrye);
		

	}
	public static void showEven(int[] nums)
	{
		String even ="";
		for(int i = 0; i <nums.length ;i++)
		{
		if(nums[i]%2==0)
		{
			even =even+" " +nums[i];			
		}
		}
		JOptionPane.showMessageDialog(null, "List of even number.\n"+even);
		
		
	}public static void showOdd(int[] nums)
	{
		String odd ="";
		for(int i = 0; i <nums.length ;i++)
		{
			if(nums[i]%2!=0)
			{
				 odd =odd+" "+nums[i];
			
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number.\n"+odd);				
	}

}
