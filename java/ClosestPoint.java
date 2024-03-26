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
		return Math.sqrt(Math.pow(Math.abs(point.x), 2) + Math.pow(Math.abs(point.y), 2));
	}
}

class Algorithm
{
	public static Point ClosestPoint(Point[] points)
	{
		if(points.length == 0) return new Point(0,0);
		Point point = new Point(0,0);
		point = points[0];

		for(int i = 0; i < points.length; i++)
		{
			if(Calculate.Distance(points[i]) < Calculate.Distance(point))
			{
				point = points[i];
			}
		}

		return point;
	}
}

class Easy_Closest_Point
{
	public static void main(String[] args)
	{
		Point[] points = new Point[4];
		points[0] = new Point(8,8);
		points[1] = new Point(4,4);
		points[2] = new Point(2,2);
		points[3] = new Point(1,1);
		Point point = Algorithm.ClosestPoint(points);
		System.out.println("Closest Point: [" + point.x + "," + point.y + "]");
	}
}
