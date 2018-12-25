class Solution {
    public boolean judgeCircle(String moves) {
        return count(moves,"U") == count(moves, "D") &&
            count(moves,"L") == count(moves,"R");
    }

    public int count(String moves, String s){
        return moves.length() - moves.replaceAll(s,"").length();
    }
}
