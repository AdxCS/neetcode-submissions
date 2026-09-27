public class Solution{
    public boolean hasDuplicate(int[] nums){
        Set<Integer> rep=new HashSet<>();
        for (int i:nums){
            if(rep.contains(i)){
                return true;


            }
            rep.add(i);

        }
        return false;
    }

}

