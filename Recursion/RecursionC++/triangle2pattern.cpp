#include <bits/stdc++.h>
using namespace std;

void pattern(int row , int col){
	if(row == 0){
		return ;
	}
	else if(row > col){
		pattern(row , col + 1);
		cout<<"* ";
	}
	else{
		pattern(row - 1, 0);
		cout<<endl;
	}
}

void pat(int row , int col ,int n){
	if(row == n){
		return;
	}
	else if(row >= col){
		cout<<"* ";
		pat(row , col+1 ,n);
	}
	else{
		cout<<endl;
		pat(row + 1 , 0 ,n);
	}
}

int main(){
	int n ;
	cin >> n ;
	// pattern(n , 0);
	pat(0,0,n);
}
