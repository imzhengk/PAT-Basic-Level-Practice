/*
1004 �ɼ����� ��20 �֣�
���� n��>0����ѧ����������ѧ�š��ɼ����ֱ�����ɼ���ߺͳɼ����ѧ����������ѧ�š�
�����ʽ��
ÿ������������� 1 ��������������ʽΪ
�� 1 �У������� n
�� 2 �У��� 1 ��ѧ�������� ѧ�� �ɼ�
  ... ... ...
�� n+1 �У��� n ��ѧ�������� ѧ�� �ɼ�
����������ѧ�ž�Ϊ������ 10 ���ַ����ַ������ɼ�Ϊ 0 �� 100 ֮���һ�����������ﱣ֤��һ�����������û������ѧ���ĳɼ�����ͬ�ġ�
�����ʽ��
��ÿ������������� 2 �У��� 1 ���ǳɼ����ѧ����������ѧ�ţ��� 2 ���ǳɼ����ѧ����������ѧ�ţ��ַ������� 1 �ո�
*/
import java.util.Scanner;

class Student{
    String name;
    String ID;
    int score;
}
public class B1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] stu = new Student[n];
        int max = 0;
        int min = 100;
        for (int i = 0; i < n; i++) {
            stu[i] = new Student();
            stu[i].name = sc.next();
            stu[i].ID = sc.next();
            stu[i].score = sc.nextInt();
            max = max > stu[i].score ? max:stu[i].score; 
            min = min < stu[i].score ? min:stu[i].score; 
        }
        for (int i = 0; i < n; i++) {
            if (stu[i].score == max) {
                System.out.println(stu[i].name + " " + stu[i].ID);
            } 
        }
        for (int i = 0; i < n; i++) {
            if (stu[i].score == min) {
                System.out.println(stu[i].name + " " + stu[i].ID);
            } 
        }

    }
}
