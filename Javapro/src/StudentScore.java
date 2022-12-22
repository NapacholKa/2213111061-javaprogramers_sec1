import java.util.*;

public class StudentScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int student = scan.nextInt();

		Student[] std = new Student[student];
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();

			System.out.print("Input student name:");
			std[i].setName(scan.next());
			System.out.print("Input student score:");
			std[i].setScore(scan.nextInt());

			while (!std[i].checkScore()) {
				System.out.print("Input student score ,again:");
				std[i].setScore(scan.nextInt());
			}
			System.out.println("-------------------------------------------------------");
		}
		for (Student _std : std) {

			System.out.println(">>" + _std.getName() + " get grade " + _std.findGrade(_std.getScore()));

		}

	}

}
