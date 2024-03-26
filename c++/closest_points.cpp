#include <vector>
#include <iostream>
#include <algorithm>

struct Point
{
	int x = 0;
	int y = 0;
};

double Distance(Point point)
{
	return point.x * point.x + point.y * point.y;
}

std::vector<Point> ClosestPoints(std::vector<Point>& points, int k)
{
	sort(points.begin(), points.end(), [&](Point& point_1, Point& point_2)
	{
		return Distance(point_1) < Distance(point_2);
	});

	return std::vector<Point>(points.begin(), points.begin() + k);
}

int main()
{
	int k = 4;
	std::vector<Point> points = {{2,3},{4,9},{10,10},{1,1}};
	std::vector<Point> closest = ClosestPoints(points, k);

	for(unsigned int i = 0; i < closest.size(); i++)
	{
		std::cout << "[" << i << "]" << " " << "[" << closest[i].x << "," << closest[i].y << "] : " << Distance(closest[i]) << '\n';
	}
}