class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer>m=new HashMap<>();
        List<Integer>ans=new ArrayList<>();
        for(char c:p.toCharArray()){
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }else{
                m.put(c,1);
            } }
            int i=0,j=0;
            int k=p.length();int count=m.size();
            while(j<s.length()){
                char ch=s.charAt(j);
            
                if(m.containsKey(ch)){
                    m.put(ch,m.get(ch)-1);
                    if(m.get(ch)==0) count--;
                }
                if(j-i+1<k){
                    j++;
                }else if(j-i+1==k){
                  char start=s.charAt(i);
                  if(count==0){
                    ans.add(i);
                  }
                  if(m.containsKey(start)){
                    m.put(start,m.get(start)+1);
                    if(m.get(start)==1) count++;
                  }
                 i++;
                  j++;
                }
           
            }return ans;
    }
}