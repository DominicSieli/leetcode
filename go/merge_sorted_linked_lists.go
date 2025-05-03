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

func merge(list1 *LinkedList, list2 *LinkedList) *LinkedList {
	list := &LinkedList{head: nil, tail: nil}
	node1 := list1.head
	node2 := list2.head

	for true {
		if node1 != nil && (node2 == nil || (node1.value <= node2.value)) {
			list.pushBack(node1.value)
			node1 = node1.next
			continue
		}

		if node2 != nil && (node1 == nil || (node2.value < node1.value)) {
			list.pushBack(node2.value)
			node2 = node2.next
			continue
		}

		if node1 == nil && node2 == nil {
			break
		}
	}

	return list
}

func main() {
	list1 := &LinkedList{}
	list2 := &LinkedList{}

	list1.pushBack(1)
	list1.pushBack(3)
	list1.pushBack(5)
	list1.pushBack(7)

	list2.pushBack(2)
	list2.pushBack(4)
	list2.pushBack(6)
	list2.pushBack(8)

	list1.printList()
	list2.printList()

	list := merge(list1, list2)

	list.printList()
}
