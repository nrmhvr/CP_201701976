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

		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		System.out.println();
		System.out.print("������ �Է��Ͻÿ� : ");
		score = input.nextInt();
		
		while(score >= 0){
			if( score > 100){
				System.out.println("���� : 100�� �Ѵ� ������ �ԷµǾ����ϴ�.");
				System.out.println();
				student_number = student_number -1;
			}
			else{
				if(score >= 90 && score <= 100){
					grade = 'A';
					System.out.println("    (���� : " +score+ ", ���� : " +grade+ ")");
					student_A = student_A + 1;
				}else if(score >= 80 && score <= 89){
					grade = 'B';
					System.out.println("    (���� : " +score+ ", ���� : " +grade+ ")");
					student_B = student_B + 1;
				}else if(score >= 70 && score <= 79){
					grade = 'C';
					System.out.println("    (���� : " +score+ ", ���� : " +grade+ ")");
					student_C = student_C + 1;
				}else if(score >= 60 && score <= 69){
					grade = 'D';
					System.out.println("    (���� : " +score+ ", ���� : " +grade+ ")");
					student_D = student_D + 1;
				}else {
					grade = 'F';
					System.out.println("    (���� : " +score+ ", ���� : " +grade+ ")");
					student_F = student_F + 1;
				}
			}
			System.out.print("������ �Է��Ͻÿ� : ");
			score = input.nextInt();
			student_number = student_number + 1;
			sum = sum + score;
		}
		
		average = (double)sum/(student_number);
		if(score < 0){
			System.out.println();
			System.out.println("�л� ���� " +student_number+ "�� �Դϴ�.");
			System.out.println("A�� " +student_A+ " �� �Դϴ�.");
			System.out.println("B�� " +student_B+ " �� �Դϴ�.");
			System.out.println("C�� " +student_C+ " �� �Դϴ�.");
			System.out.println("D�� " +student_D+ " �� �Դϴ�.");
			System.out.println("F�� " +student_F+ " �� �Դϴ�.");
			System.out.println("����� " +average+ " �Դϴ�.");
			System.out.println();
			System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		}
		input.close();

	}
	}
