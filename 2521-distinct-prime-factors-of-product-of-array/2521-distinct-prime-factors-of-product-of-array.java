class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            for (int i = 2; i * i <= num; i++) {
                while (num % i == 0) {
                    set.add(i);
                    num = num / i;
                }
                
                }
                if (num > 1) {
                    set.add(num);
            }
        }
        return set.size();

    }
}