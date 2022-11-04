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

void solve(Node*root , vector<int> &ans ,int level){
	if(root == NULL){
		return ;
	}

	if(level == ans.size()){
		ans.push_back(root->data);
	}

	solve(root->left , ans , level+1);
	solve(root->right , ans , level+1);

}

vector<int> leftView(Node* root){
	vector<int> ans;
	int level = 0;
	solve(root , ans , level);
	return ans;
}

int main(){
	Node* root = NULL ;
	root = buildTree(root);
	vector<int> ans  = leftView(root);
	for(auto i : ans){
		cout<< i <<" ";
	}
}
