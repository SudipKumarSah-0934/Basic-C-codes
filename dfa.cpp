#include<bits/stdc++.h>
using namespace std;
int main()
{
    char str[10],t[10],t1[10];
    char state='a';
    for(int j=0;j<2;j++){
    cout<<"enter transition for state A\n";
    cin>>t[j];
    cout<<"enter transition for state B\n";
    cin>>t1[j];
    }
    cout<<"enter string\n";
    cin>>str;
    for(int i=0;i<str[i]!='\0';i++){
        switch(state){
            case 'a':
                        if(str[i]=='0') state = t[0];
                        else if(str[i]=='1') state = t[1];
                        cout<<state;
                        break;

           case 'b':

                        if(str[i]=='0') state = t1[0];
                        else if(str[i]=='1') state = t1[1];
                        cout<<state;
                        break;
           }
    }
    if(state =='b') cout<<"\naccepted\n";
    else{
        cout<<"\nrejected\n";
    }
    return 0;
}


