
public  class Cylinder extends Circle{
	private double height ;
	
	public Cylinder(double redius,double height) {
        super(redius,null);
		this.height =height;
		
		
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		return this.height*this.getRadius();
	}
	public String toString()
	{
		return "height="+height+","+super.toString();
	}
	public double getArea() {
		// TODO Auto-generated method stub
		return 2*Math.PI*getVolume();
	}
}
