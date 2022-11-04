#include <bits/stdc++.h>
using namespace std;

void merge(int *arr ,int start ,int end){
	int mid  = (start+ end) / 2;

	int len1 = mid - start + 1;
	int len2 = end - mid ;
	int *first = new int[len1] ;
	int *second =  new int[len2] ;
	int k = start;

	for(int i = 0 ; i < len1 ;i++){
		first[i] = arr[k++];
	}
	k = mid + 1;
	for(int i = 0 ; i < len2 ;i++){
		second[i] = arr[k++];
	}

	int index1  = 0 ;
	int  index2 =  0 ;
	k = start ;

	while(index1 < len1 && index2 < len2){
		if(first[index1] < second[index2]){
			arr[k] = first[index1] ;
			index1++;
		}
		else if(first[index1] > second[index2]){
			arr[k] = second[index2] ;
			index2++;
		}
		k++;
	}
	while( index1 < len1){
		arr[k] = first[index1] ;
		index1++;
		k++;
	}
	while( index2 < len2){
		arr[k] = second[index2] ;
		index2++;
		k++;
	}

}

void mergeSort(int *arr , int start ,int end){
	if(start >= end){
		return;
	}
	int mid = (start + end)/2 ;
	mergeSort(arr , start , mid);
	mergeSort(arr , mid+1 ,end );
	merge(arr , start , end);
}

int main(){
	int  n;
	cin >> n ;
	int arr[n];
	for(int i = 0 ; i < n ; i++){
		cin >> arr[i] ;
	}
	mergeSort(arr , 0 , n);
	for(int i = 0 ; i < n ; i++){
		cout << arr[i] << " " ;
	}
}
