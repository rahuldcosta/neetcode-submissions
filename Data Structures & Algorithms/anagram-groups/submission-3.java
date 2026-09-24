class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mapping = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            
            int [] word= new int[26];
            for(int j=0;j<strs[i].length();j++){
                word[strs[i].charAt(j)-'a']+=1;
            }
            String sb = word.toString();
            if(sb!=null && sb!=""){
                List<String> cur= mapping.getOrDefault(Arrays.toString(word),new ArrayList<>());
                cur.add(strs[i]);
                mapping.put(Arrays.toString(word),cur);
            }

        }
        // System.out.println(mapping);
        // System.out.println(mapping.values());

        return new ArrayList<>(mapping.values());
    }
}
