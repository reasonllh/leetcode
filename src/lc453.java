public class lc453 {
    public int minMoves(int[] nums) {
        long min = nums[0], sum = 0;
        for(int i : nums) {
            min = Math.min(min, i);
            sum += i;
        }
        return (int) (sum - min * nums.length);
    }

}
