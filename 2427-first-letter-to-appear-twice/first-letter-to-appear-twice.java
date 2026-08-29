class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();


        //Check every character of the string
        for(char ch : s.toCharArray()){
            //if the character already exists return it as asnwer or add it in the hashset
            if(set.contains(ch)){
                return ch;
            }

            set.add(ch);
        }
        return ' ';//for safety (problem garauntees an asnwer)
        
    }
}