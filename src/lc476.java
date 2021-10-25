public class lc476 {

    // 给你一个正整数 num ，输出它的补数。补数是对该数的二进制表示取反。
    public static int findComplement(int num) {
        int cn = 0;
        int x = num;
        while(x != 0){
            x = x >> 1;
            cn++;
        }
        int sum = (1 << cn) - 1;
        return sum - num;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
