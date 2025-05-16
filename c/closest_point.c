#include <math.h>
#include <stdio.h>

struct point_t
{
	int x;
	int y;
};

double distance(struct point_t point)
{
	return sqrt(pow(fabs((double)point.x), 2) + pow(fabs((double)point.y), 2));
}

struct point_t closest_point(struct point_t* points, unsigned int size)
{
	struct point_t point = {0,0};
	if(size == 0) return point;
	point = points[0];

	for(unsigned int i = 0; i < size; i++)
	{
		if(distance(points[i]) < distance(point)) point = points[i];
	}

	return point;
}

struct point_t points[] = {{2,3},{4,9},{10,10},{1,1}};
unsigned int size = sizeof(points) / sizeof(struct point_t);

int main()
{
	struct point_t point = closest_point(points, size);
	printf("closest point: [%d,%d]\n", point.x, point.y);
}