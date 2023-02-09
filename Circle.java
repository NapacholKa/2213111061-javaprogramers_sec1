
public class Circle  extends Shape {
	private double radius;
	
	public Circle(double radius,String color) {
		this.radius =radius;
		color="";
		
	}
	public double getRadius() {
		return radius;
	}
	public String toString() {
		return "radius="+radius;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}
