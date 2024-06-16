#include<iostream>
#include<vector>
using namespace std;
int first(vector<int>v,int key){

    int s = 0;
    int e = v.size()-1;
    int mid = s+(e-s)/2;
    int ans =-1;

    while (s<=e){

        if (key == v[mid]){
            ans= mid;
            e = mid-1;

        }
        if (key > v[mid]){
            e = mid-1;
        }
        else{
            s =mid+1;
        }
        mid = s+(e-s)/2;

    }
    return ans;

}
int last(vector<int>v,int key){

    int s = 0;
    int e = v.size()-1;
    int mid = s+(e-s)/2;
    int ans =-1;

    while (s<=e){

        if (key == v[mid]){
            ans= mid;
            s = mid+1;

        }
        if (key > v[mid]){
            e = mid-1;
        }
        else{
            s =mid+1;
        }
        mid = s+(e-s)/2;

    }
    return ans;

}

int print(int v){

        cout<<v<<" ";

    cout<<endl;
}
int main(){
    vector<int>v;
    v.push_back(2);
    v.push_back(4);
    v.push_back(10);
    v.push_back(10);
    v.push_back(10);
    v.push_back(14);

    int first1=first(v,10);
    int last1=last(v,10);
    
    int ans =(last1-first1) +1;
    print(ans);


    return 0;

}