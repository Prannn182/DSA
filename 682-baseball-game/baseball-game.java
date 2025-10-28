class Solution {
    public int calPoints(String[] operations) {
        //brute force
     
//          int n=operations.length;
//         int sum = 0;
//         int j=0;
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             if(operations[i].charAt(0)=='+'){
//                 arr[j] = arr[j-1]+arr[j-2];
//                 j++;}
//             else if(operations[i].charAt(0)=='D'){
//                 arr[j] = 2*arr[j-1];
//                 j++;}
//             else if(operations[i].charAt(0)=='C'){
//                 j--;
//                 arr[j]=0;
//                 }
//             else{
//                 arr[j] = Integer.parseInt(operations[i]);
//                 j++;}  
//         }
//         for(int m=0 ; m<arr.length ; m++){
//             sum = sum + arr[m];
//         }
//         return sum;
//     }
// }
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