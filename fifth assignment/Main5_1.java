import java.util.Scanner;

public class Main5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int score;
		int student_number = 0;
		int sum = 0;
		double average;
		char grade;
		int student_A = 0;
		int student_B = 0;
		int student_C = 0;
		int student_D = 0;
		int student_F = 0;

		System.out.println("<<성적 처리 프로그램을 시작합니다>>");
		System.out.println();
		System.out.print("성적을 입력하시오 : ");
		score = input.nextInt();
		
		while(score >= 0){
			if( score > 100){
				System.out.println("오류 : 100이 넘는 성적이 입력되었습니다.");
				System.out.println();
				student_number = student_number -1;
			}
			else{
				if(score >= 90 && score <= 100){
					grade = 'A';
					System.out.println("    (성적 : " +score+ ", 학점 : " +grade+ ")");
					student_A = student_A + 1;
				}else if(score >= 80 && score <= 89){
					grade = 'B';
					System.out.println("    (성적 : " +score+ ", 학점 : " +grade+ ")");
					student_B = student_B + 1;
				}else if(score >= 70 && score <= 79){
					grade = 'C';
					System.out.println("    (성적 : " +score+ ", 학점 : " +grade+ ")");
					student_C = student_C + 1;
				}else if(score >= 60 && score <= 69){
					grade = 'D';
					System.out.println("    (성적 : " +score+ ", 학점 : " +grade+ ")");
					student_D = student_D + 1;
				}else {
					grade = 'F';
					System.out.println("    (성적 : " +score+ ", 학점 : " +grade+ ")");
					student_F = student_F + 1;
				}
			}
			System.out.print("성적을 입력하시오 : ");
			score = input.nextInt();
			student_number = student_number + 1;
			sum = sum + score;
		}
		
		average = (double)sum/(student_number);
		if(score < 0){
			System.out.println();
			System.out.println("학생 수는 " +student_number+ "명 입니다.");
			System.out.println("A는 " +student_A+ " 명 입니다.");
			System.out.println("B는 " +student_B+ " 명 입니다.");
			System.out.println("C는 " +student_C+ " 명 입니다.");
			System.out.println("D는 " +student_D+ " 명 입니다.");
			System.out.println("F는 " +student_F+ " 명 입니다.");
			System.out.println("평균은 " +average+ " 입니다.");
			System.out.println();
			System.out.println("<<성적 처리 프로그램을 종료합니다>>");
		}
		input.close();

	}
	}
