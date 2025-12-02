class Solution {
public:
    int countElements(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int n=nums.size(), count=0;
        int mini=nums[0], maxi=nums[n-1];
        for(int i=0;i<n;i++){
            if(nums[i]>mini && nums[i]< maxi){
                count++;
            }
        }
        return count;
    }
};