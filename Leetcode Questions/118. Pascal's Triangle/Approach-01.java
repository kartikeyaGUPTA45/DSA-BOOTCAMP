class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> subAns = new ArrayList<>();
            int val = 1;
            for(int j = 0;j<=i;j++){
                subAns.add(val);
                val = val*(i-j)/(j+1);
            }
            ans.add(subAns);
        }

        return ans;
    }
}
