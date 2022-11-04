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

bool isIdenticalTree(node* root1 , node* root2){
	if(root1 == NULL && root2 == NULL){
		return true;
	}
	if(root1 == NULL && root2 != NULL){
		return false;
	}
	if(root1 != NULL && root2 == NULL){
		return false;
	}
	bool leftAns = isIdenticalTree(root1->left,root2->left);
	bool rightAns =  isIdenticalTree(root1->right,root2->right);
	bool condition = (root1->data == root2->data);

	return leftAns && rightAns && condition;
}

int main(){
	node* root1 = NULL ;
	root1 = buildTree(root1);
	node* root2 = NULL ;
	root2 = buildTree(root2);
	cout<<isIdenticalTree(root1,root2)<<endl;
}
