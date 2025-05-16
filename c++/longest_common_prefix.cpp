#include <string>
#include <vector>
#include <iostream>

std::string LongestCommonPrefix(std::vector<std::string>& strings)
{
	unsigned int i = strings[0].length();

	for(unsigned int string = 0; string < strings.size() - 1; string++)
	{
		for(unsigned int character = 0; character < i; character++)
		{
			if(character >= strings[string].length()) {i = strings[string].length(); break;}
			if(character >= strings[string+1].length()) {i = strings[string+1].length(); break;}
			if(strings[string][character] != strings[string+1][character]) i = character;
		}
	}

	return strings[0].substr(0, i);
}

std::vector<std::string> string_1({"a"});
std::vector<std::string> string_2({"",""});
std::vector<std::string> string_3({"ab","a"});
std::vector<std::string> string_4({"flower","flow","flight"});

int main()
{
	std::cout << LongestCommonPrefix(string_1) << '\n';
	std::cout << LongestCommonPrefix(string_2) << '\n';
	std::cout << LongestCommonPrefix(string_3) << '\n';
	std::cout << LongestCommonPrefix(string_4) << '\n';
}