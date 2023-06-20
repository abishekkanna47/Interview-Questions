//mat 0

import java.util.*;
public class zeromat
{
public static void main(String []args)
{
	int m,n;
	int k=0;
	Scanner sc=new Scanner(System.in);
	ArrayList ll=new ArrayList();
	m=sc.nextInt();
	n=sc.nextInt();
	int [][]ar=new int[m][n];
		int [][]ar1=new int[m][n];

	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++){
		ar[i][j]=sc.nextInt();
		ar1[i][j]=ar[i][j];
	}}
for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{if (ar[i][j]==0)
			{
				for(int x=0;x<n;x++)
					ar1[i][x]=0;
				for(int y=0;y<m;y++)
					ar1[y][j]=0;
			}
		}
	}
			System.out.println();

	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++){
			System.out.print(ar1[i][j]+" ");
		}
		System.out.println();
	}
}}	