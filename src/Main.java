import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double grade = 0;
		double max = 0;
		double min = 100;
		double total = 0;
		double count = 0;
		
		System.out.println("Welcome to the grade book");
		grade = in.nextInt();
		while (grade >= 0) {
			if (grade > 100) {
				System.out.println("too high. try again");
			} else {
				count++;
				total = total + grade;
				
				if (grade > max) {
					max = grade;
				}
			if (grade > min) {
				min = grade;
			}
		
			}
			System.out.println("Enter your next grade: ");
			grade = in.nextInt();
		}
		//print out the results
		double average = total/count;
		

	}
}
