package Basic_Level;
/*
1040. �м���PAT��25�� 
�ַ���APPAPT�а������������ʡ�PAT�������е�һ��PAT�ǵ�2λ(P),��4λ(A),��6λ(T)�� 
�ڶ���PAT�ǵ�3λ(P),��4λ(A),��6λ(T)�� 
�ָ����ַ�������һ�������γɶ��ٸ�PAT�� 
�����ʽ�� 
����ֻ��һ�У�����һ���ַ��������Ȳ�����105��ֻ����P��A��T������ĸ�� 
�����ʽ�� 
��һ������������ַ����а������ٸ�PAT�����ڽ�����ܱȽϴ�ֻ����� 
1000000007ȡ�����Ľ���� 
 */
//BufferedReader�Ͳ������г�ʱ
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