
public class Main2_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//서로 다른 실근이 존재하는경우2
		double a, b, c;
		double determinant;
		double x1, x2;
		a = 2;
		b = -18;
		c = -104;
		System.out.println("a=" +a+ " b=" +b+ " c=" +c);
		determinant = b*b-4.0*a*c;
		x1 = (-b + Math.sqrt(determinant))/(2.0*a);
		x2 = (-b - Math.sqrt(determinant))/(2.0*a);
		System.out.println("The solution is either "+x1+" or "+x2);

	}

}
