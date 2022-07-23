class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestCommon = "";
        StringBuilder common = new StringBuilder();
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < smallest) {
                smallest = strs[i].length();
            }
        }
        l : for (int i = 0; i < smallest; i++) {
            int finalI = i;
            List<Character> ch = Arrays.stream(strs)
                    .map(s -> s.charAt(finalI)).toList();
            ch.forEach(common::append);
            String s = common.toString();
            for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) != s.charAt(0)) {
                        common = new StringBuilder();
                        break l;
                    }
            }
            longestCommon += s.charAt(0);
            common = new StringBuilder();
        }
        return longestCommon;
    }
}