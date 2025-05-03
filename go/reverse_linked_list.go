package main

import "fmt"

type Node struct {
	value int
	next  *Node
}

type LinkedList struct {
	head *Node
	tail *Node
}

func (list *LinkedList) pushFront(value int) {
	node := &Node{value: value, next: list.head}
	list.head = node
}

func (list *LinkedList) pushBack(value int) {
	node := &Node{value: value, next: nil}

	if list.tail == nil {
		list.head = node
	}

	if list.tail != nil {
		list.tail.next = node
	}

	list.tail = node
}

func (list *LinkedList) printList() {
	var current *Node
	current = list.head

	for current != nil {
		fmt.Printf("(%d)->", current.value)
		current = current.next
	}

	fmt.Println()
}

func (list *LinkedList) reverse() {
	current := list.head
	next := list.head.next
	var previous *Node = nil

	for current != nil {
		next = current.next
		current.next = previous
		previous = current
		current = next
	}

	list.tail = list.head
	list.head = previous
}

func main() {
	list := &LinkedList{}

	for i := 0; i < 10; i++ {
		list.pushBack(i)
	}

	list.printList()
	list.reverse()
	list.printList()
}
