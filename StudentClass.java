
public class StudentClass<numCourses> {
	
	//private 
	private String name;
	private String address;
	private int numCourses=0;
	private String[] courses = {};//valid range is{0,100}
	private int[] grades = {};//numbr of cor
	//the coures talk  and grades
	private static final int MAX_COURSE =30;
	
	
	/*dfdg*/
		// TODO Auto-generated constructor stub
	}
	public Student(String name,String address) {
		this.name =name;
		this.address=address;
		address = new String[MAX_COURSE];
		grades = new int[MAX_COURSE];
		numCourses =0;
		
	}
	public String getName(){
		this.name = name;
	}
	public String getAddress(){
		this.address = address;
		
	}
	public String setName(){
		return this.name;	
	}
	public String setAddress(){
		return this.address;	
	}
	public String toString() {
		return name + "(" + address + ")";
	}
	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] =grade;
		++numCourses;
	}
	public void printGrades() {
	System.out.print(name);
	for(int i = 0 ; i<numCourses;i++)
	{
		System.out.print(""+courses[i]+""+grades[i]);
	}
	System.out.println();
	}
	public double getAverageGrade()
	{
	int sum =0;
	for(int i =0; i<numCourses;i++)
	{
		sum = grades[i];
	}
	return (double) sum(numCourses);
	}
	
	
	
	
	
	

	

	}

}
