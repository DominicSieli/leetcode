class Calculate
{
	public static double Distance(int x, int y)
	{
		return x * x + y * y;
	}
}

class Solution
{
	public static void Sort(int[][] array)
	{
		int minIndex = 0;

		for(int i = 0; i < array.length; i++)
		{
			minIndex = i;

			for(int j = i + 1; j < array.length; j++)
			{
				if(Calculate.Distance(array[j][0], array[j][1]) < Calculate.Distance(array[minIndex][0], array[minIndex][1])) minIndex = j;
			}

			int a0 = array[i][0];
			int a1 = array[i][1];
			int b0 = array[minIndex][0];
			int b1 = array[minIndex][1];

			array[i][0] = b0;
			array[i][1] = b1;
			array[minIndex][0] = a0;
			array[minIndex][1] = a1;
		}
	}

	public static int[][] ClosestPoints(int[][] points, int k)
	{
		if(points[0].length == 0) return points;
		int[][] closest = new int[k][];

		Sort(points);

		for(int i = 0; i < k; i++)
		{
			closest[i] = new int[2];
			closest[i][0] = points[i][0];
			closest[i][1] = points[i][1];
		}

		return closest;
	}
}

public class Medium_K_Closest_Points
{
	public static void main(String[] args)
	{
		int k = 4;
		int size = 10;
		int[][] points = new int[size][];

		for(int i = 0; i < size; i++)
		{
			points[i] = new int[2];
			points[i][0] = size - i - 1;
			points[i][1] = size - i - 1;
		}

		int[][] closest = Solution.ClosestPoints(points, k);

		for(int i = 0; i < k; i++)
		{
			System.out.println("[" + closest[i][0] + "," + closest[i][0] + "] : " + Calculate.Distance(closest[i][0],closest[i][1]));
		}
	}
}
