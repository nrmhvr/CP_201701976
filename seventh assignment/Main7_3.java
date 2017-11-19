import java.util.Scanner;

public class Main7_3 {
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade;
		double point;

		System.out.println("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�. ");
		int score_Korean = inputScore();
		int score_English = inputScore();
		int score_Computer = inputScore();
		
		while( (score_Korean > 0) && (score_English > 0) && (score_Computer > 0) ){
			if ( (score_Korean > 100) || (score_English > 100) || (score_Computer > 100) ) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			}else{
				grade = score2Grade(score_Korean);
				point = grade2Point(grade);
				System.out.println("[��  ��] ����: " +score_Korean+ ", ����: " +grade+ ", ����: " +point);
				grade = score2Grade(score_English);
				point = grade2Point(grade);
				System.out.println("[��  ��] ����: " +score_English+ ", ����: " +grade+ ", ����: " +point);
				grade = score2Grade(score_Computer);
				point = grade2Point(grade);
				System.out.println("[��ǻ��] ����: " +score_Computer+ ", ����: " +grade+ ", ����: " +point);
			}
			System.out.println("> �� ���� (����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ�. ");
			score_Korean = inputScore();
			score_English = inputScore();
			score_Computer = inputScore();
		} 
		if ( (score_Korean < 0) || (score_English < 0) || (score_Computer < 0) ){
			System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
			System.out.println();
			System.out.println("���α׷��� �����մϴ�.");
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
		} else if (aScore >= 80 && aScore <= 89) {
			grade = 'B';
		} else if (aScore >= 70 && aScore <= 79) {
			grade = 'C';
		} else if (aScore >= 60 && aScore <= 69) {
			grade = 'D';
		} else {
			grade = 'F';
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