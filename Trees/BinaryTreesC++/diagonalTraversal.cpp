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

void solve(Node* root , map<int,vector<int>> &map ,int hd ){
	if(root == NULL){
		return ;
	}

	map[hd].push_back(root->data);

	solve(root->left , map , hd+1 );
	solve(root -> right , map , hd);

}

vector<int> diagonalTraversal(Node* root){
	vector<int> ans ;
	map<int,vector<int>> map;
	solve(root , map ,0 );
	for(auto i : map){
		for(auto j : i.second){
			ans.push_back(j);
		}
	}
	return ans;
}

int main(){
	Node* root = NULL ;
	root = buildTree(root);
	vector<int> ans  = diagonalTraversal(root);
	for(auto i : ans){
		cout<< i <<" ";
	}
}
