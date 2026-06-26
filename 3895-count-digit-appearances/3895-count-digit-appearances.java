class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        String str="";
        for(int i=0;i<nums.length;i++){
            str+=String.valueOf(nums[i]);

        }
        int count=0;
        char ch=(char)(digit+ '0');
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}