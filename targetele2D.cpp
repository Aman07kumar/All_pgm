#include<iostream>
using namespace std;
bool istarget(int arr[][3],int target,int row ,int col){
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            if (arr[i][j]==target);{
                return 1;
            }
        }
    }
    return 0;
}
int main(){
    int arr[3][3];
    cout<<"enter the value"<<endl;

    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            cin>>arr[i][j];
        }
    }
    
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            cout<<arr[j][i]<<" ";
        }
        cout<<endl;
    }
    int target;
    cout<<"enter the taget"<<endl;
    cin>>target; 
    if (istarget(arr,target,3,3)){
        cout<<"found"<<endl;
    }
    else{
        cout<<"not found"<<endl;
    }
}