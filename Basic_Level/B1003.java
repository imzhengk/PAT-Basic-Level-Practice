package Basic_Level;

/*
1003. 我要通过！(20)
“答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于PAT的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。
得到“答案正确”的条件是：
1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。
现在就请你为PAT写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。
输入格式：
每个测试输入包含1个测试用例。第1行给出一个自然数n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过100，且不包含空格。
输出格式：
每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出YES，否则输出NO。
*/
//题目好难读懂

import java.io.PrintStream;
import java.text.ParseException;
import java.util.Scanner;
 
public class B1003 {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
 
    public static boolean test(String line){
        if(line==null)
            return false;
         
        int i=0;
        int len = line.length();
         
        int pCount,aCount,tCount;
        pCount=aCount=tCount=0;
         
        for(i=0;i<len;++i){
            if(line.charAt(i)=='P'){
                ++pCount;
                 
            }else if(line.charAt(i)=='A'){
                ++aCount;
                 
            }else if(line.charAt(i)=='T'){
                ++tCount;
                 
            }else{
                // 不满足条件1: 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符
                return false;
            }
        }
         
        // P和T只能出现一次 ，且A的个数大于一次
        if(!(pCount==tCount && aCount>=1 && pCount==1 ))
            return false;
         
        int indexP = line.indexOf('P');
        int indexT = line.indexOf('T');
         
        int leftA = indexP; // P前面A的个数
        int rightA = len - indexT - 1; // T后面A的个数
        int middleA = indexT - indexP - 1; // P和T直间A的个数
         
        int n = middleA - 1; // 迭代次数
        if(rightA != n*leftA+leftA)
            return false;
         
        return true;
    }
    public static void main(String[] args) throws ParseException {
        int N = in.nextInt();
        in.nextLine(); // 读取空白符
         
        for(int i=0;i<N;++i){
            if(test(in.nextLine()))
                out.println("YES");
            else
                out.println("NO");
        }
         
    }
}

