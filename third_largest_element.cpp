class Solution{
  public:
  int thirdLargest (int arr[],int n)
  {
    sort(a,a+n);
    for(int i=0;i<n;i++)
    {
      if(n<3)
      {
        return -1;
      }
      else {
        return (a[n-3]);
      }
    }
  }
  };
