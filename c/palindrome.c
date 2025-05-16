#include <stdio.h>
#include <ctype.h>
#include <string.h>
#include <stdbool.h>

bool palindrome(char* string)
{
	unsigned int left = 0;
	unsigned int right = strlen(string) - 1;

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

char* string_1 = "0a";
char* string_2 = "ab";
char* string_3 = "aBba";
char* string_4 = "a #a c -bbc, a:  a ";

int main()
{
	printf("%s\n", palindrome(string_1) ? "true" : "false");
	printf("%s\n", palindrome(string_2) ? "true" : "false");
	printf("%s\n", palindrome(string_3) ? "true" : "false");
	printf("%s\n", palindrome(string_4) ? "true" : "false");
}