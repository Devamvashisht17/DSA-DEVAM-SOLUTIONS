class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> temp= new ArrayList<>();

        for( Integer num : nums){
            temp.clear();
            while(num !=0){
                temp.add(num%10);
                num=num/10;
                
            }
            for(int i=temp.size()-1;i>=0;i--){
                arr1.add(temp.get(i));
            }
        }
        int n= arr1.size();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= arr1.get(i);
        }
        return arr;
    }
}