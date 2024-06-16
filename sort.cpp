#include <bits/stdc++.h>
using namespace std;
int main(){

    int arr[8]={1,7,8,3,6,22,9,0};
    int n = sizeof(arr) / sizeof(arr[0]); 

    sort(arr,arr+n);
    cout << "array after sorting"<<endl;
    for (int i = 0; i < n; ++i)
        cout << arr[i] << " ";
  
    return 0;
}