class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        String[] arr= s.split(" ");
        int left=0, right= arr.length-1;
        while(left< right){
            String temp= arr[left];
            arr[left]=arr[right];
            arr[right]= temp;
            left++;
            right--;

        }
        return String.join(" ", arr);
    }
}