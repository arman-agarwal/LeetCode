class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashMap<String, Integer> h = new HashMap<>();
        int k = 10;
        String current = "";
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<k && i<s.length(); i++)
            current+=s.charAt(i);
        h.put(current, 1);
        for(int i=k; i<s.length(); i++){
            current = current.substring(1)+s.charAt(i);
            h.computeIfPresent(current, (t,v)->v+1);
            h.computeIfAbsent(current, (t)->1);
        }
            for (var entry : h.entrySet())
                if(entry.getValue()>1)ans.add(entry.getKey());
        return ans;
    }
}