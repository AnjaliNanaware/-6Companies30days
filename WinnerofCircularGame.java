//https://leetcode.com/problems/find-the-winner-of-the-circular-game/
//1823.FInd Winner of the Circular game
class Solution {
    public int findTheWinner(int n, int k) {

        List<Integer> list=new ArrayList<>();


        for(int i=1;i<=n;i++){
            list.add(i);
        }

        int i=0;
        while(list.size()!=1){

                int removeIndex=(((i+k-1)%list.size()));
                
                list.remove(removeIndex);

                i=removeIndex;
        }

        return list.get(0);
    }
}