#include<bits/stdc++.h>
using namespace std;
#define N 4
void transpose(int arr[][N],int t[][N]){

    for (int i=0 ; i<N ;i++){
        for (int j=0 ; j<N ;j++){
            t[i][j]=arr[j][i];
        }
    }
}
int main(){
int A[N][N] = { { 1, 1, 1, 1 },
                    { 2, 2, 2, 2 },
                    { 3, 3, 3, 3 },
                    { 4, 4, 4, 4 } };
 
    
    int B[N][N], i, j;
    transpose(A,B);
     cout << "Result \n ";
    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++)
            cout << " " << B[i][j];
 
        cout << "\n";
    }
    return 0;
}
