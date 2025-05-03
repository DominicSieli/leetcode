package main

import "fmt"
import "unicode"

func isAlphaNumeric(character rune) bool {
	return unicode.IsLetter(character) || unicode.IsDigit(character)
}

func isValidPalindrome(str string) bool {
	left := 0
	right := len(str) - 1

	for left < right {
		for left < right && !isAlphaNumeric(rune(str[left])) {
			left++
		}

		for left < right && !isAlphaNumeric(rune(str[right])) {
			right--
		}

		if unicode.ToLower(rune(str[left])) != unicode.ToLower(rune(str[right])) {
			return false
		}

		if left < right {
			left++
		}

		if left < right {
			right--
		}
	}

	return true
}

func main() {
	string1 := "0a"
	string2 := "ab"
	string3 := "aBba"
	string4 := "a #a c -bbc, a:  a "

	fmt.Println(isValidPalindrome(string1))
	fmt.Println(isValidPalindrome(string2))
	fmt.Println(isValidPalindrome(string3))
	fmt.Println(isValidPalindrome(string4))
}
