import java.util.Scanner;

public class UsingOOPSConcept {

	
	public static void main(String[] args) {
		UsingOOPSConcept lineComparisionUsingMethod = new UsingOOPSConcept();
		lineComparisionUsingMethod.getline();
	}

	private void getline() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your LINE1 x1 cordinate");
		int line1x1 = scan.nextInt();
		System.out.println("enter your LINE1 y1 cordinate");
		int line1y1 = scan.nextInt();
		System.out.println("enter your LINE1 x2 cordinate");
		int line1x2 = scan.nextInt();
		System.out.println("enter your LINE1 y2 cordinate");
		int line1y2 = scan.nextInt();

		System.out.println("enter your LINE2 x1 cordinate");
		int line2x1 = scan.nextInt();
		System.out.println("enter your LINE2 y1 cordinate");
		int line2y1 = scan.nextInt();
		System.out.println("enter your LINE2 x2 cordinate");
		int line2x2 = scan.nextInt();
		System.out.println("enter your LINE2 y2 cordinate");
		int line2y2 = scan.nextInt();
		line line = new line();
		line.computation(line1x1, line1x2, line1y2, line1y1, line2x2, line2x1, line2y2, line2y1);
	}

}

class line {
	void computation(int line1x1, int line1x2, int line1y2, int line1y1, int line2x2, int line2x1, int line2y2,
			int line2y1) {
		double LengthOfaLine1 = Math.sqrt(Math.pow(line1x2 - line1x1, 2) + Math.pow(line1y2 - line1y1, 2));
		System.out.println(LengthOfaLine1);
		double LengthOfaLine2 = Math.sqrt(Math.pow(line2x2 - line2x1, 2) + Math.pow(line2y2 - line2y1, 2));
		System.out.println(LengthOfaLine2);

		String lengthOfaString1 = Double.toString(LengthOfaLine1);
		String lengthOfaString2 = Double.toString(LengthOfaLine2);
		int value = lengthOfaString1.compareTo(lengthOfaString2);
		if (value == 0) {
			System.out.println("lines are equal");
		} else if (value > 0)
			System.out.println("line 1 is greater then line 2");
		else if (value < 0)
			System.out.println("line 2 is greater then line 1");
	}
}
