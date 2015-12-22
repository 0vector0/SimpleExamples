package examples;

public class NanoTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = System.nanoTime();
		int a = 1;
		int b = 2;

		a = a + b;
		b = a - b;
		a = a - b;

		
		long stop = System.nanoTime();
		System.out.println(stop - start);

	}

}
