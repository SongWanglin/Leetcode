class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck); int l = deck.length;
        LinkedList <Integer> reverseList = new LinkedList<Integer>();
        int[] res = new int[l];
        reverseList.add(deck[l-1]);
        for (int i=l-2; i>=0; i--){
            reverseList.add(reverseList.pollFirst());
            reverseList.add(deck[i]);
        }
        for (int i = l-1; i>=0; i--){
            res[l-1-i] = reverseList.get(i);
        }
        return res;
    }
}


