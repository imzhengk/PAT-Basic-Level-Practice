package Basic_Level;

/*
1035. 插入与归并(25) 
根据维基百科的定义： 
插入排序是迭代算法，逐一获得输入数据，逐步产生有序的输出序列。每步迭代中，算法从输入序列中取出一元素，将之插入有序序列中正确的位置。
如此迭代直到全部元素有序。 归并排序进行如下迭代操作：首先将原始序列看成N个只包含1个元素的有序子序列，然后每次迭代归并两个相邻的有序子序列，
直到最后只剩下1个有序的序列。现给定原始序列和由某排序算法产生的中间序列，请你判断该算法究竟是哪种排序算法？ 
输入格式： 
输入在第一行给出正整数N (<=100)；随后一行给出原始序列的N个整数；最后一行给出由某排序算法产生的中间序列。
这里假设排序的目标序列是升序。数字间以空格分隔。 
输出格式： 
首先在第1行中输出“Insertion Sort”表示插入排序、或“Merge Sort”表示归并排序；
然后在第2行中输出用该排序算法再迭代一轮的结果序列。题目保证每组测试的结果是唯一的。数字间以空格分隔，且行末不得有多余空格。 
 */
//StringBuffer没有equals方法，无法比较，用buffer.toString()
//归并算法未实现

import java.util.Scanner;

public class B1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[] array = new int[10];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt(); 
		}
		sc.nextLine();
		String process = sc.nextLine();
		sc.close();
		if(!InsertionSort(array,process))
			System.out.println("lulaal");

	}
	static boolean InsertionSort(int[] array,String process) {
		boolean flag = false;
		for(int i=1;i<array.length;i++) {
			int key = array[i];
			int j = i - 1;
			while(j>=0 && array[j]>key) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
			StringBuffer buffer = new StringBuffer("");
			for(int k=0;k<array.length;k++) {
				buffer.append(array[k]);
				if(k!=array.length-1)
					buffer.append(" ");
			}
			if(flag) {
				System.out.println("Insertion Sort");
				System.out.println(buffer);
				return flag;
			}
			if(buffer.toString().equals(process))
				flag = true;
		}
		return flag;
	}
}
