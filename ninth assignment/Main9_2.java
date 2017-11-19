import java.util.Scanner;

public class Main9_2 {
	private static final int MAX_SIZE = 100;
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numberOfStudents = 0;
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
			}
			score = inputScore();
		}
		classAverage = calcAverage(scores, numberOfStudents);
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
			System.out.println("�ְ����� " + calcMax(scores, numberOfStudents) + " ���Դϴ�.");
			System.out.println("�������� " + calcMin(scores, numberOfStudents) + " ���Դϴ�.");
			System.out.println();
			System.out.println("�������� ������ �����ϴ�.");
				selectionSort(scores, numberOfStudents);
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

	private static double calcAverage(int[] elements, int aSize) {
		int i = 0, sum = 0;
		double average;
		while (i < aSize) {
			sum = sum + elements[i];
			i++;
		}
		average = (double) sum / aSize;
		return average;
	}

	private static int calcMax(int[] elements, int aSize) {
		int i = 1;
		int max = elements[0];
		while (i < aSize) {
			if (max < elements[i]) {
				max = elements[i];
			}
			i++;
		}
		return max;
	}

	private static int calcMin(int[] elements, int aSize) {
		int i = 1;
		int min = elements[0];
		while (i < aSize) {
			if (min > elements[i]) {
				min = elements[i];
			}
			i++;
		}
		return min;
	}

	private static void selectionSort (int[] elements, int aSize) {
		int lastLoc = aSize - 1;
		int maxLoc;
		int maxValue;
		int selectionLoc = 0;
		while (selectionLoc <= lastLoc) {
			maxLoc = selectionLoc;
			maxValue = elements[maxLoc];
			int curLoc = selectionLoc + 1;
			while (curLoc <= lastLoc) {
				if (elements[curLoc] > maxValue) {
					maxLoc = curLoc;
					maxValue = elements[maxLoc];
				}
				curLoc++;
			}
			elements[maxLoc] = elements[selectionLoc];
			elements[selectionLoc] = maxValue;
			System.out.println("["+selectionLoc+"] " + elements[selectionLoc]);
			selectionLoc++;
		}
	}
}