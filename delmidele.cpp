#include<bits/stdc++.h>
using namespace std;
void slove(stack<int>&s,int k){
    if (k==1){
        s.pop() ;
        return;
    }
    int temp=s.top();
    s.pop();
    slove(s,k-1);
    s.push(temp);
}
 stack<int> delmidd(stack<int>&s,int size){
    if (s.size()==0){
        return s;
    }
    int k=size/2+1;
    slove(s,k);
return s;
}
int main(){
    stack<int>s;
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    delmidd(s,5);
  
  while (!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }





}