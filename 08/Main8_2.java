import java.util.Scanner;

public class Main8_2 {
	private static final int MAX_SIZE = 100;
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfStudents = 0;
		int total = 0;
		double classAverage;
		int aboveClassAverage = 0;
		int count1 = 0;
		int score;
		int[] scores = new int[MAX_SIZE];
		score = inputScore();

		while (score >= 0) {
			if (score > 100) {
				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닙니다.");
			} else {
				scores[numberOfStudents] = score;
				numberOfStudents++;
				total = total + score;
				}
			score = inputScore();
		}
		classAverage = (double) total / numberOfStudents;
		while (count1 <= numberOfStudents) {
			if (scores[count1] >= classAverage) {
				aboveClassAverage++;
			}
			count1++;
		}
		if (score < 100) {
			System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
			System.out.println();
			System.out.println("모두 " + numberOfStudents + "명의 성적이 입력되었습니다.");
			System.out.println("평균은 " + classAverage + " 입니다.");
			System.out.println();
			System.out.println("입력된 성적은 다음과 같습니다.");
			int count2 = 0;
			while (count2 < numberOfStudents) {
				if (scores[count2] >= classAverage) {
					System.out.println("[" + count2 + "]" + scores[count2] + " (평균 이상입니다)");
				} else {
					System.out.println("[" + count2 + "]" + scores[count2] + " (평균 미만입니다)");
				}
				count2++;
			}
			System.out.println("평균 이상인 학생의 수는 " + aboveClassAverage + " 명입니다.");
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
		}
	}
	private static int inputScore() {
		scanner = new Scanner(System.in);
		int scoreFromScanner;
		System.out.print(">점수를 입력하시오: ");
		scoreFromScanner = scanner.nextInt();
		return scoreFromScanner;
	}
}
