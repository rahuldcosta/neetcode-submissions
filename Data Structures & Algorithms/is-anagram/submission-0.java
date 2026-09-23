class Solution {
    public boolean isAnagram(String s, String t) {

     int slist[] = new int[26];
     int tlist[] = new int[26];
     if(s.length()!=t.length()) return false;

     for (int i=0;i<s.length();i++){

        slist[s.charAt(i)-'a']+=1;
        tlist[t.charAt(i)-'a']+=1;
     }

     for(int j=0;j<26;j++){

        if(slist[j]!=tlist[j]) return false;
     }
     return true;
    }
}
