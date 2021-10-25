import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 重复的DNA序列
// 所有 DNA 都由一系列缩写为 'A'，'C'，'G' 和 'T' 的核苷酸组成，例如："ACGAATTCCG"。
// 在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。

// 编写一个函数来找出所有目标子串，目标子串的长度为 10，且在 DNA 字符串 s 中出现次数超过一次。

public class lc187 {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<>();
        int n = s.length();
        Map<String, Integer> m = new HashMap<>();
        for (int i = 10; i <= n; i++) {
            String cur = s.substring(i - 10, i);
            int cnt = m.getOrDefault(cur, 0);
            if(cnt == 1){
                ans.add(cur);
            }
            m.put(cur, cnt + 1);
        }
        return ans;
    }

    // 输入：s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
    // 输出：["AAAAACCCCC","CCCCCAAAAA"]

    // 输入：s = "AAAAAAAAAAAAA"
    // 输出：["AAAAAAAAAA"]
}