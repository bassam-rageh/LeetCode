class Solution {
    public int[] productExceptSelf(int[] nums) {
        long x=1;
        int[] ans = new int[nums.length];
        boolean hasZero = false;
        for(int i: nums){
            if(!hasZero && i==0){
                hasZero = true;
            }else{
                x*=i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(hasZero){
                if(nums[i]==0){
                    ans[i] = (int) x;
                }
                else{
                    ans[i] = 0;
                }
            }else{
                ans[i] = (int) (x/nums[i]);
            }
        }
        return ans;
    }
}