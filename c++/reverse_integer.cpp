#include <stdio.h>
#include <limits.h>

int ReverseInteger(int integer)
{
	int reverse = 0;
	int last_digit = 0;

	while(integer != 0)
	{
		last_digit = integer % 10;
		integer /= 10;

		if(reverse > INT_MAX / 10 || (reverse == INT_MAX / 10 && last_digit > 7)) return 0;
		if(reverse < INT_MIN / 10 || (reverse == INT_MIN / 10 && last_digit < -8)) return 0;
		reverse = reverse * 10 + last_digit;
	}

	return reverse;
}

int main()
{
	printf("%d\n", ReverseInteger(123));
	printf("%d\n", ReverseInteger(-123));
}