//to check if a linked list containing characters is a palindrome or not

import java.util.*;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<String> ll=new LinkedList<String>();
				LinkedList<String> l=new LinkedList<String>();

		
		for(int i=0;i<n;i++)
		{
		 	ll.add(sc.next());
			l.add(ll.get(i));
		}
	Collections.reverse(ll);
	for(int i=0;i<ll.size();i++)
		System.out.println(ll.get(i));
		if(ll.equals(l))
		System.out.println("palindrome");
		else
				System.out.println("nope");

	}
}
