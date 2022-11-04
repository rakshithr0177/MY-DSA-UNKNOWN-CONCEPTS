#include <bits/stdc++.h>
using namespace std;

class Stack{
	public:
		int *arr;
		int size;
		int top;

	Stack(int size){
		this->size = size;
		this->top = -1; 
		arr = new int[size];
	}

	bool isEmpty(){
		if(top == -1)
			return true;
		else
			return false;
	}

	bool isFull(){
		if(top == size){
			return true;
		}
		else{
			return false;
		}
	}

	void push(int element){
		if (size - top > 1)
		{
			top++;
			arr[top] = element;
		}
		else{
			cout<<"Stack Overflow"<<endl;
		}
	}

	int pop(){
		if(top >=0){
			return arr[top--];
		}else{
			cout<<"Stack Underflow"<<endl;
			return -1 ;
		}
	}

	int peek(){
		if(top >=0){
			return arr[top];
		}else{
			cout<<"Stack is empty"<<endl;
			return -1;
		}
	}
};

int main(){
	cout<<"Hello"<<endl;
	
	Stack st(5);

	st.push(22);
	// st.push(23);
	// st.push(27);
	// st.push(88);
	// st.push(23);

	cout<<st.peek()<<endl;
	cout<<st.pop()<<endl;
	cout<<st.peek()<<endl;

	cout<<st.isEmpty()<<endl;

}
