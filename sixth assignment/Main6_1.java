import java.util.Scanner;

public class Main6_1 {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 시작합니다>>");
		System.out.println();
		int x = inputNumber();
		while(x>=0){
			printAstertisks(x);
			x = inputNumber();
		}if(x<0){
			System.out.println();
			System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 종료합니다>>");
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
	System.out.print("양의 정수 (종료하려면 음수)를 입력하시오 : ");
	x = input.nextInt();
	return x;
	}
}