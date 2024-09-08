#include<bits/stdc++.h>
using namespace std;
int main() 
{
vector<int>nums={1,2,3,4};
  int n=nums.size();
        vector<int>ans(n);
        vector<int>p(n);
        vector<int>s(n);
        p[0]=1;
        for(int i=1;i<n;i++)
        {
            p[i]=p[i-1]*nums[i-1];
        } 
        for(int i=0;i<n;i++)
        {
            cout<<p[i]<<endl;
        }  
        return 0; 
    
}