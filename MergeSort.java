    import java.util.Scanner;

    class MergeSort
    {
        static void printArray(int arr[])
        {
            StringBuffer sb=new StringBuffer("");
            int n = arr.length;
            for (int i=0; i<n; ++i)
                sb.append(arr[i]+" ");
            System.out.println(sb.toString());
        }
    
        
    
        public static void main(String args[])
        {
            //taking input using Scanner class
            Scanner in = new Scanner(System.in);
            
            //taking testcases
            int T = in.nextInt();
            while(T>0)
            {
                //taking elements count
                int n = in.nextInt();
                
                //creating an object of class MergeSort
                MergeSort ms = new MergeSort();
                
                //creating an array of size n
                int arr[] = new int[n];
                
                //adding elements to the array
                for(int i=0;i<n;i++)
                    arr[i] = in.nextInt();
    
                Solution g = new Solution();
              
                g.mergeSort(arr,0,arr.length-1);
    
                ms.printArray(arr);
            T--;
            }
        }
    }
    

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         int res[]= new int[r-l+1];
         int ind1=l;
         int ind2=m+1;
         int pos=0;
         while(ind1<=m && ind2<=r)
         {
             if(arr[ind1]<=arr[ind2])
              res[pos++]=arr[ind1++];
              else
              res[pos++]=arr[ind2++];
         }
         while(ind1<=m)
         {
             res[pos++]=arr[ind1++];
         }
         while(ind2<=r)
         {
             res[pos++]=arr[ind2++];
         }
         int j=l;
         for(int i=0;i<res.length;i++)
         {
             arr[j++]=res[i];
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
       if(l>=r)
       return;
       int mid= (r-l)/2+l;
       mergeSort(arr,l,mid);
       mergeSort(arr,mid+1,r);
       merge(arr,l,mid,r);
    }
}