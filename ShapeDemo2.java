
import java.util.*;
public class ShapeDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] radius = new double[5];
		double[] height = new double[5];
		
		for(int i = 0; i< 5 ;i++) {
		System.out.print("Input radius :");
		radius[i] = scan.nextDouble();
		System.out.print("Input height : ");
		height[i] = scan.nextDouble();
		System.out.println();
		}
		Cylinder cyl = new Cylinder(radius[5],height[5]);
		for(int i =0;i<5;i++) {
			System.out.println("Cylinder"+i+", volume="+cyl.getVolume());
			
		}

}
