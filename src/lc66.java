public class lc66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;
        }
        if(digits[0] == 0){
            int[] t = new int[digits.length + 1];
            t[0] = 1;
            for(int i = 0; i < digits.length; i++){
                t[i + 1] = digits[i];
            }
            digits = t;
        }
        return digits;
    }
}