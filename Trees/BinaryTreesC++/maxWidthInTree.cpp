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

int maxWidth(Node *root){
	if(root == NULL){
		return 0;
	}
	int widthAns = 0 ;
	queue<pair<Node* , int>> q ;
	q.push({root, 0});

	while(!q.empty()){

		int min = q.front().second;
		int size = q.size();

		int firstIndex = 0 , lastIndex = 0 ;

		for (int i = 0; i < size; i++){

			Node* node = q.front().first;
			int curr_id = q.front().second - min ;
			q.pop();
			
			if(i == 0){
				firstIndex = curr_id ; 
			}
			if(i == size - 1){
				lastIndex = curr_id ; 
			}

			if(node->left != NULL){
				q.push({root->left , (curr_id * 2 + 1) });
			}
			if(node->right != NULL){
				q.push({root->right , (curr_id * 2 + 2) });
			}
		}
		widthAns = max(widthAns , (firstIndex - lastIndex + 1));
		

	}
	return widthAns;

}

int main(){
	Node* root = NULL ;
	root = buildTree(root);
	cout<<maxWidth(root)<<endl;
}
