#include <bits/stdc++.h>

using namespace std;

string replaceSpaces(string str){
    
	 /*l = str.length();
    string rep = "@40";
    for(int i = 0; i<1 ; i++)
    {
        if(str[i]==' ')
        {
            str.replace(i,l,rep);
        }
    }
    return str;
}*/
    


    //int spaces_count = 0;
    int length = str.length();
    string temp[l] ="";                   
    //cout<<temp.length()<<endl;
    for(int i  = 0 ; i < str.length() ; i++){
        if(str[i] == ' ' ){
            temp[i]='@';
            temp[i+1]='@';
            temp[i+2]='@';
            
        }
        else{
            temp[i]=str[i];
        }
    }
    return temp;
    
    //int new_length = length + spaces_count *  2 + 1;
    
   // int index = new_length - 1;
    
    //str[index] = '\0';
   // index--;
    
   /* for(int j = 0 ; j <=length - 1 ; j++){
        if(str[j] == ' '){
            str[index] = '0';
            str[index-1] = '4';
            str[index-2] = '@';
            index = index - 3;
        }
        else{
            str[index] = str[j];
            index--;
        }
    }
    
    return str;*/
}

int main() {

    cout << replaceSpaces("My name is Khan");
}