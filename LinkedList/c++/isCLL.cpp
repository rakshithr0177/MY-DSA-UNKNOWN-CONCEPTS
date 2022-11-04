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


bool isCircularLL(Node* head){
    //no element
    if (head == NULL)
    {
        return true ;
    }

    // Only one element
    else if(head->next == NULL){
        return false;
    }

    Node* curr = head->next;

    while(curr != NULL && curr != head){
        curr = curr->next;
    }
    if (curr == head)
    {
        return true;
    }
    return false;
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

    if (noOfNodes%2 == 0)
    {
        tail->next = head ;
    }

    

    bool ans = isCircularLL(head);
    cout<< ans ;

    
}