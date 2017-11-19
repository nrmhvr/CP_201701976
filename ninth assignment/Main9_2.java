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
				System.out.println("오류: 100 이 넘어서, 정상적인 점수가 아닙니다.");
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
			System.out.println("최고점은 " + calcMax(scores, numberOfStudents) + " 점입니다.");
			System.out.println("최저점은 " + calcMin(scores, numberOfStudents) + " 점입니다.");
			System.out.println();
			System.out.println("성적순은 다음과 같습니다.");
				selectionSort(scores, numberOfStudents);
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