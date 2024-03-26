#include <stdio.h>

static int remove_duplicates(int* array, int size)
{
	int c = 0;
	int k = size;

	for(int i = 0; i < size; i++)
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

int main()
{
	int array[] = {1,1,1,1,2,2,2,3,3,3};
	int size = sizeof(array) / sizeof(int);

	int k = remove_duplicates(array, size);

	for(int i = 0; i < k; i++)
	{
		printf("%d\n", array[i]);
	}
}
