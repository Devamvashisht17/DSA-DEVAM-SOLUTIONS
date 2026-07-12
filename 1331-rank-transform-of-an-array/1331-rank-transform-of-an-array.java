class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n= arr.length;

        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);

        Map<Integer, Integer>map= new HashMap<>();
        int rank=1;
        for(int i=0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i], rank++);
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}