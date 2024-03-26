class Solution
{
	public static int RemoveDuplicates(int[] array)
	{
		int c = 0;
		int k = array.length;

		for(int i = 0; i < array.length; i++)
		{
			if(i != c && array[i] == array[c]) k--;

			if(array[i] > array[c])
			{
				c++;
				array[c] = array[i];
			}
		}

		return k;
	}
}

public class Easy_Remove_Duplicates
{
	public static void main(String[] args)
	{
		int[] array = {1,1,1,1,2,2,2,2,3,3};

		int k = Solution.RemoveDuplicates(array);

		for(int i = 0; i < k; i++)
		{
			System.out.println(array[i]);
		}
	}
}
