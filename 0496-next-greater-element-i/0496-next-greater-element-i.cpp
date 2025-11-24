class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int> nge;
        stack<int> st;

        for(int i=0;i<nums2.size();i++){
            int num = nums2[i];
            while(!st.empty() && st.top() < num) 
            {
                nge[st.top()] = num;
                st.pop();
            }
            st.push(num);
        }

        while(!st.empty()) 
        {
            nge[st.top()] = -1;
            st.pop();
        }

        vector<int> ans(nums1.size());
        for(int i = 0; i < nums1.size(); i++) {
            ans[i] = nge[nums1[i]];
        }
        return ans;
    }
};
