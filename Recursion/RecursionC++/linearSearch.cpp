#include <bits/stdc++.h>
using namespace std;

bool linearSearch(int arr[] , int size , int key){
	if(size == 0){
		return false;
	}
	else if(key == arr[0]){
		return true ;
	}
	else{
		return linearSearch(arr+1 , size-1 , key);
	}
	
}

int main(){
	int n ;
	cin >> n ;
	int arr[n];
	for(int i = 0 ; i < n ;i++){
		cin >> arr[i];
	}
	int key ;
	cin>> key;
	cout << linearSearch(arr , n , key);
	return 0;
}