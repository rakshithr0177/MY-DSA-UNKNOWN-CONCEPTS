#include <bits/stdc++.h>
using namespace std;

int main(){
	
	queue<int> q ;
	q.push(11);
	q.push(15);

	cout<<"The front element is "<< q.front()<<endl;

	q.push(13);

	cout<<"The end element is "<< q.back()<<endl;
	

	cout<<"Size of Queue is "<<q.size()<<endl;

	q.pop();
	q.pop();
	q.pop();

	cout<<"Size of Queue is "<<q.size()<<endl;

	if(q.empty()){
		cout<<"Queue is empty"<<endl;
	}
	else{
		cout<<"queue is not empty"<<endl;
	}

}
