#include <bits/stdc++.h>
using namespace std;

int sum(int arr[] , int size){
	if(size == 1){
		return arr[0] ;
	}
	int prev = sum(arr+1 , size - 1);
	return arr[0]+prev;
}

int main(){
	int n ;
	cin >> n;
	int arr[n];
	for(int i = 0 ; i < n ; i++){
		cin >> arr[i] ;
	}
	cout<< sum(arr , n);
}
