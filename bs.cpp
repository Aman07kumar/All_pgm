#include<iostream>
#include<vector>
using namespace std;
int bs(vector<int>v,int key)
{
    int s=0;
    int e=v.size()-1;
    int mid =s+(e-s)/2;

    while (s<=e){

        if (key == v[mid]){
           return mid;
        }
        

        if (v[mid] < key){
            s=mid+1;
        }
        else{
            e=mid-1;

        }
        mid =s+(e-s)/2;
    }

    return -1 ;

}
int print(int v){

        cout<<v<<" ";

    cout<<endl;
}


int main(){

    vector<int>v;

    v.push_back(5);
    v.push_back(6);
    v.push_back(7);
    v.push_back(8);
    v.push_back(9);

    int ans=bs(v,7);
    print (ans);



return 0;


}