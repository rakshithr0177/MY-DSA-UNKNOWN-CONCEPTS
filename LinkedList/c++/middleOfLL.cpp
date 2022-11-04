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

int getMiddle(Node* head) {
    if (head == NULL)
    {
        return -1;
    }
    if (head->next == NULL)
    {
        return head->data;
    }
    if (head->next->next == NULL)
    {
        return head->next->data;
    }

    Node* fast = head->next;
    Node* slow = head;

    while(fast!=NULL){
        fast = fast->next;
        if (fast!=NULL)
        {
            fast = fast->next;
        }
        slow = slow->next;
    }
    return slow->data;
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

    

    int ans = getMiddle(head);
    cout<< ans ;

    
}