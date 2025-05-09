class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder stb = new StringBuilder();
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
            if(count > 0){
                stb.append(c);
            }
            count++;
        }
        else{
            count--;
            if(count > 0){
                stb.append(c);
            }
        }
        }
        
        return stb.toString();
    }
}