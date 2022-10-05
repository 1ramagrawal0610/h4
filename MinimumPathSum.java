package dp;

import java.util.Arrays;

public class MinimumPathSum {

	public static void main(String[] args) {
		int m=3,n=3;
		int[][] dp=new int[m][n];
		int[][] path=new int[][] {{1,3,1},
								  {1,5,1},
								  {4,2,1}};
		for(int i=0;i<m;i++)Arrays.fill(dp[i], -1);
		System.out.println(solve(m-1, n-1, dp,path));
		System.out.println(solve1(m,n,path));
	}
	public static int solve(int m,int n,int[][] dp,int[][] path) {
		if(m==0 && n==0)return path[0][0];
		if(m<0||n<0)return Integer.MAX_VALUE;
		if(dp[m][n]!=-1)return dp[m][n];
		return dp[m][n]=path[m][n]+Math.min(solve(m-1,n,dp,path),solve(m,n-1,dp,path));
	}
	public static int solve1(int m,int n,int[][] path) {
		int[][] dp=new int[m][n];
		dp[0][0]=path[0][0];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 && j==0)continue;
				int x=Integer.MAX_VALUE;
				int y=Integer.MAX_VALUE;
				if(i>0)x=dp[i-1][j];
				if(j>0)y=dp[i][j-1];
				dp[i][j]=path[i][j]+Math.min(x, y);
			}
		}
		return dp[m-1][n-1];
	}

}
