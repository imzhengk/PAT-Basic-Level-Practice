
/*
1015 �²��� ��25 �֣�
�δ�ʷѧ��˾����ڡ�����ͨ��������һ�������ġ��²��ۡ������ǹʲŵ�ȫ��ν֮ʥ�ˣ��ŵ¼���ν֮���ˣ���ʤ��ν֮���ӣ���ʤ��ν֮С�ˡ�
��ȡ��֮����������ʥ�ˣ����Ӷ���֮�������С�ˣ����������ˡ����ָ���һ�������ĵ²ŷ����������˾�������۸���¼ȡ������
�����ʽ��
�����һ�и��� 3 �����������ֱ�Ϊ��N����10 5����������������L����60����Ϊ¼ȡ��ͷ����ߣ����·ֺͲŷ־������� L �Ŀ��������ʸ񱻿���¼ȡ��
H��<100����Ϊ����¼ȡ�ߡ����·ֺͲŷ־������ڴ��ߵı�����Ϊ���ŵ�ȫ���������࿼�����²��ִܷӸߵ�������
�ŷֲ������·ֵ��ߵ�һ�࿼�����ڡ���ʤ�š���Ҳ���ܷ����򣬵����ڵ�һ�࿼��֮��
�²ŷ־����� H�����ǵ·ֲ����ڲŷֵĿ������ڡ��ŵ¼����������С���ʤ�š��ߣ����ܷ����򣬵����ڵڶ��࿼��֮��
�����ﵽ����� L �Ŀ���Ҳ���ܷ����򣬵����ڵ����࿼��֮��
��� N �У�ÿ�и���һλ��������Ϣ��������׼��֤�� �·� �ŷ֣�����׼��֤��Ϊ 8 λ�������²ŷ�Ϊ���� [0, 100] �ڵ����������ּ��Կո�ָ���
�����ʽ��
�����һ�����ȸ����ﵽ��ͷ����ߵĿ������� M����� M �У�ÿ�а��������ʽ���һλ��������Ϣ��������������˵���Ĺ���Ӹߵ�������
��ĳ�࿼�����ж����ܷ���ͬʱ������·ֽ������У����·�Ҳ���У���׼��֤�ŵ����������
 */
//�����õ���Comparable�ӿڣ�����
//PAT���г�ʱ
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class B1015 {

	public static void main(String[] args) throws Exception {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] da = br.readLine().split(" ");
        int N = Integer.parseInt(da[0]);
        int L = Integer.parseInt(da[1]);
        int H = Integer.parseInt(da[2]);
        List<Person> PList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] cur = line.split(" ");
            int id = Integer.parseInt(cur[0]);
            int mora = Integer.parseInt(cur[1]);
            int talent = Integer.parseInt(cur[2]);
            Person Person = new Person(id, mora, talent,H);
            if (mora >= L && talent >= L) 
                PList.add(Person);
        }
        System.out.println(PList.size());
        Collections.sort(PList);
        for (Person Person : PList) 
            Person.printInfo(); 

	}
	public static class Person implements Comparable<Person>{
		int id;
		int mora;
		int talent;
		int type;
		int score;
		public Person(int id,int mora,int talent,int h) {
			this.id = id;
			this.mora = mora;
			this.talent = talent;
			this.score = this.mora + this.talent;
			if(mora >= h && talent >=h)
				type = 1;
			else if(mora >= h && talent < h)
				type = 2;
			else if(mora < h && talent < h && mora >= talent)
				type = 3;
			else
				type = 4;
		}
		public void printInfo() {
			System.out.println(this.id + " " + this.mora + " " + this.talent); 
		}
		public int compareTo(Person p) {
            if (this.type == p.type) {
                if (this.score == p.score) {
                    if (this.mora == p.mora) 
                        return (this.id - p.id);
                    return (p.mora - this.mora);
                }
                return (p.score - this.score);
            }
            return (this.type - p.type);
        } 
	}

}
