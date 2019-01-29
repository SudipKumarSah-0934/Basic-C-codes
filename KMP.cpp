#include<bits/stdc++.h>
using namespace std;
void computeLPSArray(char pattern[], int M, int lps[])
{
    int len = 0;
    lps[0] = 0;
    int i = 1;
    while (i < M) {
        if (pattern[i] == pattern[len]) {
            len++;
            lps[i] = len;
            i++;
        }
        else {
            if (len != 0) {
                len = lps[len - 1];
            }
            else
            {
                lps[i] = 0;
                i++;
            }
        }
    }
}
void KMP(char pattern[],char text[]){
   int M = strlen(pattern);
    int N = strlen(text);
    int lps[M];
    computeLPSArray(pattern, M, lps);
    int i = 0;
    int j = 0;
    while (i < N) {
        if (pattern[j] == text[i]) {
            j++;
            i++;
        }
        if (j == M) {
            printf("Found pattern at index %d ", i - j);
            j = lps[j - 1];
        }
        else if (i < N && pattern[j] != text[i]) {
            if (j != 0)
                j = lps[j - 1];
            else
                i = i + 1;
        }
    }
}

int main()
{
    char text[] = "THIS IS A TEST TEXT";
    char pattern[] = "TEST";
    KMP(pattern,text);
    return 0;
}
