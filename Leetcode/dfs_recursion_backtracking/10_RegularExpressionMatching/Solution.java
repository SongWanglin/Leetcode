class Solution {
    public boolean isMatch(String s, String p) {
        if(p.length()==0)
            return s.length()==0;
        if(s.length()==0)
            return (p.length()==0)||
            (p.length()>1 && p.charAt(1)=='*')?isMatch(s, p.substring(2)): false;
        if( p.charAt(0)!='.' && s.charAt(0)!=p.charAt(0) )
            return (p.length()>1 && p.charAt(1)=='*')? isMatch(s, p.substring(2)): false;
        if( p.length()>1 && p.charAt(1)=='*')
            return isMatch(s.substring(1), p)||isMatch(s, p.substring(2));
        return isMatch(s.substring(1), p.substring(1));
    }
}
