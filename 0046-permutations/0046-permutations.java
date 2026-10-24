class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    void fun(List<Integer> nums, List<Integer> temp) {
        if (nums.isEmpty()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            List<Integer> lp = new ArrayList<>(nums);
            List<Integer> op = new ArrayList<>(temp);

            op.add(nums.get(i));
            lp.remove(i);

            fun(lp, op);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        ans.clear();

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        List<Integer> temp = new ArrayList<>();
        fun(list, temp);

        return ans;
    }
}