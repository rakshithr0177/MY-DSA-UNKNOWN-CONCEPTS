#include <bits/stdc++.h>
using namespace std;

bool solve(int nums[] , int k ,int n , int index , int sum ){
	if(index == n){
		if(sum == k){
			return true ;
		}
		return false ;
	}
	bool exclude = solve(nums , k , n , index + 1 , sum);
	int element = nums[index];
	bool include = solve ( nums , k , n , index+1 ,sum + element);
	return exclude||include ;
}

int main(){
	int n ;
	cin >> n ;
	int arr[n];
	for(int  i = 0 ; i< n ; i++){
		cin >> arr[i] ;
	}
	cout << solve(arr , 4 , n , 0 , 0 );
}
