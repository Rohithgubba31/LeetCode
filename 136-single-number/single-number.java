class Solution {
    public int singleNumber(int[] nums) {
        int answer=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                i=i+1;
            }
            else{
                answer= nums[i];
                break;
            }
        } 
        return answer;  
    }
}