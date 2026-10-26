

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> dp = new ArrayList<>();
        dp.add(new ArrayList<>());

        for (int num : nums) {
            int size = dp.size();

            for (int i = 0; i < size; i++) {
                List<Integer> temp = new ArrayList<>(dp.get(i));
                temp.add(num);
                dp.add(temp);
            }
        }

        return dp;
    }
}
