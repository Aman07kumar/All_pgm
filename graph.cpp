#include<iostream>
using namespace std;
int main(){

    int n,m;
    cout<<"enter the value of nodes"<<endl;
    cin>>n;
    cout<<"enter the value of edge"<<endl;
    cin>>m;
    int adj[n+1][m+1];
    for (int i=0;i<m;i++){
        int u,v;
        cin>>u>>v;
        adj[u][v]=1;
        adj[v][u]=1;

    }
    return 0;
}