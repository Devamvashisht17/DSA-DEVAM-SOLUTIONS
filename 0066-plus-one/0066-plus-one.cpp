class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n= digits.size();

        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+1;

                return digits;
            }
            digits[i]=0; // to clear the arr for next no.
        }

        vector<int > result(n+1,0); // tb use hoga when 999 to make it 1000 (best way)
        result[0]=1;
        return result;
    }
};