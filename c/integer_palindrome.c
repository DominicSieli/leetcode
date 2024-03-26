#include <math.h>
#include <stdio.h>
#include <stdbool.h>

bool integer_palindrome(int integer)
{
	unsigned int exponent;
	if(integer < 0) return false;
	if(integer > 0) exponent = (int)log10(integer);

	while(integer != 0)
	{
		if(integer % 10 != (int)(integer / (int)pow(10, exponent))) return false;
		integer = integer % (int)pow(10, exponent);
		integer = (int)(integer / 10);
		exponent -= 2;
	}

	return true;
}

int main()
{
	printf("%s\n", integer_palindrome(12122121) ? "true" : "false");
}