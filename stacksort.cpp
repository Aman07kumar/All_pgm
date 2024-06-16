#include<bits/stdc++.h>
using namespace std;
void inserting(stack<int>&s,int temp){
    if (s.size()==0 || s.top()<=temp){
        s.push(temp);
        return ;
    }
    int val=s.top();
    s.pop();
    inserting(s,temp);
    s.push(val);
   
}
void sorting(stack<int>&s){
    if (s.size()==0){
        return;
    }
    int temp=s.top();
    s.pop();
    sorting(s);
    inserting(s,temp);
}

int main(){
    stack<int>s;
    s.push(0);
    s.push(1);
    s.push(5);
    s.push(2);
     sorting(s);
    //  Print(s);

    // for( int i =0;i<s.size();i++){
        // cout<<s[i]<<endl;
    // }
     while (!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }

    return 0;

}