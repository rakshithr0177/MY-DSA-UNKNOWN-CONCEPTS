#include <bits/stdc++.h>
using namespace std;

bool isValid(vector<vector<char>> &board , int row ,int col , char c){
	for(int i = 0 ; i < 9 ; i++){
		if(board[row][i] == c){
			return false;
		}
		if(board[i][col] == c){
			return false;
		}
		if(board[3*(row/3)+i/3][3*(col/3)+i%3] == c){
			return false;
		}
	}
	return true;
}

bool solve(vector<vector<char>> &board)
{
	for(int i = 0 ; i < board.size() ; i++)
    {
		for(int j = 0 ; j < board.size() ; j++)
        {
			if(board[i][j] == '.')
            {
				for(char c = '1' ; c <='9'; c++)
                {
					if(isValid(board, i , j ,c))
                    {
						board[i][j] = c ;
                        if(solve(board) == true)
                        {
						    return true;
					    }
					    else{
						    board[i][j]='.';
					    }
					}
					
				}
				return false;
			}
		}
	}
	return true;
}
    void solveSudoku(vector<vector<char>>& board) {
        solve(board);

        for(int i  = 0 ; i < board.size(); i++){
        	for(int j = 0 ;  j < board.size() ; j++){
        		cout << board[i][j] << " ";
        	}
        	cout<<endl ;
        }

    }

int main(){

	int n ;
	cin >> n ;

	vector<vector<char>> board ;
	for (int i = 0; i < n; i++)
	{
		vector<char> s;
		for (int j = 0; j < n; j++)
		{
			char c; 
			cin >> c;
			s.push_back(c);
		}
		board.push_back(s);
	}

	solveSudoku(board);
	
}