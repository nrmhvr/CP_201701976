import java.util.Scanner;

public class Main10_1_4 {
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		GPACounter counter = new GPACounter();
		System.out.println(">�� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��մϴ�.");
		int scoreKorean = inputScore();
		student.setScoreKorean(scoreKorean);
		int scoreEnglish = inputScore();
		student.setScoreEnglish(scoreEnglish);
		int scoreComputer = inputScore();
		student.setScoreComputer(scoreComputer);
		while (scoreKorean >= 0 && scoreEnglish >= 0 && scoreComputer >= 0) {
			student.setScoreKorean(scoreKorean);
			student.setScoreEnglish(scoreEnglish);
			student.setScoreComputer(scoreComputer);
			if (scoreKorean > 100 || scoreEnglish > 100 || scoreComputer > 100) {
				System.out.println("����: 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			} else {
				System.out.println("[��   ��] ����: " + student.scoreKorean() + ", ����: " + student.gradeKorean() + ", ����: "
						+ student.pointKorean());
				System.out.println("[��   ��] ����: " + student.scoreEnglish() + ", ����: " + student.gradeEnglish()
						+ ", ����: " + student.pointEnglish());
				System.out.println("[��ǻ��] ����: " + student.scoreComputer() + ", ����: " + student.gradeComputer()
						+ ", ����: " + student.pointComputer());
				System.out.println("�� �л��� ��������� " + student.gpa() + " �Դϴ�.");
				counter.count(student.gpa());
			}
			System.out.println(">�� ���� (����, ����, ��ǻ��) �� ������ ���ʷ� �Է��մϴ�.");
			scoreKorean = inputScore();
			student.setScoreKorean(scoreKorean);
			scoreEnglish = inputScore();
			student.setScoreEnglish(scoreEnglish);
			scoreComputer = inputScore();
			student.setScoreComputer(scoreComputer);
		}

		if (scoreKorean < 0 || scoreEnglish < 0 || scoreComputer < 0) {
			System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
			System.out.println();
			System.out.println("��������� 3.0 �̻��� �л��� " + counter.numberOfGPA3() + " ���Դϴ�.");
			System.out.println("��������� 2.0 �̻� 3.0 �̸��� �л��� " + counter.numberOfGPA2() + " ���Դϴ�.");
			System.out.println("��������� 1.0 �̻� 2.0 �̸��� �л��� " + counter.numberOfGPA1() + " ���Դϴ�.");
			System.out.println("��������� 1.0 �̸��� �л��� " + counter.numberOfGPA0() + " ���Դϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}
	}

	private static int inputScore() {
		scanner = new Scanner(System.in);
		System.out.print("- ������ �Է��Ͻÿ�: ");
		return scanner.nextInt();
	}
}