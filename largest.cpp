#include<iostream>
using namespace std;
int maxelement(int arr[],int n)
{
    int max1 = arr[0];
    int max2 = -1;

   
    for( int i=0 ;i<n ;i++){
        if (arr[i] > max1)
          max1=arr[i];
    }
    
    for(int i=0;i<n;i++){
        if(max2 < arr[i] && max1!=arr[i]){
            max2=arr[i];
        }


    }
    return max2;

}
 int main(){
    int arr[5]={8,24,56,43,4};
    cout<<"the largest element in an array iss "<<maxelement(arr,5)<<endl;
    return 0;

 }