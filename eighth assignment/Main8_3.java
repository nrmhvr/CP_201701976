import java.util.Scanner;

public class Main8_3 {
	private static final int MAX_SIZE = 100;
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfStudents = 0;
		double total = 0;
		double classAverage;
		int[] scoresKorean = new int[MAX_SIZE];
		int[] scoresComputer = new int[MAX_SIZE];
		double[] studentAverage = new double[MAX_SIZE];

		System.out.println(">두 과목(국어, 컴퓨터)의 점수를 차례로 입력하시오.");
		System.out.print("국어 점수: ");
		int score_Korean = inputScore();
		System.out.print("컴퓨터 점수: ");
		int score_Computer = inputScore();
		while (score_Korean >= 0 && score_Computer >= 0) {
			if (score_Korean > 100 || score_Computer > 100) {
				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닙니다.");
			} else {
				scoresKorean[numberOfStudents] = score_Korean;
				scoresComputer[numberOfStudents] = score_Computer;
				studentAverage[numberOfStudents] = (double) (score_Korean + score_Computer) / 2;
				total = total + studentAverage[numberOfStudents];
				numberOfStudents++;
			}
			System.out.println(">두 과목(국어, 컴퓨터)의 점수를 차례로 입력하시오.");
			System.out.print("국어 점수: ");
			score_Korean = inputScore();
			System.out.print("컴퓨터 점수: ");
			score_Computer = inputScore();
		}
		classAverage = (double) total / numberOfStudents;
		int count1 = 0;
		int aboveClassAverage = 0;
		while (count1 <= numberOfStudents) {
			if (studentAverage[count1] >= classAverage) {
				aboveClassAverage++;
			}
			count1++;
		}
		if (score_Korean < 0 || score_Computer < 0) {
			System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
			System.out.println();
			System.out.println("모두 " + numberOfStudents + "명의 성적이 입력되었습니다.");
			System.out.println();
			System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
			int count2 = 0;
			while (count2 < numberOfStudents) {
				System.out.println("[" + count2 + "] " + scoresKorean[count2] + " " + scoresComputer[count2] + " (평균 "
						+ studentAverage[count2] + ")");
				count2++;
			}
			System.out.println();
			System.out.println("학급 평균은 " + classAverage + " 입니다.");
			System.out.println("평균 이상인 학생의 수는 " + aboveClassAverage + " 명입니다.");
			System.out.println();
			System.out.println("프로그램을 종료합니다.");
		}
	}
	private static int inputScore() {
		scanner = new Scanner(System.in);
		int scoreFromScanner;
		scoreFromScanner = scanner.nextInt();
		return scoreFromScanner;
	}
}
