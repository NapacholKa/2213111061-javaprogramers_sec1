import java.util.*;
import java.text.*;
import javax.swing.*;

public class MusicWorldApp {

	public static void main(String[] args) {
		//NumberFormat f1= NumberFormat.getCurrencyInstance();
		//NumberFormat f2= NumberFormat.getPercentInstance();
		DecimalFormat frm = new DecimalFormat("#.##");
				DecimalFormat frm1 = new DecimalFormat("#.#")
;		String cdId = JOptionPane.showInputDialog("This progeam calculates the tatal cost of a CD order"
				+ "+\nPlase enter the ID of the CD");
		String cdTitle = JOptionPane.showInputDialog("Plese enter the title of the CD");
		String cdPrice= JOptionPane.showInputDialog("Please enter the price of the CD in CD in U.S dollars");
		double cdprice = Double.parseDouble(cdPrice);
		String cdQuantity = JOptionPane.showInputDialog("Please enter the quantity to be purchased");
		int cdquantity = Integer.parseInt(cdQuantity);
		double cdSubtotal =  cdquantity*cdprice;
		final double TAX_RATE = 0.0625;
		double cdTotal =cdSubtotal * (1 + TAX_RATE);
		
		JOptionPane.showMessageDialog(null, "Summary of the transaction:"+
		"\n\nCD ID: "+cdId+
		"\nCD Title: "+cdTitle
		+("\nCD Unit Price: $"+ frm.format(cdprice))+
				"\nCD Quantity: "+cdquantity+"\n\nSubtotal: $"
				+frm1.format(cdSubtotal)+"\nTax rate: "+frm.format((TAX_RATE)*100)+"%"
				+"\nTotal: "+"$"+cdTotal+"\n\nEnd of Program");
		
		
	}

}
