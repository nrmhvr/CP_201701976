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
		
		System.out.println("1부터 N 까지 합계를 구하려고 합니다. N 값을 입력하시오.");
		System.out.print("N = ");
		givenN = my.nextInt();
		while(count <= givenN){
			sum = sum + count;
			System.out.println(count + "까지의 합 : " +sum);
			count = count + 1;
			
			my.close();
		}

		
	}

}
