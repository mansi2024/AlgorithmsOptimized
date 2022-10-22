int getMinDiff(int arr[],int n);
{
sort(arr,arr+n);
  int res=INF;
  for(int i=1;i<n;i++)
  res=min(res,arr[i]-arr[i-1]);
  return res;
}
