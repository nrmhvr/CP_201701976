import java.util.Scanner;

public class Main7_2 {
	private static Scanner scanner;
	static int student_A = 0;
	static int student_B = 0;
	static int student_C = 0;
	static int student_D = 0;
	static int student_F = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int currentScore = inputScore();
		char grade;
		double point;

		while (currentScore >= 0) {
			if (currentScore > 100) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			} else {
				grade = score2Grade(currentScore);
				point = grade2Point(grade);
				System.out.println("    ���� : " + currentScore + ", ���� : " + grade + ", ���� : " + point);
			}
			currentScore = inputScore();
		}
		if (currentScore < 0) {
			System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
			System.out.println();
			System.out.println("A�� " + student_A + " �� �Դϴ�.");
			System.out.println("B�� " + student_B + " �� �Դϴ�.");
			System.out.println("C�� " + student_C + " �� �Դϴ�.");
			System.out.println("D�� " + student_D + " �� �Դϴ�.");
			System.out.println("F�� " + student_F + " �� �Դϴ�.");
			System.out.println("���α׷��� �����մϴ�." + "");
		}
	}

	private static int inputScore() {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("- ������ �Է��Ͻÿ�: ");
		score = scanner.nextInt();
		return score;
	}

	private static char score2Grade(int aScore) {
		char grade;
		if (aScore >= 90 && aScore <= 100) {
			grade = 'A';
			student_A++;
		} else if (aScore >= 80 && aScore <= 89) {
			grade = 'B';
			student_B++;
		} else if (aScore >= 70 && aScore <= 79) {
			grade = 'C';
			student_C++;
		} else if (aScore >= 60 && aScore <= 69) {
			grade = 'D';
			student_D++;
		} else {
			grade = 'F';
			student_F++;
		}
		return grade;
	}

	private static double grade2Point(char aGrade) {
		double point = 0;
		if (aGrade == 'A') {
			point = 4.0;
		} else if (aGrade == 'B') {
			point = 3.0;
		} else if (aGrade == 'C') {
			point = 2.0;
		} else if (aGrade == 'D') {
			point = 1.0;
		} else if (aGrade == 'F') {
			point = 0.0;
		}
		return point;
	}
}