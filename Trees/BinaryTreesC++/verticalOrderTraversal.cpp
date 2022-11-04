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

vector<int> verticalTraversal(node* root){
	map<int , map<int,vector<int>>> nodes ;
	vector<int> ans ;

	if(root == NULL){
		return ans;
	}

	queue<pair<node*,pair<int , int >>> q ;

	q.push(make_pair(root , make_pair( 0 , 0 )));

	while(!q.empty()){
		pair<node*,pair<int , int >> temp = q.front();
		q.pop();
		node* front  = temp.first;
		int hd = temp.second.first;
		int level =  temp.second.second ;
		int data = front->data;
		nodes[hd][level].push_back(data);

		if(front->left != NULL){
			q.push(make_pair(front->left,make_pair(hd-1,level+1)));
		}
		if(front->right != NULL){
			q.push(make_pair(front->right,make_pair(hd+1,level+1)));
		}
	}
	for(auto i : nodes){
		for(auto j : i.second){
			for(auto k : j.second){
				ans.push_back(k);
			}
		}
	}
	return ans ;
}

int main(){
	node* root = NULL ;
	root = buildTree(root);
	vector<int> ans  = verticalTraversal(root);
	for(auto i : ans){
		cout<< i <<" ";
	}
}
