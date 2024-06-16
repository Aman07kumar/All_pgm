#include<iostream>
using namespace std;
 bool isposssible( int arr[],int n, int m, int mid){
    int studentcount=1;
    int pagesum=0;

    for ( int i=0;i<n;i++){

        if (pagesum+arr[i]<=mid){

            pagesum += arr[i];
           

        }
        else {
            studentcount++;
            if (studentcount > m || arr[mid]> mid){
                return false;
            }
            pagesum = arr[i];

        }
        return true;
    }
}
int book( int arr[],int n,int m){
    int s=0;
    int sum =0;
    int ans =-1;
    for ( int i=0;i<n;i++){
        sum +=arr[i];

    }
    int e = sum;
    int mid= s+ (e-s)/2;

    while(s<=e){

        if(isposssible( arr, n, m ,mid)){
            ans= mid;
            e=mid-1;
        }
        else{
            s=mid+1;
        }
        mid= s+ (e-s)/2;
    }
    return ans;
}
int main()
{
   
    int arr[] = { 12, 34, 67, 90 };
    int n = sizeof(arr) / sizeof arr[0]; 
    int m = 2; 
 
    cout << "Minimum number of pages = "
         << book(arr, n, m) << endl;
    return 0;
}