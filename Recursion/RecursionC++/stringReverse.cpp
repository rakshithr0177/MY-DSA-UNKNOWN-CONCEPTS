#include <bits/stdc++.h>
using namespace std;

void stringReverse(char str[] , int i  , int j){
	if(i > j){
		return ;
	}
	char temp = str[i];
	str[i] = str[j];
	str[j] = temp ;  
	stringReverse(str , i+1  ,  j-1) ;
}

int main(){

	int n ;
	cin >> n;
	char str[n] ;
	cin >> str ;
	cout << "Before reverse " << str << endl ;
	stringReverse(str , 0 , n-1);
	cout << "After reverse "<<str << endl;
}
