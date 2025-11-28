class Solution {
public:
    char findTheDifference(string s, string t) {
        int extra = 0;
        for(int i=0;i<s.length();i++){
            extra = extra ^ s[i];
        }
        for(int j=0;j<t.length();j++){
            extra = extra ^ t[j];
        }
        return extra;
    }
};