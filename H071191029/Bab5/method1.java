import java.util.Scanner;

class method1 {
	// Hitung FPB
	static int calculateGCD(int a, int b) {
		int temp;

		while (b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}

		return a;
	}
	public static void main(String[] args) {
		Scanner ww = new Scanner(System.in);

		int a = ww.nextInt();
		if (a <= 0) {
			System.out.println("input (1)");
			return;
        }   

		int b = ww.nextInt();
		if (b <= 0) {
			System.out.println("input (2)");
			return;
		}

		System.out.println("FPB dari " + a + " dan " + b + " = " + calculateGCD(a, b));

    }
}