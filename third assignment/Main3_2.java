import java.util.Scanner;
public class Main3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my = new Scanner(System.in);
		int givenN;
		int count;
		int sum;
		sum = 0;
		count = 1;
		
		System.out.println("1���� N ���� �հ踦 ���Ϸ��� �մϴ�. N ���� �Է��Ͻÿ�.");
		System.out.print("N = ");
		givenN = my.nextInt();
		while(count <= givenN){
			sum = sum + count;
			System.out.println(count + "������ �� : " +sum);
			count = count + 1;
			
			my.close();
		}

		
	}

}
