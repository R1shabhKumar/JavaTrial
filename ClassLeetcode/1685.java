import java.util.Arrays;

class Solution {
    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i = 0;i<n;i++){
            int diff = 0;
            for(int j=0;j<n;j++){
                diff += Math.abs(nums[i] - nums[j]);
            }
        res[i] = diff;
        diff = 0;
        } 
        return res;
    }
    public static int[] getSumAbsoluteDifferences2(int[] nums){
        int[] pre;
        int[] suff;
        int n = nums.length;
        pre = new int[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = nums[i] + pre[i-1];
        }

        suff = new int[n];
        suff[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            suff[n-i-1] = suff[n-1] + nums[n-i-1];
        }


        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = (i*nums[i] - pre[i]) + (suff[i]-(n-i-1)*nums[i]);
        }
        return res;
        
    }

    public static void main(String[] args) {
        int[] nums = {2,3,5};
        System.out.println(Arrays.toString(getSumAbsoluteDifferences2(nums)));
    }
}