package Basic_Level;
/*
1032. �ھ�������ļ�ǿ(20) 
Ϊ������ʵ˵���ھ�����������ļ�ǿ��PAT��֯��һ���ھ�����ܴ�������������ݱ������ͳ�Ƴ�������ǿ���Ǹ�ѧУ�� 
�����ʽ�� 
�����ڵ�1�и���������10^5��������N�����������������N�У�ÿ�и���һλ�����ߵ���Ϣ�ͳɼ���
�������������ѧУ�ı�ţ���1��ʼ������ţ�����������ɼ����ٷ��ƣ����м��Կո�ָ��� 
�����ʽ�� 
��һ���и����ܵ÷���ߵ�ѧУ�ı�š������ܷ֣��м��Կո�ָ�����Ŀ��֤��Ψһ��û�в��С� 
 */
//������г�ʱ
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1032 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int maxIndex = 1;
		String[] temp;
		int[] scores = new int[100001];
		for(int i=0;i<num;i++) {
			temp = br.readLine().split(" ");
			int tno = Integer.parseInt(temp[0]);
			int tscore = Integer.parseInt(temp[1]);
			scores[tno] = scores[tno] + tscore;
			if(scores[maxIndex] < scores[tno])
				maxIndex = tno;
		}
		System.out.println(maxIndex + " " + scores[maxIndex]);
	}
}
