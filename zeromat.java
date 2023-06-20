//Program to check for zeroes in matrix and making the corresponding rows and columns of the zero element as zero

import java.util.*;
public class zeromat
{
public static void main(String []args)
{
	int m,n;
	int k=0;
	Scanner sc=new Scanner(System.in);
	m=sc.nextInt();
	n=sc.nextInt();
	int [][]ar=new int[m][n];
		int [][]ar1=new int[m][n];

	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++){
		ar[i][j]=sc.nextInt();  // main array to get matrix input
		ar1[i][j]=ar[i][j];  // temp matrix to process
	}}
for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{if (ar[i][j]==0)  //checking for zeroes in main matrix
			{
				for(int x=0;x<n;x++)
					ar1[i][x]=0;     //converting the corresponding column of temp matrix to zeroes
				for(int y=0;y<m;y++)
					ar1[y][j]=0;	//converting the corresponding row of temp matrix to zeroes
			}
		}
	}
			System.out.println();

	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++){
			System.out.print(ar1[i][j]+" ");    //printing processed temp matrix
		}
		System.out.println();
	}
}}	
