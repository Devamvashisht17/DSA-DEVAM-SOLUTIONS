class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] a= new int[10001];

        Arrays.fill(a,-1);
        Stack<Integer> st= new Stack <>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek()< nums2[i]){
                a[st.pop()]= nums2[i];
            }
            st.push(nums2[i]);
        }
        int [] a1 = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            a1[i] = a[nums1[i]];
        }
        return a1;
    }
}