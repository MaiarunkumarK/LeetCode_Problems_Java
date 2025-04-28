class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder stb = new StringBuilder();
        for(int i=words.length-1;i >= 0;i--){
            stb.append(words[i]);
            if(i != 0){
                stb.append(" ");
            }
        }
        return stb.toString().trim();
    }
}