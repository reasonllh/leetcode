// 给定一个正整数 n ，输出外观数列的第 n 项。

// 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。

// 你可以将其视作是由递归公式定义的数字字符串序列：

// countAndSay(1) = "1"
// countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。

public class lc38 {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String pre = countAndSay(n - 1);
        String res = "";
        char p = pre.charAt(0);
        int cnt = 1;
        for (int i = 1; i < pre.length(); i++) {
            if(p == pre.charAt(i)){
                cnt++;
                continue;
            }
            res += cnt;
            res += p;
            p = pre.charAt(i);
            cnt = 1;
        }
        res += cnt;
        res += p;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
