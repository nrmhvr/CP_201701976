import java.util.Scanner;

public class Main6_1 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		System.out.println();
		int x = inputNumber();
		while(x>=0){
			printAstertisks(x);
			x = inputNumber();
		}if(x<0){
			System.out.println();
			System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		}
	}
	
	private static void printAstertisks (int n) {
 		int i = 0;
 		while (i < n){
 			System.out.print("*");
 			i = i + 1;
 		}
 		System.out.println();
 	}

	private static int inputNumber(){
	input = new Scanner(System.in);
	int x;
	System.out.print("���� ���� (�����Ϸ��� ����)�� �Է��Ͻÿ� : ");
	x = input.nextInt();
	return x;
	}
}