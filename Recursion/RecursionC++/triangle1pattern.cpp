#include <bits/stdc++.h>
using namespace std;

void pattern1(int row){
	if(row == 0){
		return ;
	}
	else{
		for (int i = 0; i < row; ++i){
			cout<< "* ";
		}
		cout<<endl ;
		pattern1(row-1);
	}
}

void pattern2(int row ,int col){
	if(row == 0){
		return;
	}
	else if(col < row){
		cout<< "* ";
		pattern2(row , col + 1);
	}
	else {
		cout<<endl; 
		pattern2(row-1 , 0);
	}
}

int main(){
	int n ;
	cin >> n ;
	pattern1(n);
	pattern2(n , 0);
}
