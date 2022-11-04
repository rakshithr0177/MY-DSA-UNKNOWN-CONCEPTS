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


    Node* floydsAlgo(Node* &head){
        if(head == NULL){
            return NULL;
        }
        Node* slow = head ;
        Node* fast = head ;

        while(fast != NULL)
        {
            fast = fast->next;

            if (fast != NULL){
                fast = fast->next;
                slow = slow->next;
            }
            if (slow == fast){
                return fast;
            }
        }
        return NULL;
}


Node* getStartingNode(Node* head){
    if (head == NULL)
    {
        return NULL;
    }
    Node* slow = head ;
    Node* interSec = floydsAlgo(head);

    if (interSec == NULL)
    {
        return NULL;
    }

    while(slow != interSec ){
        interSec = interSec->next;
        slow = slow->next;
    }
    return slow;
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
        tail->next = head->next->next ;
    }

    

    Node* ans = getStartingNode(head);
    cout<< ans->data ;

    
}