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
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			} else {
				grade = score2Grade(currentScore);
				point = grade2Point(grade);
				System.out.println("    점수 : " + currentScore + ", 학점 : " + grade + ", 평점 : " + point);
			}
			currentScore = inputScore();
		}
		if (currentScore < 0) {
			System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
			System.out.println();
			System.out.println("A는 " + student_A + " 명 입니다.");
			System.out.println("B는 " + student_B + " 명 입니다.");
			System.out.println("C는 " + student_C + " 명 입니다.");
			System.out.println("D는 " + student_D + " 명 입니다.");
			System.out.println("F는 " + student_F + " 명 입니다.");
			System.out.println("프로그램을 종료합니다." + "");
		}
	}

	private static int inputScore() {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("- 점수를 입력하시오: ");
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