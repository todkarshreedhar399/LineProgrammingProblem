import java.util.Scanner;

public class FindingGreaterLine{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your LINE1 x1 cordinate");
		int LINE1x1 = scan.nextInt();
		System.out.println("enter your LINE1 y1 cordinate");
		int LINE1y1 = scan.nextInt();
		System.out.println("enter your LINE1 x2 cordinate");
		int LINE1x2 = scan.nextInt();
		System.out.println("enter your LINE1 y2 cordinate");
		int LINE1y2 = scan.nextInt();
		
		
		System.out.println("enter your LINE2 x1 cordinate");
		int LINE2x1 = scan.nextInt();
		System.out.println("enter your LINE2 y1 cordinate");
		int LINE2y1 = scan.nextInt();
		System.out.println("enter your LINE2 x2 cordinate");
		int LINE2x2 = scan.nextInt();
		System.out.println("enter your LINE2 y2 cordinate");
		int LINE2y2 = scan.nextInt();
		
		
		double LengthOfaLine1 = Math.sqrt(Math.pow(LINE1x2-LINE1x1, 2) + Math.pow(LINE1y2-LINE1y1, 2));
		System.out.println(LengthOfaLine1);
		double LengthOfaLine2 = Math.sqrt(Math.pow(LINE2x2-LINE2x1, 2) + Math.pow(LINE2y2-LINE2y1, 2));
		System.out.println(LengthOfaLine2);
		
		String length1 = Double.toString(LengthOfaLine1);
		String length2 = Double.toString(LengthOfaLine2);
		System.out.println(length1.compareTo(length2));
		
		if (LengthOfaLine1 > LengthOfaLine2) {
			System.out.println("line1 is greater then line2");
		}
		else if(LengthOfaLine1<LengthOfaLine2) {
			System.out.println("line2 is greater then line 1");
		}
		else
			System.out.println("line1 is equals to line2");
	}

}
