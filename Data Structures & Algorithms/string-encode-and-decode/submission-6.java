
class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) return null;
        StringBuilder sb= new StringBuilder();

        for(String s : strs){
            sb.append(Base64.getEncoder().encodeToString(s.getBytes()));
            sb.append(",");
        }
        
       return sb.toString().substring(0,sb.toString().length()-1);
    }
public List<String> decode(String str) {
    if (str==null) return new ArrayList<String>();
    String[] splited = str.split(",",-1);
    for (int i = 0; i < splited.length; i++) {
        byte[] decodedBytes = Base64.getDecoder().decode(splited[i]);
        splited[i] = new String(decodedBytes);
    }
    return Arrays.asList(splited);
}   
}
