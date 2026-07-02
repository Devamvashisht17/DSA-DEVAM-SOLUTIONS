class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list= new ArrayList<>();
        for(int i=1;i<=numRows;i++){
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
        return list;
    }
}