class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = IntStream.of(nums)
                           .boxed().collect(Collectors.toSet());
        int maxSeq = 0;

        for(int i = 0; i < nums.length; i++) {
           if(!set.contains(nums[i]-1)) { 
            int count = 0;
            int curr = nums[i];

            while(set.contains(curr)) {
                count ++;
                curr +=1;
            }

            if(count > maxSeq) {
                maxSeq = count;
            }
           }
        }

        return maxSeq;                   
        
    }
}
