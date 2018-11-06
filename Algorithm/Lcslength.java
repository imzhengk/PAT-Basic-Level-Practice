package Algorithm;

public class Lcslength {

	public static void main(String[] args) {
		char[] x = " abcbdab".toCharArray();//注意前面空格
		char[] y = " bdcaba".toCharArray();
		int[][] b = new int[x.length][y.length];
		System.out.println(lcsLength(x,y,b));

	}
	
	public static int lcsLength(char[] x,char[] y,int[][] b) {
		int m = x.length - 1;
		int n = y.length - 1;
		int[][] c = new int[x.length][y.length];
		for(int i=1;i<=m;i++)
			c[i][0] = 0;
		for(int i=1;i<=n;i++)
			c[0][i] = 0;
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(x[i] == y[j]) {
					c[i][j] = c[i-1][j-1] + 1;
					b[i][j] = 1;
				}
				else if(c[i-1][j] >= c[i][j-1]) {
					c[i][j] = c[i-1][j];
					b[i][j] = 2;
				}
				else {
					c[i][j] = c[i][j-1];
					b[i][j] = 3;
				}
			}
		}
		lcs(m,n,x,b);
		return c[m][n];
	}
	
	public static void lcs(int i,int j,char[] x,int[][] b) {
		if(i==0 || j==0)
			return;
		if(b[i][j]==1) {
			lcs(i-1,j-1,x,b);
			System.out.print(x[i]);
		}
		else if(b[i][j]==2)
			lcs(i-1,j,x,b);
		else
			lcs(i,j-1,x,b);
	}

}
