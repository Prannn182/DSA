class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence=sentence.toLowerCase();
        for(int i='a';i<='z';i++){
            if(sentence.indexOf(i)==-1){
                return false;
            }
        } return true;
    }
}