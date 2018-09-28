/*
1022. D进制的A+B (20) 
输入两个非负10进制整数A和B(<=2^30-1)，输出A+B的D (1 < D <= 10)进制数。 
输入格式： 
输入在一行中依次给出3个整数A、B和D。 
输出格式： 
输出A+B的D进制数。 
 */
import java.util.Scanner;

public class B1022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt() + sc.nextInt();
		int r = sc.nextInt();
        System.out.print(Integer.toString(total, r));
/*
        String str = "";
		while(total>0) {
			int temp = total % r;
			str = temp + str;
			total = total/r;			
		}
        System.out.print(str);
*/
        
	}

}
