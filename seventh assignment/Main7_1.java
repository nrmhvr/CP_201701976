import java.util.Scanner;

public class Main7_1 {
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
		
		while(currentScore >= 0){
			if(currentScore > 100){
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}else{
				score2Grade(currentScore);
				}
			currentScore = inputScore();
		}
		if (currentScore < 0){
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println();
		System.out.println("A는 " + student_A + " 명 입니다.");
		System.out.println("B는 " + student_B + " 명 입니다.");
		System.out.println("C는 " + student_C + " 명 입니다.");
		System.out.println("D는 " + student_D + " 명 입니다.");
		System.out.println("F는 " + student_F + " 명 입니다.");
		System.out.println("프로그램을 종료합니다." + "");
	}

	}

	private static int inputScore(){
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("- 점수를 입력하시오: ");
		score = scanner.nextInt();
		return score;
	}

	private static char score2Grade (int aScore){
		char grade;
		
		if(aScore >= 90 && aScore <= 100){
			grade = 'A';
			System.out.println("    점수 : " +aScore+ ", 학점 : " +grade);
			student_A++;
		}else if(aScore >= 80 && aScore <= 89){
			grade = 'B';
			System.out.println("    점수 : " +aScore+ ", 학점 : " +grade);
			student_B++;
		}else if(aScore >= 70 && aScore <= 79){
			grade = 'C';
			System.out.println("    점수 : " +aScore+ ", 학점 : " +grade);
			student_C++;
		}else if(aScore >= 60 && aScore <= 69){
			grade = 'D';
			System.out.println("    점수 : " +aScore+ ", 학점 : " +grade);
			student_D++;
		}else {
			grade = 'F';
			System.out.println("    점수 : " +aScore+ ", 학점 : " +grade);
			student_F++;
	}return grade;
	}
}