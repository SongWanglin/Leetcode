
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet <String> list = new HashSet <>();       
        for(int i =0; i<emails.length; i++){
            emails[i] = actualEmail(emails[i]);
            if (!list.contains(emails[i])){
                list.add(emails[i]);
                System.out.println(emails[i]);
            }
        }
        return list.size();
    }
    
    public String actualEmail(String email){
        String s[] = email.split("@");
        if (email.contains("+")){
            s[0] = s[0].replaceAll("\\+.*","@");
        }
        return s[0].replace(".","")+s[1];
    }
}