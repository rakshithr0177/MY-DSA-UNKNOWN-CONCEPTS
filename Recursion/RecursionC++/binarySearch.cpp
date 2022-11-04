#include<iostream>
using namespace std;


bool binarySearch(int arr[] , int key , int low ,int high){
	if(low > high){
		return false ;
	}
	int mid = (low + high)/2 ; 
	if(arr[mid] == key){
		cout <<"Position of "<<key<< " is " <<mid+1 <<endl;
		return true ;
	}
	else if(key < arr[mid]){
		return binarySearch(arr , key , low , mid-1 );
	}
	else if( key > arr[mid]){
		return binarySearch(arr , key , mid+1 , high);
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
	cout << binarySearch(arr , key ,0 , n-1);


	return 0;
}