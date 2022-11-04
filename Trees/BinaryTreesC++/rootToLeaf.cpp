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
void solve(Node* root , vector<int> curr , vector<vector<int>> &ans){
	if(root == NULL){
		return;
	}

	curr.push_back(root->data);

	if(root->left==NULL && root->right == NULL){
		ans.push_back(curr);
		return;
	}

	solve(root->left , curr , ans);
	solve(root->right , curr ,ans);

}

vector<vector<int>> paths(Node* root){
	vector<vector<int>> ans ;
	vector<int> curr;
	solve(root , curr ,ans);
	return ans;
}



int main(){
	Node* root = NULL ;
	root = buildTree(root);
	vector<vector<int>> ans  = paths(root);
	for(auto i : ans){
		for(auto j : i){
			cout<< j <<" ";
		}
		cout<<endl;
	}
	
}
