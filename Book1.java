
public class Book1 {
	private String title;
	private Author author;
	private int page;

	public Book1(String title, Author author) {
		this.title = title;
		this.author = author;
		page = 0;
	}

	public Book1() {
		this.title = "";
		this.author =null;
		page = 0;
	}

	public String getTitle() {
		return this.title ;
	}

	public Author getAuthor() {
		return this.author;
	}
	public void setPage(int page) {
		this.page = page;
	}

	public int getPage() {
		return this.page;
	}

	public String toString() {
		return getTitle() + " has " + getPage() + " pages write by " + author;
	}

}
