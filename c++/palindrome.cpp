#include <string>
#include <ctype.h>
#include <iostream>

bool Palindrome(std::string string)
{
	unsigned int left = 0;
	unsigned int right = string.length() - 1;

	while(left < right)
	{
		while(left < right && !isalnum(string[left])) left++;
		while(left < right && !isalnum(string[right])) right--;
		if(tolower(string[left]) != tolower(string[right])) return false;
		if(left < right) left++;
		if(left < right) right--;
	}

	return true;
}

std::string string_1 = "0a";
std::string string_2 = "ab";
std::string string_3 = "aBba";
std::string string_4 = "a #a c -bbc, a:  a ";

int main()
{
	std::cout << std::boolalpha << Palindrome(string_1) << '\n';
	std::cout << std::boolalpha << Palindrome(string_2) << '\n';
	std::cout << std::boolalpha << Palindrome(string_3) << '\n';
	std::cout << std::boolalpha << Palindrome(string_4) << '\n';
}