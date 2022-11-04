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

void levelOrder(node* root){
	queue<node*> q ;
	q.push(root);
	q.push(NULL);

	while(!q.empty()){
		node* top = q.front();
		q.pop();
		if(top == NULL){
			cout<<endl ;
			if(!q.empty()){
				q.push(NULL);
			}
		}
		else{

			cout<<top->data<<" ";
			
			if(top->left != NULL){
				q.push(top ->left);
			}
			if(top->left != NULL){
				q.push(top->right);
			}	
		}
	}

}

void preorder(node* root){
	if(root == NULL){
		return;
	}
	cout<<root->data<<" ";
	preorder(root->left);
	preorder(root->right);
}

void inorder(node* root){
	if(root == NULL){
		return;
	}
	inorder(root->left);
	cout<<root->data<<" ";
	inorder(root->right);
}

void postorder(node* root){
	if(root == NULL){
		return;
	}
	postorder(root->left);
	postorder(root->right);
	cout<<root->data<<" ";
}

void buildFromLevelOrder(node* root){
	queue<node*> q;

	int data ; 
	cin>>data;
	root = new node(data);

	q.push(root); 

	while(!q.empty()){

		node* temp = q.front() ;
		q.pop();

		int leftData ;
		cin>> leftData;

		if(leftData != -1){
			temp->left = new node(data);
			q.push(temp->left);
		}

		int rightData ;
		cin>> rightData;

		if(rightData != -1){
			temp->right = new node(rigtrata);
			q.push(temp->right);
		}
	}

}

int main(){
	node* root = NULL ;
	// root = buildTree(root);

	buildFromLevelOrder(root);

	cout<<"Levelorder Traversal"<<endl;
	levelOrder(root);

	cout<<"Preorder Traversal"<<endl;
	preorder(root);

	cout<<endl;

	cout<<"Inorder Traversal"<<endl;
	inorder(root);

	cout<<endl;

	cout<<"Postorder Traversal"<<endl;
	postorder(root);
}
