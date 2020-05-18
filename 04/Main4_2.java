import java.util.Scanner;

public class Main4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);

		int fact;
		int i;
		int givenN;
		char answer;

		System.out.println("Factorial을 계산하겠습니까?");
		System.out.println("계산하려면 Y 아니면 N 을 입력하시오.");
		answer = myScanner.next().charAt(0);

		while (answer == 'Y') {
			System.out.println("N값을 입력하시오.");
			givenN = myScanner.nextInt();

			if (givenN < 0) {
				System.out.println("오류 : N이 음수이므로, Factorial값을 계산할 수 없습니다.");
				answer = 'N';
			}
			if (givenN == 0) {
				fact = 1;
				System.out.println(givenN + "!의 값은 " + fact + " 입니다.");
				System.out.println();
				System.out.println("Factorial을 계산하겠습니까?");
				System.out.println("계산하려면 Y 아니면 N 을 입력하시오.");
				answer = myScanner.next().charAt(0);
			} else if(givenN >= 0){
				i = 1;
				fact = 1;
				while(givenN >= i){
				fact = fact * i;
				i = i + 1;
				}
				System.out.println(givenN + "!의 값은 " + fact + " 입니다.");
				System.out.println();
				System.out.println("Factorial을 계산하겠습니까?");
				System.out.println("계산하려면 Y 아니면 N 을 입력하시오.");
				answer = myScanner.next().charAt(0);
			}		
		}
		if (answer == 'N') {
			System.out.println("프로그램을 종료합니다.");
		}
		myScanner.close();
	}
}
