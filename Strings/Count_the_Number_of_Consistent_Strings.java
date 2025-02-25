import java.util.HashSet;

class Count_the_Number_of_Consistent_Strings {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count = 0;
        int n = words.length;

        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<allowed.length(); i++){
           set.add(allowed.charAt(i));
        }

        for(String str : words){
            boolean flag = true;
            for(int i = 0; i<str.length(); i++){
                if(!set.contains(str.charAt(i))){
                    flag = false;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}