class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list= new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++){
            List<Integer> row= new ArrayList<>();
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    row.add(1);
                }
                else{
                    row.add(list.get(i-2).get(j-2) + list.get(i-2).get(j-1));
                }
            }
            list.add(row);

        }
        return list.get(rowIndex);
    }
}