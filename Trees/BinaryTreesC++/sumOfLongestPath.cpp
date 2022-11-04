#include <bits/stdc++.h>
using namespace std;

class Node{
	public:
		int data;
		Node* left;
		Node* right;
		Node(int d){
			this->data = d;
			this->left = NULL;
			this->right = NULL;
		}
};
Node* buildTree(Node* root){	
	int data; 
	cin>>data ;
	root = new Node(data);
	if(data == -1){
		return NULL;
	}
	

	root->left = buildTree(root->left);
	root->right = buildTree(root->right);
	return root;

}

void solve(Node *root , int sum , int length , int &ansSum ,int &ansLength){
	if(root == NULL){
		if(length > ansLength){
			ansLength = length ;
		}
		else if(length == ansLength){
			ansSum = max(sum , ansSum);
		}
		return ;
	}
	sum = sum + root->data ;
	solve(root->left , sum , length , ansSum , ansLength);
	solve(root->right , sum , length , ansSum , ansLength);
}

int sumOfLongRootToLeafPath(Node *root){
	int sum = 0 ;
	int length = 0 ;
	int ansSum = INT_MIN ;
	int ansLength = 0 ;
	solve(root , sum , length , ansSum , ansLength);
	return ansSum;
}

int main(){
	Node* root = NULL ;
	root = buildTree(root);
	cout<<sumOfLongRootToLeafPath(root)<<endl;
}
