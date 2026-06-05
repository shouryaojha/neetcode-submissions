class Solution {
    public int[] getConcatenation(int[] nums) {
        int A[] = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            A[i] = nums[i];
            A[i+nums.length] = nums[i];
        }
        return A;
    }
}