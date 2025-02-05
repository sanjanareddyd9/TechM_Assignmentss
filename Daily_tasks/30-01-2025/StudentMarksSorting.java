package AnuragEx;
import java.util.Arrays;
import java.util.Scanner;
class Student{
	String name;
	int total;
	double average;
	public Student(String name, int[] marks) {
		this.name = name;
		this.total = Arrays.stream(marks).sum();
		this.average = (double) this.total / marks.length;
	}
}
public class StudentMarksSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = scanner.nextInt();
		scanner.nextLine();
		Student[] students = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter student name : ");
			String name = scanner.nextLine();
			System.out.println("Enter number of subjects : ");
			int subjects = scanner.nextInt();
			int[] marks = new int[subjects];
			System.out.println("Enter the marks : ");
			for (int j = 0; j < subjects; j++) {
				marks[j] = scanner.nextInt();
			}
			scanner.nextLine();
			students[i] = new Student(name, marks);
		}
		Arrays.sort(students, (a, b) -> b.total - a.total);
		System.out.println("Sorted student list (by total marks)");
		for (Student s : students) {
			System.out.println(s.name + " | Total : " + s.total + " | Average :" + String.format("%.2n", s.average));

		}
		scanner.close();

	}

}
