
public class TestStudentClass {

	public static void main(String[] args) {
		StudentClass aupap = new StudentClass("fsd fdd" , "1 Happy Ave");
		System.out.println(aupap);
		
		aupap.setAddress("25 Phatanakarn");
		System.out.print(aupap);
		System.out.print(aupap.getName());
		System.out.print(aupap.getAddress());
		
		aupap.addCourseGrade("TNI-108",87);
		aupap.addCourseGrade("MSC-202",92);
		aupap.printGrades();
		
		System.out.printf("\nThe aveage grade is %.2f%n",aupap.getAverageGrade());
		
		
		
		
	}

}
