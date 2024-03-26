class Node
{
	public int data;
	public Node next;

	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}

class Solution
{
	public Node AddTwoNumbers(Node list1, Node list2)
	{
		int carry = 0;
		Node node1 = list1;
		Node node2 = list2;
		Node list = new Node(0, null);
		Node pointer = list;

		while(node1 != null || node2 != null)
		{
			int x = (node1 != null) ? node1.data : 0;
			int y = (node2 != null) ? node2.data : 0;
			int sum = carry + x + y;

			carry = sum / 10;
			pointer.next = new Node(sum % 10, null);
			pointer = pointer.next;

			if(node1 != null) node1 = node1.next;
			if(node2 != null) node2 = node2.next;
		}

		if(carry > 0)
		{
			pointer.next = new Node(carry, null);
		}

		return list.next;
	}
}

public class Medium_Add_Two_Numbers
{
	public static void main(String[] args)
	{
		Node sum;
		Node pointer;
		Node list1 = new Node(0, null);
		Node list2 = new Node(0, null);
		Solution solution = new Solution();

		int i = 0;
		pointer = list1;
		while(i < 8)
		{
			i++;
			pointer.next = new Node(0, null);
			pointer = pointer.next;
		}

		i = 0;
		pointer = list2;
		while(i < 8)
		{
			i++;
			pointer.next = new Node(0, null);
			pointer = pointer.next;
		}

		i = 1;
		pointer = list1;
		while(pointer != null)
		{
			pointer.data = i++;
			pointer = pointer.next;
		}

		i = 1;
		pointer = list2;
		while(pointer != null)
		{
			pointer.data = i++;
			pointer = pointer.next;
		}

		sum = solution.AddTwoNumbers(list1, list2);

		pointer = list1;
		while(pointer != null)
		{
			System.out.print(pointer.data);
			pointer = pointer.next;
		}

		System.out.print("\n");

		pointer = list2;
		while(pointer != null)
		{
			System.out.print(pointer.data);
			pointer = pointer.next;
		}

		System.out.print("\n");

		pointer = sum;
		while(pointer != null)
		{
			System.out.print(pointer.data);
			pointer = pointer.next;
		}
	}
}
