class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        String s1 = s.toLowerCase().trim();
        String t1 = t.toLowerCase().trim();

        char [] sArr = s1.toCharArray();
        char [] tArr = t1.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);
       
        return new String(sArr).equals(new String(tArr));


    }
}
