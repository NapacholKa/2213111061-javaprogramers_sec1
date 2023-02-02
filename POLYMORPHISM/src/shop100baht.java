import javax.swing.*;
public class shop100baht {

	public static void main(String[] args) {
		Product sold = new Product();
		
		sold.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product")));
		
		JOptionPane.showMessageDialog(null ,sold);
	}

}
