package Basic_Level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class B1064 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new TreeSet<>();
        String[] s = br.readLine().trim().split(" ");
        for(int i = 0; i < n; i++) {
            int t = Integer.parseInt(s[i]);
            int fNum = 0;
            while(t > 0) {
                fNum += (t % 10);
                t /= 10;
            }
            set.add(fNum);
        }
        Iterator<Integer> iter = set.iterator();
        System.out.println(set.size());
        boolean flag = false;
        while(iter.hasNext()) {
            if(flag) {
                System.out.print(" " + iter.next());
            }else {
                System.out.print(iter.next());
                flag = true;
            }
        }
    }
}

