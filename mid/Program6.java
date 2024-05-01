import java.util.*;
public class Program6 {
//5.Write a program that prompts the user to enter the number of students, the students’ 
//names, and their scores, and prints student names in decreasing order of their scores. 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of students:");
		int n=input.nextInt();
		ArrayList<Student> students=new ArrayList<>();
		for(int i=0;i<n;i++) {
			System.out.println("Name:");
			String name=input.next();
			System.out.println("Score:");
			int score=input.nextInt();
			students.add(new Student(name,score));
		}
		Collections.sort(students);
		System.out.println("Ranking:");
		for(Student student: students) {
			System.out.println(student.name);
		}
		input.close();
	}
	static class Student implements Comparable<Student>{
		String name;
		int score;
		public Student(String name,int score) {
			this.name=name;
			this.score=score;
		}
		public int compareTo(Student other) {
			return other.score-this.score;
		}
	}
}
