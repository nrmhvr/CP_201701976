import java.util.Scanner;

public class Main4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);

		int fact;
		int i;
		int givenN;
		char answer;

		System.out.println("Factorial�� ����ϰڽ��ϱ�?");
		System.out.println("����Ϸ��� Y �ƴϸ� N �� �Է��Ͻÿ�.");
		answer = myScanner.next().charAt(0);

		while (answer == 'Y') {
			System.out.println("N���� �Է��Ͻÿ�.");
			givenN = myScanner.nextInt();

			if (givenN < 0) {
				System.out.println("���� : N�� �����̹Ƿ�, Factorial���� ����� �� �����ϴ�.");
				answer = 'N';
			}
			if (givenN == 0) {
				fact = 1;
				System.out.println(givenN + "!�� ���� " + fact + " �Դϴ�.");
				System.out.println();
				System.out.println("Factorial�� ����ϰڽ��ϱ�?");
				System.out.println("����Ϸ��� Y �ƴϸ� N �� �Է��Ͻÿ�.");
				answer = myScanner.next().charAt(0);
			} else if(givenN >= 0){
				i = 1;
				fact = 1;
				while(givenN >= i){
				fact = fact * i;
				i = i + 1;
				}
				System.out.println(givenN + "!�� ���� " + fact + " �Դϴ�.");
				System.out.println();
				System.out.println("Factorial�� ����ϰڽ��ϱ�?");
				System.out.println("����Ϸ��� Y �ƴϸ� N �� �Է��Ͻÿ�.");
				answer = myScanner.next().charAt(0);
			}		
		}
		if (answer == 'N') {
			System.out.println("���α׷��� �����մϴ�.");
		}
		myScanner.close();
	}
}
