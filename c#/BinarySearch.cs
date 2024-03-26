using System;

class Algorithm
{
	public int BinarySearch(int[] array, int target)
	{
		int left = 0;
		int median = 0;
		int right = array.Length - 1;

		if(target < array[left] || target > array[right]) return -1;

		while(left <= right)
		{
			median = left + (right - left) / 2;

			if(array[left] == target) return left;
			else if(array[right] == target) return right;
			else if(array[median] == target) return median;
			else if(array[median] < target) left = median + 1;
			else if(array[median] > target) right = median - 1;
		}

		return -1;
	}
}

class Program
{
	public static void Main()
	{
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		Algorithm solution = new Algorithm();

		for(int i = -1; i < array.Length + 1; i++)
		{
			Console.WriteLine(i + ": " + solution.BinarySearch(array, i));
		}
	}
}