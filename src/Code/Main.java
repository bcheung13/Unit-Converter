package Code;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mass k = new Mass(20);
		double result = k.fromGram().toKilogram();
		System.out.println(result);
		System.out.println(k.getValue());
	}
}
