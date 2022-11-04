#include <bits/stdc++.h>
using namespace std;

void bubblesort(int arr[] , int size){
	if (size == 0 || size == 1){
		return;
	}
	for(int i = 0 ;  i< size-1 ; i++){
		if(arr[i] > arr[i+1]){
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
	}

	bubblesort(arr , size - 1);
}

void sorting(int *arr , int passes ,int currIndex){
	if(passes == 1){
		return;
	}
	if(currIndex < passes){
		if(arr[currIndex] > arr[currIndex+1]){
			int temp = arr[currIndex];
			arr[currIndex] =  arr[currIndex+1];
			arr[currIndex+1] = temp;
		}
		sorting(arr , passes ,currIndex+1);
	}
	else{
		sorting(arr ,passes-1 , 0);
	}
}

int main(){
	int  n;
	cin >> n ;
	int arr[n];
	for(int i = 0 ; i < n ; i++){
		cin >> arr[i] ;
	}
	for(int i = 0 ; i < n ; i++){
		cout << arr[i] << " " ;
	}
	
	cout<<endl;
	sorting(arr , n ,0);
	cout<<"bubble sort second"<<endl;
	for(int j = 0 ; j < n ; j++){
		cout << arr[j] << " ";
	}

	cout << endl ;
	bubblesort(arr , n );
	cout<<"bubble sort first"<<endl;
	for(int j = 0 ; j < n ; j++){
		cout << arr[j] << " ";
	}
	
	
}
