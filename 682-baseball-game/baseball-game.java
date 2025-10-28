class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int last=st.peek();
                int secondlast=st.get(st.size()-2);
                st.push(last+secondlast);
            }else if(op.equals("D")){
                st.push(st.peek()*2);
            }else if(op.equals("C")){
                st.pop();
            }else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int score:st){
            sum+=score;
        }
    return sum;
    }
}