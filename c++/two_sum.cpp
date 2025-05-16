#include <vector>
#include <iostream>
#include <unordered_map>

std::vector<int> TwoSum(std::vector<int>& vector, int target)
{
	std::unordered_map<int, int> cache;

	for(unsigned int i = 0; i < vector.size(); ++i)
	{
		int complement = target - vector[i];

		if(cache.find(complement) != cache.end())
		{
			return std::vector<int>({cache[complement], (int)i});
		}

		cache[vector[i]] = i;
	}

	return std::vector<int>({0, 0});
}

std::vector<int> results;
std::vector<int> vector({1,2,3,4,5,6,7,8,9});

int main()
{
	results = TwoSum(vector, 17);

	for(unsigned int integer : results)
	{
		std::cout << "[" << integer << "]";
	}

	std::cout << "\n";
}