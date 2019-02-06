#include<bits/stdc++.h>
using namespace std;
void Palindrome(char str[30])
{
	int i=0;
	int len=strlen(str)-1;
	while(len>i)
	{
		if(str[i++]==str[len--])
		{
			printf("Palindrome");
			return;
		}
	}
	printf("not Palindrome");
}
int main()
{
    char str[30];
    cout<<"enter string\n";
    cin>>str;
    Palindrome(str);
	return 0;
}
