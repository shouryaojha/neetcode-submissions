class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(char c: s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)) s1+=c;
            else continue;
        }
        return s1.equals(new StringBuilder(s1).reverse().toString());
    }
}
