#include <vector>
#include <iostream>

int BinarySearch(std::vector<int>& vector, int target)
{
	int left = 0;
	int median = 0;
	int right = vector.size() - 1;

	if(target < vector[left] || target > vector[right]) return -1;

	while(left <= right)
	{
		median = left + (right - left) / 2;

		if(vector[left] == target) return left;
		if(vector[right] == target) return right;
		if(vector[median] == target) return median;
		if(vector[median] < target) left = median + 1;
		if(vector[median] > target) right = median - 1;
	}

	return -1;
}

std::vector<int> vector({0,1,2,3,4,5,6,7,8,9});

int main()
{
	for(unsigned int i = 0; i < vector.size(); i++)
	{
		std::cout << i << ": " << BinarySearch(vector, i) << '\n';
	}
}