class Solution {
    public int largestInteger(int num) {
        String s= String.valueOf(num);

        ArrayList<Integer> even= new ArrayList<>();
        ArrayList<Integer> odd= new ArrayList<>();

        for(int i=0;i<s.length();i++){
            int digit= s.charAt(i) -'0';

            if(digit%2==0){
                even.add(digit);
            }
            else{
                odd.add(digit);
            }  
        }
        Collections.sort(even, Collections.reverseOrder());
        Collections.sort(odd, Collections.reverseOrder());

    int e=0, o=0;
        String result="";

        for(int i=0;i<s.length();i++){
            int digit= s.charAt(i)-'0';

            if(digit%2 ==0){
                result+=even.get(e);
                e++;
            }
            else{
                result+=odd.get(o);
                o++;
            }
        }
        return Integer.parseInt(result);
    }

}