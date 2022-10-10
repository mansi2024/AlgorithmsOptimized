import java.util.Arrays;
public class Firstandlastposition {
    public static void main(String[] args) {
      int[] arr={5,7,7,7,7,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(range(arr,target)));
    }
     public   static int[] range(int[] nums,int target)
    {

        int[] ans={-1,-1};
        int start=Search(nums,target,true);
        int end=Search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;


    }
    static int Search(int[] nums,int target,boolean firstindex)
        {
            int ans=-1;
            int start=0;
            int end=nums.length-1;
            while (start<end)
            {
                int mid=start+(end-start)/2;
                if(target<nums[mid])
                    end=mid-1;
                if (target>nums[mid])
                    start=mid+1;
                else {
                    ans=mid;
                    if(firstindex)
                        end=mid-1;
                    else
                        start=mid+1;
                }
            }
            return ans;
        }



}
