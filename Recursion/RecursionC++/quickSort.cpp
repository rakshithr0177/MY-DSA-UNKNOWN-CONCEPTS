#include <bits/stdc++.h>
using namespace std;

int solve(int *arr ,int start ,int end){
	int pivot = arr[start] ;
	int i = start ; 
	int j = end ;
	while(i < j){
		if(arr[i] < pivot){
			i++;
		}
		else if(arr[j] > pivot){
			j--;
		}
		else{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp ;
		}
	}
	int temp = arr[i];
	arr[i] = pivot;
	pivot = temp ;
	return i ;
}

void quickSort(int *arr , int start ,int end){
	if(start >= end){
		return;
	}
	int pivotIndex = solve(arr , start ,end);
	quickSort(arr , start ,pivotIndex-1);
	quickSort(arr ,  pivotIndex+1 , end);
}

//Love babber solution

void swap(int *a , int *b){
	int temp = *a ;
	*a = * b ;
	*b = temp ;
}

int partition(int * arr , int start , int end ){

	int pivot = arr[start];
	int cnt = 0 ;
	for(int i = start + 1   ;  i  <= end ; i++){
		if(arr[i] <= pivot){
			cnt++;
		}
	}
	//place pivot at right position
	int pivotIndex = start + cnt ;
	swap(arr[pivotIndex] , arr[start]) ;

	//left  and right part
	int i =  start , j  = end ;

	while(i < pivotIndex && j > pivotIndex){
		while(arr[i] < pivot){
			i++;
		}
		while(arr[j] > pivot){
			j--;
		}

		if(i < pivotIndex && j > pivotIndex){
			swap(arr[i], arr[j]);
		}
	}
	return pivotIndex;
}

void loveQuickSort(int * arr , int start , int end){
	if(start >= end){
		return;
	}
	int p = partition(arr , start , end );
	loveQuickSort(arr , start , p -  1);
	loveQuickSort(arr , p + 1 , end);
}



int main(){
	int  n;
	cin >> n ;
	int arr[n];
	for(int i = 0 ; i < n ; i++){
		cin >> arr[i] ;
	}
	loveQuickSort(arr , 0 , n-1);
	for(int i = 0 ; i < n ; i++){
		cout << arr[i] << " " ;
	}
}
