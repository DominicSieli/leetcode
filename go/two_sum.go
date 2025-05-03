package main

import "fmt"

func twoSum(slice []int, target int) [2]int {
	cache := map[int]int{}

	for i := 0; i < len(slice); i++ {
		complement := target - slice[i]

		if _, exists := cache[complement]; exists {
			return [2]int{cache[complement], i}
		}

		cache[slice[i]] = i
	}

	return [2]int{0, 0}
}

func main() {
	slice := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}

	results := twoSum(slice, 15)

	fmt.Printf("[%d][%d]\n", results[0], results[1])
}
