#include<iostream>
using namespace std;

int firstocc(int arr[],int n, int key){
    int s=0;
    int e=n-1;
    int ans=-1;
    int mid=s+(e-s)/2;
    
    while(s<=e){
       
        if (arr[mid] ==key){
           ans =mid;
           e=mid-1;
        }
         
        else if (key > arr[mid]){
            s=mid+1;
        }
        
        else {
            e=mid-1;
         }
        
        mid=s+(e-s)/2;
    }
    
    return ans;
}
int lastocc(int arr[],int n, int key){
    
    int s=0;
    int e=n-1;
    int ans=-1;
    int mid=s+(e-s)/2;
    
    while(s<=e){
       
        if (arr[mid] ==key){
           ans =mid;
           s=mid+1;
        }
         
        else if (key > arr[mid]){
            s=mid+1;
        }
        
        else {
            e=mid-1;
         }
        
        mid=s+(e-s)/2;
    }
    
    return ans;
}



int main() {
    
    int arr[6]={6,6,9,8,7,5};
    
    cout<<"the first occ of index 12 is " << firstocc(arr,6,6 ) <<endl;
    cout<<"the last occ of index 12 is " << lastocc(arr,6,6 ) <<endl;
    return 0;
}