#include <iostream>
#include <bits/stdc++.h>

bool IntegerPalindrome(int integer)
{
	unsigned int exponent;
	if(integer < 0) return false;
	if(integer > 0) exponent = (int)std::log10(integer);

	while(integer != 0)
	{
		if(integer % 10 != (int)(integer / (int)std::pow(10, exponent))) return false;
		integer = integer % (int)std::pow(10, exponent);
		integer = (int)(integer / 10);
		exponent -= 2;
	}

	return true;
}

int main()
{
	std::cout << std::boolalpha << IntegerPalindrome(12122121) << "\n";
}