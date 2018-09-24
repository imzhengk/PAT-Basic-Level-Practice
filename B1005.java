/*
1005 ����(3n+1)���� ��25 �֣�
��������֤�����Ȳ����ʱ��Ϊ�˱����ظ����㣬���Լ�¼�µ��ƹ�����������ÿһ������
����� n=3 ������֤��ʱ��������Ҫ���� 3��5��8��4��2��1�����ǳ� 5��8��4��2 �Ǳ� 3�����ǡ�������
���ǳ�һ�������е�ĳ���� n Ϊ���ؼ���������� n ���ܱ������е��������������ǡ�
���ڸ���һϵ�д���֤�����֣�����ֻ��Ҫ��֤���еļ����ؼ������Ϳ��Բ������ظ���֤���µ����֡�
�����������ҳ���Щ�ؼ����֣������Ӵ�С��˳��������ǡ�
�����ʽ��
ÿ������������� 1 �������������� 1 �и���һ�������� K (<100)���� 2 �и��� K ������֤�������� n��ֵ�����ּ��ÿո������
�����ʽ��
ÿ���������������ռһ�У����Ӵ�С��˳������ؼ����֡����ּ��� 1 ���ո��������һ�������һ�����ֺ�û�пո�
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

