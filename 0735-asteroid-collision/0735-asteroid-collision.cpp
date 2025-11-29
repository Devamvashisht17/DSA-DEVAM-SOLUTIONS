class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        vector<int > st;
        int n=asteroids.size();

        for(int i=0;i<n;i++){
            int right =asteroids[i];
            bool destroy= false;

            while(!st.empty() && st.back()>0 && right<0){
                if(st.back() < abs(right)){
                    st.pop_back();
                    continue;
                }
                else if(st.back() == abs(right)){
                    st.pop_back();
                }
                destroy=true;
                break;
            }
            if(!destroy){
                st.push_back(right);
            }
        }
        return st;
    }
};