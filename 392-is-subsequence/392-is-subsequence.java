class Solution {
  public boolean isSubsequence(String s, String t) {
        if (s.equals(t) || s.equals("")) {
            return true;
        }
        List<Character> listT = new ArrayList<>();
        for (int i = 0; i < t.length(); i++) {
            listT.add(t.charAt(i));
        }
        int j = 0;
        while (j < s.length()) {
            if (listT.size() < s.length()) {
                return false;
            }
            if (listT.get(j) != s.charAt(j)) {
                listT.remove(listT.get(j));
                j--;
            }
            j++;
        }

        String string = listT.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(string);

        return string.startsWith(s);
    }
}