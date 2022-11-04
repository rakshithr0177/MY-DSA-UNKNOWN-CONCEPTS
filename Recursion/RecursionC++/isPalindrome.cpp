#include <bits/stdc++.h>
using namespace std;

bool isPalindrome(char arr[] , int i ,int j){
	if(i > j){
		return true;
	}
	else if(arr[i]!=arr[j]){
		return false ;
	}
	else{
		return isPalindrome(arr , i+1 ,  j-1 );
	}
}


int main(){
	int n ;
	cin >> n ;
	char arr[n] ;
	for(int i =0 ; i< n ; i++){
		cin >> arr[i] 
	}
	cout<< "isPalindrome: " << isPalindrome(arr , 0 , n-1);
}
