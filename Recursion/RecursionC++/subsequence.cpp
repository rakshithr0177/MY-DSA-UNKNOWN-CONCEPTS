#include <bits/stdc++.h>
using namespace std;

//striver's  solution

void printSubsequence(int ind , vector<int> &ds ,int arr[] , int n)
{
	if(ind == n)
	{
		cout<<"[";
		for(auto i : ds)
		{
			cout<< i << " ";
		}
		cout<< "]"<<endl ;
		return;
	}

	//exclude call 
	printSubsequence(ind+1 , ds , arr, n);

	//include  call 
	int element = arr[ind] ;
	ds.push_back(element); 
	printSubsequence(ind+ 1 , ds , arr , n);
	ds.pop_back();
}

int main()
{
	int n ;
	cin >> n ;
	int arr[n];
	for(int  i = 0 ; i< n ; i++){
		cin >> arr[i] ;
	}
	vector<int> ds;
	printSubsequence(0 , ds , arr , n);
	
}
