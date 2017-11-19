import java.util.Scanner;

public class Main10_1_4 {
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		GPACounter counter = new GPACounter();
		System.out.println(">세 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력합니다.");
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
				System.out.println("오류: 100이 넘어서, 정상적인 점수가 아닙니다.");
			} else {
				System.out.println("[국   어] 점수: " + student.scoreKorean() + ", 학점: " + student.gradeKorean() + ", 평점: "
						+ student.pointKorean());
				System.out.println("[영   어] 점수: " + student.scoreEnglish() + ", 학점: " + student.gradeEnglish()
						+ ", 평점: " + student.pointEnglish());
				System.out.println("[컴퓨터] 점수: " + student.scoreComputer() + ", 학점: " + student.gradeComputer()
						+ ", 평점: " + student.pointComputer());
				System.out.println("이 학생의 평균평점은 " + student.gpa() + " 입니다.");
				counter.count(student.gpa());
			}
			System.out.println(">세 과목 (국어, 영어, 컴퓨터) 의 점수를 차례로 입력합니다.");
			scoreKorean = inputScore();
			student.setScoreKorean(scoreKorean);
			scoreEnglish = inputScore();
			student.setScoreEnglish(scoreEnglish);
			scoreComputer = inputScore();
			student.setScoreComputer(scoreComputer);
		}

		if (scoreKorean < 0 || scoreEnglish < 0 || scoreComputer < 0) {
			System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
			System.out.println();
			System.out.println("평균평점이 3.0 이상인 학생은 " + counter.numberOfGPA3() + " 명입니다.");
			System.out.println("평균평점이 2.0 이상 3.0 미만인 학생은 " + counter.numberOfGPA2() + " 명입니다.");
			System.out.println("평균평점이 1.0 이상 2.0 미만인 학생은 " + counter.numberOfGPA1() + " 명입니다.");
			System.out.println("평균평점이 1.0 미만인 학생은 " + counter.numberOfGPA0() + " 명입니다.");
			System.out.println("프로그램을 종료합니다.");
		}
	}

	private static int inputScore() {
		scanner = new Scanner(System.in);
		System.out.print("- 점수를 입력하시오: ");
		return scanner.nextInt();
	}
}