import java.util.Arrays;

public class WordDictionary {
    // 添加与搜素单词--数据结构设计
    // 请你设计一个数据结构，支持 添加新单词 和 查找字符串是否与任何先前添加的字符串匹配 。

    // 实现词典类 WordDictionary ：

    // WordDictionary() 初始化词典对象
    // void addWord(word) 将 word 添加到数据结构中，之后可以对它进行匹配
    // bool search(word) 如果数据结构中存在字符串与 word 匹配，则返回 true ；否则，返回  false 。word 中可能包含一些
    // '.' ，每个 . 都可以表示任何一个字母。
    static int N = 250000;
    static int[][] tr = new int[N][26];
    static boolean[] isWord = new boolean[N];
    static int idx;

    public WordDictionary() {
        for (int i = 0; i < idx; i++) {
            Arrays.fill(tr[i], 0);
        }
        Arrays.fill(isWord, false);
        idx = 0;
    }

    public void addWord(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (tr[p][u] == 0)
                tr[p][u] = ++idx;
            p = tr[p][u];
        }
        isWord[p] = true;
    }

    public boolean search(String s) {
        return dfs(s, 0, 0);
    }

    boolean dfs(String s, int trIdx, int sIdx) {
        int n = s.length();
        if (n == sIdx)
            return isWord[trIdx];
        char c = s.charAt(sIdx);
        if (c == '.') {
            for (int j = 0; j < 26; j++) {
                if (tr[trIdx][j] != 0 && dfs(s, tr[trIdx][j], sIdx + 1))
                    return true;
            }
            return false;
        } else {
            int u = c - 'a';
            if (tr[trIdx][u] == 0)
                return false;
            return dfs(s, tr[trIdx][u], sIdx + 1);
        }
    }

    public static void main(String[] args) {
        WordDictionary wd = new WordDictionary();
        wd.addWord("abc");
        wd.addWord("def");
        wd.addWord("ghi");
        wd.addWord("123");
        System.out.println("abc");
        System.out.println("abcd");
    }

}
