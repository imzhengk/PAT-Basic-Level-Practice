package Basic_Level;
/*
1040. 有几个PAT（25） 
字符串APPAPT中包含了两个单词“PAT”，其中第一个PAT是第2位(P),第4位(A),第6位(T)； 
第二个PAT是第3位(P),第4位(A),第6位(T)。 
现给定字符串，问一共可以形成多少个PAT？ 
输入格式： 
输入只有一行，包含一个字符串，长度不超过105，只包含P、A、T三种字母。 
输出格式： 
在一行中输出给定字符串中包含多少个PAT。由于结果可能比较大，只输出对 
1000000007取余数的结果。 
 */
//BufferedReader就不会运行超时
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1040 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] s = in.readLine().toCharArray();
        in.close();
        int len = s.length, countp = 0, countt = 0;
        long total = 0;
        for (int i = 0; i < len; i++) {
            if (s[i] == 'T')
                countt++;
        }
        for (int i = 0; i < len; i++) {
            if (s[i] == 'P')
                countp++;
            if (s[i] == 'T')
                countt--;
            if (s[i] == 'A') {
                total = total + countp * countt;
                if (total > 1000000007)
                    total = total % 1000000007;
            }
        }
        System.out.println(total);
    }
}