
public abstract class Shape {

	private String color;

	public Shape(String color) {
		this.color = color;
	}

	public Shape() {
		this.color = null;
	}

	public abstract double getArea();
	
	@Override
	public String toString() {
		return "color=" + color;

	}

}
