/*
Transpose

Given a 2D array A, your task is to convert all rows to columns and columns to rows.

Input:
First line contains 2 space separated integers, N - total rows, M - total columns.
Each of the next N lines will contain M space separated integers.

Output:
Print M lines each containing N space separated integers.

Constraints:
1=N=10
1=M=10
0=A[i][j]=100 where 1=i=N and 1=j=M

*/
#include <iostream>
using namespace std;
int main(){
    int row,column;
    cin>>row;
    cin>>column;
    int array[row][column];
    for(int i = 0;i < row;i++){
        for(int j = 0;j < column;j++){
            cin>>array[i][j];
        }
    }
    for(int i = 0;i < column;i++){
        for(int j = 0;j < row;j++){
            cout<<array[j][i]<<" ";
        }
        cout<<"\n";
    }
    return 0;
}