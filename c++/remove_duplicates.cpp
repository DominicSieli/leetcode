#include <vector>
#include <iostream>

static int RemoveDuplicates(std::vector<int>& vector)
{
	unsigned int c = 0;
	unsigned int k = vector.size();

	for(unsigned int i = 0; i < vector.size(); i++)
	{
		if(i != c && vector[i] == vector[c]) k--;

		if(vector[i] > vector[c])
		{
			c++;
			vector[c] = vector[i];
		}
	}

	return k;
}

int main()
{
	std::vector<int> vector = {1,1,1,1,2,2,2,2,3,3};

	unsigned int k = RemoveDuplicates(vector);

	for(unsigned int i = 0; i < k; i++)
	{
		std::cout << vector[i] << "\n";
	}
}
