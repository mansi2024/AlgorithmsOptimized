#include<iostream>
using namespace std;
int main(int x)
{ 
    cout<<"Enter number:";
        cin>>x;
    int low=1,high=x;
    int mid=low+(high-low)/2;
    while(low<=high){
      if(mid*mid==x)
      return mid;
      else if(mid*mid>x)
      high=mid-1;
      else
       low=mid+1;
      mid=low+(high-low)/2;
    }
    return mid-1;
    }
//Time Complexity: O(log N)
//Space Complexity: O(1)
