class Solution {
    public String reverseWords(String s) {
        String[] word = s.split("\\s+");
        StringBuilder stb = new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            stb.append(word[i]);

            if( i != 0){
                stb.append(" ");
            }
        }
        return stb.toString().trim();
    }
}