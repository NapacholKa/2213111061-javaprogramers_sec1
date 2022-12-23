import javax.swing.JOptionPane;

public class Lab606 {

	public static void main(String[] args) {
		int [] nums = {25, 78, 41, 22, 36, 85,  37};
		int inputNum = Integer.parseInt( JOptionPane.showInputDialog("Input index of array:"));
		
		while(checkIndex(nums,inputNum))
		{			
			inputNum = Integer.parseInt( JOptionPane.showInputDialog("Input index of array, again :"));
		}
		(inputNum>1||inputNum<nums.length)
		?JOptionPane.showMessageDialog(null, "Current data,num["+(inputNum)+
				"] is "+currentData(nums,inputNum)
				+"\nPrevious data, num["+(inputNum-1)+"] is "+prevData(nums,inputNum)
				+"\nNext data, nums["+(inputNum+1)+"] is "+nextData(nums,inputNum))
				(inputNum==0)
				?JOptionPane.showMessageDialog(null, "Current data,num["+(inputNum)+"] is "
		+currentData(nums,inputNum)
				+"\nNo previous data"+"\nNext data, nums["+(inputNum+1)+"] is "+nextData(nums,inputNum))
	           :(inputNum==(nums.length-1))
	           ?JOptionPane.showMessageDialog(null, "Current data,num["+(inputNum)+"] is "
		+currentData(nums,inputNum)
				+"\nPrevious data, num["+(inputNum-1)+"] is "+prevData(nums,inputNum)
				+"\nNo next dayta");
	}
	public static boolean checkIndex(int[] nums,int index)
	{
		return (index < 0 || index>(nums.length))? true : false;					
	}
	public static int currentData(int[] nums,int index)
	{	
		
		return  nums[index];
		
	}
	public static int prevData(int[] nums,int index)
	{
			
		return  nums[index-1];
	}
	public static int nextData(int[] nums,int index)
	{
		
		return  nums[index+1];
	}

}
