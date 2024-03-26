class Solution
{
	public int BinarySearch(int[] array, int target)
	{
		int left = 0;
		int median = 0;
		int right = array.length - 1;

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

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		Solution solution = new Solution();

		for(int i = -1; i < array.length + 1; i++)
		{
			System.out.println(i + ": " + solution.BinarySearch(array, i));
		}
	}
}
