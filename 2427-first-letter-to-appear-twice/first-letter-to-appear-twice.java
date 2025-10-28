class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(!set.add(c)){
                return c;
            }
        } return 'a';
    }
}