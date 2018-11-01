package Basic_Level;

/*
1064.朋友数(20)–PAT乙级真题java实现
如果两个整数各位数字的和是一样的，则被称为是“朋友数”，而那个公共的和就是它们的“朋友证号”。例如123和51就是朋友数，
因为1+2+3 = 5+1 = 6，而6就是它们的朋友证号。给定一些整数，要求你统计一下它们中有多少个不同的朋友证号。
输入格式： 
输入第一行给出正整数N。随后一行给出N个正整数，数字间以空格分隔。题目保证所有数字小于104。 
输出格式： 
首先第一行输出给定数字中不同的朋友证号的个数；随后一行按递增顺序输出这些朋友证号，数字间隔一个空格，且行末不得有多余空格。 
 */

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
        Iterator iter = set.iterator();
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

