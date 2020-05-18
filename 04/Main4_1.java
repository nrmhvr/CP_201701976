import java.util.Scanner;

public class Main4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		double a, b, c;
		double determinant;
		double x1, x2;
		char answer;

		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.println("����Ϸ��� Y �ƴϸ� N �� �Է��Ͻÿ�.");
		answer = myScanner.next().charAt(0);

		while (answer == 'Y') {
			System.out.println("����� �Է��Ͻÿ�.");
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
				System.out.println("���� : �Ǻ����� ���� 0���� �۾Ƽ� �Ǳ��� �������� �ʽ��ϴ�.");
				answer = 'N';
			} else if (a == 0) {
				System.out.println("���� : �߸��� ����� �ԷµǾ����ϴ�.");
				answer = 'N';
			} else {
				System.out.println("������������ ����մϴ�!");
				System.out.println("The solution is either " + x1 + " or " + x2);
				System.out.println();
				System.out.println("������������ Ǯ�ڽ��ϱ�?");
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
