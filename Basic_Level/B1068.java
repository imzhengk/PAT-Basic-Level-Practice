package Basic_Level;

/*
1068. 万绿丛中一点红(20)–PAT乙级真题java实现
对于计算机而言，颜色不过是像素点对应的一个24位的数值。现给定一幅分辨率为MxN的画，要求你找出万绿丛中的一点红，即有独一无二颜色的那个像素点，
并且该点的颜色与其周围8个相邻像素的颜色差充分大。 
输入格式： 
输入第一行给出三个正整数，分别是M和N（<= 1000），即图像的分辨率；以及TOL，是所求像素点与相邻点的颜色差阈值，色差超过TOL的点才被考虑。
随后N行，每行给出M个像素的颜色值，范围在[0, 224)内。所有同行数字间用空格或TAB分开。 
输出格式： 
在一行中按照“(x, y): color”的格式输出所求像素点的位置以及颜色值，其中位置x和y分别是该像素在图像矩阵中的列、行编号（从1开始编号）。
如果这样的点不唯一，则输出“Not Unique”；如果这样的点不存在，则输出“Not Exist”。 
 */
//运行超时

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
public class B1068 {
    static int dir[][] = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
    static int[][] screen = new int[1001][1001];
    static int tol;
    static int n;
    static int m;
    public static boolean judge(int i, int j) {
        for (int k = 0; k < 8; k++) {
            int tx = i + dir[k][0];
            int ty = j + dir[k][1];
            if (tx >= 0 && tx < n && ty >= 0 && ty < m && screen[i][j] - screen[tx][ty] >= 0 - tol && screen[i][j] - screen[tx][ty] <= tol) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0, x = 0, y = 0;
        String[] s = br.readLine().split(" ");
        m = Integer.parseInt(s[0]);
        n = Integer.parseInt(s[1]); 
        tol = Integer.parseInt(s[2]);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String[] sp = br.readLine().split("\\s+|\t");
            for(int j = 0; j < m; j++) {
                screen[i][j] = Integer.parseInt(sp[j]);
                if(map.containsKey(screen[i][j]))
                    map.put(screen[i][j], map.get(screen[i][j]) + 1);
                else
                    map.put(screen[i][j], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map.get(screen[i][j]) == 1 && judge(i, j) == true) {
                    cnt++;
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        if (cnt == 1)
            System.out.printf("(%d, %d): %d", y, x, screen[x-1][y-1]);
        else if (cnt == 0)
            System.out.printf("Not Exist");
        else
            System.out.printf("Not Unique");
    }
}
