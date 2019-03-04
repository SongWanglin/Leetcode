public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0)
            return false;
        return helper(sequence, 0, sequence.length-1);
    }
        private boolean helper(int[] sequence, int start, int root){
            if(start>=root)
                return true;
            int right_start = root;
            for(int i = start; i<= root; i++){
                if(sequence[i]>=sequence[root]){
                    right_start = i;
                    break;
                }
            }
            for(int i = right_start; i<root; i++){
                if(sequence[i]<sequence[root]){
                    return false;
                }
            }
            return helper(sequence, start, right_start-1)|| helper(sequence, right_start, root);
        }
}
