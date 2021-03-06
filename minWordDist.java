//time complexity O(n)
//space complexity O(1)

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        if(words.length == 0 || words == null) return -1;
        int i1 = -1;
        int i2 = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < words.length; i++){
            if(word1.equals(words[i])){
                i1 = i;
            }
            if(word2.equals(words[i])){
                i2 = i;
            }
            if(i1 != -1 && i2 != -1){
                min = Math.min(min, Math.abs(i1-i2));
            }
        }
        return min;
    }
}
