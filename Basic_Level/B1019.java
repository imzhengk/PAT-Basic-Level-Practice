package Basic_Level;

import java.util.Arrays;
import java.util.Scanner;

public class B1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		while(true) {
			int max = Max(number);
			int min = Min(number);
			number = max - min;
			if (number == 0) {
                System.out.printf("%04d - %04d = %04d\n", max, min, number);
                break;
            }
            if (number == 6174) {
                System.out.printf("%04d - %04d = %04d\n", max, min, number);
                break;
            }
            System.out.printf("%04d - %04d = %04d\n", max, min, number); 
		}

	}
	public static int Min(int number) {
		char[] array = String.format("%04d", number).toCharArray();
		Arrays.sort(array);
		int temp = 0;
		for(int i=0;i<4;i++) {
			temp = temp*10 + (array[i] - '0');
		}
		return temp;
	}
	public static int Max(int number) {
		char[] array = String.format("%04d", number).toCharArray();
		Arrays.sort(array);
		int temp = 0;
		for(int i=3;i>-1;i--) {
			temp = temp*10 + (array[i] - '0');
		}
		return temp;
	}

}
