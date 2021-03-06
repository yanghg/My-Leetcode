public class Solution {
    public String convertToTitle(int n) {
        String res = "";
        while(n != 0) {
            //add at highest bit each time
            res = (char)('A' + (n - 1) % 26) + res;
            n = (n - 1) / 26;
        }
        return res;
    }
}