class Solution {
    public int lengthOfLastWord(String s) {
        
        int n = s.length();
        int i  = n-1;
        int count = 0;

        while(i>= 0 && (s.charAt(i) == ' ' || s.charAt(i) != ' ')){
            if(s.charAt(i) == ' '){
                i--;
                if(count != 0) return count;
            }else{
                i--;
                count++;
            }
            
        }
        return count;
    }
}
