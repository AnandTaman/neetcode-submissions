
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[]= new int[2*n];

        int x=0;
        for(int i=0;i<2*n;i++){
            if(x==n){x=0;}
            ans[i]=nums[x];
            x++;
        }
        return ans;
}
}