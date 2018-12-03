package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1027 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("\\s+");
		int num = Integer.parseInt(str[0]);
		Rows(num,str[1]);
	}
	public static void Rows(int N,String str) {
		double temp = Math.pow((N+1)*1.0/2,0.5);
        int n = (int) temp;
        for (int i = n; i > 1; i--) {
        	for (int j = 0; j < n-i; j++) {
        		System.out.print(" ");
        	}
        	for(int k = 0; k < 2*i-1; k++){   
        	    System.out.print(str);
        	}
        	System.out.println();   
        }
        	 
        for (int i = 1; i <= n; i++) {
        	for (int j = 0; j < n-i; j++) {
        		System.out.print(" ");
        	}
        	for(int k = 0; k < 2*i-1; k++){  
        		System.out.print(str);
        	}
        	System.out.println(); 
        }
        int sum = N-(2*n*n-1);
        System.out.println(sum);        
	}
}
