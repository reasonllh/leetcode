public class lc441 {
    // 你总共有 n 枚硬币，并计划将它们按阶梯状排列。对于一个由 k 行组成的阶梯，其第 i 行必须正好有 i 枚硬币。阶梯的最后一行 可能 是不完整的。

    // 给你一个数字 n ，计算并返回可形成 完整阶梯行 的总行数

    public static int arrangeCoins(int n) {
        int sum = 0;
        int i = (int) Math.sqrt(2.0 * n) - 1;
        // while (sum <= n) {
        // sum += i++;
        // }
        System.out.println(i);
        sum = ((1 + i) * i) / 2;
        while (sum <= n) {
            sum += ++i;
        }
        if (sum == n) {
            return i;
        } else {
            return i - 1;
        }
    }

    public static void main(String[] args) {
        int res = arrangeCoins(2147483647);
        System.out.println(res);
    }
}
