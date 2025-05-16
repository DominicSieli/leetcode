package main

import "fmt"

func validParentheses(str string) bool {
	if len(str)%2 != 0 {
		return false
	}

	stack := []rune{}

	for _, character := range str {
		if character == '(' || character == '[' || character == '{' {
			stack = append(stack, character)
		}

		if len(stack) == 0 {
			if character == ')' || character == ']' || character == '}' {
				return false
			}
		}

		if len(stack) > 0 {
			if character == ')' && stack[len(stack)-1] == '(' {
				stack = stack[:len(stack)-1]
			} else if character == ')' && stack[len(stack)-1] != '(' {
				return false
			}

			if character == ']' && stack[len(stack)-1] == '[' {
				stack = stack[:len(stack)-1]
			} else if character == ']' && stack[len(stack)-1] != '[' {
				return false
			}

			if character == '}' && stack[len(stack)-1] == '{' {
				stack = stack[:len(stack)-1]
			} else if character == '}' && stack[len(stack)-1] != '{' {
				return false
			}
		}
	}

	return len(stack) == 0
}

func main() {
	str1 := "[{[]}]"
	str2 := "][}}]["
	str3 := "])}{(["
	str4 := "([{}])"

	fmt.Println(validParentheses(str1))
	fmt.Println(validParentheses(str2))
	fmt.Println(validParentheses(str3))
	fmt.Println(validParentheses(str4))
}
