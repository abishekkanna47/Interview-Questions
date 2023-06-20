import java.util.*;

class lloop{

static class Node {
	int data;
	Node next;

	Node(int data)
	{
		this.data = data;
		next = null;
	}
};

// initialize a new head for the linked list
static Node head = null;
static class Linkedlist {
	// insert new value at the start
	void insert(int value)
	{
		Node newNode = new Node(value);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
//initialise the list elements to some value as a check point so that when returning to the same variable again ,it can be detected as a loop
boolean detectLoop()
{
	while(head!=null)
	{
		if(head.data!=-999)
		{
			head.data=-999;
			head=head.next;
		}
		else
		{
			return true;
		}}
	return false;
}}
public static void main(String[] args)
{
	Linkedlist l1 = new Linkedlist();
	// inserting new values
	l1.insert(19);
	l1.insert(20);
	l1.insert(21);
	l1.insert(22);
	l1.insert(23);

	// adding a loop
	//try moving the pointer position to change the loop position
	Node temp = head;
	while (temp.next != null)
		temp = temp.next;

	temp.next = head;


	if (l1.detectLoop())
		System.out.print("Loop exists"+"\n");
	else
		System.out.print("Loop does not exists "+"\n");

}
}
