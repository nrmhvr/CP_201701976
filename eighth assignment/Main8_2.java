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
				System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴմϴ�.");
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
			System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
			System.out.println();
			System.out.println("��� " + numberOfStudents + "���� ������ �ԷµǾ����ϴ�.");
			System.out.println("����� " + classAverage + " �Դϴ�.");
			System.out.println();
			System.out.println("�Էµ� ������ ������ �����ϴ�.");
			int count2 = 0;
			while (count2 < numberOfStudents) {
				if (scores[count2] >= classAverage) {
					System.out.println("[" + count2 + "]" + scores[count2] + " (��� �̻��Դϴ�)");
				} else {
					System.out.println("[" + count2 + "]" + scores[count2] + " (��� �̸��Դϴ�)");
				}
				count2++;
			}
			System.out.println("��� �̻��� �л��� ���� " + aboveClassAverage + " ���Դϴ�.");
			System.out.println();
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
	private static int inputScore() {
		scanner = new Scanner(System.in);
		int scoreFromScanner;
		System.out.print(">������ �Է��Ͻÿ�: ");
		scoreFromScanner = scanner.nextInt();
		return scoreFromScanner;
	}
}
