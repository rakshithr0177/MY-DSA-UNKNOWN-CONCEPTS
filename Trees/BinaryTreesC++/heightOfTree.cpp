#include <bits/stdc++.h>
using namespace std;

class node{
	public:
		int data;
		node* left;
		node* right;
		node(int d){
			this->data = d;
			this->left = NULL;
			this->right = NULL;
		}
};
node* buildTree(node* root){	
	int data; 
	cin>>data ;
	root = new node(data);
	if(data == -1){
		return NULL;
	}
	

	root->left = buildTree(root->left);
	root->right = buildTree(root->right);
	return root;

}

int height(node* root){
	if(root == NULL){
		return 0;
	}
	int leftHeight = height(root->left);
	int rightHeight = height(root->right);
	int ans = max(leftHeight,rightHeight)+1;
	return ans;

}

int main(){
	node* root = NULL ;
	root = buildTree(root);
	cout<<height(root)<<endl;
}
