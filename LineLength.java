import java.util.Scanner;

public class LineLength {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your x1 cordinate");
		int x1 = scan.nextInt();
		System.out.println("enter your y1 cordinate");
		int y1 = scan.nextInt();
		System.out.println("enter your x2 cordinate");
		int x2 = scan.nextInt();
		System.out.println("enter your y2 cordinate");
		int y2 = scan.nextInt();
		
		double LengthOfaLine = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println(LengthOfaLine);
	}
}
