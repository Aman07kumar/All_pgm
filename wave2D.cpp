#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<vector<int>> arr ;
    arr.push_back(3);
    arr.push_back(2);
    arr.push_back(3);
    arr.push_back(2);
    arr.push_back(3);
    arr.push_back(2);
    arr.push_back(3);
    arr.push_back(2);
    arr.push_back(4);
    
    cout<<endl<<"Given 2D Array"<<endl;
    for(int row=0; row<arr.size(); row++){
        for(int col=0; col<arr.size(); col++){
            cout<<arr[row][col]<<" ";
        } cout<<endl;
    }
    
    cout<<endl<<"wave print"<<endl;
    
    for(int col=0; col<arr.size(); col++){
        if(col & 1){
            for(int row=arr.size()-1; row>=0; row--){
                cout<<arr[row][col]<<" ";
            }
        } else {
            for(int row=0; row<arr.size(); row++){
                cout<<arr[row][col]<<" ";
            }
        }
    }
    
    
 return 0;
}