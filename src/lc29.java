// 两数相除
// 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。

// 返回被除数 dividend 除以除数 divisor 得到的商。

// 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2

// 要求不使用乘法、除法和 mod 运算符。
public class lc29 {
    int MAX = Integer.MAX_VALUE;
    int MIN = Integer.MIN_VALUE;
    int LIMIT = -1073741824;

    public int divide(int a, int b) {
        if (a == MIN && b == -1) {
            return MAX;
        }
        // 判断是否为负数
        boolean flag = false;
        if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            flag = true;
            // 结果为负数
        }
        if (a > 0) {
            a = -a;
        }
        if (b > 0) {
            b = -b;
        }
        int ans = 0;
        while (a <= b) {
            int c = b, d = -1;
            while (c >= LIMIT && d >= LIMIT && c >= a - c) {
                c += c;
                d += d;
            }
            a -= c;
            ans += d;
        }
        return flag ? ans : -ans;
    }

}
