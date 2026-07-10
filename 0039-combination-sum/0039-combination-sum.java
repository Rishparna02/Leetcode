class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        backtrack(candidates, target, cur, 0);
        return res;
    }
    public void backtrack(int[] candidates, int target, List<Integer> cur, int i) {
        if(target == 0) {
            res.add(new ArrayList(cur));
            return;
        }
        if(target < 0 || i >= candidates.length) {
            return;
        }
        cur.add(candidates[i]);
        backtrack(candidates, target - candidates[i], cur, i);
        cur.remove(cur.size() - 1);
        backtrack(candidates, target, cur, i+1);
    }
}