class Solution {
    public int maximumDifference(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;

        // collect all positive differences nums[j] - nums[i] where j > i
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = nums[j] - nums[i];
                if (diff > 0) {
                    arr.add(diff);
                }
            }
        }

        if (arr.isEmpty()) return -1;        // no positive difference found
        Collections.sort(arr);
        return arr.get(arr.size() - 1);      // largest positive difference
    }
}