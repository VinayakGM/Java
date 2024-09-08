#include <bits/stdc++.h>
using namespace std;

int main()
{
    
  int arr[]={1,3,5,2,2};
   int lsum=0;
   int rsum=0;
   for(int i=0;i<5;i++)
   {
    rsum+=arr[i];
   }
   for(int i=0;i<5;i++)
   {
    rsum-=arr[i];
    if(lsum==rsum)
    {
        cout<<rsum<<" "<<lsum<<" "<<i<<endl;
        break;
    }
    lsum+=arr[i];
   }
   cout<<-1<<endl;
   return 0;
}