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

pair<int , int> diameter(node* root){
	pair<int , int > ans ;
	if(root == NULL){
		ans.first = 0;
		ans.second= 0 ;
		return ans ;
	}

	//this is for get checking the height
	pair<int , int > leftAns = diameter(root->left);
	pair<int , int> rightAns = diameter(root->right);
	

	int leftHeight = leftAns.first;
	int rightHeight = rightAns.first;
	int combination = leftAns.first + rightAns.first + 1;

	//Answer to be sent
	ans.first = max(leftHeight,rightHeight)+1;
	ans.second = max(leftHeight,max(rightHeight,combination)) ;
	return ans;
}

int main(){
	node* root = NULL ;
	root = buildTree(root);
	cout<<diameter(root).second<<endl;
}
