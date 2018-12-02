package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1081 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			Judge(br.readLine());
		}

	}
	static void Judge(String s) {
        boolean flag = false;
        char[] chars = s.toCharArray();
        int a=0,b=0;
        for(char c : chars) {
        	if((c>='A' && c<='Z') || (c>='a' && c<='z'))
        		a = 1;
        	else if((c>='0' && c<='9'))
        		b = 1;
        	else if(c=='.')
        		;
        	else {
        		flag = true;
        		break;
        	}
        }
		if(s.length()>=6) {
			if(!flag) {
				if(a==1 && b==0) {
					System.out.println("Your password needs shu zi.");
				}
				else if(a==0 && b==1) {
					System.out.println("Your password needs zi mu.");
				}
				else {
					System.out.println("Your password is wan mei.");
				}
			}
			else {
				System.out.println("Your password is tai luan le.");
			}
		}
		else {
			System.out.println("Your password is tai duan le.");
		}
	}
}
