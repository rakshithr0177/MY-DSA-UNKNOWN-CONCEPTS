#include <bits/stdc++.h>
using namespace std;


class Node
{
    public:
    	int data;
    	Node* next;

    	Node(int d)
    	{
    		this->data = d;
    		this->next = NULL;
    	}
};

Node* reverseList(Node *head)
{
        if(head->next == NULL){
        	return head;
        }
        Node* newNode  = reverseList(head->next);
        head->next->next = head;
        head->next=NULL;
        return newNode;
}

void printList(Node* head)
{
	Node* temp = head;
    while (temp != NULL) {
        cout << temp->data << "-> ";
        temp = temp->next;
    }
}

int main(){

	int noOfNodes , firstData ,remData;
	Node* head =NULL ;
	Node* tail =NULL;

	cin>>noOfNodes;

	cin>>firstData;

	head = new Node(firstData);
	tail = head;

	for (int i = 1; i < noOfNodes; ++i)
	{
		cin>>remData;
		tail->next = new Node(remData);
		tail = tail->next;
	}

	head = reverseList(head);
	printList(head);
	cout<<"null";
	
}
