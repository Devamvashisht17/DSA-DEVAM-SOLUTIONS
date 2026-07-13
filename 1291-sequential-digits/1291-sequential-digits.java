class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1;i<=9;i++){
            int num=i;
            for(int j=i+1;j<=9;j++){
                num=num*10+j;
                if(num>=low && num<=high){
                    arr.add(num);
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }
}