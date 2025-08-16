import java.util.*;
public class Two_Sum
{
    static int ans[]=new int[2];
    public static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter values of array (size:5): ");
        int c=0;
        int nums[]=new int[5];
        while(c<5)
        {
            nums[c]=sc.nextInt();
            c++;
        }
        System.out.println("Enter the target value:");
        int target=sc.nextInt();
        ans=twoSum(nums,target);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] twoSum(int[] nums, int target) 
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
}