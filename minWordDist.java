//Let m is the length of first list
//n is the length of second list
//time complexity O(m+n)
//space complexity O(nl)

class Solution {
    public int shortestDistance(String[] words, String word1, String word2) {
        int i1 = 0; int i2 = 0;
        int min = Integer.MAX_VALUE;
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            if(!map.containsKey(words[i])){
                map.put(words[i], new ArrayList<>());
            }
            map.get(words[i]).add(i);
        }
        int m = map.get(word1).size();
        int n = map.get(word2).size();
        while(i1 < m && i2 < n){
            int idx1 = map.get(word1).get(i1);
            int idx2 = map.get(word2).get(i2);
            if(idx1 < idx2){
                i1++;
            } else{
                i2++;
            }
            min = Math.min(min, Math.abs(idx1 - idx2));
        }
        return min;
    }
}
