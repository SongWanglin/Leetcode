class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String strs[] = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<strs.length-2; i++){
            if( strs[i].equals(first) && strs[i+1].equals(second) ){
                sb.append( strs[i+2] );
                sb.append(" ");
            }
        }
        String res[] = sb.toString().split(" ");
        if( res.length==1 && res[0].equals("")){
            return new String[0];
        }
        return res;
    }
}
