#include <iostream>

struct Node
{
	int data;
	Node* next;
	Node() : data(0), next(nullptr) {}
	Node(int x) : data(x), next(nullptr) {}
	Node(int x, Node* next) : data(x), next(next) {}
};

Node* MergeTwoListsIterative(Node* list_1, Node* list_2)
{
	Node* node = nullptr;
	Node* head = nullptr;
	Node* tail = nullptr;

	if(list_1 != nullptr && list_2 == nullptr) return list_1;
	if(list_1 == nullptr && list_2 != nullptr) return list_2;

	while(list_1 != nullptr && list_2 != nullptr)
	{
		node = (list_1->data < list_2->data) ? list_1 : list_2;
		if(tail == nullptr) head = node; else tail->next = node; tail = node;
		if(list_1->data < list_2->data) list_1 = list_1->next; else list_2 = list_2->next;
	}

	if(list_1 != nullptr) {tail->next = list_1; tail = list_1;}
	if(list_2 != nullptr) {tail->next = list_2; tail = list_2;}

	return head;
}

Node* MergeTwoListsRecursive(Node* list_1, Node* list_2)
{
	if(list_1 == nullptr) return list_2;
	if(list_2 == nullptr) return list_1;
	if(list_1->data < list_2->data) {list_1->next = MergeTwoListsRecursive(list_1->next, list_2); return list_1;}
	if(list_1->data >= list_2->data) {list_2->next = MergeTwoListsRecursive(list_1, list_2->next); return list_2;}
	return nullptr;
}

Node* list_1 = nullptr;
Node* list_2 = nullptr;

int main()
{
	for(int i = 10; i > 0; i--)
	{
		Node* node = new Node(i, list_1);
		list_1 = node;
	}

	for(int i = 10; i > 0; i--)
	{
		Node* node = new Node(i, list_2);
		list_2 = node;
	}

	Node* list = MergeTwoListsIterative(list_1, list_2);

	while(list != nullptr)
	{
		std::cout << list->data << '\n';
		list = list->next;
	}
}