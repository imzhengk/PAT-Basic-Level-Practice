package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B1072 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        String[] thing = br.readLine().split(" ");
        int stuTol = 0, thTol = 0;
        for(int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            boolean flag = false;
            for(int j = 2; j < temp.length; j++) {
                for(int k = 0; k < M; k++) {
                    if(temp[j].equals(thing[k])) {
                        thTol++;
                        if(flag) {
                            System.out.print(" " + temp[j]);
                        }else {
                            System.out.print(temp[0] + ": " + temp[j]);
                        }
                        flag = true;
                    }
                }
            }
            if(flag) {
                stuTol++;
                System.out.println();
            }
        }
        System.out.println(stuTol + " " + thTol);
    }
}
