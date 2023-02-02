/*the point2D class a 3D point at (x,y,z)*/
public class Point3D extends Point2D{
	private float z = 0.0f;
	

	public Point3D() {
		super();// x=y=0
		this.z = 0;

	}

	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z = z;
	}

	public float getZ() {
	return this.z;
	}

	public void setZ() {
	this.z = z;
	}

	public void setXYZ(float x, float y, float z) {
		super.setX(x);
		super.setY(y);
		this.z =z;

	}
	public float[] getXYZ() {
		float[] results = new float[3];
		results[0] = super.getX();
		results[1] = super.getY();
		results[2] = this.z;
		return results;
	}
	public String toString() {
		return super.toString()+" ,and "+getZ()+")";
	}

}
