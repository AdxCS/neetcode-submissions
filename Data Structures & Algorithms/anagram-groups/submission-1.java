class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> regs=new HashMap<>();
        for (String s:strs){
            int [] count = new int [26];
            for (char c :s.toCharArray()){
                count[c-'a']++;

            }
            String keys= Arrays.toString(count);
            regs.putIfAbsent(keys, new ArrayList<>());
            regs.get(keys).add(s);
            
        }
        return new ArrayList<>(regs.values());
    }
}
