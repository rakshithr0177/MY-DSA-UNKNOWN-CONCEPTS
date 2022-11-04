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

vector<int> bottomView(Node* root){
	map<int, int> nodes ;
	vector<int> ans ;
	if(root == NULL){
		return ans ;
	}
	queue<pair<Node* , int>> q ;
	q.push(make_pair(root,0));

	while(!q.empty()){
		pair<Node* , int> temp = q.front();
		q.pop();
		Node* front =  temp.first;
		int hd = temp.second;
		
		nodes[hd] = front->data;
		

		if(front->left != NULL ){
			q.push(make_pair(front->left , hd - 1));
		}

		if(front->right != NULL){
			q.push(make_pair(front->right, hd+1));
		}
	}
	for(auto i : nodes){
		ans.push_back(i.second);
	}
}

int main(){
	Node* root = NULL ;
	root = buildTree(root);
	vector<int> ans  = bottomView(root);
	for(auto i : ans){
		cout<< i <<" ";
	}
}
