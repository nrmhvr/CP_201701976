import java.util.Scanner;

public class Main4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		double a, b, c;
		double determinant;
		double x1, x2;
		char answer;

		System.out.println("이차방정식을 풀겠습니까?");
		System.out.println("계산하려면 Y 아니면 N 을 입력하시오.");
		answer = myScanner.next().charAt(0);

		while (answer == 'Y') {
			System.out.println("계수를 입력하시오.");
			System.out.print("a = ");
			a = myScanner.nextDouble();
			System.out.print("b = ");
			b = myScanner.nextDouble();
			System.out.print("c = ");
			c = myScanner.nextDouble();
			determinant = b * b - 4.0 * a * c;
			System.out.println();

			x1 = (-b + Math.sqrt(determinant)) / (2.0 * a);
			x2 = (-b - Math.sqrt(determinant)) / (2.0 * a);

			if (determinant < 0) {
				System.out.println("오류 : 판별식의 값이 0보다 작아서 실근이 존재하지 않습니다.");
				answer = 'N';
			} else if (a == 0) {
				System.out.println("오류 : 잘못된 계수가 입력되었습니다.");
				answer = 'N';
			} else {
				System.out.println("이차방정식을 계산합니다!");
				System.out.println("The solution is either " + x1 + " or " + x2);
				System.out.println();
				System.out.println("이차방정식을 풀겠습니까?");
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
