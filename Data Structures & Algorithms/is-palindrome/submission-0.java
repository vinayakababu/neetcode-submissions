class Solution {
    public boolean isPalindrome(String s) {
        if(s == null) {
            return false;
        }
        String str =  s.replaceAll("//s", "").replaceAll("[^a-zA-Z0-9]", "");
        //String cleanStgr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
        char [] arr =  str.toLowerCase().toCharArray();
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            if(arr[left] != arr[right]) {
                return false;
            }

            left ++;
            right --;
        }
       return true;
    }
}
