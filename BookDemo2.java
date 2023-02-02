import java.util.Scanner;
import javax.swing.*;

public class BookDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author email:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page : "));
		Book1 book = new Book1(title,new Author(name,email));
		int constructor = JOptionPane.showConfirmDialog(null, "Is the page correct?", "Confirm",
				JOptionPane.YES_NO_OPTION);
		
				if (constructor == JOptionPane.NO_OPTION) {
					page = Integer.parseInt(JOptionPane.showInputDialog("Input book page,again: "));	
					book.setPage(page);
			
		}
		
		
				JOptionPane.showMessageDialog(null, "Book Title :"+book.getTitle()+
						"\nAuthor name : "+name+" ("+book.getPage()+" page)"+
						"\nAuthor e-mail:"+email);

	}

}
