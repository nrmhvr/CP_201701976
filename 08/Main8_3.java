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

		System.out.println(">�� ����(����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�.");
		System.out.print("���� ����: ");
		int score_Korean = inputScore();
		System.out.print("��ǻ�� ����: ");
		int score_Computer = inputScore();
		while (score_Korean >= 0 && score_Computer >= 0) {
			if (score_Korean > 100 || score_Computer > 100) {
				System.out.println("����: 100 �� �Ѿ, �������� ������ �ƴմϴ�.");
			} else {
				scoresKorean[numberOfStudents] = score_Korean;
				scoresComputer[numberOfStudents] = score_Computer;
				studentAverage[numberOfStudents] = (double) (score_Korean + score_Computer) / 2;
				total = total + studentAverage[numberOfStudents];
				numberOfStudents++;
			}
			System.out.println(">�� ����(����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ�.");
			System.out.print("���� ����: ");
			score_Korean = inputScore();
			System.out.print("��ǻ�� ����: ");
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
			System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
			System.out.println();
			System.out.println("��� " + numberOfStudents + "���� ������ �ԷµǾ����ϴ�.");
			System.out.println();
			System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
			int count2 = 0;
			while (count2 < numberOfStudents) {
				System.out.println("[" + count2 + "] " + scoresKorean[count2] + " " + scoresComputer[count2] + " (��� "
						+ studentAverage[count2] + ")");
				count2++;
			}
			System.out.println();
			System.out.println("�б� ����� " + classAverage + " �Դϴ�.");
			System.out.println("��� �̻��� �л��� ���� " + aboveClassAverage + " ���Դϴ�.");
			System.out.println();
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
	private static int inputScore() {
		scanner = new Scanner(System.in);
		int scoreFromScanner;
		scoreFromScanner = scanner.nextInt();
		return scoreFromScanner;
	}
}
