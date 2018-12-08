package Basic_Level;

import java.util.Scanner;

public class B1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt() + sc.nextInt();
		int r = sc.nextInt();
		sc.close();
        System.out.print(Integer.toString(total, r));
        
	}

}
