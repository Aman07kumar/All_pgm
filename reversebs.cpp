#include<iostream>
#include<vector>
using namespace std;

int rbs(vector<int>v,int key){

    int s = 0;
    int e = v.size()-1;
    int mid = s + (e-s)/2;

    while(s<=e){

        if (v[mid]==key){

            return mid;
        }
       if (v[mid] < key) {
        e =mid -1;

       }
       else{
         s =mid+1;
       }
       mid = s + (e-s)/2;
    }
    return -1;
}

int print(int v){

        cout<<v<<" ";

    cout<<endl;
}


int main(){

    vector<int>v;

    v.push_back(9);
    v.push_back(8);
    v.push_back(7);
    v.push_back(6);
    v.push_back(5);

    int ans=rbs(v,5);
    print (ans);

    return 0;
}