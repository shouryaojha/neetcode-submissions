class Solution {
    public int[] twoSum(int[] nums, int target) {
        int A[] = new int[2];
        int n=nums.length;
        Arrays.fill(A,-1);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j && nums[i]+nums[j]==target){
                    A[0]=j;
                    A[1]=i;
                    break;
                }
            }
        }
        return A;
    }
}
