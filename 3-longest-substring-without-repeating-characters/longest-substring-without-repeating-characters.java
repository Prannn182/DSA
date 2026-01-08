class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> st=new HashSet<>();
       int i=0,j=0,maxlen=0;
       while(j<s.length()){
        char ch=s.charAt(j);
        while(st.contains(ch)){
          st.remove(s.charAt(i));
          i++;
        }
        st.add(ch);
        maxlen=Math.max(maxlen,j-i+1);
        j++;

       }
       return maxlen;
    }
}