using System;

class Point
{
	public int x = 0;
	public int y = 0;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

class Calculate
{
	public static double Distance(Point point)
	{
		return Math.Sqrt(Math.Pow(Math.Abs(point.x), 2) + Math.Pow(Math.Abs(point.y), 2));
	}
}

class Solution
{
	public static void Sort(Point[] array)
	{
		int minIndex = 0;

		for(int i = 0; i < array.GetLength(0); i++)
		{
			minIndex = i;

			for(int j = i + 1; j < array.GetLength(0); j++)
			{
				if(Calculate.Distance(array[j]) < Calculate.Distance(array[minIndex])) minIndex = j;
			}

			int a0 = array[i].x;
			int a1 = array[i].y;
			int b0 = array[minIndex].x;
			int b1 = array[minIndex].y;

			array[i].x = b0;
			array[i].y = b1;
			array[minIndex].x = a0;
			array[minIndex].y = a1;
		}
	}

	public static Point[] ClosestPoints(Point[] points, int k)
	{
		if(points.Length == 0) return points;
		Point[] closest = new Point[k];

		Sort(points);

		for(int i = 0; i < k; i++)
		{
			closest[i] = new Point(points[i].x, points[i].y);
		}

		return closest;
	}
}

class LeetCode
{
	static void Main()
	{
		int k = 4;
		int size = 10;
		Point[] points = new Point[size];
		points[0] = new Point(0,0);
		points[1] = new Point(1,1);
		points[2] = new Point(2,2);
		points[3] = new Point(3,3);
		points[4] = new Point(4,4);
		points[5] = new Point(5,5);
		points[6] = new Point(6,6);
		points[7] = new Point(7,7);
		points[8] = new Point(8,8);
		points[9] = new Point(9,9);

		Point[] closest = Solution.ClosestPoints(points, k);

		for(int i = 0; i < k; i++)
		{
			Console.WriteLine("[{0},{1}] : {2}", closest[i].x, closest[i].y, Calculate.Distance(closest[i]));
		}
	}
}
