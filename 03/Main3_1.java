import java.util.Scanner;
public class Main3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		double a, b, c;
		double determinant;
		double x1, x2;
		System.out.println("����� �Է��Ͻÿ�.");
		System.out.print("a = ");
		a = myScanner.nextDouble();
		System.out.print("b = ");
		b = myScanner.nextDouble();
		System.out.print("c = ");
		c = myScanner.nextDouble();
		determinant = b*b-4.0*a*c;
		
	
		if(determinant < 0){
			System.out.println("���� : �Ǻ����� ���� 0���� �۾Ƽ� �Ǳ��� �������� �ʽ��ϴ�.");
		}else if(a==0){
			System.out.println("���� : �߸��� ����� �ԷµǾ����ϴ�.");
		}else{
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b - Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is either "+x1+" or "+x2);
		
		myScanner.close();
		}
		

	}

}
