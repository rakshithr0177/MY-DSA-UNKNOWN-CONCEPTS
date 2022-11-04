#include <bits/stdc++.h>
using namespace std;



void solve(vector<int> &nums , vector<int> output ,int index , vector<vector<int>> &ans){
	if(index >= nums.size()){
		ans.push_back(output);
		return ;
	}
	solve(nums , output , index + 1 , ans);
	output.push_back(nums[index]);
	solve(nums , output ,index + 1 , ans );
}

vector<vector<int>> subsets(vector<int> &nums){
	vector<vector<int>> ans ;
	vector<int> output ;
	int index  = 0  ;
	solve(nums , output ,index , ans);
	return ans ;
}






int main(){
	int n ;
	cin >> n ;
	vector<int> nums ;
	int arr [n];
	for(auto i : arr){
		cin >> i ;
	}
	for(auto i : arr){
		 nums.push_back(i) ;
	}
	vector<vector<int>> ans = subsets(nums) ;

	for(auto i : ans){
		for(int j = 0 ; j < i.size() ; j++){
			cout << i[j] << ",";
		}
		cout << endl ;
	}
}
