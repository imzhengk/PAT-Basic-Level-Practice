/*
1005 继续(3n+1)猜想 （25 分）
当我们验证卡拉兹猜想的时候，为了避免重复计算，可以记录下递推过程中遇到的每一个数。
例如对 n=3 进行验证的时候，我们需要计算 3、5、8、4、2、1，我们称 5、8、4、2 是被 3“覆盖”的数。
我们称一个数列中的某个数 n 为“关键数”，如果 n 不能被数列中的其他数字所覆盖。
现在给定一系列待验证的数字，我们只需要验证其中的几个关键数，就可以不必再重复验证余下的数字。
你的任务就是找出这些关键数字，并按从大到小的顺序输出它们。
输入格式：
每个测试输入包含 1 个测试用例，第 1 行给出一个正整数 K (<100)，第 2 行给出 K 个待验证的正整数 n的值，数字间用空格隔开。
输出格式：
每个测试用例的输出占一行，按从大到小的顺序输出关键数字。数字间用 1 个空格隔开，但一行中最后一个数字后没有空格。
*/
import java.util.*;
public class B1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Num[] = new int[n];
        for(int i=0; i<n; i++){
            Num[i] = scanner.nextInt();
        }

        Set<Integer> set = new HashSet<Integer>();
        int numtemp[] = new int[n];
        for(int i=0; i<n; i++){
            numtemp[i]=Num[i];
            if(set.contains(numtemp[i])){
                continue;
            }
            while(numtemp[i]!=1){
                if(numtemp[i]%2==0){
                    numtemp[i] = numtemp[i]/2;
                }else {
                    numtemp[i] = (3*numtemp[i]+1)/2;
                }
                if(set.contains(numtemp[i])){
                    break;
                }
                set.add(numtemp[i]);
            }
        }

        int outNum[] = new int[n];
        int count=0;
        for(int i=0;i<n; i++){
            if(set.contains(Num[i])){
                continue;
            }else {
                count++;
                outNum[i]=Num[i];
            }
        }

        Arrays.sort(outNum);

        for(int i=n-1; i>n-count-1; i--){
            System.out.print(outNum[i]);
            if(i==n-count){
                break;
            }
            System.out.print(" ");
        }
    }
}

